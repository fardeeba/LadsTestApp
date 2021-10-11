package com.example.ladstestapp.pojos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseBean {

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("data")
    @Expose
    private String data;

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

    public String getData() {
        return data;
    }
}
