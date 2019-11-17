package com.example.ak_tilek.model;

public class ModelsFospiner {
    private  String day;
    private  int id;

    public String  getDay(){
        return day;
    }
    public int getId(){
        return id;
    }

    public  ModelsFospiner(int id,String day){
        this.id =  id;
        this.day = day;
    }

}