package com.example.uaspb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grammer extends AppCompatActivity implements View.OnClickListener {
    Button Back;
    CardView android1, android2, android3, android4, android5, android6, android7, android8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Back = findViewById(R.id.btn1);
        Back.setOnClickListener(this);

        android1 = findViewById(R.id.android1);
        android1.setOnClickListener(this);

        android2 = findViewById(R.id.android2);
        android2.setOnClickListener(this);

        android3 = findViewById(R.id.android3);
        android3.setOnClickListener(this);

        android4 = findViewById(R.id.android4);
        android4.setOnClickListener(this);

        android5 = findViewById(R.id.android5);
        android5.setOnClickListener(this);

        android6 = findViewById(R.id.android6);
        android6.setOnClickListener(this);

        android7 = findViewById(R.id.android7);
        android7.setOnClickListener(this);

        android8 = findViewById(R.id.android8);
        android8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.android1:
                startActivity(new Intent(this, Noun.class));
                break;
        }
        switch (view.getId()) {
            case R.id.android2:
                startActivity(new Intent(this, present.class));
                break;
        }
        switch (view.getId()) {
            case R.id.android3:
                startActivity(new Intent(this, pasttense.class));
                break;

        }
        switch (view.getId()) {
            case R.id.android4:
                startActivity(new Intent(this, presentperfect.class));
                break;

        }
        switch (view.getId()) {
            case R.id.android5:
                startActivity(new Intent (this, futuretense.class));
                break;

        }
        switch (view.getId()) {
            case R.id.android6:
                startActivity(new Intent (this, verb.class));
                break;

        }

        switch (view.getId()) {
            case R.id.android7:
                startActivity(new Intent (this, conditionals.class));
                break;

        }

        switch (view.getId()) {
            case R.id.android8:
                startActivity(new Intent (this, Linkingwords.class));
                break;

        }

        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent (this, MainActivity.class));
                break;

        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
