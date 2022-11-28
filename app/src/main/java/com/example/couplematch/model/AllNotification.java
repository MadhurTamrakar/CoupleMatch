package com.example.couplematch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllNotification {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("profile1")
    @Expose
    private String profile1;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("date_time")
    @Expose
    private String dateTime;
    @SerializedName("message")
    @Expose
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfile1() {
        return profile1;
    }

    public void setProfile1(String profile1) {
        this.profile1 = profile1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
