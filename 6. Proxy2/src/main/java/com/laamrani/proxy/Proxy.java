package com.laamrani.proxy;

import com.laamrani.IMetier;
import com.laamrani.MetierImpl;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements IMetier {
    private Map<Integer,Double> cache=new HashMap<>();
    private MetierImpl metier=new MetierImpl();
    @Override
    public double calcul(int x) {
        Double data=cache.get(x);
        if(data!=null){
            System.out.println("From Cache");
            return data;
        }
        double res= metier.calcul(x);
        cache.put(x,res);
        System.out.println("From Metier");
        return res;
    }
}
