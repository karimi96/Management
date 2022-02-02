package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListUsers extends AppCompatActivity {
    private RecyclerView recyclerView ;
    private AdapterUser adapterUser;
    private ImageView img_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_users);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapterUser = new AdapterUser();
        recyclerView.setAdapter(adapterUser);

        img_back = findViewById(R.id.imag_back_user);
        img_back.setOnClickListener(v -> {
                Intent intent = new Intent(ListUsers.this,MainActivity.class);
                startActivity(intent);
        });

    }
}