package com.laamrani;
import com.laamrani.composants.Boisson;
import com.laamrani.composants.Deca;
import com.laamrani.composants.Sumatra;
import com.laamrani.decorateurs.Caramel;
import com.laamrani.decorateurs.Chocolat;
import com.laamrani.decorateurs.Lait;

public class Main {
    public static void main(String[] args) {
        Boisson boisson=new Sumatra();
        boisson= new Caramel(new Lait(new Chocolat(new Deca())));
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());


    }
}