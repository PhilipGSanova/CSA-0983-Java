package callablestatement_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CallableStatement_Project extends Application {

    private Connection conn;
    private CallableStatement cstmt;
    private TextField tfid = new TextField();
    private Label lblResult = new Label();
    private Statement stmt;

    @Override
    public void start(Stage primaryStage) {
        try {
            initializeDatabase();
            displayDatabaseDetails();

            Button btShowID = new Button("Show Employee Salary from procedure");
            HBox hbox = new HBox(5);
            hbox.getChildren().addAll(new Label("Employee ID"), tfid, btShowID);
            VBox vBox = new VBox(10);
            vBox.getChildren().addAll(hbox, lblResult);
            tfid.setPrefColumnCount(6);
            btShowID.setOnAction(e -> showResult());

            Scene scene2 = new Scene(vBox, 400, 100);
            primaryStage.setTitle("Show Employee Salary");
            primaryStage.setScene(scene2);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void initializeDatabase() {
        final String DB_URL = "jdbc:mysql://localhost:3306/hr";
        final String DB_USER = "root";
        final String DB_PASSWORD = "root";
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            stmt = conn.createStatement(); // Initialize Statement object
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showResult() {
        lblResult.setText("");
        String spQuery = "{call getEmployeeSalary(?,?,?)}";
        try {
            int id = Integer.parseInt(tfid.getText());
            cstmt = conn.prepareCall(spQuery);
            cstmt.setInt(1, id);  // First parameter: IN (employee ID)
            cstmt.registerOutParameter(2, Types.DECIMAL); // Second parameter: OUT (salary)
            cstmt.registerOutParameter(3, Types.VARCHAR); // Third parameter: OUT (last name)
            cstmt.execute();

            String salary = cstmt.getBigDecimal(2).toString();
            String lastName = cstmt.getString(3);

            lblResult.setText("Last Name " + lastName + " salary is " + salary);
        } catch (SQLException e) {
            lblResult.setText("Wrong Employee ID, please try again!");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            lblResult.setText("Wrong Employee ID format, please try again!");
            e.printStackTrace();
        }
    }

    public void displayDatabaseDetails() throws SQLException {
        DatabaseMetaData dbmd = conn.getMetaData();
        System.out.println("Database Version: " + dbmd.getDatabaseProductVersion());
        System.out.println("Driver name     : " + dbmd.getDriverName());
        System.out.println("URL             : " + dbmd.getURL());
        System.out.println("Username        : " + dbmd.getUserName());
        
        ResultSet rsTables = dbmd.getTables(null, null, "EMP%", new String[]{"TABLE"});
        while (rsTables.next()) {
            System.out.println(rsTables.getString("TABLE_NAME"));
        }

        ResultSet rs = stmt.executeQuery("SELECT job_id, job_title FROM jobs");
        ResultSetMetaData rsmd = rs.getMetaData();
        int numberOfColumns = rsmd.getColumnCount();
        System.out.println("Number of Columns: " + numberOfColumns);
    }

    public static void getColumnNames(ResultSet rs) throws SQLException {
        if (rs != null) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int numberOfColumns = rsMetaData.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                String columnName = rsMetaData.getColumnName(i);
                System.out.print(columnName + ",");
            }
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    if (i == numberOfColumns)
                        System.out.println(rs.getString(i));
                    else
                        System.out.print(rs.getString(i) + ",");
                }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
