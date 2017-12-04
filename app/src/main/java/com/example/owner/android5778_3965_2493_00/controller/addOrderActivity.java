package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;

import com.example.owner.android5778_3965_2493_00.R;

public class addOrderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_order);
        findViews();
    }
    private EditText OrderIdEditText;
    private EditText CarNumberEditText;
    private EditText StartRentEditText;
    private EditText EndRentEditText;
    private EditText StartMileAgeEditText;
    private EditText EndMileAgeEditText;
    private CheckBox FuelFillingCheckBox;
    private Spinner OrderStatusSpinner;
    private ScrollView scrollView7;
    private EditText FuelLitterEditText;
    private EditText editText2;
    private EditText CustomerIdEditText;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-12-04 09:58:55 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        OrderIdEditText = (EditText)findViewById( R.id.OrderIdEditText );
        CarNumberEditText = (EditText)findViewById( R.id.CarNumberEditText );
        StartRentEditText = (EditText)findViewById( R.id.StartRentEditText );
        EndRentEditText = (EditText)findViewById( R.id.EndRentEditText );
        StartMileAgeEditText = (EditText)findViewById( R.id.StartMileAgeEditText );
        EndMileAgeEditText = (EditText)findViewById( R.id.EndMileAgeEditText );
        FuelFillingCheckBox = (CheckBox)findViewById( R.id.FuelFillingCheckBox );
        OrderStatusSpinner = (Spinner)findViewById( R.id.OrderStatusSpinner );
        scrollView7 = (ScrollView)findViewById( R.id.scrollView7 );
        FuelLitterEditText = (EditText)findViewById( R.id.FuelLitterEditText );
        editText2 = (EditText)findViewById( R.id.editText2 );
        CustomerIdEditText = (EditText)findViewById( R.id.CustomerIdEditText );
    }
////sinuy

}
