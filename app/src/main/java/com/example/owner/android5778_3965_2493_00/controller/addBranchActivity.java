package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.RentConst;
//chaya branch
public class addBranchActivity extends Activity implements View.OnClickListener {

    private EditText AddressEditText;
    private EditText parkingSpacesEditText;
    private Button AddButton;
    private EditText BranchNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_branch);
        findViews();
    }

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
            addBranch();
            // Handle clicks for AddButton
        }
    }

    private void addBranch() {
        final ContentValues contentValues = new ContentValues();
        try {
            int branchNumber = Integer.valueOf(this.BranchNumberEditText.getText().toString());
            contentValues.put(RentConst.BranchConst.BRANCHNUMBER, branchNumber);
            contentValues.put(RentConst.BranchConst.PARKINGSPACES, this.parkingSpacesEditText.getText().toString());
            contentValues.put(RentConst.BranchConst.ADDRESS, this.AddressEditText.getText().toString());
            //DBManagerFactory.getManager().addBranch(contentValues);
        }
        catch (Exception e) {}
    }
    }
