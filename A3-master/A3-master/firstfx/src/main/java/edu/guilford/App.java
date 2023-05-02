package edu.guilford;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Instantiate a VBox root node
        VBox root = new VBox();

        // create a windows set title
        stage.setTitle("Account Creation");

        // Add a label to the root node
        // root.getChildren().add(new Label("Hello World!"));

        // Instantiate a default Individual object
        Individual individual = new Individual();

        // Instantiate a IndividualPane object and add it to the root node
        root.getChildren().add(new IndividualPane(individual));
        scene = new Scene(root, 700, 280);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}