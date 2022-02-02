package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListRequestUsers extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterRequestUser adapterRequestUser;
    private TextView tt;
    private ImageView img_back_request_user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_request_users);

        recyclerView = findViewById(R.id.recycler_request_users);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapterRequestUser = new AdapterRequestUser(this);
        recyclerView.setAdapter(adapterRequestUser);

        img_back_request_user =findViewById(R.id.img_back_request_user);
        img_back_request_user.setOnClickListener(v -> {
                Intent back = new Intent(ListRequestUsers.this,MainActivity.class);
                startActivity(back);
        });
    }
}