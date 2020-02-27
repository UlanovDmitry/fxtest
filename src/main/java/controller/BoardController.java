package controller;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
 
public class BoardController {
    @FXML private Label lblInfo;
    
    @FXML protected void btnOKClick(ActionEvent event) {
        lblInfo.setText("Button cklicked");
    }

}