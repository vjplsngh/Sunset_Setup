package com.example.vsingh.sunset_setup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private String name = "NAME";
    private Date date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    MainActivity (String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public static void initialize (MainActivity mainActivity) {
        mainActivity.date = new Date();
        mainActivity.name = new Date().toString();
    }
}
