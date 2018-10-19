package com.example.user.assginment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BioActivity extends AppCompatActivity {

    Button bioMenuBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        bioMenuBTN = findViewById(R.id.bioMenuBTN);
        bioMenuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BioActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
