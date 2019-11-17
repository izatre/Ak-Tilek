package com.example.ak_tilek.spiner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ak_tilek.model.DailySchedule;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public abstract class BaseScheduleActivity extends AppCompatActivity {
    private List<DailySchedule> dailySchedule;

    private List<DailySchedule> readJsonData(int id) {
        String json = SchedualModelUtil.loadJSONFromAsset(getApplicationContext(), "schedule_" + id + ".json");
        Type listType = new TypeToken<List<DailySchedule>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    protected DailySchedule getScheduleFor(int id) {
        for (DailySchedule schedule: dailySchedule) {
            if(schedule.getId() == id) {
                return schedule;
            }
        }
        return null;
    }

    protected void loadScheduleForGrade(int grade) {
        dailySchedule = readJsonData(grade);
        onDataSuccessFullyLoaded();
    }

    abstract void onDataSuccessFullyLoaded();
}
