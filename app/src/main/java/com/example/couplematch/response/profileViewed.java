package com.example.couplematch.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class profileViewed {
    @SerializedName("message")
    @Expose
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
