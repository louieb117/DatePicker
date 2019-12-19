package Project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DatePickerController
{
    private Button welcomeButton;

    Stage Window;
    Parent root;
    Scene titleScene, filterScene, resultScene;

    public void handleWelcomeButtonAction(ActionEvent event)  throws Exception{
        Window = (Stage) welcomeButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("DatePickerGUI.fxml"));
        filterScene = new Scene(root,1066, 630);
        Window.setScene(filterScene);
        Window.show();
    }
}