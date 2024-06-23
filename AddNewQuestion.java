import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewQuestion extends JFrame {
    private JButton addMcqsButton;
    private JButton addTrueFalseButton;
    private JButton exitButton;

    public AddNewQuestion() {
        setTitle("Add New Question");
        setLayout(new BorderLayout());
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMcqsButton = new JButton("Add MCQs");
        addTrueFalseButton = new JButton("Add True/False");
        exitButton = new JButton("Exit");

        JPanel panel = new JPanel();
        panel.add(addMcqsButton);
        panel.add(addTrueFalseButton);
        panel.add(exitButton);

        add(panel, BorderLayout.CENTER);

        addMcqsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AddNewQuestion.this, "Add MCQs clicked");
            }
        });

        addTrueFalseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(AddNewQuestion.this, "Add True/False clicked");
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
                new AddNewQuestion();
            }
        });
    }
}
