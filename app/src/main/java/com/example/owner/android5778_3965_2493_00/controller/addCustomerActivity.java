package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.backend.RentConst;

public class addCustomerActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);
        findViews();
    }
    private EditText FirstNameEditText;
    private EditText LastNameEditText;
    private EditText IDEditText;
    private EditText PhoneNumEditText;
    private EditText eMailEditText;
    private EditText CreditEditText;
    private Button AddButton;

    private void findViews() {
        FirstNameEditText = (EditText)findViewById( R.id.firstNameeditText );
        LastNameEditText = (EditText)findViewById( R.id.LastNameEditText );
        IDEditText = (EditText)findViewById( R.id.IDEditText );
        PhoneNumEditText = (EditText)findViewById( R.id.PhoneNumEditText );
        eMailEditText = (EditText)findViewById( R.id.eMailEditText );
        CreditEditText = (EditText)findViewById( R.id.CreditEditText );
        AddButton = (Button)findViewById( R.id.AddButton );

        AddButton.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        if ( v == AddButton ) {
            // Handle clicks for AddButton
            addCustomer();
        }
    }
    private void addCustomer() {
        final ContentValues contentValues = new ContentValues();
        try {
            contentValues.put(RentConst.CustomerConst.CREDITCARD, this.CreditEditText.getText().toString());
            contentValues.put(RentConst.CustomerConst.EMAIL, this.eMailEditText.getText().toString());
            contentValues.put(RentConst.CustomerConst.FIRSTNAME, this.FirstNameEditText.getText().toString());
            contentValues.put(RentConst.CustomerConst.ID, Integer.valueOf(this.IDEditText.getText().toString()));
            contentValues.put(RentConst.CustomerConst.LASTNAME, this.LastNameEditText.getText().toString());
            contentValues.put(RentConst.CustomerConst.PHONENUMBER, this.PhoneNumEditText.getText().toString());

            DBManagerFactory.getManager().addCustomer(contentValues);
        }
        catch (Exception e) {}
    }
}
