package com.example.baitaplon.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import com.example.baitaplon.DetailedDailyBakerryActivity;
import com.example.baitaplon.DetailedDailyCoffeeActivity;
import com.example.baitaplon.MyCartActivity;
import com.example.baitaplon.R;
import com.example.baitaplon.ui.menu.MenuFragment;

public class HomeFragment extends Fragment {
    AppCompatButton appCompatButton,appCompatButton1;
    Button button;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        appCompatButton =root.findViewById(R.id.Btn_Coffee);
        appCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeFragment.this.getActivity(),
                        DetailedDailyCoffeeActivity.class);
                startActivity(intent);
            }
        });
        appCompatButton1=root.findViewById(R.id.Btn_bakerry);
        appCompatButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeFragment.this.getActivity(),
                        DetailedDailyBakerryActivity.class);
                startActivity(intent);

            }
        });
        button=root.findViewById(R.id.Btn_cart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeFragment.this.getActivity(),
                        MyCartActivity.class);
                startActivity(intent);

            }
        });
        return root;

    }



}