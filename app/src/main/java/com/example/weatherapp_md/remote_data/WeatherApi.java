package com.example.weatherapp_md.remote_data;

import com.example.weatherapp_md.models.Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    String URL_KEY = "fac13deb5da0eb305b6fd89ff603d4a0";

    @GET("/data/2.5/weather")
    Call<Model> getCurrentWeather(
            @Query("q") String name,
            @Query("appid") String key
    );


}


