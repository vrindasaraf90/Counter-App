package com.streamliners.ecom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.streamliners.ecom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int qty = 0;
    private ActivityMainBinding b;

    //private static final String MeraTag = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b = ActivityMainBinding .inflate(getLayoutInflater());
        setContentView(b.getRoot());

        setupEventHandlers();

        //Log.e(MeraTag, "onCreate: invoked");

        Toast.makeText(this, "Hello World!", Toast.LENGTH_SHORT).show();
    }

    private void setupEventHandlers(){
        b.incBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incQty();
            }
        });
    }

    public void decQty(View view) {
        b.qty.setText("" + --qty);
    }

    public void incQty() {
        //TextView qtyTv = findViewById(R.id.qty);
        b.qty.setText("" + ++qty);

    }
}