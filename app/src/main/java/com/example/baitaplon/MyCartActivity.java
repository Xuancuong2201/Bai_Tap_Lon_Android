package com.example.baitaplon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baitaplon.adapters.CartAdapter;
import com.example.baitaplon.models.CartModel;
import com.example.baitaplon.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.List;

public class MyCartActivity extends AppCompatActivity {
    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        recyclerView =findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        list = new ArrayList<>();
        list.add(new CartModel(R.drawable.sanwich,"Order1","30","4.3"));
        list.add(new CartModel(R.drawable.banh1,"Order1","30","4.3"));
        list.add(new CartModel(R.drawable.sanwich,"Order1","30","4.3"));
        list.add(new CartModel(R.drawable.banh1,"Order1","30","4.3"));
        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);



    }
}