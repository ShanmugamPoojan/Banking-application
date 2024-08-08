import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditDetails implements ActionListener {
    JFrame frame = new JFrame("Edit Home");
    JFrame tempframe = new JFrame();

    ImageIcon img = new ImageIcon("cc3.jpg");
    Image i = img.getImage().getScaledInstance(1000,600,Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(i);
    ImageIcon img2 = new ImageIcon("bg2.jpg");
    Image im2 = img2.getImage().getScaledInstance(1000,600,Image.SCALE_SMOOTH);
    JLabel title = new JLabel("Welcome");

    String userID;
    JLabel background = new JLabel(image);

    JPanel button1Panel = new JPanel();
    JLabel[] button1Label = new JLabel[15];
    JTextField[] button1Field = new JTextField[15];
    JComboBox<String> qualificationComboBox;
    JComboBox<String> maritalStatusComboBox;

    JButton button1 = new JButton();
    JButton button2 = new JButton();

    String[] editField = new String[9];

    public void setButton1Panel() {
        button1Panel.setBounds(100, 80, 800, 400);
        button1Panel.setBackground(new Color(93, 173, 226, 150));
        button1Panel.setLayout(null);

        button1Label[0] = new JLabel();
        button1Label[0].setBounds(20, 20, 760, 360);
        button1Label[0].setBorder(new LineBorder(Color.WHITE, 2));
        button1Label[0].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        button1Label[0].setForeground(Color.BLACK);
        button1Label[0].setHorizontalAlignment(SwingConstants.CENTER);

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

        button1Label[1] = new JLabel();
        button1Label[1].setBounds(0, 0, 300, 40);
        button1Label[1].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        button1Label[1].setForeground(Color.BLACK);
        button1Label[1].setHorizontalAlignment(SwingConstants.CENTER);
        button1Label[1].setText(colum1);

        button1Field[1] = new JTextField();
        button1Field[1].setBounds(310, 5, 430, 30);
        button1Field[1].setBorder(null);
        button1Field[1].setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        button1Field[1].setForeground(Color.BLACK);
        button1Field[1].setHorizontalAlignment(SwingConstants.LEFT);
        button1Field[1].setText(userDetails[0]);

        button1Label[2] = new JLabel();
        button1Label[2].setBounds(0, 40, 300, 40);
        button1Label[2].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        button1Label[2].setForeground(Color.BLACK);
        button1Label[2].setHorizontalAlignment(SwingConstants.CENTER);
        button1Label[2].setText(colum2);

        button1Field[2] = new JTextField();
        button1Field[2].setBounds(310, 40, 430, 30);
        button1Field[2].setBorder(null);
        button1Field[2].setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        button1Field[2].setForeground(Color.BLACK);
        button1Field[2].setHorizontalAlignment(SwingConstants.LEFT);
        button1Field[2].setText(userDetails[1]);

        button1Label[3] = new JLabel();
        button1Label[3].setBounds(0, 80, 300, 40);
        button1Label[3].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        button1Label[3].setForeground(Color.BLACK);
        button1Label[3].setHorizontalAlignment(SwingConstants.CENTER);
        button1Label[3].setText(colum3);

        button1Field[3] = new JTextField();
        button1Field[3].setBounds(310, 80, 430, 30);
        button1Field[3].setBorder(null);
        button1Field[3].setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        button1Field[3].setForeground(Color.BLACK);
        button1Field[3].setHorizontalAlignment(SwingConstants.LEFT);
        button1Field[3].setText(userDetails[2]);

        button1Label[4] = new JLabel();
        button1Label[4].setBounds(0, 120, 300, 40);
        button1Label[4].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        button1Label[4].setForeground(Color.BLACK);
        button1Label[4].setHorizontalAlignment(SwingConstants.CENTER);
        button1Label[4].setText(colum4);

        String[] qualifications = {"UnderGraduate", "PostGraduate", "Working", "Other"};
        qualificationComboBox = new JComboBox<>(qualifications);
        qualificationComboBox.setBounds(310, 120, 430, 30);
        qualificationComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        qualificationComboBox.setForeground(Color.BLACK);
        qualificationComboBox.setSelectedItem(userDetails[3]);

        button1Label[5] = new JLabel();
        button1Label[5].setBounds(0, 160, 300, 40);
        button1Label[5].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        button1Label[5].setForeground(Color.BLACK);
        button1Label[5].setHorizontalAlignment(SwingConstants.CENTER);
        button1Label[5].setText(colum5);

        String[] maritalStatuses = {"Single", "Married", "Divorced"};
        maritalStatusComboBox = new JComboBox<>(maritalStatuses);
        maritalStatusComboBox.setBounds(310, 160, 430, 30);
        maritalStatusComboBox.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        maritalStatusComboBox.setForeground(Color.BLACK);
        maritalStatusComboBox.setSelectedItem(userDetails[4]);

        button1Label[6] = new JLabel();
        button1Label[6].setBounds(0, 200, 300, 40);
        button1Label[6].setBorder(null);
        button1Label[6].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        button1Label[6].setForeground(Color.BLACK);
        button1Label[6].setHorizontalAlignment(SwingConstants.CENTER);
        button1Label[6].setText(colum6);

        button1Field[6] = new JTextField();
        button1Field[6].setBounds(310, 200, 430, 30);
        button1Field[6].setBorder(null);
        button1Field[6].setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        button1Field[6].setForeground(Color.BLACK);
        button1Field[6].setHorizontalAlignment(SwingConstants.LEFT);
        button1Field[6].setText(userDetails[5]);

        button1Label[7] = new JLabel();
        button1Label[7].setBounds(0, 240, 300, 40);
        button1Label[7].setBorder(null);
        button1Label[7].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        button1Label[7].setForeground(Color.BLACK);
        button1Label[7].setHorizontalAlignment(SwingConstants.CENTER);
        button1Label[7].setText(colum7);

        button1Field[7] = new JTextField();
        button1Field[7].setBounds(310, 240, 430, 30);
        button1Field[7].setBorder(null);
        button1Field[7].setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        button1Field[7].setForeground(Color.BLACK);
        button1Field[7].setHorizontalAlignment(SwingConstants.LEFT);
        button1Field[7].setText(userDetails[6]);

        button1Label[8] = new JLabel();
        button1Label[8].setBounds(0, 280, 300, 40);
        button1Label[8].setBorder(null);
        button1Label[8].setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        button1Label[8].setForeground(Color.BLACK);
        button1Label[8].setHorizontalAlignment(SwingConstants.CENTER);
        button1Label[8].setText(colum8);

        button1Field[8] = new JTextField();
        button1Field[8].setBounds(310, 280, 430, 30);
        button1Field[8].setBorder(null);
        button1Field[8].setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        button1Field[8].setForeground(Color.BLACK);
        button1Field[8].setHorizontalAlignment(SwingConstants.LEFT);
        button1Field[8].setText(userDetails[7]);

        button1Label[0].add(button1Label[1]);
        button1Label[0].add(button1Label[2]);
        button1Label[0].add(button1Label[3]);
        button1Label[0].add(button1Label[4]);
        button1Label[0].add(button1Label[5]);
        button1Label[0].add(button1Label[6]);
        button1Label[0].add(button1Label[7]);
        button1Label[0].add(button1Label[8]);

        button1Label[0].add(button1Field[1]);
        button1Label[0].add(button1Field[2]);
        button1Label[0].add(button1Field[3]);
        button1Label[0].add(qualificationComboBox);
        button1Label[0].add(maritalStatusComboBox);
        button1Label[0].add(button1Field[6]);
        button1Label[0].add(button1Field[7]);
        button1Label[0].add(button1Field[8]);

        button1Panel.add(button1Label[0]);
        background.add(button1Panel);
    }

    EditDetails(String userID, JFrame j) {
        this.userID = userID;
        this.tempframe = j;
        setFrame();
    }

    public void setButtons() {
        button1.setBounds(500, 500, 260, 40);
        button1.setBackground(Color.WHITE);
        button1.setBorder(null);
        button1.setFocusable(false);
        button1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
        button1.setText("Save");
        button1.addActionListener(this);

        button2.setBounds(200, 500, 260, 40);
        button2.setBackground(Color.WHITE);
        button2.setBorder(null);
        button2.setFocusable(false);
        button2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
        button2.setText("Cancel");
        button2.addActionListener(this);

        frame.add(button1);
        frame.add(button2);
    }

    public void setLabel() {
        background.setBounds(0, 0, 1000, 600);

        title.setBounds(20, 20, 260, 50);
        title.setHorizontalAlignment(SwingConstants.LEFT);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        title.setText("UserID " + userID);

        frame.add(title);
        frame.add(background);
    }

    public void setFrame() {
        setButtons();
        setButton1Panel();
        setLabel();

        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setAlwaysOnTop(true);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            editField[0] = userID;
            editField[1] = button1Field[1].getText();
            editField[2] = button1Field[2].getText();
            editField[3] = button1Field[3].getText();
            editField[4] = (String) qualificationComboBox.getSelectedItem();
            editField[5] = (String) maritalStatusComboBox.getSelectedItem();
            editField[6] = button1Field[6].getText();
            editField[7] = button1Field[7].getText();
            editField[8] = button1Field[8].getText();

            Query q = new Query();
            boolean temp = q.updateUserDetails(editField);

            if (temp) {
                frame.dispose();
                JOptionPane.showConfirmDialog(frame, "Update successful", "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                new UserHome(userID);
                tempframe.dispose();
            } else {
                JOptionPane.showConfirmDialog(frame, "Update unsuccessful", "", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == button2) {
            JOptionPane.showConfirmDialog(frame, "Update unsuccessful", "", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
            frame.dispose();
        }
    }

//    public static void main(String[] args) {
//        new EditDetails("UID00011", new JFrame());
//    }
}
