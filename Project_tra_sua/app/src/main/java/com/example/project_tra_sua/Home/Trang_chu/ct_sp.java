package com.example.project_tra_sua.Home.Trang_chu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_tra_sua.R;
import com.example.project_tra_sua.models.chon;

import java.util.ArrayList;


public class ct_sp extends Fragment {
    RecyclerView recy_3,recy_4,recy_5,recy_6,recy_7;
    chon_adpater chon_adpater;
    ArrayList<chon> chons = new ArrayList<>();

    public ct_sp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ct_sp, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        anhxa(view);
        getdata();


    }

    private void getdata() {
        chons.add(new chon(0,"loại","Lạnh","không"));
        chons.add(new chon(0,"loại","Ấm","không"));
        chons.add(new chon(0,"loại","Nóng","không"));
        chons.add(new chon(0,"size","Size M","không"));
        chons.add(new chon(0,"size","Size L","không"));
        chons.add(new chon(0,"size","Size LS","không"));
        chons.add(new chon(0,"đường","100% đường","không"));
        chons.add(new chon(0,"đường","80% đường","không"));
        chons.add(new chon(0,"đường","70% đường","không"));
        chons.add(new chon(0,"đường","50% đường","không"));
        chons.add(new chon(0,"đường","30% đường","không"));
        chons.add(new chon(0,"đường","không đường","không"));
        chons.add(new chon(0,"đá","100% đá","không"));
        chons.add(new chon(0,"đá","80% đá","không"));
        chons.add(new chon(0,"đá","70% đá","không"));
        chons.add(new chon(0,"đá","50% đá","không"));
        chons.add(new chon(0,"đá","30% đá","không"));
        chons.add(new chon(0,"đá","Không đá","không"));
        chons.add(new chon(0,"topping","Thêm Trân Châu Sương Mai","không"));
        chons.add(new chon(0,"topping","Thêm Trân Châu Sương Mai","không"));
        chons.add(new chon(0,"topping","Thêm Trân Châu Sương Mai","không"));
        chons.add(new chon(0,"topping","Thêm Trân Châu Sương Mai","không"));
        chons.add(new chon(0,"topping","Thêm Trân Châu Sương Mai","không"));
        chons.add(new chon(0,"topping","Thêm Trân Châu Sương Mai","không"));
    }

    private void anhxa(View view) {
        recy_3=view.findViewById(R.id.recy_3);
        recy_4=view.findViewById(R.id.recy_4);
        recy_5=view.findViewById(R.id.recy_5);
        recy_6=view.findViewById(R.id.recy_6);
        recy_7=view.findViewById(R.id.recy_7);
        recy_3.setLayoutManager(new GridLayoutManager(getContext(), 2));
        chon_adpater = new chon_adpater(chons, "loại");
        recy_3.setAdapter(chon_adpater);

        recy_4.setLayoutManager(new GridLayoutManager(getContext(), 2));
        chon_adpater = new chon_adpater(chons, "size");
        recy_4.setAdapter(chon_adpater);

        recy_5.setLayoutManager(new GridLayoutManager(getContext(), 2));
        chon_adpater = new chon_adpater(chons, "đường");
        recy_5.setAdapter(chon_adpater);

        recy_6.setLayoutManager(new GridLayoutManager(getContext(), 2));
        chon_adpater = new chon_adpater(chons, "đá");
        recy_6.setAdapter(chon_adpater);

        recy_7.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        chon_adpater = new chon_adpater(chons, "topping");
        recy_7.setAdapter(chon_adpater);
    }
}