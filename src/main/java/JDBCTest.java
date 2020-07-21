import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;

public class JDBCTest {
    public static void main(String[] args) {
        System.out.println(getEmployeeFirstNames());
        System.out.println(getEmployeeFirstNames(6));
    }

    private static ArrayList<String> getEmployeeFirstNames() {
        ArrayList<String> names = new ArrayList<>();
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT first_name FROM employees.employees LIMIT 10");
            while (rs.next()) {
                names.add(rs.getString("first_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return names;
    }

    private static ArrayList<String> getEmployeeFirstNames(int totalNames) {
        ArrayList<String> names = new ArrayList<>();
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT first_name FROM employees.employees LIMIT " + totalNames);
            while (rs.next()) {
                names.add(rs.getString("first_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return names;
    }
}
