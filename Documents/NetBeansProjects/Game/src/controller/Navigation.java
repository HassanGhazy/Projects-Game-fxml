
package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public class Navigation {
    public static final String fxmllevel1 = "/view/level1.fxml";
    public static final String fxmlgameOver = "/view/gameOver.fxml";
    public static final String fxmlCong = "/view/cong.fxml";



    public void navTo(Parent rootPane, String pathFxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(pathFxml));
            rootPane.getScene().setRoot(root);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}