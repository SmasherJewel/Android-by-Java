package com.example.listview;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String> {
    private String arr [];
    public CustomAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr = arr;
    }

    @Nullable
    @Override
    public String getItem(int position) {
        return arr[position];
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        Influate Layout
//        For accessing custom_layout.xml content
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_layout,parent,false);
        TextView t = convertView.findViewById(R.id.textView);
        t.setText(getItem(position));
        return convertView;
    }
}
