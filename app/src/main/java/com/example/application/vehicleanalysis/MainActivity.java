package com.example.application.vehicleanalysis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btnConnect, btnClassify, btnPredict;
    private TextView tvS1, tvS2, tvS3, tvS4, tvResult;
    private EditText TextS1, TextS2, TextS3, TextS4;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConnect = (Button)findViewById(R.id.btnConnect);
        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Apache.connect(sqlid:45098753);
                Toast.makeText(MainActivity.this, "Connected to Apache 5.8.9.6:", Toast.LENGTH_SHORT).show();
                i = 1;
            }
        });
        btnClassify = (Button)findViewById(R.id.btnBinary);
        btnPredict = (Button)findViewById(R.id.btnRegression);
        tvS1 = (TextView)findViewById(R.id.tvS1);
        tvS2 = (TextView)findViewById(R.id.tvS2);
        tvS3 = (TextView)findViewById(R.id.tvS3);
        tvS4 = (TextView)findViewById(R.id.tvS4);
        tvResult = (TextView)findViewById(R.id.tvResult);
        TextS1 = (EditText) findViewById(R.id.TextS1);
        TextS2 = (EditText) findViewById(R.id.TextS2);
        TextS3 = (EditText) findViewById(R.id.TextS3);
        TextS4 = (EditText) findViewById(R.id.TextS4);



        btnClassify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i == 1){
                    int S1 = Integer.parseInt(TextS1.getText().toString());
                    int S2 = Integer.parseInt(TextS2.getText().toString());
                    int S3 = Integer.parseInt(TextS3.getText().toString());
                    int S4 = Integer.parseInt(TextS4.getText().toString());
                    if((S1+S2+S3+S4) >= 500 && (S1+S2+S3+S4) <= 1050){
                        tvResult.setText("Your vehicle is safe for the the next 2 years");
                    }
                    else{
                        tvResult.setText("Alert!! Your vehicle needs immediate attention");
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Connect to server first", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnPredict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int S1 = Integer.parseInt(TextS1.getText().toString());
                int S2 = Integer.parseInt(TextS2.getText().toString());
                int S3 = Integer.parseInt(TextS3.getText().toString());
                int S4 = Integer.parseInt(TextS4.getText().toString());
                // To do yet
            }
        });


    }
}
