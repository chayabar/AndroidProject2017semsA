package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.backend.RentConst;
import com.example.owner.android5778_3965_2493_00.model.entities.Enums;

public class addCarModelActivity extends Activity implements View.OnClickListener {

        private Button AddButton;
        private EditText ModelCodeEditText;
        private EditText CompanyNameEditText;
        private EditText ModelNameEditText;
        private EditText EngineCapacityEditText;
        private EditText SeatsEditText;
        private EditText ColorEditText;
        private EditText YearsManufactureEditText;
        private Spinner GearBoxSpinner;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_add_car_model);
            findViews();
        }

        private void findViews() {
            AddButton = (Button)findViewById( R.id.AddButton );
            ModelCodeEditText = (EditText)findViewById( R.id.ModelCodeEditText );
            CompanyNameEditText = (EditText)findViewById( R.id.CompanyNameEditText );
            ModelNameEditText = (EditText)findViewById( R.id.ModelNameEditText );
            EngineCapacityEditText = (EditText)findViewById( R.id.EngineCapacityEditText );
            SeatsEditText = (EditText)findViewById( R.id.SeatsEditText );
            ColorEditText = (EditText)findViewById( R.id.ColorEditText );
            YearsManufactureEditText = (EditText)findViewById( R.id.YearsManufactureEditText );
            GearBoxSpinner = (Spinner)findViewById( R.id.GearBoxSpinner );
            GearBoxSpinner.setAdapter(new ArrayAdapter<Enums.GearBox>(this, android.R.layout.simple_spinner_item, Enums.GearBox.values()));

            AddButton.setOnClickListener( this );
        }

        @Override
        public void onClick(View v) {
            if ( v == AddButton ) {
                // Handle clicks for AddButton
                addCarModel();
                finish();
            }
        }

    private void addCarModel() {
        final ContentValues contentValues = new ContentValues();
        try {
            contentValues.put(RentConst.CarModelConst.YEARMANUFACTURE, this.YearsManufactureEditText.getText().toString());
            contentValues.put(RentConst.CarModelConst.SEATS, Integer.valueOf(this.SeatsEditText.getText().toString()));
            contentValues.put(RentConst.CarModelConst.ENGINECAPACITY, Float.valueOf(this.EngineCapacityEditText.getText().toString()));
            contentValues.put(RentConst.CarModelConst.COLOR, this.ColorEditText.getText().toString());
            contentValues.put(RentConst.CarModelConst.COMPANYNAME, this.CompanyNameEditText.getText().toString());
            contentValues.put(RentConst.CarModelConst.GEARBOX, this.GearBoxSpinner.getSelectedItem().toString());
            contentValues.put(RentConst.CarModelConst.MODELCODE, this.ModelCodeEditText.getText().toString());
            contentValues.put(RentConst.CarModelConst.MODELNAME, this.ModelNameEditText.getText().toString());

            new AsyncTask<Void, Void, Boolean>() {
                @Override
                protected void onPostExecute(Boolean idResult) {
                    super.onPostExecute(idResult);
                    if (idResult == true)
                        Toast.makeText(getBaseContext(), "the car model inserted: " + idResult, Toast.LENGTH_LONG).show();
                }
                @Override
                protected Boolean doInBackground(Void... params) {
                    return DBManagerFactory.getManager().addCarModel(contentValues);
                }
            }.execute();
        }
        catch (Exception e) {}
    }
 }

