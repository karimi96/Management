package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_listuser , tv_request ,tv_listquestion , tv_setting;
    LinearLayout linear_list_user , linear_list_question,linear_setting,linear_request;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linear_list_user = findViewById(R.id.lenear_card_list_user);
        linear_list_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListUsers.class);
                startActivity(intent);
            }
        });

        linear_request = findViewById(R.id.lenear_card_request);
        linear_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListRequestUsers.class);
                startActivity(intent);
            }
        });

        linear_list_question = findViewById(R.id.lenear_card_list_question);
        linear_list_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListRequest_defult.class);
                startActivity(intent);
            }
        });

//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
//            Window window = this.getWindow();
//            window.setStatusBarColor(this.getResources().getColor(R.color.blue_bg));
//        }

    }
}