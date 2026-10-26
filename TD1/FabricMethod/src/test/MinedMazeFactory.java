package test;

import maze.src.maze.room.Room;

public class MinedMazeFactory extends MazeCreator{
    public Room createRoom(int i) {
        return new SalleMinee(i);
    }
}
