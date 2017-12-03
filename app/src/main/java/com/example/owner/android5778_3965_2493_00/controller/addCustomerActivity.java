package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.owner.android5778_3965_2493_00.R;

public class addCustomerActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);
    }
    private EditText firstNameeditText;
    private EditText LastNameEditText;
    private EditText IDEditText;
    private EditText PhoneNumEditText;
    private EditText eMailEditText;
    private EditText CreditEditText;
    private Button AddButton;

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-12-03 09:56:59 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        firstNameeditText = (EditText)findViewById( R.id.firstNameeditText );
        LastNameEditText = (EditText)findViewById( R.id.LastNameEditText );
        IDEditText = (EditText)findViewById( R.id.IDEditText );
        PhoneNumEditText = (EditText)findViewById( R.id.PhoneNumEditText );
        eMailEditText = (EditText)findViewById( R.id.eMailEditText );
        CreditEditText = (EditText)findViewById( R.id.CreditEditText );
        AddButton = (Button)findViewById( R.id.AddButton );

        AddButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-12-03 09:56:59 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == AddButton ) {
            // Handle clicks for AddButton
        }
    }

}
