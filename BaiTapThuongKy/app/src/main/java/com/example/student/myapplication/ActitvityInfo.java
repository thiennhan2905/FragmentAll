package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActitvityInfo extends AppCompatActivity{
    TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actitvity_info);

        tvInfo = (TextView) findViewById(R.id.tv_info);

        Intent intent = getIntent();
        if (!intent.getExtras().get("textButton").toString().isEmpty()) {
            tvInfo.setText(intent.getExtras().get("textButton").toString());
        }
    }
}
