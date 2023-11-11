package com.laamrani;

public class EtatEnPiste extends State{

    public EtatEnPiste(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de Sortir du garage, je suis déjà en piste");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Transition d'état de En piste vers Garage");
        avion.setState(new EtatAuGarage(avion));
    }

    @Override
    void executeDecoller() {
        System.out.println("Transition d'état de En piste vers Décollage");
        avion.setState(new EtatALair(avion));
    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible de Sortir d'atterir, je suis en piste");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état en piste ...");
        }
    }
}

