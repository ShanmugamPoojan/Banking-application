import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DeleteUserDetailsGUI {

    private static final String URL = "jdbc:mysql://localhost:3306/credit_card_database";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private JFrame frame;
    private JTextField userIdField;

    public DeleteUserDetailsGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblUserId = new JLabel("User ID:");
        lblUserId.setBounds(66, 52, 61, 16);
        frame.getContentPane().add(lblUserId);

        userIdField = new JTextField();
        userIdField.setBounds(139, 47, 200, 26);
        frame.getContentPane().add(userIdField);
        userIdField.setColumns(10);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(139, 100, 117, 29);
        frame.getContentPane().add(deleteButton);

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userID = userIdField.getText();
                deleteUserDetails(userID);
            }
        });

        frame.setVisible(true);
    }

    private void deleteUserDetails(String userID) {
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);

            // Retrieve related information from User_details
            String getUserDetailsSQL = "SELECT card_number, account_number, personal_details, employee_details, authentication_details FROM User_details WHERE userID = ?";
            pstmt = connection.prepareStatement(getUserDetailsSQL);
            pstmt.setString(1, userID);
            ResultSet rs = pstmt.executeQuery();

            String cardNumber = null;
            String accountNumber = null;
            String personalID = null;
            String employeeID = null;
            String authenticationID = null;

            if (rs.next()) {
                cardNumber = rs.getString("card_number");
                accountNumber = rs.getString("account_number");
                personalID = rs.getString("personal_details");
                employeeID = rs.getString("employee_details");
                authenticationID = rs.getString("authentication_details");
            }
            rs.close();
            pstmt.close();

            // Delete from User_details first to avoid foreign key constraint issues
            String deleteUserDetailsSQL = "DELETE FROM User_details WHERE userID = ?";
            pstmt = connection.prepareStatement(deleteUserDetailsSQL);
            pstmt.setString(1, userID);
            pstmt.executeUpdate();
            pstmt.close();

            // Delete from Rewards
            if (cardNumber != null) {
                String deleteRewardsSQL = "DELETE FROM Rewards WHERE card_number = ?";
                pstmt = connection.prepareStatement(deleteRewardsSQL);
                pstmt.setString(1, cardNumber);
                pstmt.executeUpdate();
                pstmt.close();
            }

            // Delete from Card_details
            if (cardNumber != null) {
                String deleteCardDetailsSQL = "DELETE FROM Card_details WHERE card_number = ?";
                pstmt = connection.prepareStatement(deleteCardDetailsSQL);
                pstmt.setString(1, cardNumber);
                pstmt.executeUpdate();
                pstmt.close();
            }

            // Delete from Transaction_details
            if (cardNumber != null) {
                String deleteTransactionDetailsSQL = "DELETE FROM Transaction_details WHERE card_number = ?";
                pstmt = connection.prepareStatement(deleteTransactionDetailsSQL);
                pstmt.setString(1, cardNumber);
                pstmt.executeUpdate();
                pstmt.close();
            }

            // Delete from Account_details
            if (accountNumber != null) {
                String deleteAccountDetailsSQL = "DELETE FROM Account_details WHERE account_number = ?";
                pstmt = connection.prepareStatement(deleteAccountDetailsSQL);
                pstmt.setString(1, accountNumber);
                pstmt.executeUpdate();
                pstmt.close();
            }

            // Delete from Personal_details
            if (personalID != null) {
                String deletePersonalDetailsSQL = "DELETE FROM Personal_details WHERE personalID = ?";
                pstmt = connection.prepareStatement(deletePersonalDetailsSQL);
                pstmt.setString(1, personalID);
                pstmt.executeUpdate();
                pstmt.close();
            }

            // Delete from Employee_details
            if (employeeID != null) {
                String deleteEmployeeDetailsSQL = "DELETE FROM Employee_details WHERE employeeID = ?";
                pstmt = connection.prepareStatement(deleteEmployeeDetailsSQL);
                pstmt.setString(1, employeeID);
                pstmt.executeUpdate();
                pstmt.close();
            }

            // Delete from Authentication_details
            if (authenticationID != null) {
                String deleteAuthenticationDetailsSQL = "DELETE FROM Authentication_details WHERE authenticationID = ?";
                pstmt = connection.prepareStatement(deleteAuthenticationDetailsSQL);
                pstmt.setString(1, authenticationID);
                pstmt.executeUpdate();
                pstmt.close();
            }

            // Commit transaction
            connection.commit();
            JOptionPane.showMessageDialog(frame, "User details deleted successfully!");

        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error deleting user details: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    DeleteUserDetailsGUI window = new DeleteUserDetailsGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
