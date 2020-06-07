/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.webkit.dom.EventImpl;
import controller.Navigation;
import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author HAS
 */
public class Level1Controller implements Initializable {
    Navigation nav = new Navigation();

    @FXML
    private AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Finish(MouseEvent event) {
        nav.navTo(root, nav.fxmlCong);
    }

    @FXML
    private void gameOver(MouseEvent event) {
        nav.navTo(root, nav.fxmlgameOver);
       
    }
    
}
