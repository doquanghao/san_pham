package com.example.project_tra_sua.Home.Trang_chu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_tra_sua.R;
import com.example.project_tra_sua.models.chon;

import java.util.List;

public class chon_adpater extends RecyclerView.Adapter<chon_adpater.chonloai_viewholder> {
    List<chon>list;
    String loai;

    public chon_adpater(List<chon> list, String loai) {
        this.list = list;
        this.loai = loai;
    }

    @NonNull
    @Override
    public chonloai_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chon,parent,false);
        return new chonloai_viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull chonloai_viewholder holder, int position) {
        chon chon=list.get(position);
        if (chon.getThe_loai().equals(loai)){
            if (!chon.getThe_loai().equals("topping")){
                holder.checkBox.setVisibility(View.GONE);
                holder.radioButton.setVisibility(View.VISIBLE);
                holder.radioButton.setText(chon.getTen());
            }else {
                holder.checkBox.setVisibility(View.VISIBLE);
                holder.radioButton.setVisibility(View.GONE);
                holder.checkBox.setText(chon.getTen());
            }

        }
    }

    @Override
    public int getItemCount() {
        if (list!=null){
            return  list.size();
        }
        return 0;
    }

    public class chonloai_viewholder extends RecyclerView.ViewHolder{
        CheckBox checkBox;
        RadioButton radioButton;
        public chonloai_viewholder(@NonNull View itemView) {
            super(itemView);
            checkBox=itemView.findViewById(R.id.checkBox);
            radioButton=itemView.findViewById(R.id.radioButton);
        }
    }
}
