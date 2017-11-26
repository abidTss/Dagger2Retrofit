package com.abid.dagger2retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by abid on 11/26/17.
 */

public interface ApiInterFace {

    @GET("/posts")
    Call<List<User>> getPosts();

}
