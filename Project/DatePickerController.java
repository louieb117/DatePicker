package Project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class DatePickerController
{
    @FXML
    Button welcomeButton, searchButton, newSearchButton, exitButton;
    @FXML
    RadioButton price1Button, price2Button, price3Button, price4Button,
                morningButton, dayButton, nightButton,
                northCountyButton, eastCountyButton, centralCountyButton, southCountyButton;

    Stage Window;
    Parent root;
    Scene filterScene, resultScene;

    public void handleWelcomeButtonAction(ActionEvent event)  throws Exception{
        Window = (Stage) welcomeButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FilterSceneLayout.fxml"));
        filterScene = new Scene(root,1020, 630);
        Window.setScene(filterScene);
        Window.show();
    }

    public void handleSearchButtonAction(ActionEvent event)  throws Exception{




        Window = (Stage) searchButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("ResultSceneLayout.fxml"));
        resultScene = new Scene(root,1020, 630);
        Window.setScene(resultScene);
        Window.show();
    }

    public void handleNewSearchButtonAction(ActionEvent event)  throws Exception{
        Window = (Stage) newSearchButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FilterSceneLayout.fxml"));
        filterScene = new Scene(root,1020, 630);
        Window.setScene(filterScene);
        Window.show();
    }

    public void handleExitButtonAction(ActionEvent event)  throws Exception{
        Window = (Stage) exitButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("FilterSceneLayout.fxml"));
        Window.close();
    }
}