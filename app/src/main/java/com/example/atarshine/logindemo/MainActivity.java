package com.example.atarshine.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtUserName;
    EditText txtPass;
    Button btnLogin;
    TextView txtRS1;
    public  static final String State = "Trang thai";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(State,"He he");
    }

    @Override

    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(State,"onRestoreInstanceState");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState)
    {
        if (!txtRS1.getText().toString().isEmpty())
        {
            savedInstanceState.putInt("NO1",Integer.parseInt(txtUserName.getText().toString()));
            savedInstanceState.putInt("NO2",Integer.parseInt(txtPass.getText().toString()));
            savedInstanceState.putInt("KQ",Integer.parseInt(txtRS1.getText().toString()));
        }
        Log.e(State,"onSaveInstanceState " + Integer.parseInt(txtRS1.getText().toString()));
    }

    public int plusXY(int x,int y)
    {
        return x + y;
    }

}
