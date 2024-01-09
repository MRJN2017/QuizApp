package com.infowithvijay.triviaquizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener{

    Button bttpu,btspu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        bttpu = findViewById(R.id.bt_tpu);
        btspu = findViewById(R.id.bt_spu);



        bttpu.setOnClickListener(this);
        btspu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){


            case R.id.bt_tpu:

                createLevelsForTpu();
                Intent intentJava = new Intent(CategoryActivity.this,JavaLevelsActivity.class);
                intentJava.putExtra("Category",TriviaQuestion.CATEGORY_TPU);
                startActivity(intentJava);
                finish();
                break;

            case R.id.bt_spu:
                createLevelsForSpu();
                Intent intentKotlin = new Intent(CategoryActivity.this,KoltinLevelsActivity.class);
                intentKotlin.putExtra("Category",TriviaQuestion.CATEGORY_SPU);
                startActivity(intentKotlin);
                finish();
                break;

        }

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(CategoryActivity.this,PlayScreen.class);
        startActivity(intent);
        finish();
    }



    ///  1 -> unlocked   0 -> locked
    public void createLevelsForTpu(){

        SharedPreferences sharedPreferences =
                getSharedPreferences(getPackageName() + Constants.MY_LEVEL_PREFFILE,
                        Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(Constants.KEY_JAVA_LEVEL_1,1);
        editor.putString(Constants.KEY_CAT_JAVA_LEVEL_1,"Unlock");
        editor.apply();

        if (sharedPreferences.getString(Constants.KEY_CAT_JAVA_LEVEL_1,"N/A").equals("Unlock")){

            editor.putInt(Constants.KEY_JAVA_LEVEL_1,1);   ///  Unlock Level 1
            editor.putInt(Constants.KEY_JAVA_LEVEL_2,0);
            editor.putInt(Constants.KEY_JAVA_LEVEL_3,0);
            editor.putInt(Constants.KEY_JAVA_LEVEL_4,0);

        }else  if (sharedPreferences.getString(Constants.KEY_CAT_JAVA_LEVEL_2,"N/A").equals("Unlock")){

            editor.putInt(Constants.KEY_JAVA_LEVEL_1,1);
            editor.putInt(Constants.KEY_JAVA_LEVEL_2,1);   ///  Unlock Level 2
            editor.putInt(Constants.KEY_JAVA_LEVEL_3,0);
            editor.putInt(Constants.KEY_JAVA_LEVEL_4,0);

        }else  if (sharedPreferences.getString(Constants.KEY_CAT_JAVA_LEVEL_3,"N/A").equals("Unlock")){

            editor.putInt(Constants.KEY_JAVA_LEVEL_1,1);
            editor.putInt(Constants.KEY_JAVA_LEVEL_2,1);
            editor.putInt(Constants.KEY_JAVA_LEVEL_3,1);   ///  Unlock Level 3
            editor.putInt(Constants.KEY_JAVA_LEVEL_4,0);

        }else  if (sharedPreferences.getString(Constants.KEY_CAT_JAVA_LEVEL_4,"N/A").equals("Unlock")){

            editor.putInt(Constants.KEY_JAVA_LEVEL_1,1);
            editor.putInt(Constants.KEY_JAVA_LEVEL_2,1);
            editor.putInt(Constants.KEY_JAVA_LEVEL_3,1);
            editor.putInt(Constants.KEY_JAVA_LEVEL_4,1);  ///  Unlock Level 4

        }
    }


    ///  1 -> unlocked   0 -> locked
    public void createLevelsForSpu(){

        SharedPreferences sharedPreferences =
                getSharedPreferences(getPackageName() + Constants.MY_LEVEL_PREFFILE,
                        Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(Constants.KEY_KOTLIN_LEVEL_1,1);
        editor.putString(Constants.KEY_CAT_KOTLIN_LEVEL_1,"Unlock");
        editor.apply();

        if (sharedPreferences.getString(Constants.KEY_CAT_KOTLIN_LEVEL_1,"N/A").equals("Unlock")){

            editor.putInt(Constants.KEY_KOTLIN_LEVEL_1,1);   ///  Unlock Level 1
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_2,0);
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_3,0);
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_4,0);

        }else  if (sharedPreferences.getString(Constants.KEY_CAT_KOTLIN_LEVEL_2,"N/A").equals("Unlock")){

            editor.putInt(Constants.KEY_KOTLIN_LEVEL_1,1);
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_2,1);   ///  Unlock Level 2
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_3,0);
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_4,0);

        }else  if (sharedPreferences.getString(Constants.KEY_CAT_KOTLIN_LEVEL_3,"N/A").equals("Unlock")){

            editor.putInt(Constants.KEY_KOTLIN_LEVEL_1,1);
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_2,1);
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_3,1);   ///  Unlock Level 3
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_4,0);

        }else  if (sharedPreferences.getString(Constants.KEY_CAT_KOTLIN_LEVEL_4,"N/A").equals("Unlock")){

            editor.putInt(Constants.KEY_KOTLIN_LEVEL_1,1);
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_2,1);
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_3,1);
            editor.putInt(Constants.KEY_KOTLIN_LEVEL_4,1);  ///  Unlock Level 4

        }
    }

}