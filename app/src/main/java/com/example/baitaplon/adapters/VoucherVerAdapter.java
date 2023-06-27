package com.example.baitaplon.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baitaplon.R;
import com.example.baitaplon.models.VoucherVerModel;

import java.util.ArrayList;

public class VoucherVerAdapter extends RecyclerView.Adapter<VoucherVerAdapter.ViewHolder> {

    Context context;
    ArrayList<VoucherVerModel> list;

    public VoucherVerAdapter(Context context, ArrayList<VoucherVerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VoucherVerAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.category_ver_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VoucherVerAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImg());
        holder.infor.setText(list.get(position).getInfor());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder  extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView infor,date;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.ver_img);
            infor=itemView.findViewById(R.id.ver_infor);
            date=itemView.findViewById(R.id.ver_date);
        }

    }
}
