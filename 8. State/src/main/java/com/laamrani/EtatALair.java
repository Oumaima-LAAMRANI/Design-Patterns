package com.laamrani;

public class EtatALair extends State {
    public EtatALair(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de Sortir du garage, je suis déjà à l'air");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible de entrer au garage, je suis déjà à l'air");
    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de décoller, je suis déjà à l'air");
    }

    @Override
    void executeAtterir() {
        System.out.println("Transition d'état de L'air vers Atterir");
        avion.setState(new EtatEnPiste(avion));
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état en l'air ...");
        }
    }
}
