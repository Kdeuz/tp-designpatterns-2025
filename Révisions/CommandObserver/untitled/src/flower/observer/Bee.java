package flower.observer;

import java.util.Observable;
import java.util.Observer;
import flower.Flower;

/**
 * Une Abeille.
 * Implémente Observer pour observer les Fleurs.
 * [cite: 2237]
 */
public class Bee implements Observer {

    public void gatherPollen(Flower flower) {
        System.out.println("L'abeille butine une fleur de " + flower.getSeason() + ".");
    }

    /**
     * C'est la méthode appelée par la Fleur (son Sujet).
     * [cite: 2238]
     */
    @Override
    public void update(Observable obs, Object o) {
        // 'obs' est la Fleur
        Flower flower = (Flower) obs;

        // Si la fleur est en floraison, l'abeille va butiner
        if (flower.isBlooming()) { //[cite: 2238]
            this.gatherPollen(flower);
        }
    }
}