package com.laamrani.util;

public abstract class Utilitaire {
    public double compute(String str){
        int size=str.length();
        double res=0;
        for (int i = 0; i < size; i++) {
            double x=filter1(str);
            res+=i*x;
            double y=filter2(res);
            res+=y*res;
        }
        return res;
    }
    protected abstract double filter1(String str);
    protected abstract double filter2(double d);
}
