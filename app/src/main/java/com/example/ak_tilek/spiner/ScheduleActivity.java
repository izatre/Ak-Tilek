package com.example.ak_tilek.spiner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ak_tilek.R;
import com.example.ak_tilek.RAH.MyAdapter;
import com.example.ak_tilek.model.DailySchedule;
import com.example.ak_tilek.model.ModelsFospiner;

import java.util.ArrayList;
import java.util.List;

public class ScheduleActivity extends BaseScheduleActivity {
    private Spinner spinerFoClasses;
    private Spinner spinerFodays;
    private RecyclerView recyclerView;
    private List<ModelsFospiner> grade;
    private List<ModelsFospiner> days;
    private MyAdapter adapter;
    private int activeGrade = 10;
    private int activeDay = 3;

    private AdapterView.OnItemSelectedListener daysListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            ModelsFospiner curWeekDay = days.get(position);
            DailySchedule schedule =
                    getScheduleFor(curWeekDay.getId());
            activeDay = curWeekDay.getId();
            if (schedule != null)
                adapter.update(schedule);

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    private AdapterView.OnItemSelectedListener gradeListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            ModelsFospiner curGrade = grade.get(position);
            loadScheduleForGrade(Integer.parseInt(curGrade.getDay()));

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiner);
        setupRecyclerView();
        setupClasses();
        setupDays();
        loadScheduleForGrade(activeGrade);
    }

    @Override
    public void onDataSuccessFullyLoaded() {
        adapter.update(getScheduleFor(activeDay));
    }

    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerFoR);
        adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void setupClasses() {
        spinerFoClasses = findViewById(R.id.gradeSpinner);

        SpinerrAdapter adapter = new SpinerrAdapter(this, getWeek());
        spinerFoClasses.setAdapter(adapter);
        spinerFoClasses.setOnItemSelectedListener(gradeListener);
    }

    private void setupDays() {
        spinerFodays = findViewById(R.id.daySpinner);

        AdapterForDaysSpinner adapter = new AdapterForDaysSpinner(this, getDays());
        spinerFodays.setAdapter(adapter);
        spinerFodays.setOnItemSelectedListener(daysListener);
    }

    private List<ModelsFospiner> getDays() {
        if (days == null) {
            this.days = day();
        }
        return days;
    }

    private List<ModelsFospiner> getWeek() {
        if (grade == null) {
            this.grade = getGrades();
        }
        return grade;
    }

    private List<ModelsFospiner> getGrades() {
        List<ModelsFospiner> list = new ArrayList<>();
        list.add(new ModelsFospiner(1, "10"));
        list.add(new ModelsFospiner(2, "9"));
        list.add(new ModelsFospiner(3, "8"));
        list.add(new ModelsFospiner(4, "7"));
        return list;
    }

    private List<ModelsFospiner> day() {
        List<ModelsFospiner> daylist = new ArrayList<>();
        daylist.add(new ModelsFospiner(1, "пн"));
        daylist.add(new ModelsFospiner(2, "вт"));
        daylist.add(new ModelsFospiner(3, "ср"));
        daylist.add(new ModelsFospiner(4, "чт"));
        daylist.add(new ModelsFospiner(5, "пт"));
        return daylist;
    }
}