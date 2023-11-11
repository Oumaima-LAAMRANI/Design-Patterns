package com.laamrani;

public class AvionImpl implements Avion {
    private State state;
    public AvionImpl() {
        this.state = new EtatEnPiste(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void sortirDuGarage() {
        state.executeSortirDuGarage();
    }

    @Override
    public void entrerAuGarage() {
        state.executeEntrerAuGarage();
    }

    @Override
    public void decoller() {
        state.executeDecoller();
    }

    @Override
    public void atterir() {
        state.executeAtterir();
    }

    @Override
    public void doActivity() {
        state.executeDoActivity();
    }

}
