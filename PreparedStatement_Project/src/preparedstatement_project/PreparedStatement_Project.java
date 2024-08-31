package preparedstatement_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PreparedStatement_Project extends Application {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rset;
    private TextField tfid = new TextField();
    private TextField tfSalary = new TextField();
    private Label lblResult = new Label();
    private Label lblSalary;
    private Button btModSalary;

    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root, 400, 400);

            primaryStage.setScene(scene);
            primaryStage.show();
            initializeDatabase();

            Button btShowID = new Button("Show Employee Details");
            btShowID.setOnAction(e -> showResult());
            Button btClearInfo = new Button("Clear");
            btClearInfo.setOnAction(e -> clear());
            btModSalary = new Button("Update Salary");
            btModSalary.setOnAction(e -> updateSalary());
            btModSalary.setVisible(false);
            lblSalary = new Label("New Salary");
            updateVisibility(false);

            HBox hbox = new HBox(5);
            hbox.getChildren().addAll(new Label("Employee ID"), tfid, btShowID, btClearInfo);

            HBox hBox2 = new HBox(5);
            hBox2.getChildren().addAll(lblSalary, tfSalary, btModSalary);

            VBox vBox = new VBox(10);
            vBox.getChildren().addAll(hbox, lblResult, hBox2);

            tfid.setPrefColumnCount(16);
            tfSalary.setPrefColumnCount(tfid.getPrefColumnCount());

            primaryStage.setTitle("Show Employee ID");
            primaryStage.setScene(new Scene(vBox, 400, 150));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateSalary() {
        try {
            int id = Integer.parseInt(tfid.getText());
            int salary = Integer.parseInt(tfSalary.getText());
            PreparedStatement prepstmt = conn.prepareStatement("UPDATE employees SET salary = ? WHERE employee_id = ?");
            prepstmt.setInt(1, salary);
            prepstmt.setInt(2, id);
            prepstmt.executeUpdate();
            prepstmt.close();
            lblResult.setText("Salary updated successfully for Employee ID " + id);
        } catch (NumberFormatException e) {
            displayError("Input Error", "Incorrect value entered for Salary");
        } catch (SQLIntegrityConstraintViolationException e){
            displayError("Salary Error","Negative value for salary entered");
            tfSalary.setText("");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateVisibility(boolean val) {
        lblSalary.setVisible(val);
        tfSalary.setVisible(val);
        btModSalary.setVisible(val);
    }

    private void clear() {
        updateVisibility(false);
        tfSalary.setText("");
        lblResult.setVisible(false);
        tfid.setText("");
    }

    public void initializeDatabase() {
        final String DB_URL = "jdbc:mysql://localhost:3306/hr";
        final String DB_USER = "root";
        final String DB_PASSWORD = "root";
        String query = "SELECT email, first_name, last_name, salary FROM employees WHERE employee_id = ?";

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            pstmt = conn.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showResult() {
        String employeeID = tfid.getText();
        if (employeeID.isEmpty()) {
            displayError("ID Error", "No value entered for Employee ID");
            return;
        }
        try {
            int id = Integer.parseInt(employeeID);
            pstmt.setInt(1, id);
            rset = pstmt.executeQuery();
            if (rset.next()) {
                String email = rset.getString(1);
                String firstName = rset.getString(2);
                String lastName = rset.getString(3);
                int empSalary = rset.getInt(4);
                lblResult.setText("Employee name is " + firstName + " " + lastName + ", email is " + email + ", salary: $" + empSalary);
                updateVisibility(true);
            } else {
                lblResult.setText("Try again! No Employee information for the ID " + employeeID);
                updateVisibility(false);
            }
            lblResult.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            displayError("ID Error", "Invalid Employee ID format");
        }
    }

    private void displayError(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
