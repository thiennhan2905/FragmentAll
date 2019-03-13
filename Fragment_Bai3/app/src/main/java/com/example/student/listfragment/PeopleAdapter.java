package com.example.student.listfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PeopleAdapter extends ArrayAdapter<People> {
    Context context;
    int idLayout;
    ArrayList<People> arrayList;

    public PeopleAdapter(@NonNull Context context, int resource, @NonNull ArrayList<People> objects) {
        super(context, resource, objects);
        this.context=context;
        this.idLayout=resource;
        this.arrayList=objects;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.layout_custom_listview,null);

            holder = new ViewHolder();
            holder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.imageView = (ImageView)convertView.findViewById(R.id.imageView1);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.tv_name.setText(arrayList.get(position).getFullName());
        holder.imageView.setImageResource(R.mipmap.ic_launcher_round);
        return convertView;
    }
    public class ViewHolder {
        TextView tv_name;
        ImageView imageView;
    }
}
