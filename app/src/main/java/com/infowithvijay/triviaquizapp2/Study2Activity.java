package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Study2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study2);
    }
    public void onBackPressed() {
        Intent intent = new Intent(Study2Activity.this,SelectStudyActivity.class);
        startActivity(intent);
        finish();
    }
}