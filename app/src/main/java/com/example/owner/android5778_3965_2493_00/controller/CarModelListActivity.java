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
import com.example.owner.android5778_3965_2493_00.model.entities.CarModel;
import com.example.owner.android5778_3965_2493_00.model.entities.Enums;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;


public class CarModelListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new AsyncTask<Void, Void, ListAdapter>() {
            @Override
            protected ListAdapter doInBackground(Void... params) {
                List<CarModel> carModelList = DBManagerFactory.getManager().getCarModels();
                return new ArrayAdapter<CarModel>(getBaseContext(), R.layout.item_row, carModelList);
            }

            @Override
            protected void onPostExecute(ListAdapter adapter) {
                setListAdapter(adapter);
            }
        }.execute();

    }

/*public class CarModelListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_model_list);
        initItemByListView();
    }

    void initItemByListView() {
        final List<CarModel> myList = DBManagerFactory.getManager().getCarModels();
        ListView listView = new ListView(this);
        //array adaptor is for CarModel (the class) in the example "item" is for item class they have...
        ArrayAdapter<CarModel> adapter = new ArrayAdapter<CarModel>(this, R.layout.car_model_row, myList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null)
                {
                    //the first argument is the window we are in : "CarModelListActivity.this"
                    convertView = View.inflate(CarModelListActivity.this ,R.layout.car_model_row, null);
                }

                TextView productmodelCodeTextView = (TextView) convertView.findViewById(R.id.modelCode);
                TextView productcompanyNameTextView = (TextView) convertView.findViewById(R.id.companyName);
                TextView productmodelNameTextView = (TextView) convertView.findViewById(R.id.modelName);
                TextView productengineCapacityTextView = (TextView) convertView.findViewById(R.id.engineCapacity);
                TextView productgearBoxTextView = (TextView) convertView.findViewById(R.id.gearBox);
                TextView productseatsTextView = (TextView) convertView.findViewById(R.id.seats);
                TextView productcolorTextView = (TextView) convertView.findViewById(R.id.color);
                TextView productyearManufactureTextView = (TextView) convertView.findViewById(R.id.yearManufacture);

                productmodelCodeTextView.setText((myList.get(position).getModelCode()));
                productcompanyNameTextView.setText((myList.get(position).getCompanyName()));
                productmodelNameTextView.setText(myList.get(position).getModelName());
                productengineCapacityTextView.setText(((Float) myList.get(position).getEngineCapacity()).toString());
                productgearBoxTextView.setText(((Enums.GearBox)myList.get(position).getGearBox()).toString());
                productseatsTextView.setText(((Integer)myList.get(position).getSeats()).toString());
                productcolorTextView.setText(myList.get(position).getColor());

                SimpleDateFormat df = new SimpleDateFormat("yyyy");
                String year = df.format(myList.get(position).getYearManufacture());

                productyearManufactureTextView.setText(year);

                return convertView;
                // return super.getView(position, convertView, parent) ;
            }
        };
        listView.setAdapter(adapter);

        this.setContentView(listView);
    }*/
}
