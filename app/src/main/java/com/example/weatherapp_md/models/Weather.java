package com.example.weatherapp_md.models;

import com.google.gson.annotations.SerializedName;

public class Weather {
    @SerializedName("description")
    private String description;

    public String getDescription() {
        return description;
    }
}
