package com.example.user.assginment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ImageActivity extends AppCompatActivity {

    Button imageMenuBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        imageMenuBTN = findViewById(R.id.imageMenuBTN);
        imageMenuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ImageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
