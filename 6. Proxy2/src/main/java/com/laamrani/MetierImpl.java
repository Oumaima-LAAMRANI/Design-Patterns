package com.laamrani;

public class MetierImpl implements IMetier {
    @Override
    public double calcul(int x) {
        double res=50*x*x/3;
        return res;
    }
}
