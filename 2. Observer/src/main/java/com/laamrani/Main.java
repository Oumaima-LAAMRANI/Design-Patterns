package com.laamrani;

import com.laamrani.push.ObservableImpl;
import com.laamrani.push.Observer;
import com.laamrani.push.ObserverImpl1;
import com.laamrani.push.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable= new ObservableImpl();
        Observer o1= new ObserverImpl1();
        Observer o2= new ObserverImpl2();
        Observer o3= new ObserverImpl2();
        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(o3);
        observable.setState(54);
        observable.setState(33);
        observable.unsubscribe(o3);
        observable.subscribe( o ->
            System.out.println("* Observateur anonyme *")
        );
        observable.setState(22);
    }
}