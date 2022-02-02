package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear_list_user, linear_list_question, linear_request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initID();
        initOnClick();
    }
    
    private void initID(){
        linear_list_user = findViewById(R.id.lenear_card_list_user);
        linear_request = findViewById(R.id.lenear_card_request);
        linear_list_question = findViewById(R.id.lenear_card_list_question);
    }


    private void initOnClick(){
        linear_list_user.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,ListUsers.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        linear_request.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this,ListRequestUsers.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        linear_list_question.setOnClickListener(v -> {
            startActivity( new Intent(MainActivity.this,ListRequest_defult.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });
    }
}