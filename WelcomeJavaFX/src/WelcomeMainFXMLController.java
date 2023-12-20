/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author girid
 */
public class WelcomeMainFXMLController implements Initializable {

    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfLastName;
    @FXML
    private Label lbWelcome;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btOkClick(ActionEvent event) {
        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        lbWelcome.setText("Hello "+firstName+" "+lastName+" Welcome TO JAVA FX ");
    }

    @FXML
    private void btClearClicked(ActionEvent event) {
        tfFirstName.setText("");
        tfLastName.setText("");
        lbWelcome.setText("");
    }
    
}
