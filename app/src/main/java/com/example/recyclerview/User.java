package com.example.recyclerview;

import androidx.cardview.widget.CardView;

public class User {
    String name,phone,adress,nm;

    public User(String name, String phone, String adress, String nm) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
        this.nm = nm;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }
}
