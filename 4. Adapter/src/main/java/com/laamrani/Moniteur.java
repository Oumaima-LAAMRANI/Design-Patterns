package com.laamrani;

public class Moniteur implements Vga {

    @Override
    public void print(String message) {
        System.out.println("********com.laamrani.Moniteur*******");
        System.out.println(message);
        System.out.println("********com.laamrani.Moniteur*******");
    }
}
