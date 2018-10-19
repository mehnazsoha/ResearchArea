package com.example.user.assginment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InternetActivity extends AppCompatActivity {

    Button internetMenuBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet);

        internetMenuBTN = findViewById(R.id.internetMenuBTN);
        internetMenuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InternetActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
