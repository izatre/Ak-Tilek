package com.example.ak_tilek.cources;

public class CoursesModel  {
    private  String url;
private   String mainText;

private  String text;
private  String time;
private  String day;

    public String getMainText() {
        return mainText;
    }



    public String getCoursesSubgectText() {
        return text;
    }

    public String getTime() {
        return time;
    }

    public String getDay() {
        return day;
    }


 public  String getUrl(){
     return url;

 }
   public  CoursesModel (String mainText, String url, String day, String text, String time){
      this.mainText = mainText;
      this.url = url;
      this.day = day;
      this.time = time;
      this.text = text;

    }


}
