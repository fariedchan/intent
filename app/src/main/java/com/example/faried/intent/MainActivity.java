package com.example.faried.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btpindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btpindah =(Button)findViewById(R.id.pindah);

        btpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ipindah = new Intent (MainActivity.this, halaman2activity.class);
                startActivity(ipindah);

            }
        });
    }
}
