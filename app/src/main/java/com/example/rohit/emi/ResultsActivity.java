package com.example.rohit.emi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.lang.Math;

import static java.lang.Math.pow;

public class ResultsActivity extends AppCompatActivity {

    int p,t;
    ArrayList<Result> results= new ArrayList<>();
    ResultAdapter mAdapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        p=Integer.parseInt(getIntent().getStringExtra("principal"));
        t=Integer.parseInt(getIntent().getStringExtra("tenure"));
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        int sno=1;
        for(int i=t-3;i<t+4;i++){
            double emi,total;
            double a= pow(1.03,i);

           total=((p*0.03)*a)/(a-1);
            emi= total*i;
            Result r= new Result(i,emi,total,sno);
            sno++;
            results.add(r);
        }
        mAdapter = new ResultAdapter(results);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
