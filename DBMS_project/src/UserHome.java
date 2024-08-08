
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserHome implements ActionListener {
    JFrame frame = new JFrame("User Home");
    ImageIcon img = new ImageIcon("bg1.jpg");
    Image i = img.getImage().getScaledInstance(1650, 850, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(i);
    ImageIcon img2 = new ImageIcon("bg2.jpg");
    Image im2 = img2.getImage().getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
    ImageIcon image2 = new ImageIcon(im2);


    JLabel titleImg = new JLabel(new ImageIcon("icon1.png"));
    JLabel title = new JLabel("Welcome");

    String userID;
    JLabel background = new JLabel(image);
    JPanel panel = new JPanel();
    JLabel menu = new JLabel("Menu");
    JLabel otherOptions = new JLabel("Other options");
    JLabel welcome = new JLabel("Welcome");
    JLabel titleLabel = new JLabel("Credit Card Database");

    JPanel titlePanel = new JPanel();
    JPanel homePanel = new JPanel();
    JPanel userPanel = new JPanel();
    JPanel cardPanel = new JPanel();
    JPanel accountPanel = new JPanel();
    JPanel transactionPanel = new JPanel();
    JPanel employeePanel = new JPanel();
    JPanel rewardPanel = new JPanel();
    JPanel tandcPanel = new JPanel();


    JLabel[] homeLabel = new JLabel[6];
    JLabel[] userLabel = new JLabel[17];
    JLabel[] cardLabel = new JLabel[15];
    JLabel[] accountLabel = new JLabel[15];
    JLabel[] employeeLabel = new JLabel[15];
    JLabel[] transactionLabel = new JLabel[15];
    JLabel[] rewardLabel = new JLabel[11];


    JLabel tandcLabel1 = new JLabel("Terms & Conditions*");
    JLabel tandcLabel2 = new JLabel("Terms & Conditions*");
    JLabel tandcLabel3 = new JLabel("Terms & Conditions*");

    JPanel creditsPanel = new JPanel();
    JLabel creditsLabel = new JLabel("Demo project by Shanmugam Poojan S, Pradeep M and Meghana T D");

//    JTextArea textArea = new JTextArea();
//    JScrollPane area1 = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);


    JButton button1 = new JButton("Home");
    JButton userDetailsButton = new JButton("User Details");
    JButton cardDetailsButton = new JButton("Card Details");
    JButton accountDetailsButton = new JButton("Account Details");
    JButton transactionDetailsButton = new JButton("Transaction Details");
    JButton employeeDetailsButton = new JButton("Work Details");
    JButton rewardDetailsButton = new JButton("Rewards");
    JButton editDetailsButton = new JButton("Edit Details");


    JButton button8 = new JButton("Terms & Conditions");
    JButton button9 = new JButton("Log out");


    UserHome(String userID) {
        this.userID = userID;
        setFrame();
    }

    UserHome() {
    }

    public void setButtons() {

        button1.setBounds(20, 200, 360, 40);
        button1.setBackground(Color.WHITE);
        button1.setBorder(null);
        button1.setFocusable(false);
        button1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        button1.addActionListener(this);

        userDetailsButton.setBounds(20, 250, 360, 40);
        userDetailsButton.setBackground(Color.WHITE);
        userDetailsButton.setBorder(null);
        userDetailsButton.setFocusable(false);
        userDetailsButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        userDetailsButton.addActionListener(this);

        cardDetailsButton.setBounds(20, 300, 360, 40);
        cardDetailsButton.setBackground(Color.WHITE);
        cardDetailsButton.setBorder(null);
        cardDetailsButton.setFocusable(false);
        cardDetailsButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        cardDetailsButton.addActionListener(this);

        accountDetailsButton.setBounds(20, 350, 360, 40);
        accountDetailsButton.setBackground(Color.WHITE);
        accountDetailsButton.setBorder(null);
        accountDetailsButton.setFocusable(false);
        accountDetailsButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        accountDetailsButton.addActionListener(this);

        transactionDetailsButton.setBounds(20, 400, 360, 40);
        transactionDetailsButton.setBackground(Color.WHITE);
        transactionDetailsButton.setBorder(null);
        transactionDetailsButton.setFocusable(false);
        transactionDetailsButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        transactionDetailsButton.addActionListener(this);

        rewardDetailsButton.setBounds(20, 450, 360, 40);
        rewardDetailsButton.setBackground(Color.WHITE);
        rewardDetailsButton.setBorder(null);
        rewardDetailsButton.setFocusable(false);
        rewardDetailsButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        rewardDetailsButton.addActionListener(this);

//          employeeDetailsButton.setBounds(20,500,360,40);
//        employeeDetailsButton.setBackground(Color.WHITE);
//        employeeDetailsButton.setBorder(null);
//        employeeDetailsButton.setFocusable(false);
//        employeeDetailsButton.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
//        employeeDetailsButton.addActionListener(this);

        editDetailsButton.setBounds(20, 600, 360, 40);
        editDetailsButton.setBackground(Color.WHITE);
        editDetailsButton.setBorder(null);
        editDetailsButton.setFocusable(false);
        editDetailsButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        editDetailsButton.addActionListener(this);

        button8.setBounds(20, 650, 360, 40);
        button8.setBackground(Color.WHITE);
        button8.setBorder(null);
        button8.setFocusable(false);
        button8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        button8.addActionListener(this);

//        button9.setBounds(20,700,360,40);
//        button9.setBackground(Color.WHITE);
//        button9.setBorder(null);
//        button9.addActionListener(this);

        button9.setBounds(20, 700, 360, 40);
        button9.setBackground(Color.WHITE);
        button9.setBorder(null);
        button9.setFocusable(false);
        button9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
        button9.addActionListener(this);

//        button1.setForeground(Color.WHITE);

        panel.add(button1);
        panel.add(userDetailsButton);
        panel.add(cardDetailsButton);
        panel.add(accountDetailsButton);
        panel.add(transactionDetailsButton);
//        panel.add(employeeDetailsButton);
        panel.add(rewardDetailsButton);

        panel.add(editDetailsButton);
        panel.add(button8);
        panel.add(button9);

    }

    public void setTitlePanel() {

        titlePanel.setBounds(470, 20, 1000, 100);
//        titleLabe.setBorder(new LineBorder(Color.BLACK,2));
        titlePanel.setBackground(new Color(93, 173, 226, 100));
        titlePanel.setLayout(null);

        titleLabel.setBounds(0, 0, 1000, 100);
//        titleLabel.setBorder(new LineBorder(Color.BLACK,2));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBackground(Color.red);

        titlePanel.add(titleLabel);

        background.add(titlePanel);
    }

    public void setHomePanel() {

        homePanel.setBounds(470, 150, 1000, 300);
//        homePanel.setBorder(new LineBorder(Color.WHITE,2));
        homePanel.setBackground(new Color(93, 173, 226, 190));
//        homePanel.setForeground(Color.WHITE);
//        homePanel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        homePanel.setLayout(null);
        homePanel.setVisible(true);

        homeLabel[0] = new JLabel();
        homeLabel[0].setBounds(20, 20, 960, 250);
        homeLabel[0].setBorder(new LineBorder(Color.WHITE, 4));
        homeLabel[0].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        homeLabel[0].setForeground(Color.BLACK);
        homeLabel[0].setHorizontalAlignment(SwingConstants.CENTER);

        String colum1 = "Account summary";
        String colum2 = "Username: ";
        String colum3 = "Card number: ";
        String colum4 = "Credit score: ";
        String colum5 = "Reward points: ";

        Query q = new Query();
        String[] homeDetails = q.getHomeDetails(userID);

        homeLabel[1] = new JLabel();
        homeLabel[1].setBounds(0, 0, 960, 50);
        homeLabel[1].setBorder(new LineBorder(Color.WHITE, 2));
        homeLabel[1].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        homeLabel[1].setForeground(Color.WHITE);
        homeLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
        homeLabel[1].setText(colum1);

        homeLabel[2] = new JLabel();
        homeLabel[2].setBounds(0, 50, 960, 50);
        homeLabel[2].setBorder(new LineBorder(Color.WHITE, 2));
        homeLabel[2].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        homeLabel[2].setForeground(Color.BLACK);
        homeLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
        homeLabel[2].setText(colum2 + homeDetails[0]);

        homeLabel[3] = new JLabel();
        homeLabel[3].setBounds(0, 100, 960, 50);
        homeLabel[3].setBorder(new LineBorder(Color.WHITE, 2));
        homeLabel[3].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        homeLabel[3].setForeground(Color.BLACK);
        homeLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
        homeLabel[3].setText(colum3 + homeDetails[1]);

        homeLabel[4] = new JLabel();
        homeLabel[4].setBounds(0, 150, 960, 50);
        homeLabel[4].setBorder(new LineBorder(Color.WHITE, 2));
        homeLabel[4].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        homeLabel[4].setForeground(Color.BLACK);
        homeLabel[4].setHorizontalAlignment(SwingConstants.CENTER);
        homeLabel[4].setText(colum4 + homeDetails[3]);

        homeLabel[5] = new JLabel();
        homeLabel[5].setBounds(0, 200, 960, 50);
        homeLabel[5].setBorder(new LineBorder(Color.WHITE, 2));
        homeLabel[5].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        homeLabel[5].setForeground(Color.BLACK);
        homeLabel[5].setHorizontalAlignment(SwingConstants.CENTER);
        homeLabel[5].setText(colum5 + homeDetails[2]);

        homeLabel[0].add(homeLabel[1]);
        homeLabel[0].add(homeLabel[2]);
        homeLabel[0].add(homeLabel[3]);
        homeLabel[0].add(homeLabel[4]);
        homeLabel[0].add(homeLabel[5]);

        homePanel.add(homeLabel[0]);
        background.add(homePanel);

    }

    public void setUserPanel() {

        userPanel.setBounds(470, 150, 1000, 550);
//        userPanel.setBorder(new LineBorder(Color.BLACK,2));
        userPanel.setBackground(new Color(93, 173, 226, 190));
        userPanel.setForeground(Color.WHITE);
        userPanel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        userPanel.setLayout(null);
        userPanel.setVisible(false);


        userLabel[0] = new JLabel();
        userLabel[0].setBounds(20, 20, 960, 500);
        userLabel[0].setBorder(new LineBorder(Color.WHITE, 4));
        userLabel[0].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[0].setForeground(Color.BLACK);
        userLabel[0].setHorizontalAlignment(SwingConstants.CENTER);

        Query q = new Query();
        String[] userDetails = q.getUserDetails(userID);

        String colum1 = "User name";
        String colum2 = "Contact number";
        String colum3 = "Email";
        String colum4 = "Qualification";
        String colum5 = "Marital status";
        String colum6 = "Father name";
        String colum7 = "Mother name";
        String colum8 = "Dependence";

        userLabel[1] = new JLabel();
        userLabel[1].setBounds(0, 0, 480, 50);
        userLabel[1].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[1].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[1].setForeground(Color.BLACK);
        userLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[1].setText(colum1);

        userLabel[2] = new JLabel();
        userLabel[2].setBounds(480, 0, 480, 50);
        userLabel[2].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[2].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[2].setForeground(Color.WHITE);
        userLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[2].setText(userDetails[0]);

        userLabel[3] = new JLabel();
        userLabel[3].setBounds(0, 50, 480, 50);
        userLabel[3].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[3].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[3].setForeground(Color.BLACK);
        userLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[3].setText(colum2);

        userLabel[4] = new JLabel();
        userLabel[4].setBounds(480, 50, 480, 50);
        userLabel[4].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[4].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[4].setForeground(Color.WHITE);
        userLabel[4].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[4].setText(userDetails[1]);

        userLabel[5] = new JLabel();
        userLabel[5].setBounds(0, 100, 480, 50);
        userLabel[5].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[5].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[5].setForeground(Color.BLACK);
        userLabel[5].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[5].setText(colum3);

        userLabel[6] = new JLabel();
        userLabel[6].setBounds(480, 100, 480, 50);
        userLabel[6].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[6].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[6].setForeground(Color.WHITE);
        userLabel[6].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[6].setText(userDetails[2]);

        userLabel[7] = new JLabel();
        userLabel[7].setBounds(0, 150, 480, 50);
        userLabel[7].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[7].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[7].setForeground(Color.BLACK);
        userLabel[7].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[7].setText(colum4);

        userLabel[8] = new JLabel();
        userLabel[8].setBounds(480, 150, 480, 50);
        userLabel[8].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[8].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[8].setForeground(Color.WHITE);
        userLabel[8].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[8].setText(userDetails[3]);

        userLabel[9] = new JLabel();
        userLabel[9].setBounds(0, 200, 480, 50);
        userLabel[9].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[9].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[9].setForeground(Color.BLACK);
        userLabel[9].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[9].setText(colum5);

        userLabel[10] = new JLabel();
        userLabel[10].setBounds(480, 200, 480, 50);
        userLabel[10].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[10].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[10].setForeground(Color.WHITE);
        userLabel[10].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[10].setText(userDetails[4]);

        userLabel[11] = new JLabel();
        userLabel[11].setBounds(0, 250, 480, 50);
        userLabel[11].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[11].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[11].setForeground(Color.BLACK);
        userLabel[11].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[11].setText(colum6);

        userLabel[12] = new JLabel();
        userLabel[12].setBounds(480, 250, 480, 50);
        userLabel[12].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[12].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[12].setForeground(Color.WHITE);
        userLabel[12].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[12].setText(userDetails[5]);

        userLabel[13] = new JLabel();
        userLabel[13].setBounds(0, 300, 480, 50);
        userLabel[13].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[13].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[13].setForeground(Color.BLACK);
        userLabel[13].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[13].setText(colum7);

        userLabel[14] = new JLabel();
        userLabel[14].setBounds(480, 300, 480, 50);
        userLabel[14].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[14].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[14].setForeground(Color.WHITE);
        userLabel[14].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[14].setText(userDetails[6]);

        userLabel[15] = new JLabel();
        userLabel[15].setBounds(0, 350, 480, 50);
        userLabel[15].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[15].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[15].setForeground(Color.BLACK);
        userLabel[15].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[15].setText(colum8);

        userLabel[16] = new JLabel();
        userLabel[16].setBounds(480, 350, 480, 50);
        userLabel[16].setBorder(new LineBorder(Color.WHITE, 2));
        userLabel[16].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        userLabel[16].setForeground(Color.WHITE);
        userLabel[16].setHorizontalAlignment(SwingConstants.CENTER);
        userLabel[16].setText(userDetails[7]);

        userLabel[0].add(userLabel[1]);
        userLabel[0].add(userLabel[2]);
        userLabel[0].add(userLabel[3]);
        userLabel[0].add(userLabel[4]);
        userLabel[0].add(userLabel[5]);
        userLabel[0].add(userLabel[6]);
        userLabel[0].add(userLabel[7]);
        userLabel[0].add(userLabel[8]);
        userLabel[0].add(userLabel[9]);
        userLabel[0].add(userLabel[10]);
        userLabel[0].add(userLabel[11]);
        userLabel[0].add(userLabel[12]);
        userLabel[0].add(userLabel[13]);
        userLabel[0].add(userLabel[14]);
        userLabel[0].add(userLabel[15]);
        userLabel[0].add(userLabel[16]);

        userPanel.add(userLabel[0]);
        background.add(userPanel);

//        userLabel.setText(userDetails[0]);

//        userPanel.add(userLabel1);

    }

    public void setCardPanel() {

        cardPanel.setBounds(470, 150, 1000, 550);
//        cardPanel.setBorder(new LineBorder(Color.BLACK,2));
        cardPanel.setBackground(new Color(93, 173, 226, 190));
        cardPanel.setForeground(Color.WHITE);
        cardPanel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        cardPanel.setLayout(null);
        cardPanel.setVisible(false);


        cardLabel[0] = new JLabel();
        cardLabel[0].setBounds(20, 20, 960, 500);
        cardLabel[0].setBorder(new LineBorder(Color.WHITE, 4));
        cardLabel[0].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[0].setForeground(Color.BLACK);
        cardLabel[0].setHorizontalAlignment(SwingConstants.CENTER);

        Query q = new Query();
        String[] cardDetails = q.getCardDetails(userID);

        String colum1 = "Card number";
        String colum2 = "Card username";
        String colum3 = "Card network";
        String colum4 = "Card provider";
        String colum5 = "Card class";
        String colum6 = "Card validity";
        String colum7 = "Transaction ID";

        cardLabel[1] = new JLabel();
        cardLabel[1].setBounds(0, 0, 480, 50);
        cardLabel[1].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[1].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[1].setForeground(Color.BLACK);
        cardLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[1].setText(colum1);

        cardLabel[2] = new JLabel();
        cardLabel[2].setBounds(480, 0, 480, 50);
        cardLabel[2].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[2].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[2].setForeground(Color.WHITE);
        cardLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[2].setText(cardDetails[0]);

        cardLabel[3] = new JLabel();
        cardLabel[3].setBounds(0, 50, 480, 50);
        cardLabel[3].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[3].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[3].setForeground(Color.BLACK);
        cardLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[3].setText(colum2);

        cardLabel[4] = new JLabel();
        cardLabel[4].setBounds(480, 50, 480, 50);
        cardLabel[4].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[4].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[4].setForeground(Color.WHITE);
        cardLabel[4].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[4].setText(cardDetails[1]);

        cardLabel[5] = new JLabel();
        cardLabel[5].setBounds(0, 100, 480, 50);
        cardLabel[5].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[5].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[5].setForeground(Color.BLACK);
        cardLabel[5].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[5].setText(colum3);

        cardLabel[6] = new JLabel();
        cardLabel[6].setBounds(480, 100, 480, 50);
        cardLabel[6].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[6].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[6].setForeground(Color.WHITE);
        cardLabel[6].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[6].setText(cardDetails[2]);

        cardLabel[7] = new JLabel();
        cardLabel[7].setBounds(0, 150, 480, 50);
        cardLabel[7].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[7].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[7].setForeground(Color.BLACK);
        cardLabel[7].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[7].setText(colum4);

        cardLabel[8] = new JLabel();
        cardLabel[8].setBounds(480, 150, 480, 50);
        cardLabel[8].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[8].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[8].setForeground(Color.WHITE);
        cardLabel[8].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[8].setText(cardDetails[3]);

        cardLabel[9] = new JLabel();
        cardLabel[9].setBounds(0, 200, 480, 50);
        cardLabel[9].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[9].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[9].setForeground(Color.BLACK);
        cardLabel[9].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[9].setText(colum5);

        cardLabel[10] = new JLabel();
        cardLabel[10].setBounds(480, 200, 480, 50);
        cardLabel[10].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[10].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[10].setForeground(Color.WHITE);
        cardLabel[10].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[10].setText(cardDetails[4]);

        cardLabel[11] = new JLabel();
        cardLabel[11].setBounds(0, 250, 480, 50);
        cardLabel[11].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[11].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[11].setForeground(Color.BLACK);
        cardLabel[11].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[11].setText(colum6);

        cardLabel[12] = new JLabel();
        cardLabel[12].setBounds(480, 250, 480, 50);
        cardLabel[12].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[12].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[12].setForeground(Color.WHITE);
        cardLabel[12].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[12].setText(cardDetails[5]);

        cardLabel[13] = new JLabel();
        cardLabel[13].setBounds(0, 300, 480, 50);
        cardLabel[13].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[13].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[13].setForeground(Color.BLACK);
        cardLabel[13].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[13].setText(colum7);

        cardLabel[14] = new JLabel();
        cardLabel[14].setBounds(480, 300, 480, 50);
        cardLabel[14].setBorder(new LineBorder(Color.WHITE, 2));
        cardLabel[14].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        cardLabel[14].setForeground(Color.WHITE);
        cardLabel[14].setHorizontalAlignment(SwingConstants.CENTER);
        cardLabel[14].setText(cardDetails[6]);

        cardLabel[0].add(cardLabel[1]);
        cardLabel[0].add(cardLabel[2]);
        cardLabel[0].add(cardLabel[3]);
        cardLabel[0].add(cardLabel[4]);
        cardLabel[0].add(cardLabel[5]);
        cardLabel[0].add(cardLabel[6]);
        cardLabel[0].add(cardLabel[7]);
        cardLabel[0].add(cardLabel[8]);
        cardLabel[0].add(cardLabel[9]);
        cardLabel[0].add(cardLabel[10]);
        cardLabel[0].add(cardLabel[11]);
        cardLabel[0].add(cardLabel[12]);
        cardLabel[0].add(cardLabel[13]);
        cardLabel[0].add(cardLabel[14]);

        cardPanel.add(cardLabel[0]);
        background.add(cardPanel);


    }

    public void setAccountPanel() {

        accountPanel.setBounds(470, 150, 1000, 550);
//        accountPanel.setBorder(new LineBorder(Color.BLACK,2));
        accountPanel.setBackground(new Color(93, 173, 226, 190));
        accountPanel.setForeground(Color.WHITE);
        accountPanel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        accountPanel.setLayout(null);
        accountPanel.setVisible(false);

        accountLabel[0] = new JLabel();
        accountLabel[0].setBounds(20, 20, 960, 500);
        accountLabel[0].setBorder(new LineBorder(Color.WHITE, 4));
        accountLabel[0].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[0].setForeground(Color.BLACK);
        accountLabel[0].setHorizontalAlignment(SwingConstants.CENTER);

        Query q = new Query();
        String[] accountDetails = q.getAccountDetails(userID);

        String colum1 = "Account number";
        String colum2 = "Account type";
        String colum3 = "Account balance";
        String colum4 = "Account minimum balance";
        String colum5 = "Bank ID";

        accountLabel[1] = new JLabel();
        accountLabel[1].setBounds(0, 0, 480, 50);
        accountLabel[1].setBorder(new LineBorder(Color.WHITE, 2));
        accountLabel[1].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[1].setForeground(Color.BLACK);
        accountLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel[1].setText(colum1);

        accountLabel[2] = new JLabel();
        accountLabel[2].setBounds(480, 0, 480, 50);
        accountLabel[2].setBorder(new LineBorder(Color.WHITE, 2));
        accountLabel[2].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[2].setForeground(Color.WHITE);
        accountLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel[2].setText(accountDetails[0]);

        accountLabel[3] = new JLabel();
        accountLabel[3].setBounds(0, 50, 480, 50);
        accountLabel[3].setBorder(new LineBorder(Color.WHITE, 2));
        accountLabel[3].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[3].setForeground(Color.BLACK);
        accountLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel[3].setText(colum2);

        accountLabel[4] = new JLabel();
        accountLabel[4].setBounds(480, 50, 480, 50);
        accountLabel[4].setBorder(new LineBorder(Color.WHITE, 2));
        accountLabel[4].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[4].setForeground(Color.WHITE);
        accountLabel[4].setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel[4].setText(accountDetails[1]);

        accountLabel[5] = new JLabel();
        accountLabel[5].setBounds(0, 100, 480, 50);
        accountLabel[5].setBorder(new LineBorder(Color.WHITE, 2));
        accountLabel[5].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[5].setForeground(Color.BLACK);
        accountLabel[5].setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel[5].setText(colum3);

        accountLabel[6] = new JLabel();
        accountLabel[6].setBounds(480, 100, 480, 50);
        accountLabel[6].setBorder(new LineBorder(Color.WHITE, 2));
        accountLabel[6].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[6].setForeground(Color.WHITE);
        accountLabel[6].setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel[6].setText(accountDetails[2]);

        accountLabel[7] = new JLabel();
        accountLabel[7].setBounds(0, 150, 480, 50);
        accountLabel[7].setBorder(new LineBorder(Color.WHITE, 2));
        accountLabel[7].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[7].setForeground(Color.BLACK);
        accountLabel[7].setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel[7].setText(colum4);

        accountLabel[8] = new JLabel();
        accountLabel[8].setBounds(480, 150, 480, 50);
        accountLabel[8].setBorder(new LineBorder(Color.WHITE, 2));
        accountLabel[8].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[8].setForeground(Color.WHITE);
        accountLabel[8].setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel[8].setText(accountDetails[3]);

        accountLabel[9] = new JLabel();
        accountLabel[9].setBounds(0, 200, 480, 50);
        accountLabel[9].setBorder(new LineBorder(Color.WHITE, 2));
        accountLabel[9].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[9].setForeground(Color.BLACK);
        accountLabel[9].setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel[9].setText(colum5);

        accountLabel[10] = new JLabel();
        accountLabel[10].setBounds(480, 200, 480, 50);
        accountLabel[10].setBorder(new LineBorder(Color.WHITE, 2));
        accountLabel[10].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        accountLabel[10].setForeground(Color.WHITE);
        accountLabel[10].setHorizontalAlignment(SwingConstants.CENTER);
        accountLabel[10].setText(accountDetails[4]);


        accountLabel[0].add(accountLabel[1]);
        accountLabel[0].add(accountLabel[2]);
        accountLabel[0].add(accountLabel[3]);
        accountLabel[0].add(accountLabel[4]);
        accountLabel[0].add(accountLabel[5]);
        accountLabel[0].add(accountLabel[6]);
        accountLabel[0].add(accountLabel[7]);
        accountLabel[0].add(accountLabel[8]);
        accountLabel[0].add(accountLabel[9]);
        accountLabel[0].add(accountLabel[10]);

        accountPanel.add(accountLabel[0]);
        background.add(accountPanel);

    }

    public void setTransactionPanel() {

        transactionPanel.setBounds(470, 150, 1000, 550);
//        transactionPanel.setBorder(new LineBorder(Color.BLACK,2));
        transactionPanel.setBackground(new Color(93, 173, 226, 190));
        transactionPanel.setForeground(Color.WHITE);
        transactionPanel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        transactionPanel.setLayout(null);
        transactionPanel.setVisible(false);

        transactionLabel[0] = new JLabel();
        transactionLabel[0].setBounds(20, 20, 960, 500);
        transactionLabel[0].setBorder(new LineBorder(Color.WHITE, 4));
        transactionLabel[0].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[0].setForeground(Color.BLACK);
        transactionLabel[0].setHorizontalAlignment(SwingConstants.CENTER);

        Query q = new Query();
        String[] transactionDetails = q.getTransactionDetails(userID);

        String colum1 = "Transaction ID";
        String colum2 = "Card number";
        String colum3 = "Credit score";
        String colum4 = "Credited amount";
        String colum5 = "Repaid amount";
        String colum6 = "Balance amount";
        String colum7 = "Transaction limit";

        transactionLabel[1] = new JLabel();
        transactionLabel[1].setBounds(0, 0, 480, 50);
        transactionLabel[1].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[1].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[1].setForeground(Color.BLACK);
        transactionLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[1].setText(colum1);

        transactionLabel[2] = new JLabel();
        transactionLabel[2].setBounds(480, 0, 480, 50);
        transactionLabel[2].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[2].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[2].setForeground(Color.WHITE);
        transactionLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[2].setText(transactionDetails[0]);

        transactionLabel[3] = new JLabel();
        transactionLabel[3].setBounds(0, 50, 480, 50);
        transactionLabel[3].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[3].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[3].setForeground(Color.BLACK);
        transactionLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[3].setText(colum2);

        transactionLabel[4] = new JLabel();
        transactionLabel[4].setBounds(480, 50, 480, 50);
        transactionLabel[4].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[4].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[4].setForeground(Color.WHITE);
        transactionLabel[4].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[4].setText(transactionDetails[1]);

        transactionLabel[5] = new JLabel();
        transactionLabel[5].setBounds(0, 100, 480, 50);
        transactionLabel[5].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[5].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[5].setForeground(Color.BLACK);
        transactionLabel[5].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[5].setText(colum3);

        transactionLabel[6] = new JLabel();
        transactionLabel[6].setBounds(480, 100, 480, 50);
        transactionLabel[6].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[6].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[6].setForeground(Color.WHITE);
        transactionLabel[6].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[6].setText(transactionDetails[2]);

        transactionLabel[7] = new JLabel();
        transactionLabel[7].setBounds(0, 150, 480, 50);
        transactionLabel[7].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[7].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[7].setForeground(Color.BLACK);
        transactionLabel[7].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[7].setText(colum4);

        transactionLabel[8] = new JLabel();
        transactionLabel[8].setBounds(480, 150, 480, 50);
        transactionLabel[8].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[8].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[8].setForeground(Color.WHITE);
        transactionLabel[8].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[8].setText(transactionDetails[3]);

        transactionLabel[9] = new JLabel();
        transactionLabel[9].setBounds(0, 200, 480, 50);
        transactionLabel[9].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[9].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[9].setForeground(Color.BLACK);
        transactionLabel[9].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[9].setText(colum5);

        transactionLabel[10] = new JLabel();
        transactionLabel[10].setBounds(480, 200, 480, 50);
        transactionLabel[10].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[10].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[10].setForeground(Color.WHITE);
        transactionLabel[10].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[10].setText(transactionDetails[4]);

        transactionLabel[11] = new JLabel();
        transactionLabel[11].setBounds(0, 250, 480, 50);
        transactionLabel[11].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[11].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[11].setForeground(Color.BLACK);
        transactionLabel[11].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[11].setText(colum6);

        transactionLabel[12] = new JLabel();
        transactionLabel[12].setBounds(480, 250, 480, 50);
        transactionLabel[12].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[12].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[12].setForeground(Color.WHITE);
        transactionLabel[12].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[12].setText(transactionDetails[5]);

        transactionLabel[13] = new JLabel();
        transactionLabel[13].setBounds(0, 300, 480, 50);
        transactionLabel[13].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[13].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[13].setForeground(Color.BLACK);
        transactionLabel[13].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[13].setText(colum7);

        transactionLabel[14] = new JLabel();
        transactionLabel[14].setBounds(480, 300, 480, 50);
        transactionLabel[14].setBorder(new LineBorder(Color.WHITE, 2));
        transactionLabel[14].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        transactionLabel[14].setForeground(Color.WHITE);
        transactionLabel[14].setHorizontalAlignment(SwingConstants.CENTER);
        transactionLabel[14].setText(transactionDetails[6]);

        transactionLabel[0].add(transactionLabel[1]);
        transactionLabel[0].add(transactionLabel[2]);
        transactionLabel[0].add(transactionLabel[3]);
        transactionLabel[0].add(transactionLabel[4]);
        transactionLabel[0].add(transactionLabel[5]);
        transactionLabel[0].add(transactionLabel[6]);
        transactionLabel[0].add(transactionLabel[7]);
        transactionLabel[0].add(transactionLabel[8]);
        transactionLabel[0].add(transactionLabel[9]);
        transactionLabel[0].add(transactionLabel[10]);
        transactionLabel[0].add(transactionLabel[11]);
        transactionLabel[0].add(transactionLabel[12]);
        transactionLabel[0].add(transactionLabel[13]);
        transactionLabel[0].add(transactionLabel[14]);

        transactionPanel.add(transactionLabel[0]);
        background.add(transactionPanel);

    }

    //    public void setEmployeePanel(){
//
//        employeePanel.setBounds(470,150, 1000, 550);
////        employeePanel.setBorder(new LineBorder(Color.BLACK,2));
//        employeePanel.setBackground(new Color(93, 173, 226,190));
//        employeePanel.setForeground(Color.WHITE);
//        employeePanel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
//        employeePanel.setLayout(null);
//        employeePanel.setVisible(false);
//
//        employeeLabel[0]= new JLabel();
//        employeeLabel[0].setBounds(20,20, 960, 500);
//        employeeLabel[0].setBorder(new LineBorder(Color.WHITE,4));
//        employeeLabel[0].setFont(new Font("Arial Rounded MT Bold", Font.BOLD,25));
//        employeeLabel[0].setForeground(Color.BLACK);
//        employeeLabel[0].setHorizontalAlignment(SwingConstants.CENTER);
//
//        Query q = new Query();
//        String[] employeeDetails = q.getEmployeeDetails(userID);
//
//        String colum1 = "Employee ID";
//        String colum2 = "Position";
//        String colum3 = "Organization";
//        String colum4 = "Institution";
//
//        employeeLabel[1]= new JLabel();
//        employeeLabel[1].setBounds(0,0,480,50);
//        employeeLabel[1].setBorder(new LineBorder(Color.WHITE,2));
//        employeeLabel[1].setFont(new Font("Arial Rounded MT Bold", Font.BOLD,25));
//        employeeLabel[1].setForeground(Color.BLACK);
//        employeeLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
//        employeeLabel[1].setText(colum2);
//
//        employeeLabel[2]= new JLabel();
//        employeeLabel[2].setBounds(480,0,480,50);
//        employeeLabel[2].setBorder(new LineBorder(Color.WHITE,2));
//        employeeLabel[2].setFont(new Font("Arial Rounded MT Bold", Font.BOLD,25));
//        employeeLabel[2].setForeground(Color.WHITE);
//        employeeLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
//        employeeLabel[2].setText(employeeDetails[1]);
//
//        employeeLabel[3]= new JLabel();
//        employeeLabel[3].setBounds(0,50,480,50);
//        employeeLabel[3].setBorder(new LineBorder(Color.WHITE,2));
//        employeeLabel[3].setFont(new Font("Arial Rounded MT Bold", Font.BOLD,25));
//        employeeLabel[3].setForeground(Color.BLACK);
//        employeeLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
//        employeeLabel[3].setText(colum3);
//
//        employeeLabel[4]= new JLabel();
//        employeeLabel[4].setBounds(480,50,480,50);
//        employeeLabel[4].setBorder(new LineBorder(Color.WHITE,2));
//        employeeLabel[4].setFont(new Font("Arial Rounded MT Bold", Font.BOLD,25));
//        employeeLabel[4].setForeground(Color.WHITE);
//        employeeLabel[4].setHorizontalAlignment(SwingConstants.CENTER);
//        employeeLabel[4].setText(employeeDetails[2]);
//
//        employeeLabel[5]= new JLabel();
//        employeeLabel[5].setBounds(0,100,480,50);
//        employeeLabel[5].setBorder(new LineBorder(Color.WHITE,2));
//        employeeLabel[5].setFont(new Font("Arial Rounded MT Bold", Font.BOLD,25));
//        employeeLabel[5].setForeground(Color.BLACK);
//        employeeLabel[5].setHorizontalAlignment(SwingConstants.CENTER);
//        employeeLabel[5].setText(colum4);
//
//        employeeLabel[6]= new JLabel();
//        employeeLabel[6].setBounds(480,100,480,50);
//        employeeLabel[6].setBorder(new LineBorder(Color.WHITE,2));
//        employeeLabel[6].setFont(new Font("Arial Rounded MT Bold", Font.BOLD,25));
//        employeeLabel[6].setForeground(Color.WHITE);
//        employeeLabel[6].setHorizontalAlignment(SwingConstants.CENTER);
//        employeeLabel[6].setText(employeeDetails[3]);
//
////        employeeLabel[7]= new JLabel();
////        employeeLabel[7].setBounds(0,150,480,50);
////        employeeLabel[7].setBorder(new LineBorder(Color.WHITE,2));
////        employeeLabel[7].setFont(new Font("Arial Rounded MT Bold", Font.BOLD,25));
////        employeeLabel[7].setForeground(Color.BLACK);
////        employeeLabel[7].setHorizontalAlignment(SwingConstants.CENTER);
////        employeeLabel[7].setText(colum4);
////
////        employeeLabel[8]= new JLabel();
////        employeeLabel[8].setBounds(480,150,480,50);
////        employeeLabel[8].setBorder(new LineBorder(Color.WHITE,2));
////        employeeLabel[8].setFont(new Font("Arial Rounded MT Bold", Font.BOLD,25));
////        employeeLabel[8].setForeground(Color.WHITE);
////        employeeLabel[8].setHorizontalAlignment(SwingConstants.CENTER);
////        employeeLabel[8].setText(employeeDetails[3]);
//
//
//        employeeLabel[0].add(employeeLabel[1]);
//        employeeLabel[0].add(employeeLabel[2]);
//        employeeLabel[0].add(employeeLabel[3]);
//        employeeLabel[0].add(employeeLabel[4]);
//        employeeLabel[0].add(employeeLabel[5]);
//        employeeLabel[0].add(employeeLabel[6]);
////        employeeLabel[0].add(employeeLabel[7]);
////        employeeLabel[0].add(employeeLabel[8]);
//
//        employeePanel.add(employeeLabel[0]);
//        background.add(employeePanel);
//
//
//    }
    public void setRewardPanel() {


        rewardPanel.setBounds(470, 150, 1000, 550);
//        rewardPanel.setBorder(new LineBorder(Color.BLACK,2));
        rewardPanel.setBackground(new Color(93, 173, 226, 190));
        rewardPanel.setForeground(Color.WHITE);
        rewardPanel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        rewardPanel.setLayout(null);
        rewardPanel.setVisible(false);

        rewardLabel[0] = new JLabel();
        rewardLabel[0].setBounds(20, 20, 960, 500);
        rewardLabel[0].setBorder(new LineBorder(Color.WHITE, 4));
        rewardLabel[0].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[0].setForeground(Color.BLACK);
        rewardLabel[0].setHorizontalAlignment(SwingConstants.CENTER);

        Query q = new Query();
        String[] rewardDetails = q.getRewardDetails(userID);

        String colum1 = "Card number";
        String colum2 = "Points earned";
        String colum3 = "Points redeemed";
        String colum4 = "Balance points";
        String colum5 = "Last updated";

        rewardLabel[1] = new JLabel();
        rewardLabel[1].setBounds(0, 0, 480, 50);
        rewardLabel[1].setBorder(new LineBorder(Color.WHITE, 2));
        rewardLabel[1].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[1].setForeground(Color.BLACK);
        rewardLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
        rewardLabel[1].setText(colum1);

        rewardLabel[2] = new JLabel();
        rewardLabel[2].setBounds(480, 0, 480, 50);
        rewardLabel[2].setBorder(new LineBorder(Color.WHITE, 2));
        rewardLabel[2].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[2].setForeground(Color.WHITE);
        rewardLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
        rewardLabel[2].setText(rewardDetails[0]);

        rewardLabel[3] = new JLabel();
        rewardLabel[3].setBounds(0, 50, 480, 50);
        rewardLabel[3].setBorder(new LineBorder(Color.WHITE, 2));
        rewardLabel[3].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[3].setForeground(Color.BLACK);
        rewardLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
        rewardLabel[3].setText(colum2);

        rewardLabel[4] = new JLabel();
        rewardLabel[4].setBounds(480, 50, 480, 50);
        rewardLabel[4].setBorder(new LineBorder(Color.WHITE, 2));
        rewardLabel[4].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[4].setForeground(Color.WHITE);
        rewardLabel[4].setHorizontalAlignment(SwingConstants.CENTER);
        rewardLabel[4].setText(rewardDetails[1]);

        rewardLabel[5] = new JLabel();
        rewardLabel[5].setBounds(0, 100, 480, 50);
        rewardLabel[5].setBorder(new LineBorder(Color.WHITE, 2));
        rewardLabel[5].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[5].setForeground(Color.BLACK);
        rewardLabel[5].setHorizontalAlignment(SwingConstants.CENTER);
        rewardLabel[5].setText(colum3);

        rewardLabel[6] = new JLabel();
        rewardLabel[6].setBounds(480, 100, 480, 50);
        rewardLabel[6].setBorder(new LineBorder(Color.WHITE, 2));
        rewardLabel[6].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[6].setForeground(Color.WHITE);
        rewardLabel[6].setHorizontalAlignment(SwingConstants.CENTER);
        rewardLabel[6].setText(rewardDetails[2]);

        rewardLabel[7] = new JLabel();
        rewardLabel[7].setBounds(0, 150, 480, 50);
        rewardLabel[7].setBorder(new LineBorder(Color.WHITE, 2));
        rewardLabel[7].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[7].setForeground(Color.BLACK);
        rewardLabel[7].setHorizontalAlignment(SwingConstants.CENTER);
        rewardLabel[7].setText(colum4);

        rewardLabel[8] = new JLabel();
        rewardLabel[8].setBounds(480, 150, 480, 50);
        rewardLabel[8].setBorder(new LineBorder(Color.WHITE, 2));
        rewardLabel[8].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[8].setForeground(Color.WHITE);
        rewardLabel[8].setHorizontalAlignment(SwingConstants.CENTER);
        rewardLabel[8].setText(rewardDetails[3]);

        rewardLabel[9] = new JLabel();
        rewardLabel[9].setBounds(0, 200, 480, 50);
        rewardLabel[9].setBorder(new LineBorder(Color.WHITE, 2));
        rewardLabel[9].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[9].setForeground(Color.BLACK);
        rewardLabel[9].setHorizontalAlignment(SwingConstants.CENTER);
        rewardLabel[9].setText(colum5);

        rewardLabel[10] = new JLabel();
        rewardLabel[10].setBounds(480, 200, 480, 50);
        rewardLabel[10].setBorder(new LineBorder(Color.WHITE, 2));
        rewardLabel[10].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        rewardLabel[10].setForeground(Color.WHITE);
        rewardLabel[10].setHorizontalAlignment(SwingConstants.CENTER);
        rewardLabel[10].setText(rewardDetails[4]);

        rewardLabel[0].add(rewardLabel[1]);
        rewardLabel[0].add(rewardLabel[2]);
        rewardLabel[0].add(rewardLabel[3]);
        rewardLabel[0].add(rewardLabel[4]);
        rewardLabel[0].add(rewardLabel[5]);
        rewardLabel[0].add(rewardLabel[6]);
        rewardLabel[0].add(rewardLabel[7]);
        rewardLabel[0].add(rewardLabel[8]);
        rewardLabel[0].add(rewardLabel[9]);
        rewardLabel[0].add(rewardLabel[10]);

        rewardPanel.add(rewardLabel[0]);
        background.add(rewardPanel);

    }

    JTextArea textArea = new JTextArea(960, 500);

    public void setTandcPanel() {

        tandcPanel.setBounds(470, 150, 1000, 550);
//        tandcPanel.setBorder(new LineBorder(Color.BLACK,2));
        tandcPanel.setBackground(new Color(93, 173, 226, 100));
        tandcPanel.setForeground(Color.WHITE);
        tandcPanel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
        tandcPanel.setLayout(null);
        tandcPanel.setVisible(false);

//        textArea.setBounds(20,20, 960, 500);
//        textArea.setBorder(new LineBorder(Color.WHITE,4));
//        textArea.setEditable(false);
//
//
//        File file = new File("C:\\Users\\SHANMUGAM POOJA S\\Documents\\JAVA projects\\DBMS_project");
//        try {
//            Scanner scan = new Scanner(file);
//            while (scan.hasNext()){
//                textArea.append(scan.nextLine());
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//
//        tandcPanel.add(textArea);
//        tandcPanel.add(new JScrollPane(textArea));

        tandcLabel1.setBounds(20, 20, 960, 500);
        tandcLabel1.setBorder(new LineBorder(Color.WHITE, 4));
        tandcLabel1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        tandcLabel1.setForeground(Color.BLACK);
        tandcLabel1.setHorizontalAlignment(SwingConstants.CENTER);


//        area1.setBounds(470,150, 1000, 550);
//        textArea.setBackground(new Color(93, 173, 226));


        tandcPanel.add(tandcLabel1);
//        tandcPanel.add(tandcLabel2);
//        tandcPanel.add(tandcLabel3);

        background.add(tandcPanel);

    }

    //------------------------------------------------------------ Credits ----------------------------------------------------------------------
    public void setCredits() {
        creditsPanel.setBounds(470, 720, 1000, 50);
//        creditsLabe.setBorder(new LineBorder(Color.BLACK,2));
        creditsPanel.setBackground(new Color(93, 173, 226, 100));
        creditsPanel.setLayout(null);

        creditsLabel.setBounds(0, 0, 1000, 50);
//        creditsLabel.setBorder(new LineBorder(Color.BLACK,2));
        creditsLabel.setForeground(Color.WHITE);
        creditsLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        creditsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        creditsLabel.setBackground(Color.red);

        creditsPanel.add(creditsLabel);

        background.add(creditsPanel);
    }
//------------------------------------------------------------ Label ----------------------------------------------------------------------

    public void setLabel() {

        background.setBounds(0, 0, 1540, 864);

        panel.setLayout(null);
        panel.setBounds(0, 5, 400, 850);
        panel.setBackground(new Color(93, 173, 226, 100));

        titleImg.setBounds(20, 0, 60, 100);
//        titleImg.setBorder(new LineBorder(Color.BLACK, 2));


        title.setBounds(20, 20, 360, 100);
//        title.setBorder(new LineBorder(Color.WHITE, 2));
        title.setHorizontalAlignment(SwingConstants.LEFT);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 35));
        title.setText("Welcome " + userID);

        menu.setBounds(20, 150, 360, 40);
        menu.setBorder(new LineBorder(Color.WHITE, 2));
        menu.setForeground(Color.WHITE);
        menu.setHorizontalAlignment(SwingConstants.CENTER);
        menu.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));

        otherOptions.setBounds(20, 550, 360, 40);
        otherOptions.setBorder(new LineBorder(Color.WHITE, 2));
        otherOptions.setForeground(Color.WHITE);
        otherOptions.setHorizontalAlignment(SwingConstants.CENTER);
        otherOptions.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));

//        welcome.setBounds(420,0,360,40);
//        welcome.setBorder(new LineBorder(Color.WHITE, 2));
//        welcome.setForeground(Color.WHITE);
//        welcome.setHorizontalAlignment(SwingConstants.CENTER);
//        welcome.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,20));


        panel.add(menu);
        panel.add(otherOptions);
//        panel.add(welcome);

        panel.add(title);

        setTitlePanel();
        setHomePanel();
        setUserPanel();
        setCardPanel();
        setAccountPanel();
        setTransactionPanel();
//        setEmployeePanel();
        setRewardPanel();
        setTandcPanel();

        setCredits();

        frame.add(panel);
        frame.add(background);
    }

    public void setFrame() {
        setButtons();
        setLabel();

//        frame.add();
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            userPanel.setVisible(false);
            cardPanel.setVisible(false);
            accountPanel.setVisible(false);
            transactionPanel.setVisible(false);
            employeePanel.setVisible(false);
            rewardPanel.setVisible(false);
            tandcPanel.setVisible(false);

            homePanel.setVisible(true);
        } else if (e.getSource() == userDetailsButton) {

            homePanel.setVisible(false);
            cardPanel.setVisible(false);
            accountPanel.setVisible(false);
            transactionPanel.setVisible(false);
            employeePanel.setVisible(false);
            rewardPanel.setVisible(false);
            tandcPanel.setVisible(false);

            userPanel.setVisible(true);
        } else if (e.getSource() == cardDetailsButton) {

            homePanel.setVisible(false);
            userPanel.setVisible(false);
            accountPanel.setVisible(false);
            transactionPanel.setVisible(false);
            employeePanel.setVisible(false);
            rewardPanel.setVisible(false);
            tandcPanel.setVisible(false);

            cardPanel.setVisible(true);

        } else if (e.getSource() == accountDetailsButton) {

            homePanel.setVisible(false);
            userPanel.setVisible(false);
            cardPanel.setVisible(false);
            transactionPanel.setVisible(false);
            employeePanel.setVisible(false);
            rewardPanel.setVisible(false);
            tandcPanel.setVisible(false);

            accountPanel.setVisible(true);
        } else if (e.getSource() == transactionDetailsButton) {

            homePanel.setVisible(false);
            userPanel.setVisible(false);
            cardPanel.setVisible(false);
            accountPanel.setVisible(false);
            employeePanel.setVisible(false);
            rewardPanel.setVisible(false);
            tandcPanel.setVisible(false);

            transactionPanel.setVisible(true);
        } else if (e.getSource() == employeeDetailsButton) {

            homePanel.setVisible(false);
            userPanel.setVisible(false);
            cardPanel.setVisible(false);
            accountPanel.setVisible(false);
            transactionPanel.setVisible(false);
            rewardPanel.setVisible(false);
            tandcPanel.setVisible(false);

            employeePanel.setVisible(true);

        } else if (e.getSource() == rewardDetailsButton) {

            homePanel.setVisible(false);
            userPanel.setVisible(false);
            cardPanel.setVisible(false);
            accountPanel.setVisible(false);
            transactionPanel.setVisible(false);
            employeePanel.setVisible(false);
            tandcPanel.setVisible(false);

            rewardPanel.setVisible(false);

        } else if (e.getSource() == editDetailsButton) {

            new EditDetails(userID, frame);
//            new UserHome();
//            this.frame.dispose();

        } else if (e.getSource() == button8) {

            homePanel.setVisible(false);
            userPanel.setVisible(false);
            cardPanel.setVisible(false);
            accountPanel.setVisible(false);
            transactionPanel.setVisible(false);
            employeePanel.setVisible(false);
            rewardPanel.setVisible(false);

            tandcPanel.setVisible(true);
        } else if (e.getSource() == button9) {
            int result = JOptionPane.showConfirmDialog(frame, "Do you want to log out?", "Information",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                new Login();
                frame.dispose();
            }
        }
    }
}