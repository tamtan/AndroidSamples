package com.codingwithmitch.rxjavaflatmapexample.requests;

import com.codingwithmitch.rxjavaflatmapexample.models.Comment;
import com.codingwithmitch.rxjavaflatmapexample.models.Post;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RequestApi {

    @GET("posts")
    Observable<List<Post>> getPosts();

    @GET("posts/{id}/comments")
    Observable<List<Comment>> getComments(
            @Path("id") int id
    );
}
