package com.laamrani.composants;

import com.laamrani.composants.Boisson;

public class Espresso extends Boisson {
    public Espresso(){
        description="Espresso";
    }
    @Override
    public double cout() {
        return 12;
    }
}
