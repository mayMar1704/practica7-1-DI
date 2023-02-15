package com.mycompany.proyecto_interfaces.prueba;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NewFXMain extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        StackPane raiz=new StackPane();
        Text texto= new Text("hola usuario");
        raiz.getChildren().add(texto);
        
        Scene scene = new Scene(root,500,500);

        primaryStage.setTitle("Saludar!");
        primaryStage.setScene(scene);
       
        Button btn = new Button();
        btn.setText("salir");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hola usuario");
            }
        });
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
