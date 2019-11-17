package com.example.ak_tilek.model;

public class Schedule {
    private int id;
    private String teacher;
    private String subgect;
    private String start;
    private String end;


    public Schedule(int id, String teacher, String subgect, String start, String end) {
        this.id = id;
        this.teacher = teacher;
        this.subgect = subgect;
        this.start = start;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getSubgect() {
        return subgect;
    }

    public String getStart() {
        return start;

    }

    public String getEnd() {
        return end;
    }
}
