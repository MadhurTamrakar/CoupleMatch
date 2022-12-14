package com.example.couplematch.response;

import android.os.Message;

import com.example.couplematch.model.Result2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateProfileResponse {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result2")
    @Expose
    private Result2 result2;

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

    public Result2 getResult2() {
        return result2;
    }

    public void setResult2(Result2 result2) {
        this.result2 = result2;
    }

}
