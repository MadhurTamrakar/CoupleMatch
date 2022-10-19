package com.example.couplematch.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Profile {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("user_code")
    @Expose
    private String userCode;
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
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("about_me")
    @Expose
    private String aboutMe;
    @SerializedName("partner_preference")
    @Expose
    private String partnerPreference;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("physical_status")
    @Expose
    private String physicalStatus;
    @SerializedName("father_occupation")
    @Expose
    private Object fatherOccupation;
    @SerializedName("mother_occupation")
    @Expose
    private Object motherOccupation;
    @SerializedName("drink")
    @Expose
    private String drink;
    @SerializedName("smoke")
    @Expose
    private String smoke;
    @SerializedName("income")
    @Expose
    private String income;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("block")
    @Expose
    private String block;
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

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
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

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getDosh() {return dosh;}

    public void setDosh(String dosh) {
        this.dosh = dosh;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getPartnerPreference() {
        return partnerPreference;
    }

    public void setPartnerPreference(String partnerPreference) {this.partnerPreference = partnerPreference;}

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhysicalStatus() {
        return physicalStatus;
    }

    public void setPhysicalStatus(String physicalStatus) {
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

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke;
    }

    public String getIncome() {return income;}

    public void setIncome(String income) {
        this.income = income;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
