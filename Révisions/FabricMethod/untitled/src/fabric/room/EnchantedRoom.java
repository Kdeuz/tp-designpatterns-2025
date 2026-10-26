package fabric.room;

public class EnchantedRoom extends maze.room.Room {
    public EnchantedRoom(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "Enchanted Room :\n" + super.toString();
    }
}
