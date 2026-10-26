package test;

import maze.src.maze.room.Room;

public class SalleEnchantee extends Room {

    public SalleEnchantee(int number) {
        super(number);
    }

    public String toString() {
        return "Salle Enchantee\n"+super.toString();
    }
}
