package com.laamrani;

public class Main {
    public static void main(String[] args) {
        Avion avion=new AvionImpl();
        avion.atterir();
        System.out.println("---------------------------");
        avion.doActivity();
        avion.entrerAuGarage();
        System.out.println("---------------------------");
        avion.doActivity();
        avion.sortirDuGarage();
        System.out.println("---------------------------");
        avion.doActivity();
        avion.decoller();
        System.out.println("---------------------------");
        avion.doActivity();
        avion.atterir();
    }
}