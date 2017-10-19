
package br.com.scc.login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Adriana
 */
public class loginController implements Initializable {
    
    private Label label;
    @FXML
    private TextField campoemail;
    @FXML
    private PasswordField camposenha;
    @FXML
    private Button campoentrar;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void entrar(ActionEvent event) {
         if(campoemail.getText().equals("teste") && camposenha.getText().equals(123)){
             
         }
        
    }
    
}
