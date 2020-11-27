import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import login.*;
import main.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        LoginController.show(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
