import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class BoardForm extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label l = new Label("Hello, FX");
        Scene scn = new Scene(new StackPane(l),640,480);
        stage.setScene(scn);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch();
    }
}