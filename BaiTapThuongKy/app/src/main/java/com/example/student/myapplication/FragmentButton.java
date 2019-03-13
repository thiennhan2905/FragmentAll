package com.example.student.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentButton extends Fragment implements View.OnClickListener {
    Button btnA, btnB, btnC;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.layout_fragmentbutton,container,false);

        btnA = (Button) view.findViewById(R.id.btn_A);
        btnB = (Button) view.findViewById(R.id.btn_B);
        btnC = (Button) view.findViewById(R.id.btn_C);

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        FragmentInfo fragmentInfo = (FragmentInfo) getFragmentManager().findFragmentById(R.id.fragmentInfo);
        Intent intent = new Intent(getActivity(),ActitvityInfo.class);
        switch (view.getId()) {
            case R.id.btn_A: {
                if (fragmentInfo!=null && fragmentInfo.isInLayout()) {
                    fragmentInfo.tvInfo.setText(btnA.getText());
                } else {

                    intent.putExtra("textButton",btnA.getText());
                    startActivity(intent);
                }
                break;
            }
            case R.id.btn_C: {
                if (fragmentInfo!=null && fragmentInfo.isInLayout()) {
                    fragmentInfo.tvInfo.setText(btnC.getText());
                } else {

                    intent.putExtra("textButton",btnC.getText());
                    startActivity(intent);
                }
                break;
            }
            case R.id.btn_B: {
                if (fragmentInfo!=null && fragmentInfo.isInLayout()) {
                    fragmentInfo.tvInfo.setText(btnB.getText());
                } else {

                    intent.putExtra("textButton",btnB.getText());
                    startActivity(intent);
                }
                break;
            }
        }
    }
}
