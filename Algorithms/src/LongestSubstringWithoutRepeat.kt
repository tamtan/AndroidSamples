//3. Longest Substring Without Repeating Characters
//Given a string, find the length of the longest substring without repeating characters.
//
//Example 1:
//
//Input: "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
fun main(args: Array<String>) {
    println(lengthOfLongestSubstring("adfasdgasdfasfa"))
    println(lengthOfLongestSubstring1("adfasdgasdfasfa"))
    println(lengthOfLongestSubstring2("adfasdgasdfasfa"))

}

fun lengthOfLongestSubstring2(s: String): Int {
    var windowStart = 0
    var maxWindowLength = 0
    var charToIndexMap = mutableMapOf<Char, Int>()
    for (i in s.indices) {
        val currentChar = s[i]
        if (charToIndexMap.containsKey(currentChar) && charToIndexMap[currentChar]!! >= windowStart) {
            val currentWindowLength = i - windowStart
            maxWindowLength = Math.max(currentWindowLength, maxWindowLength)
            windowStart = charToIndexMap[currentChar]!!.toInt() + 1
        }
        charToIndexMap[currentChar] = i
    }
    maxWindowLength = Math.max(s.length - windowStart, maxWindowLength)
    return maxWindowLength
}

fun lengthOfLongestSubstring(s: String): Int {
    if (s.length <= 1) return s.length
    var lIndex = 0
    var rIndex = 1
    var max = 1
    while (rIndex < s.length) {
        var l = lIndex
        while (l < rIndex) {
            if (s[l] == s[rIndex]) break
            l++
        }

        if (l == rIndex)
            rIndex++
        else {
            lIndex++
            if (s.length - lIndex < max) break
            rIndex = lIndex + 1
        }
        val r = rIndex - lIndex
        if (r > max) max = r
    }
    return max
}

fun lengthOfLongestSubstring1(s: String): Int {
    var max = 0
    s.forEachIndexed { index, _ ->
        max = Math.max(max, helper(s.substring(index)))

    }
    return max
}

private fun helper(sub: String): Int {
    val chars = mutableSetOf<Char>()
    var result = 0
    sub.forEach {
        if (!chars.contains(it)) {
            chars.add(it)
            result++
        } else {
            return result
        }
    }
    return result
}