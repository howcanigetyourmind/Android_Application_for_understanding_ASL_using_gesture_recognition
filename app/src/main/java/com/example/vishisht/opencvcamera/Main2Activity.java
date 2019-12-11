package com.example.vishisht.opencvcamera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.vishisht.opencvcamera.ui.login.LoginActivity;

public class Main2Activity extends AppCompatActivity {

    int count = 1;

    @Override
    public void onBackPressed() {
        if(count == 1) {
            Toast.makeText(Main2Activity.this, "Do you really want to finish it?", Toast.LENGTH_LONG).show();
            count = 0;
        } else {
            super.onBackPressed();
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        Button btn4 = (Button) findViewById(R.id.guest2);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
