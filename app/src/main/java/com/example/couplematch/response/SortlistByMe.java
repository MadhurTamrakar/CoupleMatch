package com.example.couplematch.response;

import com.example.couplematch.model.ShortData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SortlistByMe {
    @SerializedName("short_data")
    @Expose
    private List<ShortData> shortData = null;
    @SerializedName("message")
    @Expose
    private String message;

    public List<ShortData> getShortData() {
        return shortData;
    }

    public void setShortData(List<ShortData> shortData) {
        this.shortData = shortData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
