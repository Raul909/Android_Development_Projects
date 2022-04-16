package com.example.recyclerviewandfragement;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application  //Application class will run even before the main activity runs and it is the last class that is destroyed
{
    public static ArrayList <Person> people;
    @Override
    public void onCreate() {
        super.onCreate();
        people = new ArrayList<Person>();
        people.add(new Person("Pathikrit Ghyam","7788992288"));
        people.add(new Person("Arnab Jana","6794930902"));
        people.add(new Person("Hrittik Bania","2402983210"));

    }
}

