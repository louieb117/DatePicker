package Project;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.TextArea;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import static javafx.scene.text.Font.font;

public class DatePickerMain extends Application
{
   Stage window;
   Scene titleScene, filterScene, resultScene;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Title Scene
      Image backgroundImage = new Image("Project/resources/art.jpg");

      ImageView bgIView = new ImageView(backgroundImage);
      bgIView.setFitWidth(1080);
      bgIView.setPreserveRatio(true);
      bgIView.setSmooth(true);
      bgIView.setCache(true);
      
      Rectangle tsRectangle = new Rectangle();
      tsRectangle.setX(383);
      tsRectangle.setY(175);
      tsRectangle.setWidth(300);
      tsRectangle.setHeight(150);
      tsRectangle.setFill(Color.web("#808080"));
      
      Label nameLabel = new Label("Where To?");
      nameLabel.setFont(font(20));
      nameLabel.setTextFill(Color.WHITE);
      
      Button welcomeButton = new Button("Welcome");
      welcomeButton.setOnAction(e -> window.setScene(filterScene));
   
      VBox welcomeContainer = new VBox(nameLabel, welcomeButton);
      welcomeContainer.setSpacing(55);
      welcomeContainer.setAlignment(Pos.CENTER);
      
      StackPane titleLayout = new StackPane();
      titleLayout.getChildren().addAll(tsRectangle, welcomeContainer);
      titleLayout.setPadding(new Insets(205,485,205,485));

      Group layout1 = new Group();
      layout1.getChildren().addAll(bgIView, tsRectangle, titleLayout);
      
      titleScene = new Scene(layout1,1066, 630);
      
      
      // Filter Scene
      FileGrabber fGrabber = new FileGrabber();
      
      Image backgroundImage2 = new Image("Project/resources/art.jpg");

      ImageView bgIView2 = new ImageView(backgroundImage);
      bgIView2.setFitWidth(1080);
      bgIView2.setPreserveRatio(true);
      bgIView2.setSmooth(true);
      bgIView2.setCache(true);
      
      Rectangle fsRectangle = new Rectangle();
      fsRectangle.setX(180);
      fsRectangle.setY(50);
      fsRectangle.setWidth(700);
      fsRectangle.setHeight(400);
      fsRectangle.setFill(Color.web("#808080"));
      
      Label price = new Label("Price");
      price.setFont(font(14));
      price.setTextFill(Color.WHITE);
      Label tOD = new Label("Time of Day");
      tOD.setFont(font(14));
      tOD.setTextFill(Color.WHITE);
      Label place = new Label("Place");
      place.setFont(font(14));
      place.setTextFill(Color.WHITE);
      
      ToggleGroup priceTGroup = new ToggleGroup();
      ToggleGroup todTGroup = new ToggleGroup();
      
      RadioButton priceRadio1 = new RadioButton("( )");
      priceRadio1.setTextFill(Color.WHITE);
      priceRadio1.setToggleGroup(priceTGroup);
      priceRadio1.setSelected(true);
      RadioButton priceRadio2 = new RadioButton("($)");
      priceRadio2.setTextFill(Color.WHITE);
      priceRadio2.setToggleGroup(priceTGroup);
      RadioButton priceRadio3 = new RadioButton("($$)");
      priceRadio3.setTextFill(Color.WHITE);
      priceRadio3.setToggleGroup(priceTGroup);
      RadioButton priceRadio4 = new RadioButton("($$$)");
      priceRadio4.setTextFill(Color.WHITE);
      priceRadio4.setToggleGroup(priceTGroup);
      
      RadioButton todRadio1 = new RadioButton("Morning");
      todRadio1.setTextFill(Color.WHITE);
      todRadio1.setToggleGroup(todTGroup);
      todRadio1.setSelected(true);
      RadioButton todRadio2 = new RadioButton("Day");
      todRadio2.setTextFill(Color.WHITE);
      todRadio2.setToggleGroup(todTGroup);
      RadioButton todRadio3 = new RadioButton("Night");
      todRadio3.setTextFill(Color.WHITE);
      todRadio3.setToggleGroup(todTGroup);
      
      RadioButton placeRadio1 = new RadioButton("North County");
      placeRadio1.setTextFill(Color.WHITE);
      RadioButton placeRadio2 = new RadioButton("Central County");
      placeRadio2.setTextFill(Color.WHITE);
      placeRadio2.setSelected(true);
      RadioButton placeRadio3 = new RadioButton("East County");
      placeRadio3.setTextFill(Color.WHITE);
      RadioButton placeRadio4 = new RadioButton("South County");
      placeRadio4.setTextFill(Color.WHITE);
      
      Button searchButton = new Button("Search");
      searchButton.setOnAction(e -> window.setScene(resultScene));
      
      VBox leftContainer = new VBox(priceRadio1, priceRadio2, priceRadio3, priceRadio4);
      leftContainer.setSpacing(55);
      
      VBox middelContainer = new VBox(todRadio1, todRadio2, todRadio3);
      middelContainer.setSpacing(55);
      
      VBox rightContainer = new VBox(placeRadio1, placeRadio2, placeRadio3, placeRadio4);
      rightContainer.setSpacing(55);
      
      GridPane grid = new GridPane();
      grid.add(price, 0, 0);
      grid.add(tOD, 1, 0);
      grid.add(place, 2, 0);
      grid.add(leftContainer, 0, 1);
      grid.add(middelContainer, 1, 1);
      grid.add(rightContainer, 2, 1);
      grid.add(searchButton, 1, 2);
      
      grid.setPadding(new Insets(75,240,75,240));
      grid.setHgap(180);
      grid.setVgap(40);
      
      Group layout2 = new Group(bgIView2, fsRectangle, grid);
      
      filterScene = new Scene(layout2, 1066, 630);
      
      
      // Result Scene
      Image backgroundImage3 = new Image("Project/resources/art.jpg");
      
      ImageView bgIView3 = new ImageView(backgroundImage);
      bgIView3.setFitWidth(1080);
      bgIView3.setPreserveRatio(true);
      bgIView3.setSmooth(true);
      bgIView3.setCache(true);
      
      Rectangle rsRectangle = new Rectangle();
      rsRectangle.setX(180);
      rsRectangle.setY(50);
      rsRectangle.setWidth(700);
      rsRectangle.setHeight(400);
      rsRectangle.setFill(Color.web("#808080"));
      
      TextArea resultArea = new TextArea();
      resultArea.setPrefColumnCount(49);
      resultArea.setPrefRowCount(18);
      resultArea.setWrapText(true);
      
      Button newSearchButton = new Button("New Search");
      newSearchButton.setOnAction(e -> window.setScene(filterScene));
      Button exitButton = new Button("Exit");
      exitButton.setOnAction(e -> window.close());
      
      HBox bottomContainer = new HBox(newSearchButton,exitButton);
      bottomContainer.setSpacing(350);
      bottomContainer.setAlignment(Pos.CENTER);
      
      VBox mainContainer = new VBox(resultArea,bottomContainer);
      mainContainer.setSpacing(20);
      mainContainer.setPadding(new Insets(75,240,75,240));
      
      Group layout3 = new Group(bgIView3,rsRectangle,mainContainer);
      
      resultScene = new Scene(layout3, 1066, 630);
      
      
      // Stage
      window = primaryStage;
      window.setScene(titleScene);
      //window.setScene(filterScene);
      //window.setScene(resultScene);
      window.setResizable(false);
      window.setTitle("Where To?");
      window.show(); 
   }
}