import java.sql.*;

public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/creditcardmanagementsystem";
    private static final String username = "root";
    private static final String password = "root";

    public static void main(String[] args) {

//        new UserLogin();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            String query = "select userID, user_name from user_details";

            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                String userID = result.getString("userID");
                String username = result.getString("user_name");

                System.out.println("UserID- " + userID + " Username- " + username);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}