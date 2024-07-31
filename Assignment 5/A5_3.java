import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class A6_3 extends Application{
    @Override
    public void start(Stage primaryStage) {
        // Create UI elements
        TextField textField = new TextField();
        Button button = new Button("Display Text");
        Label label = new Label();

        // Set action for button click
        button.setOnAction(e -> {
            String inputText = textField.getText();
            label.setText(inputText);
        });

        // Arrange UI elements in a vertical box layout
        VBox vbox = new VBox(10, textField, button, label);
        
        // Create a scene with the VBox layout
        Scene scene = new Scene(vbox, 300, 200);

        // Set the title of the stage (window)
        primaryStage.setTitle("Text Display Application");
        
        // Set the scene on the stage
        primaryStage.setScene(scene);
        
        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }
}