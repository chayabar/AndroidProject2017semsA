package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.owner.android5778_3965_2493_00.R;

public class OrderActivity extends Activity implements View.OnClickListener {

    private Button AddButton;
    private Button UpdateButton;
    private Button deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        findViews();
    }

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-30 21:33:44 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        AddButton = (Button)findViewById( R.id.AddButton );
        UpdateButton = (Button)findViewById( R.id.UpdateButton );
        deleteButton = (Button)findViewById( R.id.deleteButton );

        AddButton.setOnClickListener( this );
        UpdateButton.setOnClickListener( this );
        deleteButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-30 21:33:44 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == AddButton ) {
            // Handle clicks for AddButton
            Intent intent = new Intent(this, addOrderActivity.class);
            startActivity(intent);
        } else if ( v == UpdateButton ) {
            // Handle clicks for UpdateButton
        } else if ( v == deleteButton ) {
            // Handle clicks for deleteButton
        }
    }
}