package com.example.surabayavirtualtourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class KulinerFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle
                                     savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_kuliner,container,false);

        Button btn_info = (Button) rootView.findViewById(R.id.btn_infopecel);
        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), InfoPecel.class);
                startActivity(intent);
            }
        });

        Button btn_rekom = (Button) rootView.findViewById(R.id.btn_rekompecel);
        btn_rekom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), RekomPecel.class);
                startActivity(intent);
            }
        });
        return rootView;
    }
}