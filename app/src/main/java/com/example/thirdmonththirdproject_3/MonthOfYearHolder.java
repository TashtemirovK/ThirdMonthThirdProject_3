package com.example.thirdmonththirdproject_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MonthOfYearHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public MonthOfYearHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_month);
    }
    public  void bind(String month){
        textView.setText(month);
    }
}
