package com.infowithvijay.triviaquizapp2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class KoltinLevelsActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout Level1,Level2,Level3,Level4;

    ImageView imgLevel1;
    ImageView imgLevel2;
    ImageView imgLevel3;
    ImageView imgLevel4;


    String CategoryValue = "";

    int JL1,JL2,JL3,JL4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin_levels);


        Level1 = findViewById(R.id.Level1);
        Level2 = findViewById(R.id.Level2);
        Level3 = findViewById(R.id.Level3);
        Level4 = findViewById(R.id.Level4);


        imgLevel1 = findViewById(R.id.imgLevel1);
        imgLevel2 = findViewById(R.id.imgLevel2);
        imgLevel3 = findViewById(R.id.imgLevel3);
        imgLevel4 = findViewById(R.id.imgLevel4);



        lockandUnlockLevels();

        Intent intentVar = getIntent();
        CategoryValue = intentVar.getStringExtra("Category");

    }

    @Override
    public void onClick(View view) {


        if (CategoryValue.equals("Spu")){


            switch (view.getId()){


                case R.id.Level1:

                    Intent intentJavaLevel1 = new Intent(KoltinLevelsActivity.this,QuizActivity.class);
                    intentJavaLevel1.putExtra("Category",TriviaQuestion.CATEGORY_SPU);
                    intentJavaLevel1.putExtra("Level",1);
                    startActivity(intentJavaLevel1);
                    finish();
                    break;

                case R.id.Level2:

                    Intent intentJavaLevel2 = new Intent(KoltinLevelsActivity.this,QuizActivity.class);
                    intentJavaLevel2.putExtra("Category",TriviaQuestion.CATEGORY_SPU);
                    intentJavaLevel2.putExtra("Level",2);
                    startActivity(intentJavaLevel2);
                    finish();
                    break;

                case R.id.Level3:

                    Intent intentJavaLevel3 = new Intent(KoltinLevelsActivity.this,QuizActivity.class);
                    intentJavaLevel3.putExtra("Category",TriviaQuestion.CATEGORY_SPU);
                    intentJavaLevel3.putExtra("Level",3);
                    startActivity(intentJavaLevel3);
                    finish();
                    break;


                case R.id.Level4:

                    Intent intentJavaLevel4 = new Intent(KoltinLevelsActivity.this,QuizActivity.class);
                    intentJavaLevel4.putExtra("Category",TriviaQuestion.CATEGORY_SPU);
                    intentJavaLevel4.putExtra("Level",4);
                    startActivity(intentJavaLevel4);
                    finish();
                    break;

            }

        }

    }

    private void lockandUnlockLevels() {

        SharedPreferences sharedPreferences =
                getSharedPreferences(getPackageName() + Constants.MY_LEVEL_PREFFILE,
                        Context.MODE_PRIVATE);

        JL1 = sharedPreferences.getInt(Constants.KEY_KOTLIN_LEVEL_1,0);
        JL2 = sharedPreferences.getInt(Constants.KEY_KOTLIN_LEVEL_2,0);
        JL3 = sharedPreferences.getInt(Constants.KEY_KOTLIN_LEVEL_3,0);
        JL4 = sharedPreferences.getInt(Constants.KEY_KOTLIN_LEVEL_4,0);


         // Level 1
        if (JL1 == 1){
            Level1.setClickable(true);
            Level1.setOnClickListener(this);
            Level1.setBackgroundResource(R.drawable.level1_bg);
            imgLevel1.setImageResource(R.drawable.black_unlock_img);

        }else {
            Level1.setClickable(false);
            Level1.setBackgroundResource(R.drawable.level_lock_bg);
            imgLevel1.setImageResource(R.drawable.black_lock_img);
        }


        // Level 2
        if (JL2 == 1){
            Level2.setClickable(true);
            Level2.setOnClickListener(this);
            Level2.setBackgroundResource(R.drawable.level2_bg);
            imgLevel2.setImageResource(R.drawable.black_unlock_img);

        }else {
            Level2.setClickable(false);
            Level2.setBackgroundResource(R.drawable.level_lock_bg);
            imgLevel2.setImageResource(R.drawable.black_lock_img);
        }

        // Level 3
        if (JL3 == 1){
            Level3.setClickable(true);
            Level3.setOnClickListener(this);
            Level3.setBackgroundResource(R.drawable.level3_bg);
            imgLevel3.setImageResource(R.drawable.black_unlock_img);

        }else {
            Level3.setClickable(false);
            Level3.setBackgroundResource(R.drawable.level_lock_bg);
            imgLevel3.setImageResource(R.drawable.black_lock_img);
        }

        // Level 4
        if (JL4 == 1){
            Level4.setClickable(true);
            Level4.setOnClickListener(this);
            Level4.setBackgroundResource(R.drawable.level4_bg);
            imgLevel4.setImageResource(R.drawable.black_unlock_img);

        }else {
            Level4.setClickable(false);
            Level4.setBackgroundResource(R.drawable.level_lock_bg);
            imgLevel4.setImageResource(R.drawable.black_lock_img);
        }

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(KoltinLevelsActivity.this,CategoryActivity.class);
        startActivity(intent);
        finish();

    }
}