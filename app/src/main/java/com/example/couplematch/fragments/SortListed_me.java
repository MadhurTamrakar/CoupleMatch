package com.example.couplematch.fragments;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.couplematch.FriendRequestList;
import com.example.couplematch.MainActivity;
import com.example.couplematch.R;
import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.adapter.RequestAdapter;
import com.example.couplematch.adapter.SortListedMe;
import com.example.couplematch.adapter.sortlistAdapter;
import com.example.couplematch.model.RequestData;
import com.example.couplematch.model.ShortData;
import com.example.couplematch.model.SortDataMe;
import com.example.couplematch.response.RequestReceived;
import com.example.couplematch.response.SortlistByMe;
import com.example.couplematch.response.SortlistMe;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SortListed_me extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager LayoutManager;
    SortListedMe adapter;
    List<SortDataMe> sortDataMe;
    TextView textData;
    ImageView mail_box;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public SortListed_me() {

    }

    public static SortListed_me newInstance(String param1, String param2) {
        SortListed_me fragment = new SortListed_me ();
        Bundle args = new Bundle ();
        args.putString (ARG_PARAM1, param1);
        args.putString (ARG_PARAM2, param2);
        fragment.setArguments (args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        if (getArguments () != null) {
            mParam1 = getArguments ().getString (ARG_PARAM1);
            mParam2 = getArguments ().getString (ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate (R.layout.fragment_sort_listed_me, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);
        String user_id = this.getArguments ().getString ("ID");
        sortlist (user_id);
        textData = view.findViewById (R.id.textData);
        mail_box = view.findViewById (R.id.mail_box);
        recyclerView = view.findViewById (R.id.recyclerView);
        LayoutManager = new GridLayoutManager (getActivity (), 2);
        recyclerView.setLayoutManager (LayoutManager);
        recyclerView.setHasFixedSize (true);
    }

    private void sortlist(String user_id) {
        final ProgressDialog progressDialog = new ProgressDialog (getActivity ());
        progressDialog.setMessage ("Loading....");
        progressDialog.show ();
        UserService apiService = ApiService.getService ();
        Call<SortlistMe> call = apiService.get_sort_listed_me (user_id);
        call.enqueue (new Callback<SortlistMe> () {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call<SortlistMe> call, Response<SortlistMe> response) {
                if (response.isSuccessful ()) {
                    if (response.body ().getShortData () != null) {
                        progressDialog.dismiss ();
                        mail_box.setVisibility (View.GONE);
                        textData.setVisibility (View.GONE);
                        sortDataMe = response.body ().getShortData ();
                        adapter = new SortListedMe (getActivity (), sortDataMe);
                        recyclerView.setAdapter (adapter);
                        adapter.notifyDataSetChanged ();
                        adapter.getItemCount ();

                    } else {
                        progressDialog.dismiss ();
//                        Toast.makeText (getActivity (), "No Content", Toast.LENGTH_SHORT).show ();
                        textData.setText ("No One Sort Listed You");
                    }
                }
            }

            @Override
            public void onFailure(Call<SortlistMe> call, Throwable t) {

            }
        });
    }
}
