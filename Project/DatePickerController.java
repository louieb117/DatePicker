package Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DatePickerController
{
    @FXML
    Button welcomeButton;

    Stage Window;
    Parent root;
    Scene filterScene, resultScene;

    public void handleWelcomeButtonAction(ActionEvent event)  throws Exception{
        Window = (Stage) welcomeButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FilterSceneLayout.fxml"));
        filterScene = new Scene(root,1066, 630);
        Window.setScene(filterScene);
        Window.show();
    }
}