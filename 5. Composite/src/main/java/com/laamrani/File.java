package com.laamrani;

public class File extends Component {
    public File(String name) {
        super(name);
    }
    @Override
    public void show() {
        System.out.println(tab(level)+"File : "+name);
    }
}
