package com.example.maze.BEE;

public class Maze {
    private int rows;
    private int cols;
    private int[][] grid;

    public Maze(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new int[rows][cols];
    }

    public void setCell(int row, int col, int value) {
        grid[row][col] = value;
    }

    public int getCell(int row, int col) {
        return grid[row][col];
    }

    public int[][] getGrid() {
        return grid;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
