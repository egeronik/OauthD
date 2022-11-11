package com.example.oauthd.NetWork;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface yaInterface {
    @GET("info?format=json&jwt_secret=eb3c6a1aefbc44e9b58a762c1e1271ee&")
    Call<user> getUserInfo(@Query("oauth_token") String token);
}
