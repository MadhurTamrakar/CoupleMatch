package com.example.couplematch.response;

import java.util.ArrayList;
import java.util.List;
import com.example.couplematch.model.Result3;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetUserData {
    @SerializedName("result3")
    @Expose
    private List<Result3> result3 = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public List<Result3> getResult3() {
        return result3;
    }

    public void setResult3(List<Result3> result3) {
        this.result3 = result3;
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
