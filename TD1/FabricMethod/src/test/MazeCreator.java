package test;

import maze.src.maze.Maze;
import maze.src.maze.door.Door;
import maze.src.maze.room.Room;
import maze.src.maze.wall.Wall;

public class MazeCreator {

    public Maze createMaze() {
        Room room1 = createRoom(1);
        Room room2 = createRoom(2);

        Door door = createDoor(room1, room2);

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

    public Room createRoom(int number) {
        return new Room(number);
    };

    public Door createDoor(Room r1, Room r2){
        return new Door(r1, r2);
    };
}
