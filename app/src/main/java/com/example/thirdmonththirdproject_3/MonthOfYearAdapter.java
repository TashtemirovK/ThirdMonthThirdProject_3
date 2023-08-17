package com.example.thirdmonththirdproject_3;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MonthOfYearAdapter extends RecyclerView.Adapter<MonthOfYearHolder> {

    private ArrayList<String> monthList;

    public MonthOfYearAdapter(ArrayList<String> monthList) {
        this.monthList = monthList;
    }

    @NonNull
    @Override
    public MonthOfYearHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MonthOfYearHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_month, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MonthOfYearHolder holder, int position) {
        holder.bind(monthList.get(position));

    }

    @Override
    public int getItemCount() {
        return monthList.size();
    }
}
