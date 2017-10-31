/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scc.login.apresentacao;

import br.com.scc.login.service.LoginService;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Adriana
 */
public class LoginController implements Initializable {

    @FXML
    private TextField campoemail;
    @FXML
    private PasswordField camposenha;
    @FXML
    private Button campoentrar;
    @FXML
    private Button campocadastrar;
    @FXML
    private ImageView img;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ImageView imagem = new ImageView();
         imagem.setImage(new Image("br/com/scc/login/apresentacao/motocubo.png"));
    }

    @FXML
    private void entrar(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;
        Button b = (Button)event.getSource();        
        stage=(Stage) b.getScene().getWindow();
        
        String email = campoemail.getText();
        String senha = camposenha.getText();
        
        LoginService servico =  new LoginService();
        
        String perfil = servico.logar(email, senha);
        
        if (perfil.equals("cliente")){
            
        }else if (perfil.equals("gestor")){
    
            root = FXMLLoader.load(getClass().getResource("/br/com/scc/cadastroproduto/cadastroProduto.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else if (perfil.equals("relatorio")){
            
        }else{
            //erro
        }
        
        
        
    }
    
    
}
