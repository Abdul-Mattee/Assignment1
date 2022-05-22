package com.example.a39_a1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.content.Intent;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textContainer);
        Bundle valuesFromMain = getIntent().getExtras();
        int value = valuesFromMain.getInt("Number");
        setTitle("Table of" + value);
        StringBuilder table = new StringBuilder();
        for (int i = 1;i<11;i++){
            String tableLine = String.format("%s  x  %s =\t%s\n", value, i,value*i); ;
            table.append(tableLine);
        }
        textView.setText(table);
    }
}