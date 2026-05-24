package hospital.management.system;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee_info extends JFrame {
    Employee_info() {
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 990, 590);
        panel.setBackground(new Color(13, 23, 40)); 
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(20, 45, 950, 430);
        table.setBackground(new Color(28, 38, 56)); 
        table.setForeground(Color.WHITE); 
        table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        table.setGridColor(new Color(60, 70, 90)); 
        table.setRowHeight(25); 
        panel.add(table);

        // DATABASE FETCH LOGIC WITH POP-UP ERROR TRACKING
        try {
            conn c = new conn();
            String q = "select * from employee"; 
            ResultSet resultSet = c.statement.executeQuery(q);
            
            if (resultSet != null) {
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            }

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        // --- Column Headers ---
        JLabel label1 = new JLabel("Name");
        label1.setBounds(41, 15, 70, 20);
        label1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("Age");
        label2.setBounds(200, 15, 70, 20);
        label2.setFont(new Font("Segoe UI", Font.BOLD, 14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JLabel label3 = new JLabel("Phone Number");
        label3.setBounds(355, 15, 150, 20);
        label3.setFont(new Font("Segoe UI", Font.BOLD, 14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JLabel label4 = new JLabel("Salary");
        label4.setBounds(520, 15, 150, 20);
        label4.setFont(new Font("Segoe UI", Font.BOLD, 14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JLabel label5 = new JLabel("Gmail");
        label5.setBounds(680, 15, 150, 20);
        label5.setFont(new Font("Segoe UI", Font.BOLD, 14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JLabel label6 = new JLabel("Aadhar Number");
        label6.setBounds(835, 15, 150, 20);
        label6.setFont(new Font("Segoe UI", Font.BOLD, 14));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        JButton button = new JButton("BACK");
        button.setBounds(435, 510, 130, 35);
        button.setFont(new Font("Segoe UI", Font.BOLD, 15));
        button.setBackground(new Color(28, 38, 56));
        button.setForeground(Color.LIGHT_GRAY);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(new Color(60, 70, 90), 1));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.add(button);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setSize(1000, 600);
        setLocationRelativeTo(null); 
        setLayout(null);
        getContentPane().setBackground(new Color(13, 23, 40));
        setVisible(true);
    }

    public static void main(String[] args) {
        new Employee_info();
    }
}