package com.example.rohit.emi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText pr,ten;
    String p,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pr= (EditText) findViewById(R.id.et_principal);
        ten= (EditText) findViewById(R.id.et_tenure);

    }

    public void onClickCalculate(View view) {
        p=pr.getText().toString();
        t=ten.getText().toString();

        Intent i = new Intent(this,ResultsActivity.class);
        i.putExtra("principal",p);
        i.putExtra("tenure",t);
        startActivity(i);
    }
}
