/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.manufacturing.company;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author farha
 */
public class Login2Controller implements Initializable {
  private Scene scene;
    private Stage stage;
    private Parent root;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void entercardetailer(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Car detailer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
    }

    @FXML
    private void entercarrentalagent(ActionEvent event) throws IOException {
        
         Parent root = FXMLLoader.load(getClass().getResource("Car Rental Agent.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void entercarsalesperson(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("Car Sales Person.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void enterautoengineer(ActionEvent event) throws IOException {
     Parent root = FXMLLoader.load(getClass().getResource("Auto Engineer.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

   @FXML
    private void entervehicleinspector(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Vehicle Inspector.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    
    
}
}

