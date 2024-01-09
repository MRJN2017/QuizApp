package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectStudyActivity extends AppCompatActivity implements View.OnClickListener{
    Button mt_tpu,mt_spu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_study);

        mt_tpu = findViewById(R.id.bt_mtpu);
        mt_spu = findViewById(R.id.bt_mspu);

        mt_tpu.setOnClickListener(this);
        mt_spu.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.bt_mtpu:

                Intent playIntent = new Intent(SelectStudyActivity.this,StudyActivity.class);
                startActivity(playIntent);
                finish();
                break;

            case R.id.bt_mspu:
                Intent settingIntent = new Intent(SelectStudyActivity.this,Study2Activity.class);
                startActivity(settingIntent);
                finish();
                break;

        }

    }



    public void onBackPressed() {
        Intent intent = new Intent(SelectStudyActivity.this,PlayScreen.class);
        startActivity(intent);
        finish();
    }
}