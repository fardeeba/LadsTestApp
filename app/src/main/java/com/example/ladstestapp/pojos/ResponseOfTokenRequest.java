package com.example.ladstestapp.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseOfTokenRequest {

    @SerializedName("token")
    @Expose
    private String token;

    public String getToken() {
        return token;
    }
}
