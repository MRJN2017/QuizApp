package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);


    }

    public void onBackPressed() {
        Intent intent = new Intent(StudyActivity.this,SelectStudyActivity.class);
        startActivity(intent);
        finish();
    }

}