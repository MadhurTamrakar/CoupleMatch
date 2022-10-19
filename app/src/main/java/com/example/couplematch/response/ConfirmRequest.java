package com.example.couplematch.response;

import com.example.couplematch.model.Confirm;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConfirmRequest {

    @SerializedName("data")
    @Expose
    private List<Confirm> data = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Boolean status;

    public List<Confirm> getData() {
        return data;
    }

    public void setData(List<Confirm> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
