
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    ImageIcon img = new ImageIcon("cc3.jpg");
    Image im = img.getImage().getScaledInstance(1000,600,Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(im);



    JFrame frame = new JFrame("Login Page");

    JButton submit = new JButton("Submit");
    JButton reset = new JButton("Reset");
    JButton signup = new JButton("Sign up");
    JButton admin = new JButton("Admin login");

    JTextField username = new JTextField();
    JTextField password = new JTextField();

    JLabel background = new JLabel(image);
    JPanel panel=new JPanel();
    JLabel welcome = new JLabel("Welcome");
    JLabel userLabel = new JLabel("User ID");
    JLabel passwordLabel = new JLabel("Password");

    JLabel message1 = new JLabel("Don't have an account, sign up here");
    JLabel message2 = new JLabel("or");

    Login(){
        setFrame();
    }
    public void setLabels(){
        background.setBounds(0,0,1000, 600);

        panel.setLayout(null);
        panel.setBounds(250,100,500,370);
        panel.setBackground(new Color(255, 255, 255,120));


        welcome.setBounds(100,30,300,50);
        welcome.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,40));
        welcome.setForeground(Color.darkGray);
        welcome.setAlignmentX(Component.CENTER_ALIGNMENT);


        userLabel.setBounds(100,100,100,30);
        userLabel.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,16));
        userLabel.setForeground(Color.DARK_GRAY);

        passwordLabel.setBounds(100,140,100,30);
        passwordLabel.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,16));
        passwordLabel.setForeground(Color.DARK_GRAY);


        username.setBounds(200,100,200,30);
        username.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        username.setBorder(null);
        password.setBounds(200,140, 200,30);
        password.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        password.setBorder(null);


        message1.setBounds(100,215,300,30);
        message1.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,12));
//        message1.setVisible(false);
        message1.setForeground(Color.darkGray);

        message2.setBounds(100,280,300,30);
        message2.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,15));
        message2.setHorizontalAlignment(SwingConstants.CENTER);
        message2.setForeground(Color.darkGray);


        panel.add(welcome);
        panel.add(userLabel);
        panel.add(passwordLabel);
        panel.add(username);
        panel.add(password);

        panel.add(message1);
        panel.add(message2);

    }
    public void setButtons(){
        submit.setFocusable(false);
        reset.setFocusable(false);
        signup.setFocusable(false);
        admin.setFocusable(false);

        submit.setBounds(100,180,145,30);
        submit.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,14));
        submit.setBackground(Color.WHITE);
        submit.setBorder(null);
        submit.addActionListener(this);

        reset.setBounds(255,180,145,30);
        reset.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,14));
        reset.addActionListener(this);
        reset.setBackground(Color.WHITE);
        reset.setBorder(null);

        signup.setBounds(100,250,300,30);
        signup.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,14));
        signup.addActionListener(this);
        signup.setBackground(Color.WHITE);
        signup.setBorder(null);

        admin.setBounds(100,310, 300, 30);
        admin.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,14));
        admin.addActionListener(this);
        admin.setBackground(Color.WHITE);
        admin.setBorder(null);


        panel.add(submit);
        panel.add(reset);
        panel.add(signup);
        panel.add(admin);
    }
    public void setFrame(){

        setButtons();
        setLabels();

        frame.add(panel);
        frame.add(background);

        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==reset){
            username.setText("");
            password.setText("");

        }
        else if(e.getSource()==submit){

           String userID = username.getText();
           String pass = password.getText();

           Query q =  new Query();
           if(q.checkUser(userID,pass)){
               new UserHome(userID);
               frame.dispose();
           }else{
//               message1.setVisible(true);
               JOptionPane.showConfirmDialog(panel,"Incorrect userID/password","Warning",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
               username.setText("");
               password.setText("");
           }
        }
        else if(e.getSource()== signup){
            new UserDetails();
            frame.dispose();
        }
        else if(e.getSource()==admin){
            new Admin();
            frame.dispose();
        }

    }
    public static void main(String args[]){

        new Login();
    }
}
