
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin implements ActionListener {

    ImageIcon img = new ImageIcon("cc1.jpg");
    Image im = img.getImage().getScaledInstance(1000,600,Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(im);


    JFrame frame = new JFrame("Admin Login Page");

    JButton submit = new JButton("Submit");
    JButton reset = new JButton("Reset");
    JButton user = new JButton("User login");

    JTextField adminname = new JTextField();
    JTextField password = new JTextField();

    JLabel background = new JLabel(image);
    JPanel panel =new JPanel();
    JLabel welcome = new JLabel("Welcome");
    JLabel userLabel = new JLabel("Admin ID");
    JLabel passwordLabel = new JLabel("Password");

    Admin(){
        setFrame();
    }
    public void setLabels(){
        background.setBounds(0,0,1000, 600);

        panel.setLayout(null);
        panel.setBounds(250,100,500,370);
        panel.setBackground(new Color(255, 255, 255,120));
//        panel.setBorder(new LineBorder(Color.BLACK,1));

        welcome.setBounds(100,30,300,50);
        welcome.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,40));
        welcome.setForeground(Color.darkGray);
        welcome.setAlignmentX(Component.CENTER_ALIGNMENT);


        userLabel.setBounds(100,100,100,30);
        userLabel.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,16));
        userLabel.setForeground(Color.darkGray);

        passwordLabel.setBounds(100,140,100,30);
        passwordLabel.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,16));
        passwordLabel.setForeground(Color.darkGray);

        adminname.setBounds(200,100,200,30);
        adminname.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        adminname.setBorder(null);
        password.setBounds(200,140, 200,30);
        password.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,18));
        password.setBorder(null);

        panel.add(welcome);
        panel.add(userLabel);
        panel.add(passwordLabel);
        panel.add(adminname);
        panel.add(password);

        frame.add(panel);
    }
    public void setButtons(){
        submit.setFocusable(false);
        reset.setFocusable(false);
        user.setFocusable(false);

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


        user.setBounds(100,310, 300, 30);
        user.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,14));
        user.addActionListener(this);
        user.setBackground(Color.WHITE);
        user.setBorder(null);


        panel.add(submit);
        panel.add(reset);
        panel.add(user);
    }
    public void setFrame(){

        setLabels();
        setButtons();

        frame.add(background);

        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==reset){
            adminname.setText("");
            password.setText("");

        }
        else if(e.getSource()==submit){

            String adminID = adminname.getText();
            String pass = password.getText();

            Query q =  new Query();
            if(q.checkAdmin(adminID,pass)){
                new AdminHome(adminID);
                frame.dispose();
            }else{
//               message1.setVisible(true);
                JOptionPane.showConfirmDialog(panel,"Incorrect adminID/password","Warning",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE);
                adminname.setText("");
                password.setText("");
            }
        }
        else if(e.getSource()==user){
            new Login();
            frame.dispose();
        }

    }

}
