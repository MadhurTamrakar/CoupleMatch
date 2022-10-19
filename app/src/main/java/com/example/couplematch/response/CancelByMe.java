package com.example.couplematch.response;

import com.example.couplematch.model.RequestCancelByMe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CancelByMe {

    @SerializedName("short_data")
    @Expose
    private List<RequestCancelByMe> shortData = null;
    @SerializedName("message")
    @Expose
    private String message;

    public List<RequestCancelByMe> getShortData() {
        return shortData;
    }

    public void setShortData(List<RequestCancelByMe> shortData) {
        this.shortData = shortData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
