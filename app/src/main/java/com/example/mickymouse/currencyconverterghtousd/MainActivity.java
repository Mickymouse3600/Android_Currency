package com.example.mickymouse.currencyconverterghtousd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {

        Double temp;
        EditText GhCurrency = (EditText) findViewById(R.id.editText);

        temp= Double.parseDouble(GhCurrency.getText().toString());
         Double DollarAmount = temp * 0.21;

        Toast.makeText(MainActivity.this,"$"+ String.format("%.2f",DollarAmount ),Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
