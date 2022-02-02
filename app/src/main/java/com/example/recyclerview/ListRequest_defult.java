package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListRequest_defult extends AppCompatActivity {
    private RecyclerView recyclerView ;
    private AdapterRequestDefult adapterRequestDefult;
    private ImageView img_back_defult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_request_defult);

        recyclerView = findViewById(R.id.recycler_defult);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapterRequestDefult = new AdapterRequestDefult();
        recyclerView.setAdapter(adapterRequestDefult);

        img_back_defult = findViewById(R.id.imag_back_defult);
        img_back_defult.setOnClickListener(v -> {
                Intent intent = new Intent(ListRequest_defult.this ,MainActivity.class);
                startActivity(intent);
        });
    }
}