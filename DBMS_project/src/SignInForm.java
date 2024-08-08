import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class SignInForm extends JFrame {

    static final String DB_URL = "jdbc:mysql://localhost:3306/credit_card_database";
    static final String USER = "root";
    static final String PASS = "root";

    private JTextField accountNumberField, accountTypeField, accountBalanceField, accountMinBalanceField, bankIDField;
    private JTextField transactionIDField, creditScoreField, creditedAmountField, repaidAmountField, balanceAmountField, transactionLimitField;
    private JTextField cardNumberField, cardUsernameField;
    private JComboBox<String> cardNetworkCombo, cardProviderCombo, cardClassCombo;
    private JTextField cardValidityField;

    public SignInForm() {
        setTitle("Sign In Form");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 700);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(18, 2));
        add(inputPanel, BorderLayout.CENTER);

        // Account Details
        inputPanel.add(new JLabel("Account Number:"));
        accountNumberField = new JTextField();
        accountNumberField.setEditable(false);
        inputPanel.add(accountNumberField);

        inputPanel.add(new JLabel("Account Type:"));
        accountTypeField = new JTextField();
        inputPanel.add(accountTypeField);

        inputPanel.add(new JLabel("Account Balance:"));
        accountBalanceField = new JTextField();
        inputPanel.add(accountBalanceField);

        inputPanel.add(new JLabel("Account Min Balance:"));
        accountMinBalanceField = new JTextField();
        inputPanel.add(accountMinBalanceField);

        inputPanel.add(new JLabel("Bank ID:"));
        bankIDField = new JTextField();
        inputPanel.add(bankIDField);

        // Transaction Details
        inputPanel.add(new JLabel("Transaction ID:"));
        transactionIDField = new JTextField();
        inputPanel.add(transactionIDField);

        inputPanel.add(new JLabel("Credit Score:"));
        creditScoreField = new JTextField();
        inputPanel.add(creditScoreField);

        inputPanel.add(new JLabel("Credited Amount:"));
        creditedAmountField = new JTextField();
        inputPanel.add(creditedAmountField);

        inputPanel.add(new JLabel("Repaid Amount:"));
        repaidAmountField = new JTextField();
        inputPanel.add(repaidAmountField);

        inputPanel.add(new JLabel("Balance Amount:"));
        balanceAmountField = new JTextField();
        inputPanel.add(balanceAmountField);

        inputPanel.add(new JLabel("Transaction Limit:"));
        transactionLimitField = new JTextField();
        inputPanel.add(transactionLimitField);

        // Card Details
        inputPanel.add(new JLabel("Card Number:"));
        cardNumberField = new JTextField();
        cardNumberField.setEditable(false);
        inputPanel.add(cardNumberField);

        inputPanel.add(new JLabel("Card Username:"));
        cardUsernameField = new JTextField();
        inputPanel.add(cardUsernameField);

        inputPanel.add(new JLabel("Card Network:"));
        String[] cardNetworks = {"VISA", "MasterCard"};
        cardNetworkCombo = new JComboBox<>(cardNetworks);
        inputPanel.add(cardNetworkCombo);

        inputPanel.add(new JLabel("Card Provider:"));
        String[] cardProviders = {"SBI", "HDFC", "ICICI", "AXIS", "Kotak", "IndusInd", "Canara", "Union", "Syndicate"};
        cardProviderCombo = new JComboBox<>(cardProviders);
        inputPanel.add(cardProviderCombo);

        inputPanel.add(new JLabel("Card Class:"));
        String[] cardClasses = {"Silver", "Gold", "Platinum"};
        cardClassCombo = new JComboBox<>(cardClasses);
        inputPanel.add(cardClassCombo);

        inputPanel.add(new JLabel("Card Validity:"));
        cardValidityField = new JTextField();
        cardValidityField.setEditable(false);
        inputPanel.add(cardValidityField);

        JButton signInButton = new JButton("Sign In");
        JButton clearButton = new JButton("Clear");
        JButton cancelButton = new JButton("Cancel");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(signInButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(cancelButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Action listeners for buttons
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signIn();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        // Generate unique account number, card number, and set card validity date
        generateAccountNumber();
        generateCardNumber();
        setCardValidityDate();

        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void generateAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            accountNumber.append(random.nextInt(10));
        }
        accountNumberField.setText(accountNumber.toString());
    }

    private void generateCardNumber() {
        Random random = new Random();
        StringBuilder cardNumber = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            cardNumber.append(String.format("%04d", random.nextInt(10000)));
            if (i < 3) {
                cardNumber.append(" ");
            }
        }
        cardNumberField.setText(cardNumber.toString());
    }

    private void setCardValidityDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 3); // Card validity is 3 years from now
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        cardValidityField.setText(sdf.format(calendar.getTime()));
    }

    private void signIn() {
        String accountNumber = accountNumberField.getText();
        String accountType = accountTypeField.getText();
        String accountBalance = accountBalanceField.getText();
        String accountMinBalance = accountMinBalanceField.getText();
        String bankID = bankIDField.getText();

        String transactionID = transactionIDField.getText();
        String creditScore = creditScoreField.getText();
        String creditedAmount = creditedAmountField.getText();
        String repaidAmount = repaidAmountField.getText();
        String balanceAmount = balanceAmountField.getText();
        String transactionLimit = transactionLimitField.getText();

        String cardNumber = cardNumberField.getText();
        String cardUsername = cardUsernameField.getText();
        String cardNetwork = (String) cardNetworkCombo.getSelectedItem();
        String cardProvider = (String) cardProviderCombo.getSelectedItem();
        String cardClass = (String) cardClassCombo.getSelectedItem();
        String cardValidity = cardValidityField.getText();

        if (accountNumber.isEmpty() || transactionID.isEmpty() || cardNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Account Number, Transaction ID, and Card Number are required!");
            return;
        }

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            conn.setAutoCommit(false);

            try {
                String accountQuery = "INSERT INTO Account_details (account_number, account_type, account_balance, account_minbalance, bankID) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement accountStmt = conn.prepareStatement(accountQuery);
                accountStmt.setString(1, accountNumber);
                accountStmt.setString(2, accountType);
                accountStmt.setInt(3, Integer.parseInt(accountBalance));
                accountStmt.setInt(4, Integer.parseInt(accountMinBalance));
                accountStmt.setString(5, bankID);
                accountStmt.executeUpdate();

                String transactionQuery = "INSERT INTO Transaction_details (transactionID, card_number, credit_score, credited_amount, repaid_amount, balance_amount, transaction_limit) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement transactionStmt = conn.prepareStatement(transactionQuery);
                transactionStmt.setString(1, transactionID);
                transactionStmt.setString(2, cardNumber);
                transactionStmt.setInt(3, Integer.parseInt(creditScore));
                transactionStmt.setInt(4, Integer.parseInt(creditedAmount));
                transactionStmt.setInt(5, Integer.parseInt(repaidAmount));
                transactionStmt.setInt(6, Integer.parseInt(balanceAmount));
                transactionStmt.setInt(7, Integer.parseInt(transactionLimit));
                transactionStmt.executeUpdate();

                String cardQuery = "INSERT INTO Card_details (card_number, card_username, card_network, card_provider, card_class, card_validity, transactionID) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement cardStmt = conn.prepareStatement(cardQuery);
                cardStmt.setString(1, cardNumber);
                cardStmt.setString(2, cardUsername);
                cardStmt.setString(3, cardNetwork);
                cardStmt.setString(4, cardProvider);
                cardStmt.setString(5, cardClass);
                cardStmt.setDate(6, Date.valueOf(cardValidity));
                cardStmt.setString(7, transactionID);
                cardStmt.executeUpdate();

                conn.commit();
                JOptionPane.showMessageDialog(this, "Sign In successful!");

            } catch (SQLException ex) {
                conn.rollback();
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error signing in. Please try again.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database connection error.");
        }
    }

    private void clearForm() {
        generateAccountNumber();
        accountTypeField.setText("");
        accountBalanceField.setText("");
        accountMinBalanceField.setText("");
        bankIDField.setText("");

        transactionIDField.setText("");
        creditScoreField.setText("");
        creditedAmountField.setText("");
        repaidAmountField.setText("");
        balanceAmountField.setText("");
        transactionLimitField.setText("");

        cardUsernameField.setText("");
        cardNetworkCombo.setSelectedIndex(0);
        cardProviderCombo.setSelectedIndex(0);
        cardClassCombo.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SignInForm();
            }
        });
    }
}
