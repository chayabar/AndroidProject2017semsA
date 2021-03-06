package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;
import com.example.owner.android5778_3965_2493_00.model.backend.RentConst;
import com.example.owner.android5778_3965_2493_00.model.entities.Branch;

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

    private void findViews() {
        AddressEditText = (EditText)findViewById( R.id.AddressEditText );
        parkingSpacesEditText = (EditText)findViewById( R.id.parkingSpacesEditText );
        AddButton = (Button)findViewById( R.id.AddButton );
        BranchNumberEditText = (EditText)findViewById( R.id.BranchNumberEditText );

        AddButton.setOnClickListener( this );
    }

    @Override
    public void onClick(View v) {
        if ( v == AddButton ) {
            // Handle clicks for AddButton
            addBranch();
            finish();
        }
    }

    private void addBranch() {
        final ContentValues contentValues = new ContentValues();
        try {
            contentValues.put(RentConst.BranchConst.BRANCHNUMBER, Integer.valueOf(this.BranchNumberEditText.getText().toString()));
            contentValues.put(RentConst.BranchConst.PARKINGSPACES, Integer.valueOf(this.parkingSpacesEditText.getText().toString()));
            contentValues.put(RentConst.BranchConst.ADDRESS, this.AddressEditText.getText().toString());

            new AsyncTask<Void, Void, Boolean>() {
                @Override
                protected void onPostExecute(Boolean idResult) {
                    super.onPostExecute(idResult);
                    if (idResult == true)
                        Toast.makeText(getBaseContext(), "the branch inserted: " + idResult, Toast.LENGTH_LONG).show();
                }
                @Override
                protected Boolean doInBackground(Void... params) {
                    return DBManagerFactory.getManager().addBranch(contentValues);
                }
            }.execute();
        }
        catch (Exception e) {}
    }
}
