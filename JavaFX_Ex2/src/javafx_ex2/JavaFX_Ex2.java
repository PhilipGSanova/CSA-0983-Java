package javafx_ex2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * JavaFX Application to display a Rectangle and a Circle with colors Blue and Orange separately.
 * 
 * @author hp
 */
public class JavaFX_Ex2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a rectangle and a circle
        Rectangle rectangle = new Rectangle(100, 100, Color.BLUE);
        Circle circle = new Circle(50, Color.ORANGE);
        
        // Use HBox to place them side by side
        HBox root = new HBox(20); // 20 is the spacing between the shapes
        root.getChildren().addAll(rectangle, circle);
        
        // Create the scene and add it to the stage
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Rectangle and Circle");
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
