package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class ListUsers extends AppCompatActivity {
    RecyclerView recyclerView ;
    AdapterUser adapterUser;
    ImageView img_back;
//    ArrayList<User> users ;
//    String[] name = {"","","","","",""};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_users);



        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<User> users = new ArrayList<User>();
//        users.add(new User("تیباش","08938","تیابت","یتابما"));
//        users.add(new User("مهدی اکبری","09876543218","روحانی کوچه2","88"));
//        users.add(new User("رضا یوسفی","0937826537","صدوقی کوچه 5","77"));
//        users.add(new User("علی بابایی","09131563678","توحید کوچه 90","90"));


        adapterUser = new AdapterUser();
        recyclerView.setAdapter(adapterUser);


        img_back = findViewById(R.id.imag_back_user);
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListUsers.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}