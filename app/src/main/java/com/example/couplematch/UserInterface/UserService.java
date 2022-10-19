package com.example.couplematch.UserInterface;

import com.example.couplematch.model.Result3;
import com.example.couplematch.model.ShortData;
import com.example.couplematch.response.AcceptedByMe;
import com.example.couplematch.response.AcceptedByUser;
import com.example.couplematch.response.Block;
import com.example.couplematch.response.CancelByMe;
import com.example.couplematch.response.CancelByUser;
import com.example.couplematch.response.CancelRequest;
import com.example.couplematch.response.ConfirmRequest;
import com.example.couplematch.response.DeleteData;
import com.example.couplematch.response.GetUserData;
import com.example.couplematch.response.HelpSupport;
import com.example.couplematch.response.PhotoResponse;
import com.example.couplematch.response.RequestReceived;
import com.example.couplematch.response.RequestSend;
import com.example.couplematch.response.RequestSendByMe;
import com.example.couplematch.response.SavedPreference;
import com.example.couplematch.response.SignUpResponse;
import com.example.couplematch.response.SortList;
import com.example.couplematch.response.SortlistByMe;
import com.example.couplematch.response.SortlistMe;
import com.example.couplematch.response.UniqueUserData;
import com.example.couplematch.response.UpdateProfileResponse;
import com.example.couplematch.response.ViewProfile;
import com.example.couplematch.response.Viewed;
import com.example.couplematch.response.ViewerData;
import com.example.couplematch.response.profileViewed;

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
        @Field("age") String age);

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
        @Field("city") String city,
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
        @Field("email") String email,
        @Field("message") String message);

    @FormUrlEncoded
    @POST("search_partner_preference")
    Call<SavedPreference> search_partner_preference(
        @Field ("gender") String gender,
        @Field("age") String age,
        @Field("religion") String religion,
        @Field("dosh") String dosh,
        @Field("marital_status") String marital_status,
        @Field("diet") String diet,
        @Field("height") String height,
        @Field("education") String education,
        @Field("profession") String profession,
        @Field("drink") String drink,
        @Field("smoke") String smoke,
        @Field("physical_status") String physical_status);

    @FormUrlEncoded
    @POST("send_friend_request")
    Call<RequestSend> send_friend_request(
        @Field("user_id") String user_id,
        @Field("request_id") String request_id);

    @GET("get_friend_requests")
    Call<RequestReceived> get_friend_requests(
        @Query("user_id") String user_id);

    @FormUrlEncoded
    @POST("confirm_request")
    Call<ConfirmRequest> confirm_request(
        @Field("user_id") String user_id,
        @Field("request_id") String request_id);

    @FormUrlEncoded
    @POST("cancel_request")
    Call<CancelRequest> cancel_request(
        @Field("user_id") String user_id,
        @Field("request_id") String request_id);

    @FormUrlEncoded
    @POST("requested_profile")
    Call<ViewProfile> requested_profile(
        @Field("request_id") String request_id);

    @FormUrlEncoded
    @POST("block_user")
    Call<Block> block_user(
        @Field("user_id") String user_id,
        @Field("block_id") String block_id);

    @FormUrlEncoded
    @POST("sort_list")
    Call<SortList> sort_list(
        @Field("user_id") String user_id,
        @Field("sort_id") String sort_id);

    @FormUrlEncoded
    @POST("get_sort_by_me")
    Call<SortlistByMe> get_sort_by_me(
        @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("get_sort_listed_me")
    Call<SortlistMe> get_sort_listed_me(
        @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("get_profile_viewer")
    Call<ViewerData> get_profile_viewer(
        @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("profile_view")
    Call<profileViewed> profile_view(
        @Field("user_id") String user_id,
        @Field ("profile_id") String profile_id);

    @FormUrlEncoded
    @POST("get_profile_viewed")
    Call<Viewed> get_profile_viewed(
        @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("request_accepted_by_user")
    Call<AcceptedByUser> request_accepted_by_user(
        @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("request_accepted_by_me")
    Call<AcceptedByMe> request_accepted_by_me(
        @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("request_cancel_by_user")
    Call<CancelByUser> request_cancel_by_user(
        @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("request_cancel_by_me")
    Call<CancelByMe> request_cancel_by_me(
        @Field("user_id") String user_id);

    @FormUrlEncoded
    @POST("friend_request_send_by_me")
    Call<RequestSendByMe> friend_request_send_by_me(
        @Field("user_id") String user_id);
}
