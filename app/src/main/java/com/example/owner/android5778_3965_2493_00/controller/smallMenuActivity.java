package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.owner.android5778_3965_2493_00.R;

public class smallMenuActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_small_menu);
        findViews();
    }

    private Button addCarButton;
    private Button addCarModelButton;
    private Button addCustomerButton;
    private Button addOrderButton;
    private Button branchListButton;
    private Button carListButton;
    private Button carModelListButton;
    private Button customerListButton;
    private Button orderListButton;
    private Button addBranchButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-12-25 15:00:44 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        addCarButton = (Button)findViewById( R.id.addCarButton );
        addCarModelButton = (Button)findViewById( R.id.addCarModelButton );
        addCustomerButton = (Button)findViewById( R.id.addCustomerButton );
        addOrderButton = (Button)findViewById( R.id.addOrderButton );
        branchListButton = (Button)findViewById( R.id.branchListButton );
        carListButton = (Button)findViewById( R.id.carListButton );
        carModelListButton = (Button)findViewById( R.id.carModelListButton );
        customerListButton = (Button)findViewById( R.id.customerListButton );
        orderListButton = (Button)findViewById( R.id.orderListButton );
        addBranchButton = (Button)findViewById( R.id.addBranchButton );

        addCarButton.setOnClickListener( this );
        addCarModelButton.setOnClickListener( this );
        addCustomerButton.setOnClickListener( this );
        addOrderButton.setOnClickListener( this );
        branchListButton.setOnClickListener( this );
        carListButton.setOnClickListener( this );
        carModelListButton.setOnClickListener( this );
        customerListButton.setOnClickListener( this );
        orderListButton.setOnClickListener( this );
        addBranchButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-12-25 15:00:44 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == addCarButton ) {
            Intent intent = new Intent(this, addCarActivity.class);
            startActivity(intent);
        } else if ( v == addCarModelButton ) {
            Intent intent = new Intent(this, addCarModelActivity.class);
            startActivity(intent);
        } else if ( v == addCustomerButton ) {
            Intent intent = new Intent(this, addCustomerActivity.class);
            startActivity(intent);
        } else if ( v == addOrderButton ) {
            Intent intent = new Intent(this, addOrderActivity.class);
            startActivity(intent);
        } else if ( v == branchListButton ) {
            Intent intent = new Intent(this, BranchListActivity.class);
            startActivity(intent);
        } else if ( v == carListButton ) {
            Intent intent = new Intent(this, CarListActivity.class);
            startActivity(intent);
        } else if ( v == carModelListButton ) {
            Intent intent = new Intent(this, CarModelListActivity.class);
            startActivity(intent);
        } else if ( v == customerListButton ) {
            Intent intent = new Intent(this, CustomerListActivity.class);
            startActivity(intent);
        } else if ( v == orderListButton ) {
            Intent intent = new Intent(this, OrderListActivity.class);
            startActivity(intent);
        } else if ( v == addBranchButton ) {
            Intent intent = new Intent(this, addBranchActivity.class);
            startActivity(intent);
        }
    }

}
