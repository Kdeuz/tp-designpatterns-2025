package fabric.creator;

import maze.Maze;
import maze.room.Room;
import maze.door.Door;

public class TestFabric {
    public static void main(String[] args) {
        MazeCreator mazeCreator = new MazeCreator();
        BombedMazeCreator bombedMazeFactory = new BombedMazeCreator();
        EnchantedMazeCreator enchantedMazeFactory = new EnchantedMazeCreator();

        Maze maze = mazeCreator.makeMaze();
        Maze bombedMaze = bombedMazeFactory.makeMaze();
        Maze enchantedMaze = enchantedMazeFactory.makeMaze();

        Room r1 = mazeCreator.makeRoom(1);
        Room r2 = mazeCreator.makeRoom(2);

        Room eR1 = enchantedMazeFactory.makeRoom(1);
        Room eR2 = enchantedMazeFactory.makeRoom(2);

        Room bR1 = bombedMazeFactory.makeRoom(1);
        Room bR2 = bombedMazeFactory.makeRoom(2);

        Door door = mazeCreator.makeDoor(r1, r2);

        Door eDoor = enchantedMazeFactory.makeDoor(eR1, eR2);

        Door bDoor = bombedMazeFactory.makeDoor(bR1, bR2);

        r1.setSide(Room.Direction.EAST, door);
        r2.setSide(Room.Direction.WEST, door);

        eR1.setSide(Room.Direction.EAST, eDoor);
        eR2.setSide(Room.Direction.WEST, eDoor);

        bR1.setSide(Room.Direction.EAST, bDoor);
        bR2.setSide(Room.Direction.WEST, bDoor);


        maze.addRoom(r1);
        maze.addRoom(r2);

        bombedMaze.addRoom(bR1);
        bombedMaze.addRoom(bR2);

        enchantedMaze.addRoom(eR1);
        enchantedMaze.addRoom(eR2);
    }
}
