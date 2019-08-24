package com.example.myapplication;


import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<String> imageName = new ArrayList<>();
    ArrayList<String> image = new ArrayList<>();

    Toolbar toolbar;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.views);
        AdaperDemo adapter=new AdaperDemo(this,image,imageName);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView = findViewById(R.id.views);
//        layoutManager = new LinearLayoutManager(this);
//
//        recyclerView.setAdapter();
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setHasFixedSize(true);

        initialiseList();


    }

    public void initialiseList() {

        imageName.add("funky pandey");
        image.add("https://gamepedia.cursecdn.com/zelda_gamepedia_en/thumb/4/46/OoT_Adult_Epona_Model.png/320px-OoT_Adult_Epona_Model.png?version=6c8ff9e624ab3f44634a2761342b257f");
        imageName.add("zahil khhan");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR9t4TzOmoisqG6CC5BqBpJ-uFH8ZARPJwagsGRWIAxQI212PqDZA");
        imageName.add("chunkey pandey");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDBNx6-z5WSxIFp-CcNMbS0UnRc657DQPUWi2ceCwX5SjNU-eNtw");
        imageName.add("pkmb");

        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROpuBKG2gQFRHkqXkdIcrBBRh6JWQadhywJtmRVzVF5y457loi");
        imageName.add("sseaj");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjuxaTdIkNishbC6lRKKk_30fgxRoB-XeVEV1LEC3cUhg-O-1zEQ");
        imageName.add("sddmc0");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrk0993IZh5cuNXQS5YM2ODjn-ShBLfWnWUjQW6gM5UIN2HHQ2");
        imageName.add("sddmc0");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTArjxmG8hlUlUhD92SzrAp7b9JDidrNt_eiDjHB8L1DDjiKkOH");
        imageName.add("df");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZoh6WKKvYM-uDm9oHexfvx8rPCCUzNtdeiAWSTARZNPEBYAPAHg");
        imageName.add("dsvf");

        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0dsVtnqB4TPNF7LImpcKtS8W3uRlaZ3--FTz5fXhdn3CDxZFl");
        imageName.add("svgfd");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSYaBoBNbdwOy3ucTgDc2egP8lAVM9xYbK2zczWtePRw3T-CF6p");
        imageName.add("sfbfb");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrIoGUYXv26NNZfd2ACxJdPiQ0npGVkO9xrIeC4VBme4lnmlsy");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRnWe04BqMC7oLRikaBPN3ntY2_F0ee-7VozUWqfsfQfW8S2jWbqw");
        imageName.add("kanti pyri");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6IHyal00VgJzZ3uZ_MH8TviN9jpkG2jLt69I69XQI8OJOYx1Ovg");
        imageName.add("snata banta");
        image.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSyuikpWHU9ygFlznWxlCAxBv563clC8D3sl1DDVDh6zhBFR5kqWA");

    }


}
