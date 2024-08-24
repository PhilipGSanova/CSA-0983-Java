package mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySQLConnection {

    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hr?&serverTimezone=UTC";
        String user = "root";
        String password = "root";
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            
            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. SELECT");
                System.out.println("2. INSERT");
                System.out.println("3. UPDATE");
                System.out.println("4. DELETE");
                System.out.println("5. EXIT");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                switch (choice) {
                    case 1:
                        System.out.println("\nEnter SELECT query (e.g., SELECT * FROM departments):");
                        String selectQuery = scanner.nextLine();
                        performSelect(st, selectQuery);
                        break;
                    case 2:
                        System.out.println("\nEnter INSERT query (e.g., INSERT INTO departments (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES (280, 'Research', 300, 1700)):");
                        String insertQuery = scanner.nextLine();
                        performUpdate(st, insertQuery);
                        break;
                    case 3:
                        System.out.println("\nEnter UPDATE query (e.g., UPDATE departments SET DEPARTMENT_NAME = 'Development' WHERE DEPARTMENT_ID = 280):");
                        String updateQuery = scanner.nextLine();
                        performUpdate(st, updateQuery);
                        break;
                    case 4:
                        System.out.println("\nEnter DELETE query (e.g., DELETE FROM departments WHERE DEPARTMENT_ID = 280):");
                        String deleteQuery = scanner.nextLine();
                        performUpdate(st, deleteQuery);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        con.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    // Method to perform SELECT query
    public static void performSelect(Statement st, String query) throws SQLException {
        ResultSet rs = st.executeQuery(query);
        int colNum = getColumnNames(rs);
        if (colNum > 0) {
            while (rs.next()) {
                for (int i = 0; i < colNum; i++) {
                    if (i + 1 == colNum) {
                        System.out.println(rs.getString(i + 1));
                    } else {
                        System.out.print(rs.getString(i + 1) + ", ");
                    }
                }
            }
        }
    }

    // Method to perform INSERT, UPDATE, DELETE queries
    public static void performUpdate(Statement st, String query) throws SQLException {
        int result = st.executeUpdate(query);
        System.out.println("Query executed successfully, rows affected: " + result);
    }

    // Method to print column names
    public static int getColumnNames(ResultSet rs) throws SQLException {
        int numberOfColumns = 0;
        if (rs != null) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            numberOfColumns = rsMetaData.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                String columnName = rsMetaData.getColumnName(i);
                System.out.print(columnName + ", ");
            }
        }
        System.out.println();
        return numberOfColumns;
    }
}
