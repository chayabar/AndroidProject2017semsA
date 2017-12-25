package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.backend.RentConst;
import com.example.owner.android5778_3965_2493_00.model.entities.Enums;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class addOrderActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_order);
        findViews();
    }

    private EditText OrderIdEditText;
    private EditText CarNumberEditText;
    private TextView StartRentTextView;
    private CustomDatePicker CustomDatePiker;
    private TextView EndRentTextView;
    private CustomDatePicker CustomDatePiker2;
    private EditText StartMileAgeEditText;
    private EditText EndMileAgeEditText;
    private CheckBox FuelFillingCheckBox;
    private Spinner OrderStatusSpinner;
    private EditText FuelLitterEditText;
    private EditText ChargeEditText;
    private EditText CustomerIdEditText;
    private ScrollView scrollView;
    private Button addButton;

    private void findViews() {
        OrderIdEditText = (EditText)findViewById( R.id.OrderIdEditText );
        CarNumberEditText = (EditText)findViewById( R.id.CarNumberEditText );
        StartRentTextView = (TextView)findViewById( R.id.startRentTextView );
        CustomDatePiker=(CustomDatePicker) findViewById( R.id.CustomDatePiker);
        EndRentTextView = (TextView)findViewById( R.id.endRentTextView );
        CustomDatePiker2=(CustomDatePicker) findViewById( R.id.CustomDatePiker2);
        StartMileAgeEditText = (EditText)findViewById( R.id.StartMileAgeEditText );
        EndMileAgeEditText = (EditText)findViewById( R.id.EndMileAgeEditText );
        FuelFillingCheckBox = (CheckBox)findViewById( R.id.FuelFillingCheckBox );
        OrderStatusSpinner = (Spinner)findViewById( R.id.OrderStatusSpinner );
        OrderStatusSpinner.setAdapter(new ArrayAdapter<Enums.OrderStatus>(this, android.R.layout.simple_spinner_item, Enums.OrderStatus.values()));
        FuelLitterEditText = (EditText)findViewById( R.id.FuelLitterEditText );
        ChargeEditText = (EditText)findViewById( R.id.ChargeEditText);
        CustomerIdEditText = (EditText)findViewById( R.id.CustomerIdEditText );
        scrollView = (ScrollView)findViewById( R.id.scrollView );
        addButton = (Button)findViewById( R.id.addButton );

        addButton.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        if ( v == addButton ) {
            // Handle clicks for AddButton
            addOrder();
            finish();
        }
    }
    private void addOrder() {
        final ContentValues contentValues = new ContentValues();
        try {
            int orderId = Integer.valueOf(this.OrderIdEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.ORDERID, orderId);
            contentValues.put(RentConst.OrderConst.CARNUMBER, this.CarNumberEditText.getText().toString());
            Date startDate = CustomDatePiker.getDate();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // like MySQL Format
            String dateString = dateFormat.format(startDate);
            contentValues.put(RentConst.OrderConst.STARTRENT, dateString);
            Date endDate = CustomDatePiker2.getDate();
            String endDateString = dateFormat.format(endDate);
            contentValues.put(RentConst.OrderConst.ENDRENT, endDateString);
            float startMileAge = Float.valueOf(this.StartMileAgeEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.STARTMILEAGE, startMileAge);
            float endMileAge = Float.valueOf(this.EndMileAgeEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.ENDMILEAGE, endMileAge);
            contentValues.put(RentConst.OrderConst.FUELFILLING, this.FuelFillingCheckBox.getText().toString());
            contentValues.put(RentConst.OrderConst.ORDERSTATUS, this.OrderStatusSpinner.getSelectedItem().toString());
            float fullLitter = Float.valueOf(this.FuelLitterEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.FUELLITTER, fullLitter);
            float charge = Float.valueOf(this.ChargeEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.CHARGE, charge);
            int customerId = Integer.valueOf(this.CustomerIdEditText.getText().toString());
            contentValues.put(RentConst.OrderConst.CUSTUMERID, customerId);

            new AsyncTask<Void, Void, Boolean>() {
                @Override
                protected void onPostExecute(Boolean idResult) {
                    super.onPostExecute(idResult);
                    if (idResult == true)
                        Toast.makeText(getBaseContext(), "the order inserted: " + idResult, Toast.LENGTH_LONG).show();
                }
                @Override
                protected Boolean doInBackground(Void... params) {
                    return DBManagerFactory.getManager().addOrder(contentValues);
                }
            }.execute();
        }
        catch (Exception e) {}
    }
}
