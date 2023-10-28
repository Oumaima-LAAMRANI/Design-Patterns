package com.laamrani.proxy;

import com.laamrani.IMetier;
import com.laamrani.MetierImpl;

import java.util.HashMap;
import java.util.Map;

public class ProxySecurity implements IMetier {
    public static  String password="";
    private MetierImpl metier=new MetierImpl();
    @Override
    public double calcul(int x) {

        if(password.equals("1234")){
            double res= metier.calcul(x);
            return res;
        }
        throw new RuntimeException("Not Authorised");
    }
}
