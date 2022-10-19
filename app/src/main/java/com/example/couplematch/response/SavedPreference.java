package com.example.couplematch.response;

import com.example.couplematch.model.Data2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SavedPreference {

    @SerializedName("data2")
    @Expose
    private List<Data2> data2 = null;
    @SerializedName("status")
    @Expose
    private Boolean status;

    public List<Data2> getData2() {return data2;}

    public void setData2(List<Data2> data2) {this.data2 = data2;}

    public Boolean getStatus() {return status;}

    public void setStatus(Boolean status) {this.status = status;}
}
