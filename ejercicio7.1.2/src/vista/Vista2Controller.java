package vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Vista2Controller implements Initializable {

    @FXML
    private TextField numero1;
    @FXML
    private TextField numero2;
    @FXML
    private TextField resultado;
    @FXML
    private Button sumar;
    @FXML
    private Button resetear;

    @FXML
    private void sumarNumeros(ActionEvent event) {
        int num1 = Integer.parseInt(numero1.getText());
        int num2 = Integer.parseInt(numero2.getText());
        int total = num1 + num2;
        resultado.setText(total + "");

    }
  @FXML
    private void resetearNumeros(ActionEvent event) {
        numero1.setText("");
        numero2.setText("");
        resultado.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


}
