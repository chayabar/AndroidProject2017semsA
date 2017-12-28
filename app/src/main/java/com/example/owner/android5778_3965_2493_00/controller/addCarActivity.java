package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.backend.RentConst;
import com.example.owner.android5778_3965_2493_00.model.entities.Branch;
import com.example.owner.android5778_3965_2493_00.model.entities.CarModel;

import java.util.ArrayList;
import java.util.List;

public class addCarActivity extends Activity implements View.OnClickListener {

    private Button AddButton;
    private Spinner HouseBranchSpinner;
    private Spinner ModelCodeSpinner;
    private EditText MileAgeEditText;
    private EditText CarNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
        findViews();
    }

    private void findViews() {
        AddButton = (Button) findViewById(R.id.AddButton);
        HouseBranchSpinner = (Spinner) findViewById(R.id.HouseBranchSpinner);
        ModelCodeSpinner = (Spinner) findViewById(R.id.ModelCodeSpinner);
        MileAgeEditText = (EditText) findViewById(R.id.MileAgeEditText);
        CarNumberEditText = (EditText) findViewById(R.id.CarNumberEditText);
        AddButton.setOnClickListener(this);

        new AsyncTask<Void, Void, ArrayAdapter>() {
            @Override
            protected ArrayAdapter doInBackground(Void... params) {
                List<Integer> branchList = new ArrayList<Integer>();
                for (Branch b : DBManagerFactory.getManager().getBranchs()) {
                    branchList.add(b.getBranchNumber());
                }
                return new ArrayAdapter<Integer>(addCarActivity.this, android.R.layout.simple_spinner_item, branchList);
            }

            @Override
            protected void onPostExecute(ArrayAdapter adapter) {
                HouseBranchSpinner.setAdapter(adapter);
                HouseBranchSpinner.setEnabled(true);

            }
        }.execute();

        new AsyncTask<Void, Void, ArrayAdapter>() {
            @Override
            protected ArrayAdapter doInBackground(Void... params) {
                List<Integer> modelCodeList = new ArrayList<Integer>();
                for (CarModel cm : DBManagerFactory.getManager().getCarModels()) {
                    modelCodeList.add(cm.getModelCode());
                }
                return new ArrayAdapter<Integer>(addCarActivity.this, android.R.layout.simple_spinner_item, modelCodeList);
            }

            @Override
            protected void onPostExecute(ArrayAdapter adapter) {
                ModelCodeSpinner.setAdapter(adapter);
                ModelCodeSpinner.setEnabled(true);

            }
        }.execute();
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-12-02 22:05:03 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == AddButton ) {
            // Handle clicks for AddButton
            addCar();
            finish();
        }
    }

    private void addCar() {
        final ContentValues contentValues = new ContentValues();
        try {
            contentValues.put(RentConst.CarConst.CARNUMBER, Integer.valueOf(this.CarNumberEditText.getText().toString()));
            contentValues.put(RentConst.CarConst.HOUSEBRANCH, Integer.valueOf(this.HouseBranchSpinner.getSelectedItem().toString()));
            contentValues.put(RentConst.CarConst.MILEAGE, Float.valueOf(this.MileAgeEditText.getText().toString()));
            contentValues.put(RentConst.CarConst.MODELCODE, this.ModelCodeSpinner.getSelectedItem().toString());
            new AsyncTask<Void, Void, Boolean>() {
                @Override
                protected void onPostExecute(Boolean idResult) {
                    super.onPostExecute(idResult);
                    if (idResult == true)
                        Toast.makeText(getBaseContext(), "the car inserted: " + idResult, Toast.LENGTH_LONG).show();
                }
                @Override
                protected Boolean doInBackground(Void... params) {
                    return DBManagerFactory.getManager().addCar(contentValues);
                }
            }.execute();
        }
        catch (Exception e) {}
    }
}
