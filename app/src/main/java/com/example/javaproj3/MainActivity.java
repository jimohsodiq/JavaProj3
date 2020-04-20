package com.example.javaproj3;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.biscuit, R.drawable.chicken, R.drawable.soda, R.drawable.soap, R.drawable.golden_morn, R.drawable.basket, R.drawable.books};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.shopping_list);
        s2 = getResources().getStringArray(R.array.price);



        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);

        Context context;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        }

            }




