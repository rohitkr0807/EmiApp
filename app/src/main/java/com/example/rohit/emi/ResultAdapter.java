package com.example.rohit.emi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rohit on 4/30/2017.
 */

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.MyViewHolder> {
    private List<Result> ResultList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView sno, emi, total,tenure;

        public MyViewHolder(View view) {
            super(view);
            sno = (TextView) view.findViewById(R.id.sno);
            emi = (TextView) view.findViewById(R.id.emi);
            total = (TextView) view.findViewById(R.id.total);
            tenure = (TextView) view.findViewById(R.id.tenure);

        }
    }
    public ResultAdapter(List<Result> ResultList) {
        this.ResultList = ResultList;
    }

    @Override
    public ResultAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ResultAdapter.MyViewHolder holder, int position) {
        Result result = ResultList.get(position);
        holder.sno.setText(String.valueOf(result.getSno()));
        holder.emi.setText(String.valueOf(result.getEmi()));
        holder.total.setText(String.valueOf(result.getTotal()));
        holder.tenure.setText(String.valueOf(result.getTenure()));

    }

    @Override
    public int getItemCount() {
        return ResultList.size();
    }
}
