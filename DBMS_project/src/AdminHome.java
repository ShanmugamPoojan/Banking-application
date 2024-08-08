
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class AdminHome implements ActionListener {
    JFrame frame = new JFrame("Admin Home");
    ImageIcon img = new ImageIcon("bg1.jpg");
    Image i = img.getImage().getScaledInstance(1650,850,Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(i);
    ImageIcon img2 = new ImageIcon("bg2.jpg");
    Image im2 = img2.getImage().getScaledInstance(1000,600,Image.SCALE_SMOOTH);
    ImageIcon image2 = new ImageIcon(im2);


    JLabel titleImg = new JLabel(new ImageIcon("icon1.png"));
    JLabel title = new JLabel("Welcome");

    String userID;
    JLabel background = new JLabel(image);
    JPanel panel = new JPanel();
    JPanel tablePanel = new JPanel();
    
    JLabel menu = new JLabel("Display menu");
    JLabel label3 = new JLabel("hi");
    JLabel label2 = new JLabel("Welcome");
    JLabel titleLabel = new JLabel("Credit Card Database");

    JPanel titlePanel;

    JPanel creditsPanel = new JPanel();
    JLabel creditsLabel = new JLabel("Demo project by Shanmugam Poojan S, Pradeep M and Meghana T D");


    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton logout = new JButton("Log out");


    JScrollPane scrollPane = new JScrollPane();
    Query q = new Query();
    AdminHome(String userID){
        this.userID = userID;
        setFrame();
    }
    public void setButtons(){

        button1.setText("User Details");
        button1.setBounds(20,200,360,40);
        button1.setBackground(Color.WHITE);
        button1.setBorder(null);
        button1.setFocusable(false);
        button1.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        button1.addActionListener(this);

        button2.setText("Card Details");
        button2.setBounds(20,250,360,40);
        button2.setBackground(Color.WHITE);
        button2.setBorder(null);
        button2.setFocusable(false);
        button2.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        button2.addActionListener(this);

        button3.setText("Account Details");
        button3.setBounds(20,300,360,40);
        button3.setBackground(Color.WHITE);
        button3.setBorder(null);
        button3.setFocusable(false);
        button3.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        button3.addActionListener(this);

        button4.setText("Transaction Details");
        button4.setBounds(20,350,360,40);
        button4.setBackground(Color.WHITE);
        button4.setBorder(null);
        button4.setFocusable(false);
        button4.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        button4.addActionListener(this);

        button5.setText("Reward details");
        button5.setBounds(20,400,360,40);
        button5.setBackground(Color.WHITE);
        button5.setBorder(null);
        button5.setFocusable(false);
        button5.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        button5.addActionListener(this);

        button6.setText("Personal Details");
        button6.setBounds(20,450,360,40);
        button6.setBackground(Color.WHITE);
        button6.setBorder(null);
        button6.setFocusable(false);
        button6.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        button6.addActionListener(this);

        button7.setText("Authentication Details");
        button7.setBounds(20,500,360,40);
        button7.setBackground(Color.WHITE);
        button7.setBorder(null);
        button7.setFocusable(false);
        button7.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        button7.addActionListener(this);

        button8.setText("Bank details");
        button8.setBounds(20,550,360,40);
        button8.setBackground(Color.WHITE);
        button8.setBorder(null);
        button8.setFocusable(false);
        button8.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        button8.addActionListener(this);

        logout.setBounds(20,700,360,40);
        logout.setBackground(Color.WHITE);
        logout.setBorder(null);
        logout.setFocusable(false);
        logout.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        logout.addActionListener(this);


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);

        panel.add(logout);

    }
    public void setTablePanel(String tableName){

        background.remove(scrollPane);
        scrollPane = q.getTable(tableName);

        scrollPane.setBounds(470, 150, 1000, 500);
//        tablePanel.setBackground(new Color(93, 173, 226, 190));
//        tablePanel.setBorder(new LineBorder(Color.BLACK,2));
//        scrollPane.setLayout(new GridLayout(2,2));
        tablePanel.setVisible(true);

        background.add(scrollPane);
    }
    public void setTitlePanel(){

        titlePanel = new JPanel();

        titlePanel.setBounds(470,20, 1000, 100);
//        titleLabe.setBorder(new LineBorder(Color.BLACK,2));
        titlePanel.setBackground(new Color(93, 173, 226,100));
        titlePanel.setLayout(null);

        titleLabel.setBounds(0,0, 1000, 100);
//        titleLabel.setBorder(new LineBorder(Color.BLACK,2));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBackground(Color.red);

        titlePanel.add(titleLabel);

        background.add(titlePanel);
    }
    
    //------------------------------------------------------------ Credits ----------------------------------------------------------------------
    public void setCredits(){
        creditsPanel.setBounds(470,720, 1000, 50);
//        creditsLabe.setBorder(new LineBorder(Color.BLACK,2));
        creditsPanel.setBackground(new Color(93, 173, 226,100));
        creditsPanel.setLayout(null);

        creditsLabel.setBounds(0,0, 1000, 50);
//        creditsLabel.setBorder(new LineBorder(Color.BLACK,2));
        creditsLabel.setForeground(Color.WHITE);
        creditsLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        creditsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        creditsLabel.setBackground(Color.red);

        creditsPanel.add(creditsLabel);

        background.add(creditsPanel);
    }
//------------------------------------------------------------ Label ----------------------------------------------------------------------

    public void setLabel(){

        background.setBounds(0,0,1540,864);

        panel.setLayout(null);
        panel.setBounds(0,5,400,850);
        panel.setBackground(new Color(93, 173, 226,100));

        titleImg.setBounds(20,0,60,100);
//        titleImg.setBorder(new LineBorder(Color.BLACK, 2));

        title.setBounds(20,20,360,100);
//        title.setBorder(new LineBorder(Color.WHITE, 2));
        title.setHorizontalAlignment(SwingConstants.LEFT);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,35));
        title.setText("Welcome "+ userID);

        menu.setBounds(20,150,360,40);
        menu.setBorder(new LineBorder(Color.WHITE, 2));
        menu.setForeground(Color.WHITE);
        menu.setHorizontalAlignment(SwingConstants.CENTER);
        menu.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,20));


        panel.add(menu);
        panel.add(label2);
//        panel.add(label3);

        panel.add(title);

        setTitlePanel();

        setCredits();

        frame.add(panel);
        frame.add(background);

    }
    
    public void setFrame(){
        setButtons();


        setLabel();
//        setTablePanel("user_details");

//        frame.add();
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    public static void main(String []args){
        new AdminHome("admin01");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button1){

            setTablePanel("user_details");

        }else
        if(e.getSource()== button2){

            setTablePanel("card_details");

        }
        else
        if(e.getSource()== button3){

            setTablePanel("account_details");

        }else
        if(e.getSource()== button4){

            setTablePanel("transaction_details");

        }else
        if(e.getSource()== button5){

            setTablePanel("reward_details");

        }else
        if(e.getSource()== button6){

            setTablePanel("personal_details");

        }else
        if(e.getSource()== button7){

            setTablePanel("authentication_details");

        }else
        if(e.getSource()== button8){

            setTablePanel("bank_details");

        }
        else if(e.getSource()== logout){
            int result = JOptionPane.showConfirmDialog(frame,"Do you want to log out?","Information",
                    JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                new Login();
                frame.dispose();
            }
        }
    }
}
