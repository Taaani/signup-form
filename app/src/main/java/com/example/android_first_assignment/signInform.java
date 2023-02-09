package com.example.android_first_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signInform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_inform);
    }

    public void goToSignUp(View view){

        Intent signIN = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(signIN);
    }

}