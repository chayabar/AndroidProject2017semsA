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
import com.example.owner.android5778_3965_2493_00.model.entities.Enums;
import com.example.owner.android5778_3965_2493_00.model.entities.Order;

import java.text.SimpleDateFormat;
import java.util.List;

public class OrderListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);
        initItemByListView();
    }
    
    void initItemByListView() {
        final List<Order> myList = DBManagerFactory.getManager().getOrders();
        ListView listView = new ListView(this);
        //array adaptor is for Order (the class) in the example "item" is for item class they have...
        ArrayAdapter<Order> adapter = new ArrayAdapter<Order>(this, R.layout.order_row, myList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    //the first argument is the window we are in : "OrderListActivity.this"
                    convertView = View.inflate(OrderListActivity.this, R.layout.order_row, null);
                }

                TextView productorderIDTextView = (TextView) convertView.findViewById(R.id.orderID);
                TextView productcustomerIDTextView = (TextView) convertView.findViewById(R.id.customerID);
                TextView productcarNumberTextView = (TextView) convertView.findViewById(R.id.carNumber);
                TextView productstartRentTextView = (TextView) convertView.findViewById(R.id.startRent);
                TextView productendRentTextView = (TextView) convertView.findViewById(R.id.endRent);
                TextView productchargeTextView = (TextView) convertView.findViewById(R.id.charge);

                productorderIDTextView.setText(((Integer) myList.get(position).getOrderID()).toString());
                productcustomerIDTextView.setText(((Integer) myList.get(position).getCustomerID()).toString());
                productcarNumberTextView.setText(myList.get(position).getCarNumber());

                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                String start = df.format(myList.get(position).getStartRent());
                productstartRentTextView.setText(start);

                String end = df.format(myList.get(position).getEndRent());
                productendRentTextView.setText(end);

                productchargeTextView.setText(((Float) myList.get(position).getCharge()).toString());

                return convertView;
                // return super.getView(position, convertView, parent) ;
            }
        };

        listView.setAdapter(adapter);
        this.setContentView(listView);
    }
}
