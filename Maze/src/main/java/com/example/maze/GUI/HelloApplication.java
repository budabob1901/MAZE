package com.example.maze.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(
            HelloApplication.class.getResource("/com/example/maze/maze-view.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Maze Generator");
        stage.setScene(scene);

        stage.setFullScreen(true); // ← gør vinduet fullscreen

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
