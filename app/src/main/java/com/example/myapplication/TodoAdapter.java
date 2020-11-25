package com.example.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class TodoAdapter extends ArrayAdapter<Todo> {
    Context cont;
    int res = R.layout.row;
    List<Todo> items;


    public TodoAdapter(@NonNull Context context, int resource, @NonNull List<Todo> todos) {
        super(context, resource, todos);
        cont = context;
        res = resource;
        items = todos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;
        LayoutInflater lif = (LayoutInflater) cont.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        row = lif.inflate(res, parent, false);
        TextView tv = row.findViewById(R.id.rowTitle);
        tv.setText(items.get(position).getName());
        TextView des = row.findViewById(R.id.rowDes);
        des.setText(items.get(position).getDescription());
//        ImageView im = row.findViewById(R.id.imageView);
//        im.setImageResource(items.get(position).getIconIndex());

        return row;
    }
}
