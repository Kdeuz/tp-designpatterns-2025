package test;

import maze.src.maze.Maze;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        test.SimpleMazeGame smg = new test.SimpleMazeGame();
//
//        Maze maze = smg.createMaze();
//        Maze enchantedMaze = smg.createEnchantedMaze();
//        Maze minedMaze = smg.createMinedMaze();

        MazeCreator mc = new MazeCreator();
        Maze maze = mc.createMaze();

        mc = new EnchantedMazeFactory();
        Maze enchantedMaze = mc.createMaze();

        mc = new MinedMazeFactory();
        Maze minedMaze = mc.createMaze();
        /*
        Avantages :
         Extensibilité et flexibilité
         Encapsulation de la logique de création
         Respect du principe Ouvert/Fermé
         Polymorphisme
         Cohérence des objets créés

        Inconvénients :
         Complexité accrue
         Couplage avec les classes concrètes
         Difficulté de paramétrage

         */

    }
}