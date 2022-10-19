package com.example.couplematch.response;

import com.example.couplematch.model.RequestSendMe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RequestSendByMe {
    @SerializedName("request_data")
    @Expose
    private List<RequestSendMe> requestData = null;
    @SerializedName("status")
    @Expose
    private Boolean status;

    public List<RequestSendMe> getRequestData() {
        return requestData;
    }

    public void setRequestData(List<RequestSendMe> requestData) {
        this.requestData = requestData;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
