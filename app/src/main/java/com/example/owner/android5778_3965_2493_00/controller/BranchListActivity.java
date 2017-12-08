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
import com.example.owner.android5778_3965_2493_00.model.entities.Branch;

import java.util.List;

public class BranchListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch_list);
        initItemByListView();
    }



        void initItemByListView() {
            final List<Branch> myList = DBManagerFactory.getManager().getBranchs();
            ListView listView = new ListView(this);
            //array adaptor is for Branch (the class) in the example "item" is for item class they have...
            ArrayAdapter<Branch> adapter = new ArrayAdapter<Branch>(this, R.layout.item_row, myList) {
                @Override
                public View getView(int position, View convertView, ViewGroup parent) {
                    if (convertView == null)
                    {
                        //the first argument is the window we are in : "BranchListActivity.this"
                        convertView = View.inflate(BranchListActivity.this ,R.layout.item_row, null);
                    }

                    TextView productItemAddressTextView = (TextView) convertView.findViewById(R.id.itemName);
                    TextView productItemIdTextView = (TextView) convertView.findViewById(R.id.itemId);
                    productItemAddressTextView.setText(myList.get(position).getAddress());
                    productItemIdTextView.setText(((Integer) myList.get(position).getBranchNumber()).toString());
                    return convertView;
                    // return super.getView(position, convertView, parent) ;
                }
            };
            listView.setAdapter(adapter);

            this.setContentView(listView);
        }
    }
