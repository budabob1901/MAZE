package com.example.maze.BLL;

import com.example.maze.BEE.Maze;

public class MazeGen {

    public Maze generate(int rows, int cols) {
        Maze maze = new Maze(rows, cols);

        fillWithWalls(maze);


        return maze;
    }

    public void fillWithWalls(Maze maze){
        for(int r = 0; r < maze.getRows(); r++){
            for(int c = 0; c < maze.getCols(); c++){
                maze.setCell(r, c, 1);
            }
        }

    }

    public void carvePath(Maze maze, int row, int col){

        maze.setCell(row, col, 0);

    }


}
