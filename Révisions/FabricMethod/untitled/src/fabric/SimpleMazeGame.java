package fabric;

import maze.Maze;
import maze.room.Room;
import maze.door.Door;
import maze.wall.Wall;

public class SimpleMazeGame {
    public Maze createMaze() {
        Maze maze = new Maze();
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Door door = new Door(room1, room2);

        room1.setSide(Room.Direction.NORTH, new Wall());
        room1.setSide(Room.Direction.EAST, door);
        room1.setSide(Room.Direction.SOUTH, new Wall());
        room1.setSide(Room.Direction.WEST, new Wall());

        room2.setSide(Room.Direction.WEST, door);
        room2.setSide(Room.Direction.NORTH, new Wall());
        room2.setSide(Room.Direction.EAST, new Wall());
        room2.setSide(Room.Direction.SOUTH, new Wall());

        maze.addRoom(room1);
        maze.addRoom(room2);

        return maze;
    }
}
