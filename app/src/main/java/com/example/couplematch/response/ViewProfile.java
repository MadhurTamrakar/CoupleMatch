package com.example.couplematch.response;

import com.example.couplematch.model.Profile;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ViewProfile {

    @SerializedName("data")
    @Expose
    private List<Profile> data = null;
    @SerializedName("status")
    @Expose
    private Boolean status;

    public List<Profile> getData() {
        return data;
    }

    public void setData(List<Profile> data) {
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
