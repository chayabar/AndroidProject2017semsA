package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.backend.RentConst;
import com.example.owner.android5778_3965_2493_00.model.entities.Customer;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

        final ContentValues contentValues = new ContentValues();

        contentValues.put(RentConst.BranchConst.BRANCHNUMBER, "100");
        contentValues.put(RentConst.BranchConst.PARKINGSPACES, "3");
        contentValues.put(RentConst.BranchConst.ADDRESS, "kanfei nesharim 12, jerusalem, Israel");
        DBManagerFactory.getManager().addBranch(contentValues);

        contentValues.put(RentConst.CarConst.CARNUMBER, "898989");
        contentValues.put(RentConst.CarConst.HOUSEBRANCH, "100");
        contentValues.put(RentConst.CarConst.MILEAGE, "1897.7");
        contentValues.put(RentConst.CarConst.MODELNAME, "modeltoyota");
        DBManagerFactory.getManager().addCar(contentValues);

        contentValues.put(RentConst.CarModelConst.YEARMANUFACTURE, "2017");
        contentValues.put(RentConst.CarModelConst.SEATS, "5");
        contentValues.put(RentConst.CarModelConst.ENGINECAPACITY, "200");
        contentValues.put(RentConst.CarModelConst.COLOR, "white");
        contentValues.put(RentConst.CarModelConst.COMPANYNAME, "toyota");
        contentValues.put(RentConst.CarModelConst.GEARBOX, "AUTO");
        contentValues.put(RentConst.CarModelConst.MODELCODE, "223344");
        contentValues.put(RentConst.CarModelConst.MODELNAME, "modeltoyota");
        DBManagerFactory.getManager().addCarModel(contentValues);

        contentValues.put(RentConst.CustomerConst.CREDITCARD, "credit123");
        contentValues.put(RentConst.CustomerConst.EMAIL, "someone@");
        contentValues.put(RentConst.CustomerConst.FIRSTNAME, "avraham");
        contentValues.put(RentConst.CustomerConst.ID, "308475684");
        contentValues.put(RentConst.CustomerConst.LASTNAME, "cohen");
        contentValues.put(RentConst.CustomerConst.PHONENUMBER, "0529857844");
        DBManagerFactory.getManager().addCustomer(contentValues);

        contentValues.put(RentConst.OrderConst.ORDERID, "98765");
        contentValues.put(RentConst.OrderConst.CARNUMBER, "carNum78");
        contentValues.put(RentConst.OrderConst.STARTRENT, "2017");
        contentValues.put(RentConst.OrderConst.ENDRENT, "2017");
        contentValues.put(RentConst.OrderConst.STARTMILEAGE, "12.5");
        contentValues.put(RentConst.OrderConst.ENDMILEAGE, "10.5");
        contentValues.put(RentConst.OrderConst.FUELFILLING, "TRUE");
        contentValues.put(RentConst.OrderConst.ORDERSTATUS, "CLOSE");
        contentValues.put(RentConst.OrderConst.FUELLITTER, "52.1");
        contentValues.put(RentConst.OrderConst.CHARGE, "100");
        contentValues.put(RentConst.OrderConst.CUSTUMERID, "308475684");
        DBManagerFactory.getManager().addOrder(contentValues);

    }

    private Button LoginButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-29 12:57:29 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        LoginButton = (Button) findViewById(R.id.LoginButton);

        LoginButton.setOnClickListener(this);
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-29 12:57:29 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if (v == LoginButton) {
            // Handle clicks for LoginButton
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
        }
    }
}
