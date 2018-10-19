package com.example.user.assginment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NaturalActivity extends AppCompatActivity {

    Button naturalMenuBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural);

        naturalMenuBTN = findViewById(R.id.naturalMenuBTN);
        naturalMenuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NaturalActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
