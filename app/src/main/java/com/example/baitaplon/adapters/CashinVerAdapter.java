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
import com.example.baitaplon.models.CashinVerModel;
import com.example.baitaplon.models.VoucherVerModel;

import java.util.ArrayList;

public class CashinVerAdapter extends RecyclerView.Adapter<CashinVerAdapter.ViewHolder> {

    Context context;
    ArrayList<CashinVerModel> list;

    public CashinVerAdapter(Context context, ArrayList<CashinVerModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CashinVerAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cashin_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CashinVerAdapter.ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImg());
        holder.money.setText(list.get(position).getMoney());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder  extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView bank,time,money,recharge;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img_recharge);
            recharge=itemView.findViewById(R.id.recharge);
            time=itemView.findViewById(R.id.time);
            money=itemView.findViewById(R.id.money);
            bank=itemView.findViewById(R.id.bank);

        }

    }
}
