package com.example.student.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentInfo extends Fragment {
    TextView tvInfo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.layout_fragment_info,container,false);

        tvInfo = (TextView) view.findViewById(R.id.tv_info);

        /*Intent intent = new Intent();
        if (!intent.getExtras().get("textButton").toString().isEmpty()) {
            tvInfo.setText(intent.getExtras().get("textButton").toString());
        }*/

        return view;
    }
}
