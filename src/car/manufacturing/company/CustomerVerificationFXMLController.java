/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.manufacturing.company;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author farha
 */
public class CustomerVerificationFXMLController implements Initializable {

    /*@FXML
    private Label EnterIcustomerIDlabel;*/
    @FXML
    private TextField Typeboxgforcustomeridverification;
    @FXML
    private TextArea Resultboxofidverification;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void load(ActionEvent event) {
        
File f = null;
        FileOutputStream fout = null;
        DataOutputStream dout = null;
        
        try {
            f = new  File ("Post.bin");
            if (f.exists()){ fout = new FileOutputStream(f,true);}
            else {fout = new FileOutputStream(f);}
            dout = new DataOutputStream(fout);
            dout.writeUTF(Typeboxgforcustomeridverification.getText());
          ;
            
        }
        catch(IOException e){
             Logger.getLogger(CustomerVerificationFXMLController.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if(dout!= null) {dout.close();}
            } catch (IOException e) {
                Logger.getLogger(CustomerVerificationFXMLController.class.getName()).log(Level.SEVERE, null, e);
            }

        
    }
        
     Resultboxofidverification.setText("");
        File fo = null;
        FileInputStream fis = null;
        DataInputStream dis = null;
        String str="";
        try {
            fo = new File("Post.bin");
            
                
                fis = new FileInputStream(fo);
             
                dis = new DataInputStream(fis);
                
                while(true){
                    str+= dis.readUTF();
                       
                   
                }
            
        } catch (IOException ex) {
            Resultboxofidverification.setText(str);
            Logger.getLogger(CustomerVerificationFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(CustomerVerificationFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
        
    
}
}