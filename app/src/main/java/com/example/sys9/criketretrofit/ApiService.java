package com.example.sys9.criketretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("cricket.json")
    Call<Cricket> getCricket();
}
