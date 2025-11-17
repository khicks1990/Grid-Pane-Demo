package com.example;

/**
 *  GridPane Demo


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;



public class Main extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create some Label controls.
      Label label1 = new Label("This is label1");
      Label label2 = new Label("This is label2");
      Label label3 = new Label("This is label3");
      Label label4 = new Label("This is label4");
      
      // Create a GridPane.
      GridPane gridpane = new GridPane();
      
      // Add the Labels to the GridPane.
      gridpane.add(label1, 0, 0);
      gridpane.add(label2, 1, 0);
      gridpane.add(label3, 0, 1);
      gridpane.add(label4, 1, 1);

      // Create a Scene with the GridPane as its root node.
      // The Scene is 200 pixels wide by 100 pixels high.
      Scene scene = new Scene(gridpane, 200, 100);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Show the window.
      primaryStage.show();
   }
}

 */





/**
 *  This program demonstrates the GridPane layout container.
 


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class Main extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create the Image components.
      Image moonImage = new Image("/Moon.jpg");
      Image shipImage = new Image("/Ship.jpg");
      Image sunsetImage = new Image("/Sunset.jpg");
      Image flowerImage = new Image("/Flower.jpg");
      
      // Create the ImageView components.
      ImageView moonIView = new ImageView(moonImage);
      ImageView shipIView = new ImageView(shipImage);
      ImageView sunsetIView = new ImageView(sunsetImage);
      ImageView flowerIView = new ImageView(flowerImage);
      
      // Resize the moon image, preserving its aspect ratio.
      moonIView.setFitWidth(200);
      moonIView.setPreserveRatio(true);
      
      // Resize the ship image, preserving its aspect ratio.
      shipIView.setFitWidth(200);
      shipIView.setPreserveRatio(true);

      // Resize the sunset image, preserving its aspect ratio.
      sunsetIView.setFitWidth(200);
      sunsetIView.setPreserveRatio(true);
      
      // Resize the flower image, preserving its aspect ratio.
      flowerIView.setFitWidth(200);
      flowerIView.setPreserveRatio(true);
      
      // Create a GridPane.
      GridPane gridpane = new GridPane();
      
      // Add the ImageViews to the GridPane.
      gridpane.add(moonIView, 0, 0);     // Col 0, Row 0
      gridpane.add(shipIView, 1, 0);     // Col 1, Row 0
      gridpane.add(sunsetIView, 0, 1);   // Col 0, Row 1
      gridpane.add(flowerIView, 1, 1);   // Col 1, Row 1
      
      // Set the gap sizes.
      gridpane.setVgap(10);
      gridpane.setHgap(10);
      
      // Set the GridPane's padding.
      gridpane.setPadding(new Insets(30));
      
      // Create a Scene with the GridPane as its root node.
      Scene scene = new Scene(gridpane);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Images");
      
      // Show the window.
      primaryStage.show();
   }
}


*/