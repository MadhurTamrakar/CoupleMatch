package com.example.couplematch.UserInterface;

import com.example.couplematch.model.Result3;
import com.example.couplematch.response.DeleteData;
import com.example.couplematch.response.GetUserData;
import com.example.couplematch.response.HelpSupport;
import com.example.couplematch.response.PhotoResponse;
import com.example.couplematch.response.SignUpResponse;
import com.example.couplematch.response.UniqueUserData;
import com.example.couplematch.response.UpdateProfileResponse;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
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
        @Field("dob") String dob,
        @Field ("age") String age);

    @FormUrlEncoded
    @POST("update_profile")
    Call<UpdateProfileResponse> UpdateProfile(
        @Field("user_id") String user_id,
        @Field("user_code") String user_code,
        @Field("religion") String religion,
        @Field("dosh") String dosh,
        @Field("marital_status") String marital_status,
        @Field("diet") String diet,
        @Field("height") String height,
        @Field("education") String education,
        @Field("profession") String profession,
        @Field("location") String location,
        @Field ("city") String city,
        @Field("about_me") String about_me,
        @Field("partner_preference") String partner_preference);

    @FormUrlEncoded
    @POST("update_profile")
    Call<UpdateProfileResponse> UpdateProfileAgain(
        @Field("user_id") String user_id,
        @Field("name") String name,
        @Field("mobile") String mobile,
        @Field("gender") String gender,
        @Field("dob") String dob,
        @Field("religion") String religion,
        @Field("dosh") String dosh,
        @Field("marital_status") String marital_status,
        @Field("diet") String diet,
        @Field("height") String height,
        @Field("education") String education,
        @Field("profession") String profession,
        @Field("location") String location,
        @Field("about_me") String about_me,
        @Field("partner_preference") String partner_preference,
        @Field("income") String income,
        @Field("drink") String drink,
        @Field("smoke") String smoke,
        @Field("father_occupation") String father_occupation,
        @Field("mother_occupation") String mother_occupation,
        @Field("email") String email,
        @Field("age") String age,
        @Field("physical_status") String physical_status);

    @Multipart
    @POST("add_profiles")
    Call<PhotoResponse> UploadImage(
        @Part("user_id") RequestBody user_id,
        @Part MultipartBody.Part profile1,
        @Part MultipartBody.Part profile2,
        @Part MultipartBody.Part profile3,
        @Part MultipartBody.Part profile4,
        @Part MultipartBody.Part profile5,
        @Part MultipartBody.Part profile6);

    @GET("get_all_data")
    Call<GetUserData> GetUser(
        @Query("user_id") String user_id);

    @FormUrlEncoded
    @POST("update_profile")
    Call<UpdateProfileResponse> EditProfile(
        @Field("user_id") String user_id);

    @GET("get_data_user_code")
    Call<UniqueUserData> GetUniqueUserData(
        @Query("user_code") String user_code);

    @FormUrlEncoded
    @POST("account_delete")
    Call<DeleteData> DeleteAccount(
        @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("help_and_support")
    Call<HelpSupport> Help_And_Support(
        @Field("user_id") String user_id,
        @Field ("email") String email,
        @Field ("message") String message);

}
