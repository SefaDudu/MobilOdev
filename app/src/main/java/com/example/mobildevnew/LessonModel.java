package com.example.mobildevnew;

public class LessonModel {
    String Ders;
    String Vize;
    String Final;

    public LessonModel( String Ders, String Vize, String Final)
    {
        this.Ders=Ders;
        this.Final=Final;
        this.Vize=Vize;
    }
    public String Ders(){
        return Ders;
    }
    public String Vize(){
        return Vize;
    }
    public String Final(){
        return Final;
    }
}


