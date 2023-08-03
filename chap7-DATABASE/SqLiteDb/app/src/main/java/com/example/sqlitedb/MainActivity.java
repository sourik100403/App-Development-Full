package com.example.sqlitedb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DbHandeler handeler = new DbHandeler(this, "empdb", null, 1);
//        handeler.addEmployee(new Employee(10, "diya nag", 33.3));
        handeler.getEmployee(3);
        handeler.close();
    }
}