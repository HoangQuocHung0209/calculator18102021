package com.example.calculator18102021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {


    //khai báo view để tương tác
    TextInputEditText mTxtInPutEdtNumber1,mTxtInPutEdtNumber2;
    TextView mTvResult;
    Button mBtnPlus,mBtnSub,mBtnMul,mBtnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ :
        mTxtInPutEdtNumber1 = findViewById(R.id.input1);
        mTxtInPutEdtNumber2 = findViewById(R.id.input2);
        mTvResult = findViewById(R.id.textViewRessult);
        mBtnPlus = findViewById(R.id.button1);
        mBtnSub = findViewById(R.id.button2);
        mBtnMul = findViewById(R.id.button3);
        mBtnDiv = findViewById(R.id.button4);

        //task : xử lý task như thế nào

        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Click button cộng",Toast.LENGTH_SHORT).show();
            }
        });

    }
}