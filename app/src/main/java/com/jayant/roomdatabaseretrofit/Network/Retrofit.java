package com.jayant.roomdatabaseretrofit.Network;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {
    retrofit2.Retrofit retrofit=new retrofit2.Retrofit.Builder()
            .baseUrl(Url.URL_DATA)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    public Api api=retrofit.create(Api.class);
}
