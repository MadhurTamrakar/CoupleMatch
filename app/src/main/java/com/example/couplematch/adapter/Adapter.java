package com.example.couplematch.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.couplematch.ProfileActivity;
import com.example.couplematch.R;
import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.model.Result3;
import com.example.couplematch.response.ViewerData;
import com.example.couplematch.response.profileViewed;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharePre;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    Context context;
    List<Result3> userData;
    SharedPrefManager sharedPrefManager;
    SharePre sharePre;
    private double MyLat;
    private double MyLong;

    public Adapter(Context context, List<Result3> userData) {
        this.userData = userData;
        this.context = context;
        sharedPrefManager = new SharedPrefManager (context);
        sharePre = new SharePre (context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.card_gride_layout, null);
        Adapter.ViewHolder viewHolder = new Adapter.ViewHolder (view);
        return viewHolder;


    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Result3 temp = userData.get (position);

        String location = sharedPrefManager.getUserCity ();
        String LocationB = userData.get (0).getCity ();
        Geocoder gc = new Geocoder(context);

        try {
            List<Address> addresses= gc.getFromLocationName(location, 5);
            List<Address> addressesB= gc.getFromLocationName(LocationB, 5);

            List<LatLng> ll = new ArrayList<LatLng>(addresses.size());
            List<LatLng> llB = new ArrayList<LatLng>(addressesB.size());

            for(Address a : addresses){
                if(a.hasLatitude() && a.hasLongitude()){
                    ll.add(new LatLng(a.getLatitude(), a.getLongitude()));
                    Location locationA = new Location ("AddressA");
                    locationA.setLatitude (a.getLatitude ());
                    locationA.setLongitude (a.getLongitude ());
                    sharePre.setlatA (String.valueOf (a.getLatitude ()));
                    sharePre.setlngA (String.valueOf (a.getLongitude ()));
                }
            }
            for(Address b : addressesB){
                if(b.hasLatitude() && b.hasLongitude()){
                    llB.add(new LatLng(b.getLatitude(), b.getLongitude()));
                    Location locationB = new Location ("AddressB");
                    locationB.setLatitude (b.getLatitude ());
                    locationB.setLongitude (b.getLongitude ());
                    sharePre.setlatB (String.valueOf (b.getLatitude ()));
                    sharePre.setlngB (String.valueOf (b.getLongitude ()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace ();
        }

        Location locationA = new Location ("AddressA");
        locationA.setLatitude (Double.parseDouble(sharePre.getlatA ()));
        locationA.setLongitude (Double.parseDouble(sharePre.getlngA ()));

        Location locationB = new Location ("AddressB");
        locationB.setLatitude (Double.parseDouble(sharePre.getlatB ()));
        locationB.setLongitude (Double.parseDouble(sharePre.getlngB ()));

        float distance = locationA.distanceTo (locationB);

//        holder.tv_distance.setText(String.valueOf (distance));
        holder.tv_name.setText (userData.get (position).getShortName ());
        holder.tv_location.setText (userData.get (position).getCity ());
        holder.tv_age.setText (userData.get (position).getAge ());
        Glide.with (context)
            .load (userData.get (position).getProfile1 ())
            .placeholder (R.drawable.avatar)
            .centerCrop ()
            .into (holder.Image_View);

        holder.Image_View.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (context, ProfileActivity.class);
                intent.putExtra ("Id", temp.getId ());
                intent.putExtra ("Image", temp.getProfile1 ());
                intent.putExtra ("Image2", temp.getProfile2 ());
                intent.putExtra ("Image3", temp.getProfile3 ());
                intent.putExtra ("Image4", temp.getProfile4 ());
                intent.putExtra ("Image5", temp.getProfile5 ());
                intent.putExtra ("Image6", temp.getProfile6 ());
                intent.putExtra ("Name", temp.getName ());
                intent.putExtra ("UserCode", temp.getUserCode ());
                intent.putExtra ("Religion", temp.getReligion ());
                intent.putExtra ("Marital_Status", temp.getMaritalStatus ());
                intent.putExtra ("Height", temp.getHeight ());
                intent.putExtra ("Diet", temp.getDiet ());
                intent.putExtra ("Education", temp.getEducation ());
                intent.putExtra ("Profession", temp.getProfession ());
                intent.putExtra ("About_Me", temp.getAboutMe ());
                intent.putExtra ("Partner_Preference", temp.getPartnerPreference ());
                intent.putExtra ("City", temp.getCity ());
                intent.putExtra ("Age", temp.getAge ());

                intent.setFlags (Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity (intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userData.size ();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView Image_View, location;
        TextView tv_location, tv_age, tv_name, tv_distance;

        public ViewHolder(@NonNull View itemView) {
            super (itemView);
            Image_View = itemView.findViewById (R.id.Image_View);
            location = itemView.findViewById (R.id.location);
            tv_distance = itemView.findViewById (R.id.tv_distance);
            tv_location = itemView.findViewById (R.id.tv_location);
            tv_age = itemView.findViewById (R.id.tv_age);
            tv_name = itemView.findViewById (R.id.tv_name);
        }
    }
}
