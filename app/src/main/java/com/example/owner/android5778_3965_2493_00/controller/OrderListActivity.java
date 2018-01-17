package com.example.owner.android5778_3965_2493_00.controller;

import android.app.ListActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.entities.Order;

import java.util.List;

public class OrderListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new AsyncTask<Void, Void, ListAdapter>() {
            @Override
            protected ListAdapter doInBackground(Void... params) {
                List<Order> orderList = DBManagerFactory.getManager().getOrders();
                return new ArrayAdapter<Order>(getBaseContext(), R.layout.item_row, orderList);
            }

            @Override
            protected void onPostExecute(ListAdapter adapter) {
                setListAdapter(adapter);
            }
        }.execute();

    }

}