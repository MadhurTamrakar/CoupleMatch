package com.example.couplematch.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.couplematch.ProfileActivity;
import com.example.couplematch.R;
import com.example.couplematch.model.Data2;
import com.example.couplematch.model.ViewedByMe;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder>{

    Context context;
    List<Data2> data2;

    public SearchAdapter(Context context, List<Data2> data2) {
        this.data2 = data2;
        this.context = context;
    }

    @NonNull
    @Override
    public SearchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.card_gride_layout, null);
        SearchAdapter.ViewHolder viewHolder = new SearchAdapter.ViewHolder (view);
        return viewHolder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull SearchAdapter.ViewHolder holder, int position) {

        final Data2 temp = data2.get (position);
        holder.tv_age.setText (temp.getAge ());
        holder.idTVName.setText (data2.get (position).getName ());
        holder.idTvCity.setText (data2.get (position).getCity ());
        Glide.with (context)
            .load (data2.get (position).getProfile1 ())
            .placeholder (R.drawable.avatar)
            .into (holder.idIVImage);

        holder.idIVImage.setOnClickListener (new View.OnClickListener () {
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
        return data2.size ();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView idIVImage;
        TextView idTVName,idTvCity,tv_age;


        public ViewHolder(@NonNull View itemView) {
            super (itemView);
            tv_age = itemView.findViewById (R.id.tv_age);
            idIVImage = itemView.findViewById (R.id.Image_View);
            idTVName = itemView.findViewById (R.id.tv_name);
            idTvCity = itemView.findViewById (R.id.tv_location);
        }
    }
}
