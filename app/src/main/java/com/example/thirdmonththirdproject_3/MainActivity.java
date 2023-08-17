package com.example.thirdmonththirdproject_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MonthOfYearAdapter monthOfYearAdapter;
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_yom);
        loadData();
        monthOfYearAdapter=new MonthOfYearAdapter(arrayList);
        recyclerView.setAdapter(monthOfYearAdapter);

    }

    private void loadData() {
        arrayList.add("Январь");
        arrayList.add("Февраль");
        arrayList.add("Март");
        arrayList.add("Апрель");
        arrayList.add("Май");
        arrayList.add("Июнь");
        arrayList.add("Июль");
        arrayList.add("Август");
        arrayList.add("Сентябрь");
        arrayList.add("Октябрь");
        arrayList.add("Ноябрь");
        arrayList.add("Декабрь");
    }
}