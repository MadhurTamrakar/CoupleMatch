package com.example.couplematch.response;

import com.example.couplematch.model.RequestCancelByUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CancelByUser {
    @SerializedName("short_data")
    @Expose
    private List<RequestCancelByUser> shortData = null;
    @SerializedName("message")
    @Expose
    private String message;

    public List<RequestCancelByUser> getShortData() {
        return shortData;
    }

    public void setShortData(List<RequestCancelByUser> shortData) {
        this.shortData = shortData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
