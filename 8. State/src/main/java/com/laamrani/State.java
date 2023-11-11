package com.laamrani;

public abstract class State{
    protected AvionImpl avion;

    public State(AvionImpl avion) {
        this.avion = avion;
    }

    abstract void executeSortirDuGarage(); // Operation de transition d'état
    abstract void executeEntrerAuGarage(); // Operation de transition d'état
    abstract void executeDecoller(); // Operation de transition d'état
    abstract void executeAtterir(); // Operation de transition d'état
    abstract void executeDoActivity(); // Activité : c'est une operation qui prend une durée observable
}
