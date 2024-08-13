package javafx_ex4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX Application to display an image from the user's device.
 * 
 * @author hp
 */
public class JavaFX_Ex4 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Load the image from the file path
        Image image = new Image("file:C:/Users/hp/Pictures/Saved Pictures/Apple II computers.jpeg"); // Replace with the actual path to your image
        
        // Create an ImageView to display the image
        ImageView imageView = new ImageView(image);
        
        // Optionally, set properties on the ImageView
        imageView.setFitWidth(300); // Set the desired width
        imageView.setPreserveRatio(true); // Preserve the aspect ratio
        
        // Add the ImageView to the layout
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        
        // Create the scene and add it to the stage
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Image Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
