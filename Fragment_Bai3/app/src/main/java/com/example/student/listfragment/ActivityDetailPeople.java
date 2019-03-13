package com.example.student.listfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDetailPeople extends AppCompatActivity {
    TextView tvFullName, tvBirthDay, tvAddress, tvEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_people);

        tvFullName = (TextView) findViewById(R.id.tv_FullName);
        tvAddress = (TextView) findViewById(R.id.tv_Address);
        tvBirthDay = (TextView) findViewById(R.id.tv_BirthDay);
        tvEmail = (TextView) findViewById(R.id.tv_Email);

        if (getIntent().getExtras().get("people") != null) {
            People people = (People) getIntent().getExtras().get("people");
            tvFullName.setText("Họ tên: " + people.getFullName());
            tvBirthDay.setText("Năm sinh: " + people.getBirhDay());
            tvEmail.setText("email: " + people.getEmail());
            tvAddress.setText("Địa chỉ: " + people.getAddress());
        }
    }
}
