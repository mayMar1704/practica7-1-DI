package ejercicio7.pkg1.pkg2;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ejercicio712 extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/vista/vista2.fxml"));
        Pane rootPane = (Pane) loader.load();

        Scene scene = new Scene(rootPane, 600, 400);
        primaryStage.setTitle("Operaciones sencillas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
