package com.laamrani;

import com.laamrani.adapter.HdmiVgaAdapter;
import com.laamrani.adapter.HdmiVgaAdapterH;

public class Test {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale=new UniteCentrale();
        uniteCentrale.setVga(new Moniteur());
        uniteCentrale.afficher("Bonjour");
        uniteCentrale.setVga(new VP());
        uniteCentrale.afficher("Bonjour");

        HdmiVgaAdapterH hdmiVgaAdapter= new HdmiVgaAdapterH();
        uniteCentrale.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("Bonsoir");

        uniteCentrale.setVga(new SuperVP());
        uniteCentrale.afficher("Hello");

        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentrale.setVga(hdmiVgaAdapter1);
        uniteCentrale.afficher("Hello");

    }
}