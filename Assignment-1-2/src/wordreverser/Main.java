package wordreverser;
/*Author: Frantisek Niscak
 * Date: <UNKNOWN>
 * File: ArrayListStack.java
 * 
 * Problem Description: 
 * Use JavaFX to create GUI that demonstrates that your ArrayListStack works.
 * 
 * Attempted to modify the supplied example to accept text input. Did not
 * succeed in doing so. I do not yet understand javaFX but will endeavor to 
 * learn why my attempted implementation did not work. Left the rest of the
 * program as-is to serve as a demonstartor that the ArrayListStack implementation
 * in the main class is functional. 
 * 
 * INPUT: data from the Model method.
 * 
 * OUTPUT: graphical representations of the data, and a user interface.
 */
import javafx.application.Application;
import javafx.collections.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;


public class Main extends Application
{
  @Override
  
  public void start(Stage primaryStage)
  {
    
    try
    {
      
      // Build UI
      primaryStage.setTitle("Stack GUI Demo");
      
      Group root = new Group();
      Scene scene = new Scene(root, 400, 400, Color.WHITE);
      
      GridPane gridpane = new GridPane();
      gridpane.setPadding(new Insets(5));
      gridpane.setHgap(10);
      gridpane.setVgap(10);
      
     
//      Label label1 = new Label("Sentence to reverse:");
//      TextField textField = new TextField ();
//      HBox hb = new HBox();
//      hb.getChildren().addAll(label1, textField);
//      hb.setSpacing(10);
//      GridPane grid = new GridPane();
//      grid.setPadding(new Insets(10, 10, 10, 10));
//      grid.setVgap(5);
//      grid.setHgap(5);
//      
//      final TextField name = new TextField();
//      name.setPromptText("Enter your sentence.");
//      name.setPrefColumnCount(10);
//      name.getText();
//      GridPane.setConstraints(name, 0, 0);
//      grid.getChildren().add(name);
//      
//      Button submit = new Button("Submit");
//      GridPane.setConstraints(submit, 1, 0);
//      grid.getChildren().add(submit);
//
//      Button clear = new Button("Clear");
//      GridPane.setConstraints(clear, 1, 1);
//      grid.getChildren().add(clear);
//Attempted to implement a text field for custom string input. Did not work.     
 

      Label leftLabel = new Label("Left = Stack SIZE");
      GridPane.setHalignment(leftLabel, HPos.CENTER);
      gridpane.add(leftLabel, 0, 0);

      Label rightLabel = new Label("Right = STACK");
      gridpane.add(rightLabel, 2, 0);
      GridPane.setHalignment(rightLabel, HPos.CENTER);

      final ObservableList<String> lefts = FXCollections.observableArrayList("0");
      final ListView<String> leftListView = new ListView<String>(lefts);
      leftListView.setPrefWidth(150);
      leftListView.setPrefHeight(150);

      gridpane.add(leftListView, 0, 1);

      final ObservableList<String> rights = FXCollections.observableArrayList();
      final ListView<String> rightListView = new ListView<String>(rights);
      rightListView.setPrefWidth(150);
      rightListView.setPrefHeight(150);

      gridpane.add(rightListView, 2, 1);

      Button pushButton = new Button("Push");
      Button popButton = new Button("Pop");

      VBox vbox = new VBox(5);
      vbox.getChildren().addAll(pushButton, popButton);

      gridpane.add(vbox, 1, 1);
      GridPane.setConstraints(vbox, 1, 1, 1, 2, HPos.CENTER, VPos.CENTER);

      root.getChildren().add(gridpane);
      
      
      ///////////////////////////////////////////////////////////////////////
      // Create object from Model class 
      Model model = new Model();
      
      ///////////////////////////////////////////////////////////////////////
      // Set button Event Handlers
      popButton.setOnAction(new EventHandler<ActionEvent>()
      {
        public void handle(ActionEvent event)
        {
//          String item = rightListView.getSelectionModel().getSelectedItem();
//          if (item != null)
//          {
//            rightListView.getSelectionModel().clearSelection();
//            rights.remove(item);
//            lefts.add(item);
//          }
          model.popStack();
          rights.clear();
          rights.addAll(model.getList());

          lefts.clear();
          lefts.add("" + model.getSize());
        }
      });
      
      pushButton.setOnAction(new EventHandler<ActionEvent>()
      {
        
        public void handle(ActionEvent event)
        {
//          String item = leftListView.getSelectionModel().getSelectedItem();
//          if (item != null)
//          {
//            leftListView.getSelectionModel().clearSelection();
//            lefts.remove(item);
//            rights.add(item);
//          }
          model.pushStack();
          rights.clear();
          rights.addAll(model.getList());

          lefts.clear();
          lefts.add("" + model.getSize());
        }
      });

      ///////////////////////////////////////////////////////////////////////
      // Display the finished application 
      primaryStage.setScene(scene);
      primaryStage.show();
    }
    catch(Exception e )
    {
      e.printStackTrace();
    }
  }
  

  public static void main(String[] args)
  {
    launch(args);
  }
}