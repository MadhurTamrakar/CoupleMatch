package com.example.couplematch.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.couplematch.R;
import com.example.couplematch.model.RequestData;
import com.example.couplematch.model.ShortData;

import java.util.List;

public class sortlistAdapter extends RecyclerView.Adapter<sortlistAdapter.ViewHolder>  {

    Context context;
    List<ShortData> shortData;

    public sortlistAdapter(Context context, List<ShortData> shortData) {
        this.shortData = shortData;
        this.context = context;
    }

    @NonNull
    @Override
    public sortlistAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.card_gride_layout, null);
        sortlistAdapter.ViewHolder viewHolder = new sortlistAdapter.ViewHolder (view);
        return viewHolder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull sortlistAdapter.ViewHolder holder, int position) {

        final ShortData temp = shortData.get (position);
        holder.tv_age.setText (temp.getAge ());
        holder.idTVName.setText (shortData.get (position).getName ());
        holder.idTvCity.setText (shortData.get (position).getCity ());
        Glide.with (context)
            .load (shortData.get (position).getProfile1 ())
            .placeholder (R.drawable.avatar)
            .into (holder.idIVImage);
    }

    @Override
    public int getItemCount() {
        return shortData.size ();
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
