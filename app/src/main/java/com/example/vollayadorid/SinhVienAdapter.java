package com.example.vollayadorid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SinhVienAdapter extends RecyclerView.Adapter<SinhVienAdapter.ViewHolder> {
    ArrayList<Sinhvien> sinhvienArrayList;
    Context context;

    public SinhVienAdapter(ArrayList<Sinhvien> sinhvienArrayList, Context context) {
        this.sinhvienArrayList = sinhvienArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.custom_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txthoten.setText(sinhvienArrayList.get(position).getTensv());
        holder.txtnamsinh.setText(sinhvienArrayList.get(position).getNgaysinh());
    }

    @Override
    public int getItemCount() {
        return sinhvienArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txthoten,txtnamsinh;
        ImageView imgdelete,imgEdit;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txthoten=itemView.findViewById(R.id.txtten);
            txtnamsinh=itemView.findViewById(R.id.txtnamsinh);
            imgdelete=itemView.findViewById(R.id.imgdelete);
            imgEdit=itemView.findViewById(R.id.imgEdit);
        }
    }
}
