import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp extends JFrame {
    public MainApp() {
        setTitle("Student Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(new GridLayout(6, 1));

        JButton addStudentButton = new JButton("Add Student");
        JButton deleteStudentButton = new JButton("Delete Student");
        JButton viewStudentButton = new JButton("View Student");
        JButton logoutButton = new JButton("Logout");
        JButton exitButton = new JButton("Exit");

        panel.add(addStudentButton);
        panel.add(deleteStudentButton);
        panel.add(viewStudentButton);
        panel.add(logoutButton);
        panel.add(exitButton);

        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainApp.this, "Add Student clicked");
            }
        });

        deleteStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainApp.this, "Delete Student clicked");
            }
        });

        viewStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainApp.this, "View Student clicked");
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainApp.this, "LogOut clicked");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainApp();
            }
        });
    }
}
