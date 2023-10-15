package com.laamrani.pop;

public class ObserverImpl2 implements Observer {
    private int counter;
    @Override
    public void update(Observable observable) {
        int state=((ObservableImpl) observable).getState();
        if(state%2==0) ++counter;
        System.out.println("******* ObserverImpl2 *******");
        System.out.println("Nouvelle mise à jour : state = "+ state);
        System.out.println("Résultat de calcul : "+ ((state%2)==0?"Pair":"Impair"));
        System.out.println("Le compteur est : "+counter);
        System.out.println("******************************");
    }
}
