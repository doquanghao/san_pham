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
import com.example.project_tra_sua.models.danh_muc;
import com.example.project_tra_sua.models.san_pham;

import java.util.ArrayList;


public class trang_chu extends Fragment {

    RecyclerView recy_1,recy_2;
    danh_muc_adpater danh_muc_adpater;
    sp_adapter sp_adapter;

    ArrayList<danh_muc>danh_mucs=new ArrayList<>();
    ArrayList<san_pham>san_phams=new ArrayList<>();

    public trang_chu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trang_chu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        anhxa(view);
        getdata();
    }

    private void getdata() {
        danh_mucs.add(new danh_muc(0,"Món nổi bật","https://cdn-icons-png.flaticon.com/512/4645/4645898.png","khong"));
        danh_mucs.add(new danh_muc(1,"Món nổi bật","https://cdn-icons-png.flaticon.com/512/4645/4645898.png","khong"));
        danh_mucs.add(new danh_muc(2,"Món nổi bật","https://cdn-icons-png.flaticon.com/512/4645/4645898.png","khong"));
        danh_mucs.add(new danh_muc(3,"Món nổi bật","https://cdn-icons-png.flaticon.com/512/4645/4645898.png","khong"));
        danh_mucs.add(new danh_muc(4,"Món nổi bật","https://cdn-icons-png.flaticon.com/512/4645/4645898.png","khong"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng1","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng2","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng3","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng4","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng5","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng6","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng6","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng8","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng9","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));
        san_phams.add(new san_pham(0,1,"Trà Xoài Bưởi Hồng10","38000d","https://tocotocotea.com/wp-content/uploads/2022/04/trà-xoài-bưởi-hồng.png"));

    }

    private void anhxa(View view) {
        recy_1=view.findViewById(R.id.recy_1);
        recy_2=view.findViewById(R.id.recy_2);



        recy_1.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        danh_muc_adpater=new danh_muc_adpater(danh_mucs,getContext());
        recy_1.setAdapter(danh_muc_adpater);


        recy_2.setLayoutManager(new GridLayoutManager(getContext(),2));
        sp_adapter=new sp_adapter(san_phams,this);
        recy_2.setAdapter(sp_adapter);



    }
}