package com.example.project_tra_sua.Home.Trang_chu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.project_tra_sua.R;
import com.example.project_tra_sua.models.san_pham;

import java.util.List;

public class sp_adapter extends RecyclerView.Adapter<sp_adapter.sp_viewholder> {
    List<san_pham>list;

    Fragment fragment;
    public sp_adapter(List<san_pham> list,Fragment context) {
        this.list = list;
        this.fragment = context;
    }

    @NonNull
    @Override
    public sp_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(fragment.getContext()).inflate(R.layout.item_sp,parent,false);
        return new sp_viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull sp_viewholder holder, int position) {
        san_pham san_pham=list.get(position);
        Glide.with(fragment.getContext()).load(san_pham.getHinhanh()).error(R.drawable.img1).into(holder.imageView);
        holder.txt_name.setText(san_pham.getTensp());
        holder.txt_giatien.setText(san_pham.getGiatien());
        holder.img_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(fragment).navigate(R.id.action_trang_chu_to_ct_sp);
            }
        });
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(fragment).navigate(R.id.action_trang_chu_to_ct_sp);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (list!=null){
            return list.size();
        }
        return 0;
    }

    public class sp_viewholder extends RecyclerView.ViewHolder{
        ImageView imageView,img_add;
        TextView txt_name,txt_giatien;
        public sp_viewholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            img_add=itemView.findViewById(R.id.img_add);
            txt_name=itemView.findViewById(R.id.txt_name);
            txt_giatien=itemView.findViewById(R.id.txt_giatien);
        }
    }
}
