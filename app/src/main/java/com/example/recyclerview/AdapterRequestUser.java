package com.example.recyclerview;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRequestUser extends RecyclerView.Adapter<AdapterRequestUser.ViewHolder> {
    Context context;

    public AdapterRequestUser(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_card_request_users,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( AdapterRequestUser.ViewHolder holder, int position) {
        holder.img_make_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //<editor-fold desc="test send massage: first way">

                //int permitioncheck = ContextCompat.checkSelfPermission(context, Manifest.permission.SEND_SMS);
//                if(permitioncheck == PackageManager.PERMISSION_GRANTED){
//                    String phone = "09796";
//                    String messag = "hello world";
//                    SmsManager smsManager = SmsManager.getDefault();
//                    smsManager.sendTextMessage(phone,null,messag,null,null);
//                }
//                else {
////                    ActivityCompat.requestPermissions(,new String[]{Manifest.permission.SEND_SMS},0);
//                }
                //</editor-fold>


//                test CALL
                String phonnumber = "09903927338";
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:" + phonnumber));
                context.startActivity(call);
            }
        });

        holder.tv_make_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phonnumber = "09803927338";
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:" + phonnumber));
                context.startActivity(call);
            }
        });

        holder.img_send_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String phonnumber = "09381230567";
                Intent sms = new Intent(Intent.ACTION_VIEW);
                sms.putExtra("sms_body","Hello guys");
                sms.putExtra("adress","09381230567");
                sms.setData(Uri.parse("smsto:"));
                sms.setType("vnd.android-dir/mms-sms");
                context.startActivity(sms);
            }
        });

        holder.tv_send_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sms = new Intent(Intent.ACTION_VIEW);
                sms.putExtra("sms_body","Hello guys");
                sms.putExtra("address","09107657234");
                sms.setData(Uri.parse("smsto:"));
                sms.setType("vnd.android-dir/mms-sms");
                context.startActivity(sms);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_send_sms;
        ImageView img_make_call;
        TextView tv_send_sms;
        TextView tv_make_call;
        public ViewHolder( View itemView) {
            super(itemView);
            img_send_sms = itemView.findViewById(R.id.img_send_sms);
            img_make_call = itemView.findViewById(R.id.img_call);
            tv_send_sms = itemView.findViewById(R.id.tv_massage);
            tv_make_call = itemView.findViewById(R.id.tv_call);
        }
    }
}
