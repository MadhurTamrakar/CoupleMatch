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
import com.example.couplematch.model.RequestCancelByMe;
import com.example.couplematch.model.ViewedByMe;

import java.util.List;

public class CancelMeAdapter extends RecyclerView.Adapter<CancelMeAdapter.ViewHolder>{

    Context context;
    List<RequestCancelByMe> requestCancelByMe;

    public CancelMeAdapter(Context context, List<RequestCancelByMe> requestCancelByMe) {
        this.requestCancelByMe = requestCancelByMe;
        this.context = context;
    }

    @NonNull
    @Override
    public CancelMeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.card_gride_layout, null);
        CancelMeAdapter.ViewHolder viewHolder = new CancelMeAdapter.ViewHolder (view);
        return viewHolder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull CancelMeAdapter.ViewHolder holder, int position) {

        final RequestCancelByMe temp = requestCancelByMe.get (position);
        holder.idTVName.setText ("Name - " + requestCancelByMe.get (position).getName ());
        holder.idTvCity.setText ("City - " + requestCancelByMe.get (position).getCity ());
        Glide.with (context)
            .load (requestCancelByMe.get (position).getProfile1 ())
            .placeholder (R.drawable.avatar)
            .into (holder.idIVImage);

    }

    @Override
    public int getItemCount() {
        return requestCancelByMe.size ();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView idIVImage;
        TextView idTVName,idTvCity;
        RelativeLayout person_request;

        public ViewHolder(@NonNull View itemView) {
            super (itemView);
            person_request = itemView.findViewById (R.id.person_request);
            idIVImage = itemView.findViewById (R.id.idIVImage);
            idTVName = itemView.findViewById (R.id.idTVName);
            idTvCity = itemView.findViewById (R.id.idTvCity);
        }
    }
}
