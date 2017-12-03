package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.owner.android5778_3965_2493_00.R;

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
    }

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-12-02 22:29:53 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        AddButton = (Button)findViewById( R.id.AddButton );
        ModelNameEditText = (EditText)findViewById( R.id.ModelNameEditText );
        CompanyNameEditText = (EditText)findViewById( R.id.CompanyNameEditText );
        ModelNameEditText = (EditText)findViewById( R.id.ModelNameEditText );
        EngineCapacityEditText = (EditText)findViewById( R.id.EngineCapacityEditText );
        SeatsEditText = (EditText)findViewById( R.id.SeatsEditText );
        ColorEditText = (EditText)findViewById( R.id.ColorEditText );
        YearsManufactureEditText = (EditText)findViewById( R.id.YearsManufactureEditText );
        GearBoxSpinner = (Spinner)findViewById( R.id.GearBoxSpinner );

        AddButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-12-02 22:29:53 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == AddButton ) {
            // Handle clicks for AddButton
        }
    }



}
