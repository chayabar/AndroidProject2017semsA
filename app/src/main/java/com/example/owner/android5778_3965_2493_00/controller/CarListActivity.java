package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.entities.Car;

import java.util.List;

public class CarListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);
        initItemByListView();
    }

    void initItemByListView() {
        final List<Car> myList = DBManagerFactory.getManager().getCars();
        ListView listView = new ListView(this);
        //array adaptor is for Car (the class) in the example "item" is for item class they have...
        ArrayAdapter<Car> adapter = new ArrayAdapter<Car>(this, R.layout.car_row, myList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null)
                {
                    //the first argument is the window we are in : "CarListActivity.this"
                    convertView = View.inflate(CarListActivity.this ,R.layout.car_row, null);
                }
                TextView productionCarNumberTextView = (TextView) convertView.findViewById(R.id.carNumber);
                TextView productModelCodeTextView = (TextView) convertView.findViewById(R.id.modelCode);
                TextView productHouseBranchTextView = (TextView) convertView.findViewById(R.id.houseBranch);
                TextView productionMileAgeTextView = (TextView) convertView.findViewById(R.id.mileAge);

                productionCarNumberTextView.setText(myList.get(position).getCarNumber());
                productModelCodeTextView.setText(((Integer)myList.get(position).getModelCode()).toString());
                productHouseBranchTextView.setText(((Integer) myList.get(position).getHouseBranch()).toString());
                productionMileAgeTextView.setText(((Float) myList.get(position).getMileAge()).toString());
                return convertView;
                // return super.getView(position, convertView, parent);
            }
        };
        listView.setAdapter(adapter);

        this.setContentView(listView);
    }
}

