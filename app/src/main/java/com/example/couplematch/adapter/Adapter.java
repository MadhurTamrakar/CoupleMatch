package com.example.couplematch.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.couplematch.R;
import com.example.couplematch.model.UserData;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

//    int []arr;
//    public Adapter(int[] arr) {
//        this.arr = arr;
//    }
    Context context;
    List<UserData> userData;

    public Adapter(Context context, List<UserData> userData){
        this.userData = userData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (context).inflate(R.layout.card_gride_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder (view);
        return viewHolder;
    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_name.setText (userData.get (position).getName ());
        holder.tv_age.setText (userData.get (position).getAge ().toString ());
        Glide.with (context)
            .load (userData.get (position).getProfile1 ())
//            .placeholder (R.drawable.download2)
//            .error(R.drawable.ic_launcher_background)
            .into (holder.Image_View);
//        holder.detailTitle.setText (position);
//        holder.detailTitle2.setText (position);

    }

    @Override
    public int getItemCount() {
        return userData.size ();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView Image_View,location;
        TextView tv_distance,tv_location,tv_age,tv_name;

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
