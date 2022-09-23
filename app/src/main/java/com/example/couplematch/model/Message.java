package com.example.couplematch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("profile1")
    @Expose
    private String profile1;
    @SerializedName("profile2")
    @Expose
    private String profile2;
    @SerializedName("profile3")
    @Expose
    private String profile3;
    @SerializedName("profile4")
    @Expose
    private String profile4;
    @SerializedName("profile5")
    @Expose
    private String profile5;
    @SerializedName("profile6")
    @Expose
    private String profile6;
    @SerializedName("mobile")
    @Expose
    private String mobile;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("religion")
    @Expose
    private String religion;
    @SerializedName("dosh")
    @Expose
    private String dosh;
    @SerializedName("marital_status")
    @Expose
    private String maritalStatus;
    @SerializedName("diet")
    @Expose
    private String diet;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("education")
    @Expose
    private String education;
    @SerializedName("profession")
    @Expose
    private String profession;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lon")
    @Expose
    private String lon;
    @SerializedName("about_me")
    @Expose
    private String aboutMe;
    @SerializedName("partner_preference")
    @Expose
    private String partnerPreference;
    @SerializedName("age")
    @Expose
    private Object age;
    @SerializedName("physical_status")
    @Expose
    private Object physicalStatus;
    @SerializedName("father_occupation")
    @Expose
    private Object fatherOccupation;
    @SerializedName("mother_occupation")
    @Expose
    private Object motherOccupation;
    @SerializedName("drink")
    @Expose
    private Object drink;
    @SerializedName("smoke")
    @Expose
    private Object smoke;
    @SerializedName("income")
    @Expose
    private Object income;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("date_time")
    @Expose
    private String dateTime;


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

    public String getProfile2() {
        return profile2;
    }

    public void setProfile2(String profile2) {
        this.profile2 = profile2;
    }

    public String getProfile3() {
        return profile3;
    }

    public void setProfile3(String profile3) {
        this.profile3 = profile3;
    }

    public String getProfile4() {
        return profile4;
    }

    public void setProfile4(String profile4) {
        this.profile4 = profile4;
    }

    public String getProfile5() {
        return profile5;
    }

    public void setProfile5(String profile5) {
        this.profile5 = profile5;
    }

    public String getProfile6() {
        return profile6;
    }

    public void setProfile6(String profile6) {
        this.profile6 = profile6;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getReligion(String religion) {
        return this.religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getDosh(String dosh) {
        return this.dosh;
    }

    public void setDosh(String dosh) {
        this.dosh = dosh;
    }

    public String getMaritalStatus(String maritalStatus) {
        return this.maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getDiet(String diet) {
        return this.diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getHeight(String height) {
        return this.height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getEducation(String education) {
        return this.education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfession(String professional) {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getLocation(String location) {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getAboutMe(String about_yourself) {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getPartnerPreference(String about_partner) {
        return partnerPreference;
    }

    public void setPartnerPreference(String partnerPreference) {
        this.partnerPreference = partnerPreference;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public Object getPhysicalStatus() {
        return physicalStatus;
    }

    public void setPhysicalStatus(Object physicalStatus) {
        this.physicalStatus = physicalStatus;
    }

    public Object getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(Object fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public Object getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(Object motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public Object getDrink() {
        return drink;
    }

    public void setDrink(Object drink) {
        this.drink = drink;
    }

    public Object getSmoke() {
        return smoke;
    }

    public void setSmoke(Object smoke) {
        this.smoke = smoke;
    }

    public Object getIncome() {
        return income;
    }

    public void setIncome(Object income) {
        this.income = income;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
