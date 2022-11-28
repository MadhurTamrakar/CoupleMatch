package com.example.couplematch.response;

import com.example.couplematch.model.AllNotification;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NotificationData {
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("all_notification")
    @Expose
    private List<AllNotification> allNotification = null;
    @SerializedName("total_notification")
    @Expose
    private Integer totalNotification;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<AllNotification> getAllNotification() {
        return allNotification;
    }

    public void setAllNotification(List<AllNotification> allNotification) {
        this.allNotification = allNotification;
    }

    public Integer getTotalNotification() {
        return totalNotification;
    }

    public void setTotalNotification(Integer totalNotification) {
        this.totalNotification = totalNotification;
    }

}
