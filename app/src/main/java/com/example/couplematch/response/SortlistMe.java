package com.example.couplematch.response;

import com.example.couplematch.model.SortDataMe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SortlistMe {

    @SerializedName("short_data")
    @Expose
    private List<SortDataMe> shortData = null;
    @SerializedName("message")
    @Expose
    private String message;

    public List<SortDataMe> getShortData() {
        return shortData;
    }

    public void setShortData(List<SortDataMe> shortData) {
        this.shortData = shortData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
