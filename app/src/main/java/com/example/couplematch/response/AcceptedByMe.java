package com.example.couplematch.response;

import com.example.couplematch.model.RequestAcceptedByMe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AcceptedByMe {

    @SerializedName("short_data")
    @Expose
    private List<RequestAcceptedByMe> shortData = null;
    @SerializedName("message")
    @Expose
    private String message;

    public List<RequestAcceptedByMe> getShortData() {
        return shortData;
    }

    public void setShortData(List<RequestAcceptedByMe> shortData) {
        this.shortData = shortData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
