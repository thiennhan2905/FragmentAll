package com.example.student.fragmentbundle;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentBundle extends Fragment {

    TextView tvFragment;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        View view = inflater.inflate(R.layout.layout_fragmentbundle,container,false);

        tvFragment = (TextView) view.findViewById(R.id.tv_fragment);
        Bundle bundle = getArguments();
        if (bundle != null) {
            tvFragment.setText(bundle.get("content").toString());
        }
        return view;
    }
}
