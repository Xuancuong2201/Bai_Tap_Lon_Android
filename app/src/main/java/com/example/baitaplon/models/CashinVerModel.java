package com.example.baitaplon.models;

public class CashinVerModel {
    int img;
    String recharge;
    String money;
    String bank;
    String time;

    public CashinVerModel(int img, String recharge, String money, String bank, String time) {
        this.img = img;
        this.recharge = recharge;
        this.money = money;
        this.bank = bank;
        this.time = time;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getRecharge() {
        return recharge;
    }

    public void setRecharge(String recharge) {
        this.recharge = recharge;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
