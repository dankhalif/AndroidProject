package com.project.androidproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ProfileBtn = (Button) findViewById(R.id.ProfileBtn);
        ProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),ProfileActivity.class);
                startActivity(startIntent);
            }
        });

        Button alcBtn = (Button) findViewById(R.id.alcBtn);
        alcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alc = "https://andela.com/alc/";
                Uri webaddress = Uri.parse(alc);
                Intent gotoalc = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoalc.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoalc);
                }
            }
        });
    }
}
