package com.example.psaga.mobileapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_main);

        }
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.d("landscape","landscape");
            setContentView(R.layout.activity_main_land);

        }
        Button signUp=(Button)findViewById(R.id.button2);
        signUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mintent = new Intent(MainActivity.this, Dashboard.class);
                startActivity(mintent);
            }
        });
    }
}
