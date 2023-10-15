package com.laamrani.decorateurs;

import com.laamrani.composants.Boisson;
import com.laamrani.decorateurs.Decorateur;

public class Chocolat extends Decorateur {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription() +" au chocolat";
    }

    @Override
    public double cout() {
        return boisson.cout()+0.6;
    }
}
