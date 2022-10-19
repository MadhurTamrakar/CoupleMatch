package com.example.couplematch.adapter;

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
import com.example.couplematch.model.RequestAcceptedByMe;
import com.example.couplematch.model.ViewedByMe;

import java.util.List;

public class AcceptedMeAdapter  extends RecyclerView.Adapter<AcceptedMeAdapter.ViewHolder>{

    Context context;
    List<RequestAcceptedByMe> requestAcceptedByMe;

    public AcceptedMeAdapter(Context context, List<RequestAcceptedByMe> requestAcceptedByMe) {
        this.requestAcceptedByMe = requestAcceptedByMe;
        this.context = context;
    }

    @NonNull
    @Override
    public AcceptedMeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.card_gride_layout, null);
        AcceptedMeAdapter.ViewHolder viewHolder = new AcceptedMeAdapter.ViewHolder (view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AcceptedMeAdapter.ViewHolder holder, int position) {

        final RequestAcceptedByMe temp = requestAcceptedByMe.get (position);
        holder.tv_age.setText (temp.getAge ());
        holder.idTVName.setText (requestAcceptedByMe.get (position).getName ());
        holder.idTvCity.setText (requestAcceptedByMe.get (position).getCity ());
        Glide.with (context)
            .load (requestAcceptedByMe.get (position).getProfile1 ())
            .placeholder (R.drawable.avatar)
            .into (holder.idIVImage);
    }

    @Override
    public int getItemCount() {
        return requestAcceptedByMe.size ();
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
