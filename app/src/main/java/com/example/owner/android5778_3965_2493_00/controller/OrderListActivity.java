package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.app.ListActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.entities.Enums;
import com.example.owner.android5778_3965_2493_00.model.entities.Order;

import java.text.SimpleDateFormat;
import java.util.List;

public class OrderListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);
        initItemByListView();
    }

//    new AsyncTask<Void, Void, ListAdapter>()
//    {
//        @Override
//        protected ListAdapter doInBackground(Void... params)
//        {
//            List<Student> studentList = DBManagerFactory.getManager().getStudents();
//            return new ArrayAdapter<Student>(getBaseContext(), R.layout.student_item_view, studentList);
//        }
//        @Override
//        protected void onPostExecute(ListAdapter adapter)
//        {
//            setListAdapter(adapter);
//        }
//    }.execute();

    void initItemByListView() {
        new AsyncTask<Void, Void, ListAdapter>() {
            @Override
            protected ListAdapter doInBackground(Void... params) {
                final List<Order> myList = DBManagerFactory.getManager().getOrders();
                return new ArrayAdapter<Order>(getBaseContext(), R.layout.order_row, myList);
                /*ListView listView = new ListView(this);
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
                        productcarNumberTextView.setText((myList.get(position).getCarNumber()).toString());

                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                        String start = df.format(myList.get(position).getStartRent());
                        productstartRentTextView.setText(start);

                        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                        String end = df1.format(myList.get(position).getEndRent());
                        productendRentTextView.setText(end);

                        productchargeTextView.setText(((Float) myList.get(position).getCharge()).toString());

                        return convertView;
                        // return super.getView(position, convertView, parent) ;
                    }
                };


                listView.setAdapter(adapter);
                this.setContentView(listView);*/
            }
            @Override
            protected void onPostExecute (ListAdapter adapter)
            {
                setListAdapter(adapter);
            }

        }.execute();

    }

}