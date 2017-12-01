package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.owner.android5778_3965_2493_00.R;

public class addActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }

    private EditText AddressEditText;
    private EditText parkingSpacesEditText;
    private Button AddButton;
    private EditText BranchNumberEditText;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-11-30 22:44:43 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        AddressEditText = (EditText)findViewById( R.id.AddressEditText );
        parkingSpacesEditText = (EditText)findViewById( R.id.parkingSpacesEditText );
        AddButton = (Button)findViewById( R.id.AddButton );
        BranchNumberEditText = (EditText)findViewById( R.id.BranchNumberEditText );

        AddButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-11-30 22:44:43 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == AddButton ) {
            //addBranch
            // Handle clicks for AddButton
        }
    }

}
