package com.example.couplematch.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.couplematch.R;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    int []arr;
    public Adapter(int[] arr) {
        this.arr = arr;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext ()).inflate(R.layout.card_gride_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder (view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Image_View.setImageResource (arr[position]);
//        holder.detailTitle.setText (position);
//        holder.detailTitle2.setText (position);

    }

    @Override
    public int getItemCount() {
        return arr.length;
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
