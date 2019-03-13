package com.example.student.listfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDetail extends Fragment {
    TextView tvFullName, tvBirthDay, tvAddress, tvEmail;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.layout_detailframent,container,false);

        tvFullName = (TextView) view.findViewById(R.id.tv_FullName);
        tvAddress = (TextView) view.findViewById(R.id.tv_Address);
        tvBirthDay = (TextView) view.findViewById(R.id.tv_BirthDay);
        tvEmail = (TextView) view.findViewById(R.id.tv_Email);

        Bundle bundle = getArguments();
        if (bundle != null) {
            People people = (People) bundle.get("people");
            tvFullName.setText("Họ tên: " + people.getFullName());
            tvBirthDay.setText("Năm sinh: " + people.getBirhDay());
            tvEmail.setText("email: " + people.getEmail());
            tvAddress.setText("Địa chỉ: " + people.getAddress());
        }

        return view;
    }
}
