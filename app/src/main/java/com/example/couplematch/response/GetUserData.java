package com.example.couplematch.response;

import java.util.List;
import com.example.couplematch.model.UserData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetUserData {
    @SerializedName("result")
    @Expose
    private List<UserData> result = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<UserData> getResult() {
        return result;
    }

    public void setResult(List<UserData> result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
