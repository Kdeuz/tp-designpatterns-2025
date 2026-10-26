package flower;

import java.util.Observable;
import java.util.Observer;

public class Flower extends Observable implements Observer {
    private boolean isBlooming;
    private Season season;

    public Flower(Season season) {
        this.isBlooming = false;
        this.season = season;
    }

    public void bloom() {
        this.isBlooming = true;
        System.out.println("Une fleur de " + this.getSeason() + " éclot !");
        setChanged(); // Marque la fleur comme ayant changé [cite: 2226]
        notifyObservers(); // Notifie les abeilles et colibris [cite: 2226]
    }

    public boolean isBlooming() {
        return this.isBlooming;
    }

    public Season getSeason() {
        return this.season;
    }


    @Override
    public void update(Observable obs, Object o) {
        // 'obs' est le Sujet qui a notifié, castons-le
        SeasonCycle cycle = (SeasonCycle) obs;

        // Si la saison du cycle correspond à la saison de la fleur
        // et qu'elle n'est pas déjà en fleur
        if (cycle.getSeason().equals(this.getSeason()) && !isBlooming()) {
            this.bloom(); // Alors elle éclot [cite: 2228]
        }
    }

    @Override
    public String toString() {
        return "Fleur fleurissant durant la saison " + this.getSeason() + "."; //[cite: 2227]
    }
}
