package com.example.project_tra_sua.Home.Trang_chu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.project_tra_sua.R;
import com.example.project_tra_sua.models.danh_muc;

import java.util.List;

public class danh_muc_adpater extends RecyclerView.Adapter<danh_muc_adpater.danh_muc_viewhodler> {
    List<danh_muc>list;
    Context context;

    public danh_muc_adpater(List<danh_muc> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public danh_muc_viewhodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_danhmuc,parent,false);
        return new danh_muc_viewhodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull danh_muc_viewhodler holder, int position) {
        danh_muc danh_muc=list.get(position);
        Glide.with(context).load(danh_muc.getHinhanh()).error(R.drawable.tra_sua).into(holder.imageView);
        holder.txt_name.setText(danh_muc.getTen_dm());
    }

    @Override
    public int getItemCount() {
        if (list!=null){
            return list.size();
        }
        return 0;
    }

    public class danh_muc_viewhodler extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txt_name;
        public danh_muc_viewhodler(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.profile_image);
            txt_name=itemView.findViewById(R.id.txt_name);

        }
    }
}
