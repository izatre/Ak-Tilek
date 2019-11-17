package com.example.ak_tilek;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ak_tilek.cources.CoursesActivity;
import com.example.ak_tilek.spiner.ScheduleActivity;

public class MajorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);
        TextView schedule = findViewById(R.id.schedule);
        TextView courses = findViewById(R.id.courses);
        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchCourses();
            }
        });
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchSchedule();
            }
        });
    }

    public void launchSchedule() {
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);
    }

    public void launchCourses() {
        Intent intent = new Intent(this, CoursesActivity.class);
        startActivity(intent);
    }

}