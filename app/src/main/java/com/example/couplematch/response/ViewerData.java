package com.example.couplematch.response;

import com.example.couplematch.model.Viewer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ViewerData {
    @SerializedName("short_data")
    @Expose
    private List<Viewer> shortData = null;
    @SerializedName("message")
    @Expose
    private String message;

    public List<Viewer> getShortData() {
        return shortData;
    }

    public void setShortData(List<Viewer> shortData) {
        this.shortData = shortData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
