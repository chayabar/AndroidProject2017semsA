package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.app.ListActivity;
import android.content.ClipData;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.datasource.List_DBManager;
import com.example.owner.android5778_3965_2493_00.model.entities.Branch;

import java.util.List;

public class BranchListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new AsyncTask<Void, Void, ListAdapter>() {
            @Override
            protected ListAdapter doInBackground(Void... params) {
                List<Branch> branchList = DBManagerFactory.getManager().getBranchs();
                return new ArrayAdapter<Branch>(getBaseContext(), R.layout.item_row, branchList);
            }

            @Override
            protected void onPostExecute(ListAdapter adapter) {
                setListAdapter(adapter);
            }
        }.execute();

    }
    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_branch_list);
        //initItemByListView();
    }*/



    /*void initItemByListView() {
        final List<Branch> myList = DBManagerFactory.getManager().getBranchs();
        ListView listView = new ListView(this);
        ArrayAdapter<Branch> adapter = new ArrayAdapter<Branch>(this, R.layout.branch_row, myList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null)
                {
                    convertView = View.inflate(BranchListActivity.this ,R.layout.branch_row, null);
                }

                TextView productBranchNumberTextView = (TextView) convertView.findViewById(R.id.branchNumber);
                TextView productParkingSpacesTextView = (TextView) convertView.findViewById(R.id.pakingSpaces);
                TextView productAddressTextView = (TextView) convertView.findViewById(R.id.address);
                productBranchNumberTextView.setText(((Integer)myList.get(position).getBranchNumber()).toString());
                productParkingSpacesTextView.setText(((Integer) myList.get(position).getParkingSpaces()).toString());
                productAddressTextView.setText(myList.get(position).getAddress());
                return convertView;
            }
        };
        listView.setAdapter(adapter);

        this.setContentView(listView);
    }*/
}
