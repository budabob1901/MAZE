package com.example.maze.GUI;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import com.example.maze.BLL.MazeGen;
import com.example.maze.BEE.Maze;

public class MazeController {

    @FXML
    private GridPane mazeGrid;

    private MazeGen generator = new MazeGen();

    @FXML
    private void onGenerateMaze() {
        Maze maze = generator.generate(20, 20);
        drawMaze(maze);
    }

    private void drawMaze(Maze maze) {
        mazeGrid.getChildren().clear();

        for (int r = 0; r < maze.getRows(); r++) {
            for (int c = 0; c < maze.getCols(); c++) {

                Rectangle rect = new Rectangle(20, 20);

                if (maze.getCell(r, c) == 1)
                    rect.setFill(Color.BLACK);
                else
                    rect.setFill(Color.WHITE);

                mazeGrid.add(rect, c, r);
            }
        }
    }

    private void carvePath(Maze maze){
        int rows = maze.getRows();
        int cols = maze.getCols();

        int r = (int)(Math.random() * rows);
        int c = (int)(Math.random() * cols);

        //psedu code
        maze.setCell(r, c, 0){
            if(r || c = maze.getRows(?,?,0) || maze.getCols(?,?,0))

        }
    }
}
