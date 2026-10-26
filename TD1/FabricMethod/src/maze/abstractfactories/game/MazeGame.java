package maze.abstractfactories.game;

import maze.abstractfactories.factory.MazeFactory;
import maze.src.maze.Maze;
import maze.src.maze.door.Door;
import maze.src.maze.room.Room;
import maze.src.maze.room.Room.Direction;

public class MazeGame {
    public static Maze createMaze(MazeFactory factory) {
        Maze maze = factory.makeMaze();

        Room room1 = factory.makeRoom(1);
        Room room2 = factory.makeRoom(2);

        Door door = factory.makeDoor(room1, room2);

        room1.setSide(Direction.NORTH, factory.makeWall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, factory.makeWall());
        room1.setSide(Direction.WEST, factory.makeWall());

        room2.setSide(Direction.NORTH, factory.makeWall());
        room2.setSide(Direction.EAST, factory.makeWall());
        room2.setSide(Direction.SOUTH, factory.makeWall());
        room2.setSide(Direction.WEST, door);

        // Ajout des salles au labyrinthe
        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }
}
