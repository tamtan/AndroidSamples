# Copyright (C) 2019 The Dagger Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
"""Skylark rules to collect Maven artifacts information.
"""


# TODO(b/142057516): Unfork this file once we've settled on a more general API.
MavenInfo = provider(
    fields = {
        "maven_artifacts": """
        The Maven coordinates for the artifacts that are exported by this target: i.e. the target
        itself and its transitively exported targets.
        """,
        "maven_dependencies": """
        The Maven coordinates of the direct dependencies, and the transitively exported targets, of
        this target.
        """,
        "all_transitive_deps": """
        All transitive deps of the target.
        """,
        "maven_transitive_deps": """
        All transitive deps that are included in some maven dependency.
        """,
    },
)

_EMPTY_MAVEN_INFO = MavenInfo(
    maven_artifacts = depset(),
    maven_dependencies = depset(),
    maven_transitive_deps = depset(),
    all_transitive_deps = depset(),
)

_MAVEN_COORDINATES_PREFIX = "maven_coordinates="

def _maven_artifacts(targets):
    return [target[MavenInfo].maven_artifacts for target in targets if MavenInfo in target]

def _collect_maven_info_impl(target, ctx):
    tags = getattr(ctx.rule.attr, "tags", [])
    deps = getattr(ctx.rule.attr, "deps", [])
    exports = getattr(ctx.rule.attr, "exports", [])

    maven_artifacts = []
    for tag in tags:
        if tag in ("maven:compile_only", "maven:shaded"):
            return [_EMPTY_MAVEN_INFO]
        if tag.startswith(_MAVEN_COORDINATES_PREFIX):
            maven_artifacts.append(tag[len(_MAVEN_COORDINATES_PREFIX):])

    all_deps = [dep.label for dep in (deps + exports)]
    all_transitive_deps = [dep[MavenInfo].all_transitive_deps for dep in (deps + exports)]

    maven_deps = []
    maven_transitive_deps = []
    for dep in (deps + exports):
        # If the dep is itself a maven artifact, add it and all of its transitive deps.
        # Otherwise, just propagate its transitive maven deps.
        if dep[MavenInfo].maven_artifacts or dep[MavenInfo] == _EMPTY_MAVEN_INFO:
            maven_deps.append(dep.label)
            maven_transitive_deps.append(dep[MavenInfo].all_transitive_deps)
        else:
            maven_transitive_deps.append(dep[MavenInfo].maven_transitive_deps)

    return [MavenInfo(
        maven_artifacts = depset(maven_artifacts, transitive = _maven_artifacts(exports)),
        maven_dependencies = depset([], transitive = _maven_artifacts(deps + exports)),
        maven_transitive_deps = depset(maven_deps, transitive = maven_transitive_deps),
        all_transitive_deps = depset(all_deps, transitive = all_transitive_deps),
    )]

collect_maven_info = aspect(
    attr_aspects = [
        "deps",
        "exports",
    ],
    doc = """
    Collects the Maven information for targets, their dependencies, and their transitive exports.
    """,
    implementation = _collect_maven_info_impl,
)

