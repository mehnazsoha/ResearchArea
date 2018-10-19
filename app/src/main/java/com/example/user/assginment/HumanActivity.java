package com.example.user.assginment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HumanActivity extends AppCompatActivity {

    Button humanMenuBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human);

        humanMenuBTN = findViewById(R.id.humanMenuBTN);
        humanMenuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HumanActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
