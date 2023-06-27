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

public class DetailedDailyBakerryActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_bakery);

        recyclerView = findViewById(R.id.detailed_rec1);
        imageView = findViewById(R.id.detailed_img1);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);
        detailedDailyModelList.add(new DetailedDailyModel(R.drawable.banh1,"Bánh Croissaant","description","4.9","10","07am to 10pm"));
        detailedDailyModelList.add(new DetailedDailyModel(R.drawable.banh3,"Bánh Muffin","description","4.9","10","07am to 10pm"));
        detailedDailyModelList.add(new DetailedDailyModel(R.drawable.banh4,"Bánh Chocolate","description","4.9","12","09am to 10pm"));
        detailedDailyModelList.add(new DetailedDailyModel(R.drawable.banh5,"Bánh Strawberry","description","4.9","12","09am to 10pm"));
        detailedDailyModelList.add(new DetailedDailyModel(R.drawable.banhmy,"Bánh mỳ","description","4.9","10","07am to 10pm"));
        dailyAdapter.notifyDataSetChanged();

    }
}