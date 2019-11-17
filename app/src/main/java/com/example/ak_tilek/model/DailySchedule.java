package com.example.ak_tilek.model;

import java.util.List;

public class DailySchedule {

    private int id;
    private List<Schedule> data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Schedule> getData() {
        return data;
    }

    public void setData(List<Schedule> data) {
        this.data = data;
    }


}
