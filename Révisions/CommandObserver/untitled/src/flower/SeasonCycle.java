package flower;

import java.util.Observable;

/**
 * Le cycle des saisons.
 * Étend Observable (le Sujet) pour être observé par les Fleurs.
 * [cite: 2229, 2230]
 */
public class SeasonCycle extends Observable {

    private Season season;

    public SeasonCycle(Season season) {
        this.season = season;
    }

    public SeasonCycle() {
        this(Season.HIVER); // Commence en Hiver [cite: 2231]
    }

    public Season getSeason() {
        return this.season;
    }

    /**
     * Passe à la saison suivante et notifie les observateurs (les fleurs).
     * [cite: 2232]
     */
    public void next() {
        season = Season.values()[(season.ordinal() + 1) % 4];
        setChanged(); // Marque cet objet comme ayant changé [cite: 2232]
        notifyObservers(); // Notifie tous les observateurs [cite: 2232]
    }
}