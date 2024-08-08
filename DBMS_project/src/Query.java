import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class Query {
    private static final String DBurl = "jdbc:mysql://localhost:3306/credit_card_database";
    private static final String DBusername = "root";
    private static final String DBpassword = "root";
    public Statement statement;
    public Connection connection;

    public void setDrivers() throws  SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Drivers");
        }catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        connection = DriverManager.getConnection(DBurl,DBusername,DBpassword);
        statement = connection.createStatement();

    }
    public void insertPersonalDetails(){
        try{
            setDrivers();

            String query = String.format("SELECT personal_details from user_details");

            ResultSet resultSet = statement.executeQuery(query);

            String personalID = "";
            while(resultSet.next()){
                personalID = resultSet.getNString("personal_details");
            }

            System.out.println(personalID);

            System.out.println(increment(personalID));

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean checkUser(String userID, String password){

        String query = String.format("SELECT password FROM Login_details WHERE userID = '%s'",userID);

        try{
            setDrivers();

            ResultSet output = statement.executeQuery(query);
//            String pass = "";
            while (output.next()){
                String pass = output.getString("password");
//                System.out.println(pass);
//                System.out.println(password);
                return pass.equals(password);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    return false;
    }
    public boolean checkAdmin(String adminID, String password){

        String query = String.format("SELECT password FROM Admin_details WHERE adminID = '%s'",adminID);

        try{
            setDrivers();

            ResultSet output = statement.executeQuery(query);
//            String pass = "";
            while (output.next()){
                String pass = output.getString("password");
//                System.out.println(pass);
//                System.out.println(password);
                return pass.equals(password);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public String[] getHomeDetails(String userID){

        String [] homeDetails = new String[4];
        String query1 = String.format("SELECT user_name, card_number FROM user_details WHERE userID ='%s'",userID);

        try{
            setDrivers();

            ResultSet output1 = statement.executeQuery(query1);
            while (output1.next()){
                homeDetails[0] = output1.getString("user_name");
                homeDetails[1] = output1.getString("card_number");
            }

            String query2 = String.format("SELECT balance_points FROM reward_details WHERE card_number ='%s'",homeDetails[1]);

            ResultSet output2 = statement.executeQuery(query2);
            while (output2.next()){
                homeDetails[2] = output2.getString("balance_points");
            }

            String query3 = String.format("SELECT credit_score FROM transaction_details WHERE card_number ='%s'",homeDetails[1]);

            ResultSet output3 = statement.executeQuery(query3);
            while (output3.next()){
                homeDetails[3] = output3.getString("credit_score");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return homeDetails;
    }
    public String[] getUserDetails(String userID){

        String [] userDetails = new String[9];
        String query1 = String.format("SELECT user_name, personal_details, authentication_details FROM user_details WHERE userID ='%s'",userID);
        String temp1 = "";
        String temp2 = "";

        try{
            setDrivers();

            ResultSet output1 = statement.executeQuery(query1);
            while (output1.next()){
                userDetails[0] = output1.getString("user_name");
                temp1 = output1.getString("personal_details");
                temp2 = output1.getString("authentication_details");
            }

            String query2 = String.format("SELECT * FROM personal_details WHERE personalID ='%s'",temp1);

            ResultSet output2 = statement.executeQuery(query2);
            while (output2.next()){
                userDetails[3] = output2.getString("qualification");
                userDetails[4] = output2.getString("marital_status");
                userDetails[5] = output2.getString("father_name");
                userDetails[6] = output2.getString("mother_name");
                userDetails[7] = output2.getString("dependence");
            }

            String query3 = String.format("SELECT contact_number, emailID FROM authentication_details WHERE authenticationID ='%s'",temp2);

            ResultSet output3 = statement.executeQuery(query3);
            while (output3.next()) {
                userDetails[1] = output3.getString("contact_number");
                userDetails[2] = output3.getString("emailID");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return userDetails;
    }
    public String[] getCardDetails(String userID){

        String [] cardDetails = new String[7];
        String query1 = String.format("SELECT card_number FROM user_details WHERE userID ='%s'",userID);

        try{
            setDrivers();

            ResultSet output1 = statement.executeQuery(query1);
            while (output1.next()){
                cardDetails[0] = output1.getString("card_number");

            }

//            System.out.println(cardDetails[0]);
            String query2 = String.format("SELECT * FROM card_details WHERE card_number ='%s'",cardDetails[0]);

            ResultSet output2 = statement.executeQuery(query2);
            while (output2.next()){
                cardDetails[1] = output2.getString("card_username");
                cardDetails[2] = output2.getString("card_network");
                cardDetails[3] = output2.getString("card_provider");
                cardDetails[4] = output2.getString("card_class");
                cardDetails[5] = output2.getString("card_validity");
                cardDetails[6] = output2.getString("transactionID");

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return cardDetails;
    }
    public String[] getAccountDetails(String userID){

        String [] accountDetails = new String[7];
        String query1 = String.format("SELECT account_number FROM user_details WHERE userID ='%s'",userID);

        try{
            setDrivers();

            ResultSet output1 = statement.executeQuery(query1);
            while (output1.next()){
                accountDetails[0] = output1.getString("account_number");
            }

            String query2 = String.format("SELECT * FROM account_details WHERE account_number ='%s'",accountDetails[0]);

            ResultSet output2 = statement.executeQuery(query2);
            while (output2.next()){
                accountDetails[1] = output2.getString("account_type");
                accountDetails[2] = output2.getString("account_balance");
                accountDetails[3] = output2.getString("account_minbalance");
                accountDetails[4] = output2.getString("bankID");

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return accountDetails;
    }
    public String[] getTransactionDetails(String userID){

        String [] transactionDetails = new String[7];
        String query1 = String.format("SELECT card_number FROM user_details WHERE userID ='%s'",userID);

        try{
            setDrivers();

            ResultSet output1 = statement.executeQuery(query1);
            while (output1.next()){
                transactionDetails[1] = output1.getString("card_number");
            }

            String query2 = String.format("SELECT * FROM transaction_details WHERE card_number ='%s'",transactionDetails[1]);

            ResultSet output2 = statement.executeQuery(query2);
            while (output2.next()){
                transactionDetails[0] = output2.getString("transactionID");
                transactionDetails[2] = output2.getString("credit_score");
                transactionDetails[3] = output2.getString("credited_amount");
                transactionDetails[4] = output2.getString("repaid_amount");
                transactionDetails[5] = output2.getString("balance_amount");
                transactionDetails[6] = output2.getString("transaction_limit");

            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return transactionDetails;
    }
    public String[] getEmployeeDetails(String userID){

        String [] employeeDetails = new String[4];
        String query1 = String.format("SELECT employee_details FROM user_details WHERE userID ='%s'",userID);

        try{
            setDrivers();

            ResultSet output1 = statement.executeQuery(query1);
            while (output1.next()){
                employeeDetails[0] = output1.getString("employee_details");
            }

            String query2 = String.format("SELECT * FROM employee_details WHERE employeeID ='%s'",employeeDetails[0]);

            ResultSet output2 = statement.executeQuery(query2);
            while (output2.next()){
                employeeDetails[1] = output2.getString("positions");
                employeeDetails[2] = output2.getString("organisation");
                employeeDetails[3] = output2.getString("institution");

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return employeeDetails;
    }
    public String[] getRewardDetails(String userID){

        String [] rewardDetails = new String[5];
        String query1 = String.format("SELECT card_number FROM user_details WHERE userID ='%s'",userID);

        try{
            setDrivers();

            ResultSet output1 = statement.executeQuery(query1);
            while (output1.next()){
                rewardDetails[0] = output1.getString("card_number");
            }

            String query2 = String.format("SELECT * FROM reward_details WHERE card_number ='%s'",rewardDetails[0]);

            ResultSet output2 = statement.executeQuery(query2);
            while (output2.next()){
                rewardDetails[1] = output2.getString("points_earned");
                rewardDetails[2] = output2.getString("points_redeemed");
                rewardDetails[3] = output2.getString("balance_points");
                rewardDetails[4] = output2.getString("last_updated");

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return rewardDetails;
    }
    public boolean updateUserDetails(String[] editField){

        String query1 = String.format("UPDATE user_details SET user_name = '%s' WHERE userID ='%s'",editField[1], editField[0]);

        try{
            setDrivers();

            String query2 = String.format("SELECT personal_details, authentication_details, card_number FROM user_details WHERE userID ='%s'", editField[0]);
            String temp1 = "";
            String temp2 = "";
            String temp3 = "";


            ResultSet output = statement.executeQuery(query2);
            if(output.next()){
                temp1 = output.getString("personal_details");
                temp2 = output.getString("authentication_details");
                temp3 = output.getString("card_number");

            }

            String query3 = String.format("UPDATE personal_details set " +
                            "qualification = '%s'," +
                            "marital_status  = '%s'," +
                            "father_name = '%s'," +
                            "mother_name = '%s'," +
                            "dependence = '%s' WHERE personalID ='%s'",
                            editField[4],editField[5],editField[6],editField[7],editField[8],temp1);

            String query4 = String.format("UPDATE authentication_details set " +
                            "contact_number = '%s'," +
                            "emailID = '%s' WHERE authenticationID = '%s'",editField[2],editField[3],temp2);


            statement.executeUpdate(String.format("UPDATE card_details SET card_username = '%s' WHERE card_number ='%s'",editField[1],temp3));
            statement.executeUpdate(query1);
            statement.executeUpdate(query3);
            statement.executeUpdate(query4);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return true;
    }

    public JScrollPane getTable(String tableName){
        JTable table = new JTable();
        try {
            setDrivers();

            String query = "SELECT * FROM "+ tableName+";";
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = metaData.getColumnName(i);
            }

            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }

            table.setModel(model);
            table.setFont(new Font("Arial", Font.PLAIN, 12));


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return new JScrollPane(table);
    }
    public String increment(String id){
        String temp1 = id.substring(5);
        String temp2 = id.substring(0,6);
        int num = Integer.parseInt(temp1);
        num++;
        String temp3 = Integer.toString(num);
        String temp4 = "";
        temp4 = temp4.concat(temp2);
        temp4 = temp4.concat(temp3);
        return temp4;
    }
    Query(){
        if(checkUser("UID00001","password01")){
            System.out.println("ok");
        }
//        String[] s =getCardDetails("UID00011");
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//        System.out.println(s[2]);
//        System.out.println(s[3]);
//        System.out.println(s[4]);
//        System.out.println(s[5]);
//        System.out.println(s[6]);
//        System.out.println(s[7]);
//
//
////        insertPersonalDetails();
    }
    public static void main(String args[]){

        new Query();
    }
}
