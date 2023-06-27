package com.example.baitaplon;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper

{
    public  static final String databaseName = "Signup.db";

    public DatabaseHelper(@Nullable Context context) {
        super(context,"Signup.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDatabase) {

        MyDatabase.execSQL("create Table users(account TEXT primary key,email TEXT, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase  MyDatabase, int i, int i1) {
        MyDatabase.execSQL("drop Table if exists users");
    }

    public Boolean insertData(String account, String password,String email)
    {
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("account",account);
        contentValues.put("password",password);
        contentValues.put("email",email);
        long result = MyDatabase.insert("users", null,contentValues);
        if(result == -1) {
            return false;
        }
        else {
            return true;
        }
    }
    public Boolean checkEmail(String email){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from users where email= ?", new String[]{email});
        if(cursor.getCount() > 0) {
            return true;
        }else {
            return false;
        }
    }

    public  Boolean checkAccount(String account)
    {
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from users where account = ?", new String[]{account});

        if (cursor.getCount() >0) {
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean checkAccountPassword(String account,String password){
        SQLiteDatabase MyDatabase = this.getWritableDatabase();
        Cursor cursor = MyDatabase.rawQuery("Select * from users where account = ? and password = ?",new String[]{account,password});
        if(cursor.getCount()>0) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
