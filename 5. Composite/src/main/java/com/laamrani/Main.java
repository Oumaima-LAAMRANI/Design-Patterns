package com.laamrani;

public class Main {
    public static void main(String[] args) {
        Folder root=new Folder("Design Patterns");
        Folder d1=(Folder)root.addComponent(new Folder("Comportement"));
        Folder d2=(Folder)root.addComponent(new Folder("Creation"));
        Folder d3=(Folder)root.addComponent(new Folder("Structure"));
        d1.addComponent(new File("Strategy"));
        d1.addComponent(new File("Observer"));
        d2.addComponent(new File("Decorateur"));
        d2.addComponent(new File("Composite"));
        d3.addComponent(new File("Singleton"));
        d3.addComponent(new File("Builder"));
        Folder d21=(Folder) d2.addComponent(new Folder("Str21"));
        d21.addComponent(new File("F211"));
        d21.addComponent(new File("F212"));
        d21.addComponent(new File("F213"));
        root.show();
    }
}