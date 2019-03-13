package com.example.student.listfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Fragment1 extends Fragment{
    ListView listView1;
    PeopleAdapter arrayAdapter;
    ArrayList<People> arrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater,container,savedInstanceState);
        View view = inflater.inflate(R.layout.layout_listfragment,container,false);

        listView1 = (ListView) view.findViewById(R.id.listView1);

        arrayList = new ArrayList<People>();
        arrayList = PeopleModel.getListPeopleDemo();

        arrayAdapter = new PeopleAdapter (getActivity(),R.layout.layout_custom_listview,arrayList);
        listView1.setAdapter(arrayAdapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                People people = arrayList.get(i);
                Bundle bundle = new Bundle();
                bundle.putSerializable("people",people);
                FragmentDetail fragmentDetail = new FragmentDetail();
                fragmentDetail.setArguments(bundle);

                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();

                fragmentTransaction.replace(R.id.frameLayoutList,fragmentDetail);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
