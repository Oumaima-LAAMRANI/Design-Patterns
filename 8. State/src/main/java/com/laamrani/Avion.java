package com.laamrani;

public interface Avion {
    void sortirDuGarage(); // Operation de transition d'état
    void entrerAuGarage(); // Operation de transition d'état
    void decoller(); // Operation de transition d'état
    void atterir(); // Operation de transition d'état
    void doActivity(); // Activité : c'est une operation qui prend une durée observable
}
