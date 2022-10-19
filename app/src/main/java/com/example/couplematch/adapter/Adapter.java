package com.example.couplematch.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
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
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    List<Result3> userData;
    SharedPrefManager sharedPrefManager;

    public Adapter(Context context, List<Result3> userData){
        this.userData = userData;
        this.context = context;
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

        holder.tv_name.setText (userData.get (position).getName ());
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

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView Image_View,location;
        TextView tv_location,tv_age,tv_name;

        public ViewHolder(@NonNull View itemView) {
            super (itemView);
            Image_View = itemView.findViewById (R.id.Image_View);
            location = itemView.findViewById (R.id.location);
//            tv_distance = itemView.findViewById (R.id.tv_distance);
            tv_location = itemView.findViewById (R.id.tv_location);
            tv_age = itemView.findViewById (R.id.tv_age);
            tv_name = itemView.findViewById (R.id.tv_name);
        }
    }
}
