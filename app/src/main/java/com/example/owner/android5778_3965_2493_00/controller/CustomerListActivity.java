/*package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.entities.Customer;

import java.util.List;

public class CustomerListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
        initItemByListView();
    }

    void initItemByListView() {
        final List<Customer> myList = DBManagerFactory.getManager().getCustomers();
        ListView listView = new ListView(this);
        //array adaptor is for Customer (the class) in the example "item" is for item class they have...
        ArrayAdapter<Customer> adapter = new ArrayAdapter<Customer>(this, R.layout.customer_row, myList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null)
                {
                    // the first argument is the window we are in : "CustomerListActivity.this"
                    convertView = View.inflate(CustomerListActivity.this ,R.layout.customer_row, null);
                }


                TextView productFirstNameTextView = (TextView) convertView.findViewById(R.id.firstName);
                TextView productLastNameTextView = (TextView) convertView.findViewById(R.id.LastName);
                TextView productIDTextView = (TextView) convertView.findViewById(R.id.ID);
                TextView productPhoneNumTextView = (TextView) convertView.findViewById(R.id.PhoneNum);
                productFirstNameTextView.setText(myList.get(position).getFirstName());
                productLastNameTextView.setText(myList.get(position).getLastName());
                productIDTextView.setText(((Integer)myList.get(position).getID()).toString());
                productPhoneNumTextView.setText(myList.get(position).getPhoneNumber());
                return convertView;
                // return super.getView(position, convertView, parent);
            }
        };
        listView.setAdapter(adapter);

        this.setContentView(listView);
    }

}*/
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
import com.example.owner.android5778_3965_2493_00.model.entities.Customer;

import java.util.List;

public class CustomerListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new AsyncTask<Void, Void, ListAdapter>() {
            @Override
            protected ListAdapter doInBackground(Void... params) {
                List<Customer> customerList = DBManagerFactory.getManager().getCustomers();
                return new ArrayAdapter<Customer>(getBaseContext(), R.layout.customer_row, customerList);
            }

            @Override
            protected void onPostExecute(ListAdapter adapter) {
                setListAdapter(adapter);
            }
        }.execute();

    }
}