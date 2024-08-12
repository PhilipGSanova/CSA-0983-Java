package javafx_ex3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * JavaFX Application to display a rectangle using lines.
 * 
 * @author hp
 */
public class JavaFX_Ex3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Define the coordinates of the rectangle
        double x1 = 50, y1 = 50;
        double x2 = 250, y2 = 50;
        double x3 = 250, y3 = 150;
        double x4 = 50, y4 = 150;
        
        // Create lines for each side of the rectangle
        Line line1 = new Line(x1, y1, x2, y2); // Top side
        Line line2 = new Line(x2, y2, x3, y3); // Right side
        Line line3 = new Line(x3, y3, x4, y4); // Bottom side
        Line line4 = new Line(x4, y4, x1, y1); // Left side
        
        // Set line colors (optional)
        line1.setStroke(Color.BLACK);
        line2.setStroke(Color.BLACK);
        line3.setStroke(Color.BLACK);
        line4.setStroke(Color.BLACK);
        
        // Add the lines to a Pane
        Pane root = new Pane();
        root.getChildren().addAll(line1, line2, line3, line4);
        
        // Create the scene and add it to the stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Rectangle with Lines");
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


