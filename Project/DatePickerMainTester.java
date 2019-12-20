package Project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class DatePickerMainTester extends Application {
   @Override
   public void start(Stage window) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("TitleSceneLayout.fxml"));

      Scene titleScene = new Scene(root,1020, 630);

      // Stage
      window.setScene(titleScene);
      window.setResizable(false);
      window.setTitle("Where To?");
      window.show(); 
   }

   public static void main(String[] args) {
      // Launch the application.
      launch(args);
   }
}