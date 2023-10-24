package com.laamrani;

public class UniteCentrale {
    private Standard standard;
    public void afficher(String str){
        System.out.println("****************");
        System.out.println(str);
        System.out.println("****************");
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public Standard getStandard() {
        return standard;
    }
}
