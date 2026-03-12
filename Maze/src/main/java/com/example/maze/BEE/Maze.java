package com.example.maze.BEE;

public class Maze {
    private int rows;
    private int cols;
    private int[][] map;

    public Maze(int rows, int cols){

        this.rows = rows;
        this.cols = cols;
    }

    public void setcell(int rows, int cols, int value){
        map[rows][cols] = value;
    }

    public int getCell(int rows, int cols){
        return map[rows][cols];
    }
    public int[][] getMap(){
        return map;
    }
}
