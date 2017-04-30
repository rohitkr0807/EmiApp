package com.example.rohit.emi;

/**
 * Created by Rohit on 4/30/2017.
 */

public class Result {
    double tenure,total,emi;
    int sno;

    public Result(double tenure, double total, double emi, int sno) {
        this.tenure = tenure;
        this.total = total;
        this.emi = emi;
        this.sno = sno;
    }

    public double getTenure() {
        return tenure;
    }

    public double getTotal() {
        return total;
    }

    public double getEmi() {
        return emi;
    }

    public int getSno() {
        return sno;
    }
}
