package com.example.baitaplon.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baitaplon.R;
import com.example.baitaplon.models.DetailedDailyModel;

import java.time.temporal.Temporal;
import java.util.List;

public class DetailedDailyAdapter  extends RecyclerView.Adapter<DetailedDailyAdapter.ViewHolder> {

    List<DetailedDailyModel> list;

    public DetailedDailyAdapter(List<DetailedDailyModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_coffee_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImage());
        holder.price.setText(list.get(position).getPrice());
        holder.name.setText(list.get(position).getName());
        holder.timing.setText(list.get(position).getTiming());
        holder.rating.setText(list.get(position).getRating());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name,price,description,rating,timing;

        public ViewHolder(View itemview) {
            super(itemview);
            imageView = itemview.findViewById(R.id.detailed_img);
            name = itemview.findViewById(R.id.detailed_name);
            price = itemview.findViewById(R.id.detailed_price);
            description = itemview.findViewById(R.id.detailed_des);
            rating = itemview.findViewById(R.id.detailed_rating);
            timing = itemview.findViewById(R.id.detailed_timing);

        }
    }
}
