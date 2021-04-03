package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.my_rcv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String arr[]={"c","c++","Java","python","c","c++","Java","python","c","c++","Java","python"};
        recyclerView.setAdapter(new MyAdapter(arr));
    }
}