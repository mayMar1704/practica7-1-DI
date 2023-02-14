
    public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/vista/Vista1.fxml"));
        Pane rootPane = (Pane) loader.load();
        
        Scene scene = new Scene(rootPane, 500, 250);
        primaryStage.setTitle("Ejemplo1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    }
