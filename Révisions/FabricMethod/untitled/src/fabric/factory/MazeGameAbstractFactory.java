package fabric.factory;

import maze.Maze;
import maze.room.Room;
import maze.door.Door;
import maze.room.Room.Direction;

public class MazeGameAbstractFactory {
    public Maze create(MazeFactory factory) {
        Maze maze = factory.makeMaze();
        Room room1 = factory.makeRoom(1);
        Room room2 = factory.makeRoom(2);
        Door door = factory.makeDoor(room1, room2);

        maze.addRoom(room1);
        room1.setSide(Direction.NORTH, factory.makeWall());
        room1.setSide(Direction.EAST, door);
        room1.setSide(Direction.SOUTH, factory.makeWall());
        room1.setSide(Direction.WEST, factory.makeWall());

        maze.addRoom(room2);
        room2.setSide(Direction.NORTH, factory.makeWall());
        room2.setSide(Direction.EAST, factory.makeWall());
        room2.setSide(Direction.SOUTH, factory.makeWall());
        room2.setSide(Direction.WEST, door);

        return maze;
    }

    public static void main(String[] args) {
        MazeGameAbstractFactory mazeGameAbstractFactory = new MazeGameAbstractFactory();
        Maze maze = mazeGameAbstractFactory.create(new MazeFactory());
        Maze bombedMaze = mazeGameAbstractFactory.create(new BombedMazeFactory());
        Maze enchantedMaze = mazeGameAbstractFactory.create(new EnchantedMazeFactory());
    }
}
//Déléguer l'instanciation d'un produit à la sous-classe
//