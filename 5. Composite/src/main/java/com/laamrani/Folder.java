package com.laamrani;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private List<Component> child=new ArrayList<>();
    public Folder(String name) {
        super(name);
    }
    public Component addComponent(Component component){
        component.level=level+1;
        child.add(component);
        return component;
    }
    @Override
    public void show() {
        System.out.println(tab(level)+"Folder : "+name);
        for (Component ch:child){
            ch.show();
        }
    }
}
