package com.example.couplematch.UserInterface;

import com.example.couplematch.model.Message;
import com.example.couplematch.response.PhotoResponse;
import com.example.couplematch.response.SignUpResponse;
import com.example.couplematch.response.UpdateProfileResponse;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface UserService {

    @FormUrlEncoded
    @POST("signup")
    Call<SignUpResponse> registerUser(
        @Field("name") String name,
        @Field("mobile") String mobile,
        @Field("gender") String gender,
        @Field("dob") String dob);

    @FormUrlEncoded
    @POST("update_profile")
    Call<UpdateProfileResponse> UpdateProfile(
        @Field ("user_id") String user_id,
        @Field("religion") String religion,
        @Field("dosh") String dosh,
        @Field("marital_status") String marital_status,
        @Field("diet") String diet,
        @Field("height") String height,
        @Field("education") String education,
        @Field("profession") String profession,
        @Field("location") String location,
        @Field("about_me") String about_me,
        @Field("partner_preference") String partner_preference);

    @Multipart
    @POST("add_profiles")
    Call<PhotoResponse> UploadImage(
        @Part ("user_id") RequestBody user_id,
        @Part MultipartBody.Part profile1);


}
