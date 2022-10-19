package com.example.couplematch.fragments;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
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
import com.example.couplematch.R;
import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.adapter.ProfileViewerAdapter;
import com.example.couplematch.adapter.RequestAdapter;
import com.example.couplematch.model.RequestData;
import com.example.couplematch.response.RequestReceived;
import com.example.couplematch.service.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RequestByMe extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager LayoutManager;
    RequestAdapter adapter;
    List<RequestData> requestData;
    TextView textData;
    ImageView mail_box;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public RequestByMe() {
        // Required empty public constructor
    }

    public static RequestByMe newInstance(String param1, String param2) {
        RequestByMe fragment = new RequestByMe ();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate (R.layout.fragment_request_by_me, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);

        String user_id = this.getArguments ().getString ("ID");
        RequestReceived (user_id);
        textData = view.findViewById (R.id.textData);
        mail_box = view.findViewById (R.id.mail_box);
        recyclerView = view.findViewById (R.id.recyclerView);
        LayoutManager = new GridLayoutManager (getActivity (), 2);
        recyclerView.setLayoutManager (LayoutManager);
        recyclerView.setHasFixedSize (true);
    }

    private void RequestReceived(String user_id) {
        final ProgressDialog progressDialog = new ProgressDialog (getActivity());
        progressDialog.setMessage ("Loading....");
        progressDialog.show ();
        UserService apiService = ApiService.getService ();
        Call<RequestReceived> call = apiService.get_friend_requests (user_id);
        call.enqueue (new Callback<RequestReceived> () {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onResponse(Call<RequestReceived> call, Response<RequestReceived> response) {
                if (response.isSuccessful ()) {
                    assert response.body () != null;
                    if (response.body ().getRequestData () != null) {
                        progressDialog.dismiss ();
                        mail_box.setVisibility (View.GONE);
                        textData.setVisibility (View.GONE);
                        requestData = response.body ().getRequestData ();
                        adapter = new RequestAdapter (getActivity (), requestData);
                        recyclerView.setAdapter (adapter);
                        adapter.notifyDataSetChanged ();
                        adapter.getItemCount ();
                    }else{
                        progressDialog.dismiss ();
//                        Toast.makeText (getActivity (), "No Request Found", Toast.LENGTH_SHORT).show ();
                        textData.setText ("No Request Received");
                    }
                }
            }

            @Override
            public void onFailure(Call<RequestReceived> call, Throwable t) {

            }
        });
    }
}
