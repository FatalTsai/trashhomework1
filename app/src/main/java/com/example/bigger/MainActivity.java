package com.example.bigger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button smaller,bigger;
    TextView txv;
    int fontsize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txv=(TextView)findViewById(R.id.txv);
        fontsize =30;
        smaller =(Button)findViewById(R.id.smaller);
        smaller.setTextSize(fontsize);
        bigger =(Button)findViewById(R.id.bigger);
        bigger.setTextSize(fontsize);
    }


    public  void smaller(View v)
    {
        if(fontsize >10)
            fontsize--;
        txv.setTextSize(fontsize);

    }


    public  void bigger(View v)
    {
        if(fontsize <200)
            fontsize++;
        txv.setTextSize(fontsize);

    }





}
