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
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.couplematch.ProfileActivity;
import com.example.couplematch.R;
import com.example.couplematch.RequestReceivedActivity;
import com.example.couplematch.model.RequestData;
import com.example.couplematch.model.Result3;

import java.util.List;

public class RequestAdapter extends RecyclerView.Adapter<RequestAdapter.ViewHolder> {

    Context context;
    List<RequestData> requestData;

    public RequestAdapter(Context context, List<RequestData> requestData) {
        this.requestData = requestData;
        this.context = context;
    }

    @NonNull
    @Override
    public RequestAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.card_gride_layout, null);
        RequestAdapter.ViewHolder viewHolder = new RequestAdapter.ViewHolder (view);
        return viewHolder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RequestAdapter.ViewHolder holder, int position) {

        final RequestData temp = requestData.get (position);
        holder.tv_age.setText (temp.getAge ());
        holder.idTVName.setText (requestData.get (position).getName ());
        holder.idTvCity.setText (requestData.get (position).getCity ());
        Glide.with (context)
            .load (requestData.get (position).getProfile1 ())
            .placeholder (R.drawable.avatar)
            .into (holder.idIVImage);

        holder.idIVImage.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (context, RequestReceivedActivity.class);
                i.putExtra ("Request_id", temp.getId ());
                i.putExtra ("Name", temp.getName ()) ;
                i.putExtra ("Image", temp.getProfile1 ());

                i.setFlags (Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity (i);

            }
        });
    }

    @Override
    public int getItemCount() {
            return requestData.size ();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

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
