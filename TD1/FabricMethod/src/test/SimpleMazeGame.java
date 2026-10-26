package test;

import maze.src.maze.Maze;
import maze.src.maze.door.Door;
import maze.src.maze.room.Room;
import maze.src.maze.wall.Wall;

public class SimpleMazeGame {
    public SimpleMazeGame() {
    }

    public Maze createMaze() {
        Room room1 = new Room(1);
        Room room2 = new Room(2);

        Door door = new Door(room1, room2);

        room1.setSide(Room.Direction.EAST,door);
        room1.setSide(Room.Direction.SOUTH,new Wall());
        room1.setSide(Room.Direction.NORTH,new Wall());
        room1.setSide(Room.Direction.WEST,new Wall());


        room2.setSide(Room.Direction.WEST,door);
        room2.setSide(Room.Direction.NORTH,new Wall());
        room2.setSide(Room.Direction.EAST,new Wall());
        room2.setSide(Room.Direction.SOUTH,new Wall());

        Maze maze = new Maze();
        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }

    public Maze createEnchantedMaze() {
        Room room1 = new SalleEnchantee(1);
        Room room2 = new SalleEnchantee(2);

        Door door = new PorteMagique(room1, room2);

        room1.setSide(Room.Direction.EAST,door);
        room1.setSide(Room.Direction.SOUTH,new Wall());
        room1.setSide(Room.Direction.NORTH,new Wall());
        room1.setSide(Room.Direction.WEST,new Wall());

        room2.setSide(Room.Direction.WEST,door);
        room2.setSide(Room.Direction.NORTH,new Wall());
        room2.setSide(Room.Direction.EAST,new Wall());
        room2.setSide(Room.Direction.SOUTH,new Wall());

        Maze maze = new Maze();
        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }

    public Maze createMinedMaze() {
        Room room1 = new SalleMinee(1);
        Room room2 = new SalleMinee(2);

        Door door = new Door(room1, room2);

        room1.setSide(Room.Direction.EAST,door);
        room1.setSide(Room.Direction.SOUTH,new Wall());
        room1.setSide(Room.Direction.NORTH,new Wall());
        room1.setSide(Room.Direction.WEST,new Wall());

        room2.setSide(Room.Direction.WEST,door);
        room2.setSide(Room.Direction.NORTH,new Wall());
        room2.setSide(Room.Direction.EAST,new Wall());
        room2.setSide(Room.Direction.SOUTH,new Wall());

        Maze maze = new Maze();
        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }
}

//Les inconvénients de la solution est que le code se répète

