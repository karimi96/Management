package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ListRequestUsers extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterRequestUser adapterRequestUser;
    Dialog dialog;
    CardView cardView;
    TextView tt;
    ImageView img_back_request_user;


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
        img_back_request_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(ListRequestUsers.this,MainActivity.class);
                startActivity(back);
            }
        });









//        dialog = new Dialog(ListRequestUsers.this);
//        dialog.setContentView(R.layout.customs_dialog);
////        dialog.getWindow().setBackgroundDrawable();
//        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//        dialog.setCancelable(false);
//       recyclerView.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View v) {
//               dialog.show();
//           }
//       });
//        cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.show();
//            }
//        });









    }
}