package com.laamrani.composants;

import com.laamrani.composants.Boisson;

public class Sumatra extends Boisson {
    public Sumatra(){
        description="Sumatra";
    }
    @Override
    public double cout() {
        return 6;
    }
}
