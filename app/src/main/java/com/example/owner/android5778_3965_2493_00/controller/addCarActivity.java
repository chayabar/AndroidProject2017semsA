package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.RentConst;

public class addCarActivity extends Activity implements View.OnClickListener {

    private Button AddButton;
    private EditText HouseBranchEditText;
    private EditText ModelNameEditText;
    private EditText MileAgeEditText;
    private EditText CarNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
        findViews();
    }

    /**
     * Find the Views in the layout<br />
     * <br />
     * Auto-created on 2017-12-02 22:05:03 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    private void findViews() {
        AddButton = (Button)findViewById( R.id.AddButton );
        HouseBranchEditText = (EditText)findViewById( R.id.HouseBranchEditText );
        ModelNameEditText = (EditText)findViewById( R.id.ModelNameEditText );
        MileAgeEditText = (EditText)findViewById( R.id.MileAgeEditText );
        CarNumberEditText = (EditText)findViewById( R.id.CarNumberEditText );

        AddButton.setOnClickListener( this );
    }

    /**
     * Handle button click events<br />
     * <br />
     * Auto-created on 2017-12-02 22:05:03 by Android Layout Finder
     * (http://www.buzzingandroid.com/tools/android-layout-finder)
     */
    @Override
    public void onClick(View v) {
        if ( v == AddButton ) {
            // Handle clicks for AddButton
            addCar();
        }
    }

    private void addCar() {
        final ContentValues contentValues = new ContentValues();
        try {
            contentValues.put(RentConst.CarConst.CARNUMBER, this.CarNumberEditText.getText().toString());
            contentValues.put(RentConst.CarConst.HOUSEBRANCH, Integer.valueOf(this.HouseBranchEditText.getText().toString()));
            contentValues.put(RentConst.CarConst.MILEAGE, Float.valueOf(this.MileAgeEditText.getText().toString()));
            contentValues.put(RentConst.CarConst.MODELNAME, this.ModelNameEditText.getText().toString());
            //DBManagerFactory.getManager().addCar(contentValues);
        }
        catch (Exception e) {}
    }



}
