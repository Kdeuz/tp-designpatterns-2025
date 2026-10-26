package fabric.wall;

public class CrackedWall extends maze.wall.Wall {
    public CrackedWall() {
        super();
    }

    public String toString() {
        return "Mur fissuré : \n" + super.toString();
    }
}
