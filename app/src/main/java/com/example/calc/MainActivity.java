package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int n1, n2;
    private TextView resView, n1View, n2View;
    private Button bAdd, bSub, bMul, bDiv, btnRnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1View = findViewById(R.id.num1View);
        n2View = findViewById(R.id.num2View);
        resView = findViewById(R.id.resultView);
        bAdd = findViewById(R.id.addButton);
        bSub = findViewById(R.id.subtractButton);
        bMul = findViewById(R.id.multiplyButton);
        bDiv = findViewById(R.id.divideButton);
        btnRnd = findViewById(R.id.randomizeButton);


        genNumbers();


        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = n1 + n2;
                resView.setText("Result: " + res);
            }
        });

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = n1 - n2;
                resView.setText("Result: " + res);
            }
        });

        bMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = n1 * n2;
                resView.setText("Result: " + res);
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n2 != 0) {
                    double res = (double) n1 / n2;
                    resView.setText("Result: " + res);
                } else {
                    resView.setText("n /0!");
                }
            }
        });

        btnRnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genNumbers();
            }
        });
    }

    private void genNumbers() {
        Random rnd = new Random();
        n1 = rnd.nextInt(100);
        n2 = rnd.nextInt(100);
        n1View.setText(String.valueOf(n1));
        n2View.setText(String.valueOf(n2));
        resView.setText("Res:");
    }
}

