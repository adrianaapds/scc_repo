
package br.com.scc.cadastroproduto;

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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Adriana
 */
public class CadastroProdutoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void salvar(ActionEvent event) throws IOException {
        Stage stage; 
        Parent root;
        Button b = (Button)event.getSource();
        stage=(Stage) b.getScene().getWindow();
       
        root = FXMLLoader.load(getClass().getResource("/br/com/scc/cadastroCliente/cadastroCliente.fxml"));
        
         Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    }
    
}
