package com.example.couplematch.response;

import com.example.couplematch.model.RequestData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RequestReceived {

    @SerializedName("request_data")
    @Expose
    private List<RequestData> requestData = null;
    @SerializedName("status")
    @Expose
    private Boolean status;

    public List<RequestData> getRequestData() {
        return requestData;
    }

    public void setRequestData(List<RequestData> requestData) {
        this.requestData = requestData;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
