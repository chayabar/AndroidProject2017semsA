package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.owner.android5778_3965_2493_00.R;

public class MenuActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        findViews();

    }
    private Button BranchButton;
    private Button CarButton;
    private Button CarModelButton;
    private Button CustomerButton;
    private Button OrderButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-29 12:33:39 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        BranchButton = (Button)findViewById( R.id.BranchButton );
        CarButton = (Button)findViewById( R.id.CarButton );
        CarModelButton = (Button)findViewById( R.id.CarModelButton );
        CustomerButton = (Button)findViewById( R.id.CustomerButton );
        OrderButton = (Button)findViewById( R.id.OrderButton );

        BranchButton.setOnClickListener( this );
        CarButton.setOnClickListener( this );
        CarModelButton.setOnClickListener( this );
        CustomerButton.setOnClickListener( this );
        OrderButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-29 12:33:39 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == BranchButton ) {
            // Handle clicks for BranchButton
            Intent intent = new Intent(this, BranchActivity.class);
            startActivity(intent);
        } else if ( v == CarButton ) {
            // Handle clicks for CarButton
        } else if ( v == CarModelButton ) {
            // Handle clicks for CarModelButton
        } else if ( v == CustomerButton ) {
            // Handle clicks for CustomerButton
        } else if ( v == OrderButton ) {
            // Handle clicks for OrderButton
        }
    }

}
