package flower;

import flower.observer.Bee;
import flower.observer.HummingBird;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // 1. Créer le sujet principal (le cycle des saisons)
        SeasonCycle cycle = new SeasonCycle();// [cite: 2233]

        // 2. Créer les observateurs finaux (abeille et colibri)
        Bee maya = new Bee(); //[cite: 2233]
        HummingBird flit = new HummingBird(); //[cite: 2234]

        System.out.println(">>> FLEURS <<<");

        // 3. Créer 10 fleurs (Sujets/Observateurs)
        for (int i = 0; i < 10; i++) {
            // Crée une fleur pour une saison aléatoire
            Flower f = new Flower(Season.values()[new Random().nextInt(4)]);// [cite: 2234]
            System.out.println(f); //[cite: 2235]

            // Abonner la fleur au cycle des saisons
            cycle.addObserver(f); //[cite: 2235]

            // Abonner l'abeille et le colibri à cette fleur
            f.addObserver(maya); //[cite: 2235]
            f.addObserver(flit); //[cite: 2235]
        }

        // 4. Lancer la simulation
        // L'appel à cycle.next() va notifier les Fleurs,
        // qui vont appeler bloom(), qui va notifier les Abeilles/Colibris.
        for (int i = 0; i < 4; i++) {
            // (Le code du jar imprime la saison *à venir*, pas la saison actuelle)
            System.out.println("\n>>> " + Season.values()[(cycle.getSeason().ordinal() + 1) % 4] + " <<<");// [cite: 2235]
            cycle.next(); //[cite: 2236]
        }
    }
}