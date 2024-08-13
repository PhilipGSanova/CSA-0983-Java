package javafx_ex5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.nio.file.Paths;

/**
 * JavaFX Application to play an audio file.
 * 
 * @author hp
 */
public class JavaFX_Ex5 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Load the audio file from the file path
        String audioFilePath = Paths.get("C:/Users/hp/Music/Céline Dion, _NSYNC - That’s The Way It Is (Live).mp3").toUri().toString();
        Media audioMedia = new Media(audioFilePath);
        
        // Create a MediaPlayer to play the audio
        MediaPlayer mediaPlayer = new MediaPlayer(audioMedia);
        
        // Play the audio
        mediaPlayer.play();
        
        // Create a basic layout for the scene
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Audio Player");
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
