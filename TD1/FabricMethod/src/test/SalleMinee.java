package test;

import maze.src.maze.room.Room;

public class SalleMinee extends Room {
    public SalleMinee(int number) {
        super(number);
    }

    public String toString() {
        return "Salle Minee\n" + super.toString();
    }
}
