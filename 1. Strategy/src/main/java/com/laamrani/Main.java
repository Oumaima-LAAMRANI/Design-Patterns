package com.laamrani;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context=new Context();
        //par setter
 /*
      context.effectuerOperation();
      context.setStrategy(new StrategyImpl2());
      context.effectuerOperation();

      */
        IStrategy strategy;
       /*
        L'inconvienient c'est que on ceer plusieurs instance qui sont les memes
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Quelle stratégie ? ");
            String str= scanner.nextLine();
            //IStrategy strategy= (IStrategy) Class.forName("com.laamrani.StrategyImpl"+str).newInstance();
            strategy= (IStrategy) Class.forName("com.laamrani.StrategyImpl"+str).getConstructor().newInstance();
            context.setStrategy(strategy);
            context.effectuerOperation();
        }*/
        Map<String,IStrategy> strategyMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Quelle stratégie ? ");
            String str= scanner.nextLine();
            strategy=strategyMap.get(str);
            if(strategy==null) {
                System.out.println("Creation d'un nouvel objet de StrategyImpl"+str);
                strategy = (IStrategy) Class.forName("com.laamrani.StrategyImpl" + str).getConstructor().newInstance();
                strategyMap.put(str,strategy);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();
        }


    }
}