package com.example.couplematch.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PhotoResponse {
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("status")
    @Expose
    private String status;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
