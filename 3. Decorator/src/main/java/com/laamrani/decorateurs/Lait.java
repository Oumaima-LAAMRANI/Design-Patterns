package com.laamrani.decorateurs;

import com.laamrani.composants.Boisson;
import com.laamrani.decorateurs.Decorateur;

public class Lait extends Decorateur {
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() +" au lait";
    }

    @Override
    public double cout() {
        return boisson.cout()+0.5;
    }
}
