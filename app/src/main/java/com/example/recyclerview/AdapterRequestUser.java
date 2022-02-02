package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

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
        holder.linear_call.setOnClickListener(v -> {
                    String phonnumber = "09903927338";
                    Intent call = new Intent(Intent.ACTION_DIAL);
                    call.setData(Uri.parse("tel:" + phonnumber));
                    context.startActivity(call);
        });

        holder.linear_massage.setOnClickListener(v -> {
                    Intent sms = new Intent(Intent.ACTION_VIEW);
                    sms.putExtra("sms_body","Hello guys");
                    sms.putExtra("adress","09381230567");
                    sms.setData(Uri.parse("smsto:"));
                    sms.setType("vnd.android-dir/mms-sms");
                    context.startActivity(sms);
        });

    }


    @Override
    public int getItemCount() {
        return 15;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linear_call;
        LinearLayout linear_massage;
        public ViewHolder( View itemView) {
            super(itemView);
            linear_call = itemView.findViewById(R.id.linear_call);
            linear_massage = itemView.findViewById(R.id.linear_massage);
        }
    }
}
