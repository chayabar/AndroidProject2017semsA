package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.owner.android5778_3965_2493_00.R;

public class CarActivity extends Activity implements View.OnClickListener {

    private Button AddButton;
    private Button UpdateButton;
    private Button deleteButton;
    private Button listCarsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
    findViews();
}

    private void findViews() {
        AddButton = (Button)findViewById( R.id.AddButton );
        UpdateButton = (Button)findViewById( R.id.UpdateButton );
        deleteButton = (Button)findViewById( R.id.deleteButton );
        listCarsButton = (Button)findViewById( R.id.listCarsButton );


        AddButton.setOnClickListener( this );
        UpdateButton.setOnClickListener( this );
        deleteButton.setOnClickListener( this );
        listCarsButton.setOnClickListener( this );
    }


    @Override
    public void onClick(View v) {
        if ( v == AddButton ) {
            // Handle clicks for AddButton
            Intent intent = new Intent(this, addCarActivity.class);
            startActivity(intent);
        } else if ( v == UpdateButton ) {
            // Handle clicks for UpdateButton
        } else if ( v == deleteButton ) {
            // Handle clicks for deleteButton
        } else if ( v == listCarsButton ) {
            // Handle clicks for listCarsButton
        }
    }

}
