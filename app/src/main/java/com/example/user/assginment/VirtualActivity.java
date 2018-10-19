package com.example.user.assginment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VirtualActivity extends AppCompatActivity {

    Button virtualMenuBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual);

        virtualMenuBTN = findViewById(R.id.virtualMenuBTN);
        virtualMenuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VirtualActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
