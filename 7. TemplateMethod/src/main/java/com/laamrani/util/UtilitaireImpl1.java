package com.laamrani.util;

public class UtilitaireImpl1 extends Utilitaire {

    @Override
    public double filter1(String str) {
        return Math.pow(str.length(),4);
    }

    @Override
    public double filter2(double d) {
        return d*2;
    }
}
