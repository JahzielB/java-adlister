import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
    public static void main(String[] args) {
        System.out.println(getEmployeeFirstNames().toString());
        System.out.println(getEmployeeFirstNames(5).toString());
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
