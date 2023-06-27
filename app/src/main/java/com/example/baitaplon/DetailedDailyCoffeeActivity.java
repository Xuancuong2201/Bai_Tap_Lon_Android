package com.example.baitaplon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.baitaplon.adapters.DetailedDailyAdapter;
import com.example.baitaplon.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyCoffeeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_coffee);


        recyclerView = findViewById(R.id.detailed_rec);
        imageView = findViewById(R.id.detailed_img);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();

        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);
        detailedDailyModelList.add(new DetailedDailyModel(R.drawable.espreeso,"espresso","description","4.9","40","07am to 10pm"));
        detailedDailyModelList.add(new DetailedDailyModel(R.drawable.latteamericano,"ColdBrew Latte","description","4.4","59","07am to 10pm"));
        detailedDailyModelList.add(new DetailedDailyModel(R.drawable.americano,"Americano","description","4.5","30","07am to 10pm"));
        detailedDailyModelList.add(new DetailedDailyModel(R.drawable.coffeenau,"coffee milk","description","4.9","30","07am to 10pm"));
        detailedDailyModelList.add(new DetailedDailyModel(R.drawable.latte,"latte","description","4.9","30","07am to 10pm"));
        dailyAdapter.notifyDataSetChanged();


    }
}