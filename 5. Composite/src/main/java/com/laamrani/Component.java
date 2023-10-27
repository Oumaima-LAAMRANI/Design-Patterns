package com.laamrani;

public abstract class Component {
    protected String name;
    protected int level=0;

    public abstract void show();
    public Component(String name) {
        this.name = name;
    }
    public String tab(int level){
        String tab="";
        for(int i=0;i<level;i++){
            tab+="\t";
        }
        return tab;
    }
}
