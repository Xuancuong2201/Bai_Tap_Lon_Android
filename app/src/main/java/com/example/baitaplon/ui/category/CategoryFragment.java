package com.example.baitaplon.ui.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baitaplon.R;
import com.example.baitaplon.adapters.CashinVerAdapter;
import com.example.baitaplon.adapters.UpdateVerticalRec;
import com.example.baitaplon.adapters.VoucherVerAdapter;
import com.example.baitaplon.models.CashinVerModel;
import com.example.baitaplon.models.VoucherVerModel;

import java.util.ArrayList;

public class CategoryFragment extends Fragment {
    RecyclerView voucherVertical, cashinVertical;
    ArrayList<VoucherVerModel> voucherVerModelList;
    VoucherVerAdapter voucherVerAdapter;

    ArrayList<CashinVerModel> cashinVerModelList;
    CashinVerAdapter cashinVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_category, container, false);

        voucherVertical = root.findViewById(R.id.Voucher_ver);
        voucherVerModelList = new ArrayList<>();
        voucherVerModelList.add(new VoucherVerModel(R.drawable.voucher1, "mua 1 tặng 1", "hết hạn 7 ngày"));
        voucherVerModelList.add(new VoucherVerModel(R.drawable.voucher2, "mua 2", "hết hạn 5 ngày"));
        voucherVerModelList.add(new VoucherVerModel(R.drawable.voucher1, "mua 1 tặng 1", "hết hạn 7 ngày"));

        voucherVerAdapter = new VoucherVerAdapter(getActivity(), voucherVerModelList);
        voucherVertical.setAdapter(voucherVerAdapter);
        voucherVertical.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        voucherVertical.setHasFixedSize(true);
        voucherVertical.setNestedScrollingEnabled(false);


        /////////////////////Cash/////////////////////////
        cashinVertical = root.findViewById(R.id.History_ver);
        cashinVerModelList = new ArrayList<>();
        cashinVerModelList.add(new CashinVerModel(R.drawable.recharge, "nạp tiền", "+400 000 VND","Viettinbank","07/06/2000"));
        cashinVerModelList.add(new CashinVerModel(R.drawable.recharge, "nạp tiền", "+300 000 VND","techcombank","24/07/2023"));
        cashinVerModelList.add(new CashinVerModel(R.drawable.recharge, "nạp tiền", "+550 000 VND","Viettinbank","25/10/2019"));

        cashinVerAdapter = new CashinVerAdapter(getActivity(), cashinVerModelList);
        cashinVertical.setAdapter(cashinVerAdapter);
        cashinVertical.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));
        cashinVertical.setHasFixedSize(true);
        cashinVertical.setNestedScrollingEnabled(false);

        return root;


    }


}