
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class UserDetails {
    JFrame frame = new JFrame("User Details");
    ImageIcon img = new ImageIcon("cc1.jpg");
    Image i = img.getImage().getScaledInstance(1650,850,Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(i);
    JLabel title = new JLabel("User Details");

    JLabel background = new JLabel(image);
    JPanel panel = new JPanel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel info1 = new JLabel();

    JTextField[] field = new JTextField[5];
    JTextField[] field2 = new JTextField[2];
    JTextField[] field3 = new JTextField[2];
    JTextField[] field4 = new JTextField[2];

    UserDetails(){

        setFrame();
    }
    public void setLabel(){

        background.setBounds(0,0,1540,864);

        panel.setLayout(null);
        panel.setBounds(0,0,400,850);
        panel.setBackground(new Color(255, 255, 255, 119));

        title.setBounds(100,50,400,50);
        title.setBorder(new LineBorder(Color.BLACK, 2));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(new Font("Arial",Font.BOLD,16));

        label1.setBounds(100,120,100,40);
        label1.setBorder(new LineBorder(Color.BLACK, 2));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Arial",Font.BOLD,16));

        label2.setBounds(100,170,100,40);
        label2.setBorder(new LineBorder(Color.BLACK, 2));
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        label2.setFont(new Font("Arial",Font.BOLD,16));

        label3.setBounds(100,220,100,40);
        label3.setBorder(new LineBorder(Color.BLACK, 2));
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setFont(new Font("Arial",Font.BOLD,16));

        label4.setBounds(100,270,100,40);
        label4.setBorder(new LineBorder(Color.BLACK, 2));
        label4.setHorizontalAlignment(SwingConstants.CENTER);
        label4.setFont(new Font("Arial",Font.BOLD,16));

        label5.setBounds(20,50, 360, 100);
        label5.setBorder(new LineBorder(Color.BLACK,2));
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Arial", Font.BOLD, 30));
        label5.setHorizontalAlignment(SwingConstants.CENTER);
        label5.setBackground(Color.red);

        info1.setBounds(450,200, 1100, 600);
        info1.setBorder(new LineBorder(Color.BLACK,2));
        info1.setForeground(Color.WHITE);
        info1.setFont(new Font("Arial", Font.BOLD, 30));
        info1.setHorizontalAlignment(SwingConstants.CENTER);
        info1.setBackground(Color.red);

//        field1.setBounds(200,120,300,40);
//        field1.setFont(new Font("Arial",Font.BOLD,16));
//
//        field2.setBounds(200,170,300,40);
//        field2.setFont(new Font("Arial",Font.BOLD,16));
//
//        field3.setBounds(200,220,300,40);
//        field3.setFont(new Font("Arial",Font.BOLD,16));
//
//        field4.setBounds(200,270,300,40);
//        field4.setFont(new Font("Arial",Font.BOLD,16));

        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);


        frame.add(panel);
        frame.add(background);


//        frame.add(label1);
//        frame.add(label2);
//        frame.add(label3);
//        frame.add(label4);
//
//        frame.add(field1);
//        frame.add(field2);
//        frame.add(field3);
//        frame.add(field4);


//        frame.add(title);
    }
    public void setFrame(){
        setLabel();

//        frame.add();
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
    public static void main(String []args){
        new UserDetails();
    }
}
