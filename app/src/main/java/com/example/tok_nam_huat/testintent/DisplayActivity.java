package com.example.tok_nam_huat.testintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView tvDisplayValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvDisplayValue = findViewById(R.id.textViewDisplayNumber);

        Intent intentReceived = getIntent();
        int value = intentReceived.getIntExtra("value", 0);

        tvDisplayValue.setText(value + "");
    }
}
