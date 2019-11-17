package com.example.ak_tilek.cources;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ak_tilek.Listener;
import com.example.ak_tilek.R;

import java.util.ArrayList;
import java.util.List;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesViewHolder> {
 private    List<CoursesModel> list = new ArrayList<>();




    public CoursesAdapter(List<CoursesModel> list) {
        this.list = list;


    }

    @NonNull
    @Override
    public CoursesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.courses_item, viewGroup, false);
        return new CoursesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoursesViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    public CoursesModel getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}