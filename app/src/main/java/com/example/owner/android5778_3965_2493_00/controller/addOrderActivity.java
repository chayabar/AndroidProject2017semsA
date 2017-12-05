package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.RentConst;
import com.example.owner.android5778_3965_2493_00.model.entities.Enums;

public class addOrderActivity extends Activity implements View.OnClickListener {

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
    private EditText FuelLitterEditText;
    private EditText ChargeEditText;
    private EditText CustomerIdEditText;
    private ScrollView scrollView7;
    private Button addButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-12-04 21:25:25 by Android Layout Finder
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
        OrderStatusSpinner.setAdapter(new ArrayAdapter<Enums.OrderStatus>(this, android.R.layout.simple_spinner_item, Enums.OrderStatus.values()));


        FuelLitterEditText = (EditText)findViewById( R.id.FuelLitterEditText );
        ChargeEditText = (EditText)findViewById( R.id.ChargeEditText);
        CustomerIdEditText = (EditText)findViewById( R.id.CustomerIdEditText );
        scrollView7 = (ScrollView)findViewById( R.id.scrollView7 );
        addButton = (Button)findViewById( R.id.addButton );

        addButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-12-04 21:25:25 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == addButton ) {
            addOrder();
        }
    }
    private void addOrder() {
        final ContentValues contentValues = new ContentValues();
        try {



//            CustomerIdEditText = (EditText)findViewById( R.id.CustomerIdEditText );
            int orderId = Integer.valueOf(this.OrderIdEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.ORDERID, orderId);
            contentValues.put(RentConst.OrderConst.CARNUMBER, this.CarNumberEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.STARTRENT, this.StartRentEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.ENDRENT, this.EndRentEditText.getText().toString());
            float startMileAge = Integer.valueOf(this.StartMileAgeEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.STARTMILEAGE, startMileAge);
            float endMileAge = Integer.valueOf(this.EndMileAgeEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.ENDMILEAGE, endMileAge);
            contentValues.put(RentConst.OrderConst.FUELFILLING, this.FuelFillingCheckBox.getText().toString());
            //contentValues.put(RentConst.OrderConst.ORDERSTATUS, this.OrderStatusSpinner.);How to get Spinner?
            float fullLitter = Integer.valueOf(this.FuelLitterEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.FUELLITTER, fullLitter);
            float charge = Integer.valueOf(this.ChargeEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.CHARGE, charge);
            int customerId = Integer.valueOf(this.CustomerIdEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.CUSTUMERID, customerId);
            //DBManagerFactory.getManager().addBranch(contentValues);
        }
        catch (Exception e) {}
    }

}
