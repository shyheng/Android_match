package com.example.ui1.ui.inde.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ui1.R;
import com.example.ui1.tool.ImageLoad;
import com.example.ui1.tool.Net;
import com.example.ui1.tool.NetAIP;
import com.youth.banner.Banner;

import retrofit2.Call;
import retrofit2.Response;


public class HomeFragment extends Fragment {


    private EditText et;
    private LinearLayout ss;
    private Banner ban;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ban = root.findViewById(R.id.ban);
        ban.setImageLoader(new ImageLoad());
        Net.netAIP.rot("2").enqueue(new Net<NetAIP.Rot>() {
            @Override
            public void onResponse(Call<NetAIP.Rot> call, Response<NetAIP.Rot> response) {

                ban.setImages(response.body().rows);
            }
        });

        return root;
    }
}