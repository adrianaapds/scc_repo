
package br.com.scc.cadastroCliente;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Adriana
 */
public class CadastroClienteController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ImageView imagem = new ImageView();
         imagem.setImage(new Image("br/com/scc/login/motocubo.png"));
    } 
    
}
