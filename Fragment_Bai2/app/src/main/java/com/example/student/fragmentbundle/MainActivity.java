package com.example.student.fragmentbundle;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtContent;

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtContent = (EditText) findViewById(R.id.edt_Content);
        fragmentManager = getFragmentManager();
    }

    public void AddFragment(View view) {
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentBundle fragmentBundle = new FragmentBundle();
        Bundle bundle = new Bundle();

        if (!edtContent.getText().toString().isEmpty()) {
            bundle.putString("content",edtContent.getText().toString());
            fragmentBundle.setArguments(bundle);
        }
        Fragment fragment = fragmentManager.findFragmentById(R.id.myActivityMain);
        if (fragment != null) {
            fragmentTransaction.replace(R.id.myActivityMain,fragmentBundle);
            fragmentTransaction.commit();
            return;
        }
        fragmentTransaction.add(R.id.myActivityMain,fragmentBundle);
        fragmentTransaction.commit();
    }

    public void RemoveFragment(View view) {
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = fragmentManager.findFragmentById(R.id.myActivityMain);
        if (fragment != null) {
            fragmentTransaction.remove(fragment);
            fragmentTransaction.commit();
        }
    }
}
