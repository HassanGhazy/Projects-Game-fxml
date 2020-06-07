package main;

import java.awt.PageAttributes;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/Level1.fxml"));
        primaryStage.setTitle("Game");
        primaryStage.setScene(new Scene(root));
        //    primaryStage.setWidth(600);
        // primaryStage.setHeight(400);
        //primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/image/Untitled-4.png")));

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}
