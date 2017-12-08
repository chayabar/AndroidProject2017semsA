package com.example.owner.android5778_3965_2493_00.controller;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.owner.android5778_3965_2493_00.R;
import com.example.owner.android5778_3965_2493_00.model.backend.DBManagerFactory;

public class BranchActivity extends Activity implements View.OnClickListener {

    private Button AddButton;
    private Button UpdateButton;
    private Button deleteButton;
    private Button AllbranchesButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        findViews();
    }

    private void findViews() {
        AddButton = (Button) findViewById(R.id.AddButton);
        UpdateButton = (Button) findViewById(R.id.UpdateButton);
        deleteButton = (Button) findViewById(R.id.deleteButton);
        AllbranchesButton = (Button) findViewById(R.id.AllbranchesButton);

        AddButton.setOnClickListener(this);
        UpdateButton.setOnClickListener(this);
        deleteButton.setOnClickListener(this);
        AllbranchesButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == AddButton) {
            Intent intent = new Intent(this, addBranchActivity.class);
            startActivity(intent);
        } else if (v == UpdateButton) {
            // Handle clicks for UpdateButton
        } else if (v == deleteButton) {
            // Handle clicks for deleteButton
        } else if (v == AllbranchesButton) {
            showBranchList();
        }
    }

    private void showBranchList() {
        Intent intent = new Intent(this, BranchListActivity.class);
        startActivity(intent);
    }

}
