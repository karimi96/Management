package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.ViewHolder>{
//    ArrayList<User> user ;
//    Context context;
//
//    public AdapterUser(ArrayList<User> user,Context context) {
//        this.user = user;
//        this.context= context;
//    }

    @Override
    public AdapterUser.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View item = layoutInflater.inflate(R.layout.list_card_users,parent,false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
//        final User userClass = user.get(position);
//        holder.tname.setText(userClass.getName());
//        holder.tphone.setText(userClass.phone);
//        holder.tadress.setText(userClass.adress);
//        holder.tnum.setText(userClass.nm);


    }

    @Override
    public int getItemCount() {
//        return user.size();
        return 13;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tname;
        TextView tphone;
        TextView tadress;
        TextView tnum;
        public ViewHolder( View itemView) {
            super(itemView);
            this.tname = itemView.findViewById(R.id.tv_name);
            this.tphone = itemView.findViewById(R.id.tv_phone);
            this.tadress = itemView.findViewById(R.id.tv_adress);
            this.tnum= itemView.findViewById(R.id.tv_request);
        }
    }
}
