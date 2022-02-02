package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

public class AdapterUser extends RecyclerView.Adapter<AdapterUser.ViewHolder>{

    @Override
    public AdapterUser.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View item = layoutInflater.inflate(R.layout.list_card_users,parent,false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 13;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder( View itemView) {
            super(itemView);

        }
    }
}
