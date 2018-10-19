package com.example.user.assginment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button machineBTN, imageBTN, humanBTN, virtualBTN, artificialBTN, naturalBTN, dataBTN, bigBTN, bioBTN, internetBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        machineBTN = findViewById(R.id.machineBTN);
        imageBTN = findViewById(R.id.imageBTN);
        humanBTN = findViewById(R.id.humanBTN);
        virtualBTN = findViewById(R.id.virtualBTN);
        artificialBTN = findViewById(R.id.artificialBTN);
        naturalBTN = findViewById(R.id.naturalBTN);
        dataBTN = findViewById(R.id.dataBTN);
        bigBTN = findViewById(R.id.bigBTN);
        bioBTN = findViewById(R.id.bioBTN);
        internetBTN = findViewById(R.id.internetBTN);

        machineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, machineActivity.class);
                startActivity(intent);
            }
        });


        imageBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                startActivity(intent);
            }
        });

        humanBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HumanActivity.class);
                startActivity(intent);
            }
        });

        virtualBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VirtualActivity.class);
                startActivity(intent);
            }
        });

        artificialBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ArtificialActivity.class);
                startActivity(intent);
            }
        });

        naturalBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NaturalActivity.class);
                startActivity(intent);
            }
        });

        dataBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DataActivity.class);
                startActivity(intent);
            }
        });

        bigBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BigActivity.class);
                startActivity(intent);
            }
        });

        bioBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BioActivity.class);
                startActivity(intent);
            }
        });

        internetBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InternetActivity.class);
                startActivity(intent);
            }
        });
    }
}
