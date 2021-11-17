package com.example.calculator18102021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    //khai báo view để tương tác
    TextInputEditText mTxtInPutEdtNumber1,mTxtInPutEdtNumber2;
    TextView mTvResult;
    Button mBtnPlus,mBtnSub,mBtnMul,mBtnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ :
        mTxtInPutEdtNumber1 = findViewById(R.id.TxTInputEdtNumber1);
        mTxtInPutEdtNumber2 = findViewById(R.id.TxTInputEdtNumber2);
        mTvResult = findViewById(R.id.textViewRessult);
        mBtnPlus = findViewById(R.id.button1);
        mBtnSub = findViewById(R.id.button2);
        mBtnMul = findViewById(R.id.button3);
        mBtnDiv = findViewById(R.id.button4);

        //task : xử lý task như thế nào

        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"Click button cộng",Toast.LENGTH_SHORT).show();

                String textNumber1 = mTxtInPutEdtNumber1.getText().toString();
                String textNumber2 = mTxtInPutEdtNumber2.getText().toString();

                //Kiểm tra :
                if (textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid input", Toast.LENGTH_SHORT).show();
                    return;
                }

                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);
                int result = number1 + number2;
                mTvResult.setText("Result =  " +result);
            }
        });

        mBtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textNumber1 = mTxtInPutEdtNumber1.getText().toString();
                String textNumber2 = mTxtInPutEdtNumber2.getText().toString();

                if(textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    return;
                }

                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);

                int result = number1 - number2;
                mTvResult.setText("Result = "+result);
            }
        });

        mBtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textNumber1 = mTxtInPutEdtNumber1.getText().toString();
                String textNumber2 = mTxtInPutEdtNumber2.getText().toString();

                if(textNumber1.isEmpty() || textNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    return;
                }

                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);
                int result = number1*number2;
                mTvResult.setText("Result = "+result);
            }
        });

        mBtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textNumber1 = mTxtInPutEdtNumber1.getText().toString();
                String textNumber2 = mTxtInPutEdtNumber2.getText().toString();

                if ((textNumber1.isEmpty() || textNumber2.isEmpty())) {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    return;
                }

                float number1 = Float.parseFloat(textNumber1);
                float number2 = Float.parseFloat(textNumber2);
                if (number2==0){
                    Toast.makeText(MainActivity.this, "cannot divide by 0", Toast.LENGTH_SHORT).show();
                    return;
                }
                float result = number1/number2;

                mTvResult.setText("Result = "+df.format(result));
            }
        });

    }
}