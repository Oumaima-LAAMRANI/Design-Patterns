package com.laamrani;
import com.laamrani.proxy.ProxySecurity;

public class Main {
    public static void main(String[] args) {
        ProxySecurity.password="1234";
        Presentation presentation=new Presentation();
        presentation.setMetier(new ProxySecurity());
        presentation.traitement(46);
        presentation.traitement(30);
        presentation.traitement(30);
    }
}