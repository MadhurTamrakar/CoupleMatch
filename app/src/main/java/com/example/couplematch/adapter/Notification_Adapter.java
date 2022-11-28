package com.example.couplematch.adapter;

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
import com.example.couplematch.model.AllNotification;
import com.example.couplematch.model.RequestAcceptedByMe;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class Notification_Adapter extends RecyclerView.Adapter<Notification_Adapter.ViewHolder> {
    Context context;
    List<AllNotification> notification;

    public Notification_Adapter(Context context, List<AllNotification> notification) {
        this.notification = notification;
        this.context = context;
    }

    public Notification_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from (parent.getContext ()).inflate (R.layout.notification_cardview, null);
        Notification_Adapter.ViewHolder viewHolder = new Notification_Adapter.ViewHolder (view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Notification_Adapter.ViewHolder holder, int position) {

        final AllNotification temp = notification.get (position);
        holder.message_tv.setText (temp.getMessage ());
        holder.idTVName.setText (notification.get (position).getName ());
        holder.name_tv.setText (notification.get (position).getName ());
        Glide.with (context)
            .load (notification.get (position).getProfile1 ())
            .placeholder (R.drawable.avatar)
            .into (holder.idIVImage);
    }

    @Override
    public int getItemCount() {
        return notification.size ();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircularImageView idIVImage;
        TextView idTVName,message_tv,name_tv;

        public ViewHolder(@NonNull View itemView) {
            super (itemView);

            message_tv = itemView.findViewById (R.id.message_tv);
            idIVImage = itemView.findViewById (R.id.idIVImage);
            idTVName = itemView.findViewById (R.id.idTVName);
            name_tv = itemView.findViewById (R.id.name_tv);
        }
    }
}
