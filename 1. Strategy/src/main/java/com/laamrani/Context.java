package com.laamrani;

public class Context {
    private IStrategy strategy= new DefaultStrategyImpl();

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void effectuerOperation(){
        System.out.println("**************");
        strategy.opertaionStrategy();
        System.out.println("**************");
    }
}
