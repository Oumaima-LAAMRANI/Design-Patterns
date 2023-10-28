package com.laamrani;

public class Presentation {
    private IMetier metier;
    public void traitement(int x){
        double res=metier.calcul(x);
        System.out.println("**********************");
        System.out.println("Pour "+x+" ====> "+res);
        System.out.println("**********************");
    }
    public void setMetier(IMetier metier) {
        this.metier = metier;
    }
}
