package com.example.temperaturecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    EditText etchirps;
    Button btnCalc;
    TextView tvResults;
    DecimalFormat Formatter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etchirps=findViewById(R.id.etchirps);
        btnCalc=findViewById(R.id.btnCalc);
        tvResults=findViewById(R.id.tvResults);
        Formatter = new DecimalFormat("#0.0");

        tvResults.setVisibility(View.GONE);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etchirps.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter a valid field!", Toast.LENGTH_SHORT).show();
                }
                else{
                    int chirps = Integer.parseInt(etchirps.getText().toString().trim());

                            double temperature=(chirps/3.0)+4;

                    String result=getString(R.string.res1) +" " +  Formatter.format(temperature) + " "+ getString(R.string.res2);

                    tvResults.setText(result);


                    tvResults.setVisibility(View.VISIBLE);

                }


            }
        });


    }
}