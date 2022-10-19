package com.example.couplematch.response;

import com.example.couplematch.model.RequestAcceptedByUser;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AcceptedByUser {
    @SerializedName("short_data")
    @Expose
    private List<RequestAcceptedByUser> shortData = null;
    @SerializedName("message")
    @Expose
    private String message;

    public List<RequestAcceptedByUser> getShortData() {
        return shortData;
    }

    public void setShortData(List<RequestAcceptedByUser> shortData) {
        this.shortData = shortData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
