package com.example.couplematch.response;

import com.example.couplematch.model.ViewedByMe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Viewed {

    @SerializedName("short_data")
    @Expose
    private List<ViewedByMe> shortData = null;
    @SerializedName("message")
    @Expose
    private String message;

    public List<ViewedByMe> getShortData() {
        return shortData;
    }

    public void setShortData(List<ViewedByMe> shortData) {
        this.shortData = shortData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
