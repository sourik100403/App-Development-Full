package com.example.listviewapp;

import static android.widget.AdapterView.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[]={"this is","item","item2","another item","item 7677","this is","item","item2","another item","item 7677","this is","item","item2","another item","item 7677","this is","item","item2","another item","item 7677"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        // build in adapter
        //ArrayAdapter ad=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
//        listView.setAdapter(ad);



        // create custom adapter
        SourikAdapter ad=new SourikAdapter(this,R.layout.my_sourik_layout,arr);
        listView.setAdapter(ad);
        //listener on array adpter list view
//        listView.setOnClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view , int i, long l){
//                Toast.makeText(MainActivity.this, "you clicked on "+ i, Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}