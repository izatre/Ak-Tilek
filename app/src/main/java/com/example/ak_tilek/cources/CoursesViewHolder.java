package com.example.ak_tilek.cources;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.ak_tilek.Listener;
import com.example.ak_tilek.R;

public class CoursesViewHolder extends RecyclerView.ViewHolder {
    private Listener listener;
    private TextView main;
    private TextView subgect;

    private TextView time;
    private TextView day;
    private ImageView url;

    public CoursesViewHolder(@NonNull View itemView) {
        super(itemView);
        main = itemView.findViewById(R.id.coursesTextView);
        day = itemView.findViewById(R.id.coursesDayTexView);
        subgect = itemView.findViewById(R.id.coursesSubgectTextView);
        time = itemView.findViewById(R.id.coursesTimeTextView);
        url = itemView.findViewById(R.id.coursesImageView);


    }



    public void bind(CoursesModel coursesModel) {
        time.setText(coursesModel.getTime());
        subgect.setText(coursesModel.getCoursesSubgectText());
        day.setText(coursesModel.getDay());
        main.setText(coursesModel.getMainText());
        Glide.with(url)
                .load(coursesModel.getUrl())
                .into(url);


    }

}