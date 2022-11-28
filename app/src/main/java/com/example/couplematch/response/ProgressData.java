package com.example.couplematch.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProgressData {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("progress")
    @Expose
    private Integer progress;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

}
