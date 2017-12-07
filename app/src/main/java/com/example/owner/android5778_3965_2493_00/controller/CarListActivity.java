package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ClipData;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.datasource.List_DBManager;
import com.example.owner.android5778_3965_2493_00.model.entities.Car;

import java.util.List;

public class CarListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);
    }

    void initItemByListView() {
        final List<Car> myList = DBManagerFactory.getManager().getCars();
        ListView listView = new ListView(this);
        ArrayAdapter<Car> adapter = new ArrayAdapter<Car>(this, R.layout.row_car, myList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null)
                {
                    convertView = View.inflate(CarListActivity.this ,R.layout.row_car, null);
                }
                TextView productHouseBranchTextView = (TextView) convertView.findViewById(R.id.HouseBranchEditText);
                TextView productModelNameTextView = (TextView) convertView.findViewById(R.id.ModelNameEditText);
                TextView productionMileAgeTextView = (TextView) convertView.findViewById(R.id.MileAgeEditText);
                TextView productionCarNumberTextView = (TextView) convertView.findViewById(R.id.CarNumberEditText);
                productHouseBranchTextView.setText(((Integer) myList.get(position).getHouseBranch()).toString());
                productModelNameTextView.setText(myList.get(position).getModelName());
                productionMileAgeTextView.setText(((Float) myList.get(position).getMileAge()).toString());
                productionCarNumberTextView.setText(myList.get(position).getModelName());
                return convertView;
                // return super.getView(position, convertView, parent);
            }
        };
        listView.setAdapter(adapter);

        this.setContentView(listView);
    }
}

