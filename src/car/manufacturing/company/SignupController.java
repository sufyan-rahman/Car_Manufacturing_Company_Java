/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.manufacturing.company;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author farha
 */
public class SignupController implements Initializable {

    @FXML
    private TextField Firstnametext;
    @FXML
    private TextField surnametext;
    @FXML
    private TextField emailtext;
    @FXML
    private TextField newpasswordtext;
    @FXML
    private ChoiceBox<String> gebderselect;
      private Scene scene;
    private Stage stage;
    private Parent root;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gebderselect.getItems().addAll("Male","Female");
    }    

    @FXML
    private void signnup(ActionEvent event) throws IOException {
        File f = null;
        FileOutputStream fou = null;
        DataOutputStream dou = null;
        
        try {
            f = new  File ("save.bin");
            if (f.exists()){ fou = new FileOutputStream(f,true);}
            else {fou = new FileOutputStream(f);}
            dou = new DataOutputStream(fou);
            
            dou.writeUTF(Firstnametext.getText());
             dou.writeUTF(surnametext.getText());
              dou.writeUTF(emailtext.getText());
            dou.writeUTF(newpasswordtext.getText());
          
            dou.writeUTF(gebderselect.getValue());
            
        }
        catch(IOException e){
             Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if(dou!= null) {dou.close();}
            } catch (IOException e) {
                Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, e);
            }
           
        }
        
         
        
        try {
            f = new  File ("save1.bin");
            if (f.exists()){ fou = new FileOutputStream(f,true);}
            else {fou = new FileOutputStream(f);}
            dou = new DataOutputStream(fou);
            
            dou.writeUTF(Firstnametext.getText());
             
            dou.writeUTF(newpasswordtext.getText());
          
            
            
        }
        catch(IOException e){
             Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if(dou!= null) {dou.close();}
            } catch (IOException e) {
                Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, e);
            }
           
        }
        
        
         Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
