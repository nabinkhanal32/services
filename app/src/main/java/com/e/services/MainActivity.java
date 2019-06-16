package com.e.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import services.MyService;

public class MainActivity extends AppCompatActivity {
    private Button btnStart,btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMyServices();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMyServices();
            }
        });
    }
    private void startMyServices(){
        startService(new Intent(this, MyService.class));
    }
    private void stopMyServices(){
        stopService(new Intent(this, MyService.class));
    }
}
