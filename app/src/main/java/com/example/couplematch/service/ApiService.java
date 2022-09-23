package com.example.couplematch.service;

import androidx.annotation.NonNull;

import com.example.couplematch.UserInterface.UserService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    @NonNull
    public static Retrofit getRetrofit(){

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor ();
        httpLoggingInterceptor.setLevel (HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder ()
            .addInterceptor (httpLoggingInterceptor).build ();

        Retrofit retrofit = new Retrofit.Builder ()
            .addConverterFactory (GsonConverterFactory.create ())
            .baseUrl ("https://progressiveaidata.in/couple_match/webservice/")
            .client (okHttpClient)
            .build ();

        return retrofit;
    }

    @NonNull
    public static UserService getService(){
        UserService userService = getRetrofit().create (UserService.class);

        return userService;
    }
}
