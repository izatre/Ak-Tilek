package com.example.ak_tilek.spiner;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.ak_tilek.R;
import com.example.ak_tilek.model.ModelsFospiner;

import java.util.List;

public class SpinerrAdapter extends ArrayAdapter<ModelsFospiner> {

    public SpinerrAdapter(Context context, List<ModelsFospiner> list) {
        super(context, R.layout.spiner_item, R.id.textspinner, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View row = inflater.inflate(R.layout.spiner_item, parent, false);
        TextView label = (TextView) row.findViewById(R.id.textspinner);
        label.setTextColor(Color.WHITE);
        ModelsFospiner model = getItem(position);
        label.setText(model.getDay());
        return row;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View row = inflater.inflate(R.layout.spiner_item, parent, false);
        TextView label = (TextView) row.findViewById(R.id.textspinner);
        label.setTextColor(Color.GRAY);
        ModelsFospiner model = getItem(position);
        label.setText(model.getDay());
        return row;
    }
}