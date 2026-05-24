package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    // Global declarations for components
    JTextField textField;
    JPasswordField jPasswordField;
    JButton b1, b2;

    Login() {
        // Window Title
        super("Medicore Medical Center - Login");

        // 1. Username Label (Text Color: White, Font: Segoe UI)
        JLabel namelabel = new JLabel("Username");
        namelabel.setBounds(50, 40, 100, 30);
        namelabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        namelabel.setForeground(Color.WHITE);
        add(namelabel);

        // 2. Password Label (Text Color: White, Font: Segoe UI)
        JLabel password = new JLabel("Password");
        password.setBounds(50, 100, 100, 30);
        password.setFont(new Font("Segoe UI", Font.BOLD, 16));
        password.setForeground(Color.WHITE);
        add(password);

        // 3. Username Input Box (Dark BG, Red Text & Border)
        textField = new JTextField();
        textField.setBounds(160, 40, 180, 35);
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        textField.setBackground(new Color(28, 38, 56)); // Custom Dark Box
        textField.setForeground(new Color(255, 69, 69)); // Crimson Red Text
        textField.setCaretColor(new Color(255, 69, 69)); // Red Blinking Cursor
        textField.setBorder(BorderFactory.createLineBorder(new Color(60, 70, 90), 1));
        add(textField);

        // 4. Password Input Box (Dark BG, Red Text & Border)
        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(160, 100, 180, 35);
        jPasswordField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        jPasswordField.setBackground(new Color(28, 38, 56));
        jPasswordField.setForeground(new Color(255, 69, 69));
        jPasswordField.setCaretColor(new Color(255, 69, 69));
        jPasswordField.setBorder(BorderFactory.createLineBorder(new Color(60, 70, 90), 1));
        add(jPasswordField);

        // 5. Login Button (Solid Modern Red, Hand Cursor)
        b1 = new JButton("Login");
        b1.setBounds(50, 180, 130, 35);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 15));
        b1.setBackground(new Color(255, 51, 51)); // Vibrant Red
        b1.setForeground(Color.WHITE);
        b1.setFocusPainted(false);
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b1.addActionListener(this);
        add(b1);

        // 6. Cancel Button (Dark Outline Style, Hand Cursor)
        b2 = new JButton("Cancel");
        b2.setBounds(210, 180, 130, 35);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 15));
        b2.setBackground(new Color(28, 38, 56)); // Matches field theme
        b2.setForeground(Color.LIGHT_GRAY);
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createLineBorder(new Color(60, 70, 90), 1));
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b2.addActionListener(this);
        add(b2);

        // 7. Right Side: Splitter Line decoration
        JSeparator separator = new JSeparator(JSeparator.VERTICAL);
        separator.setBounds(375, 25, 1, 210);
        separator.setForeground(new Color(60, 70, 90));
        add(separator);

        // 8. Logo Image Setup (Perfect fit alignment with SCALE_SMOOTH)
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(410, 240, Image.SCALE_SMOOTH);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(400, 15, 410, 240); // Shifted right side perfectly
        add(label);

        // 9. Frame Settings (Dark theme background & Window layout size)
        getContentPane().setBackground(new Color(13, 23, 40)); // Deep Dark Blue/Black
        setSize(850, 290); // Expanded width for layout splitting
        setLocationRelativeTo(null); // Automatically centers window on your monitor screen
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                conn c = new conn();
                String user = textField.getText();
                String Pass = jPasswordField.getText();

                String q = "select * from login where ID = '" + user + "' and  PW = '" + Pass + "'";
                ResultSet resultSet = c.statement.executeQuery(q);

                if (resultSet.next()) {
                    new Reception();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Credentials");
                }

            } catch (Exception E) {
                E.printStackTrace();
            }
        } else {
            System.exit(0); // Clean application closing handler
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}