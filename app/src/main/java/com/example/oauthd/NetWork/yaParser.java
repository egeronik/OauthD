package com.example.oauthd.NetWork;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class yaParser {
    Retrofit retrofit;
    private final yaInterface boardAPI;

    public yaParser(){
        retrofit = new Retrofit.Builder()
                .baseUrl("https://login.yandex.ru/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        boardAPI = retrofit.create(yaInterface.class);
    }


    public yaInterface getBoardAPI() {
        return boardAPI;
    }
}
