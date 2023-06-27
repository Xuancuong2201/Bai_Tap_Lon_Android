package com.example.baitaplon.models;

public class VoucherVerModel {
    int img;
    String infor;
    String date;

    public VoucherVerModel(int img, String infor, String date) {
        this.img = img;
        this.infor = infor;
        this.date = date;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
