package com.example.atarshine.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_result extends AppCompatActivity {
    TextView txtRS;
    Button btnBack;
    public  String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txtRS = (TextView)findViewById(R.id.txtRS);
        String s = getIntent().getStringExtra("string");
        txtRS.setText(s);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_result.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.back_enter,R.anim.back_exit);
            }
        });
    }
}
