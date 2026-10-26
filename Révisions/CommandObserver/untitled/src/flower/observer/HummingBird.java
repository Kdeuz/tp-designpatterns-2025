package flower.observer;

import java.util.Observable;
import java.util.Observer;
import flower.Flower;

/**
 * Un Colibri.
 * Implémente Observer pour observer les Fleurs.
 * [cite: 2239]
 */
public class HummingBird implements Observer {

    public void gatherPollen(Flower flower) {
        System.out.println("Le colibri butine une fleur de " + flower.getSeason() + ".");
    }

    /**
     * C'est la méthode appelée par la Fleur (son Sujet).
     * [cite: 2240]
     */
    @Override
    public void update(Observable obs, Object o) {
        // 'obs' est la Fleur
        Flower flower = (Flower) obs;

        // Si la fleur est en floraison, le colibri va butiner
        if (flower.isBlooming()) { //[cite: 2240]
            this.gatherPollen(flower);
        }
    }
}