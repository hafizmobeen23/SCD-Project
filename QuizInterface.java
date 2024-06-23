import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizInterface extends JFrame {
    private JLabel welcomeLabel;
    private JLabel questionLabel;
    private JLabel nameLabel;
    private JLabel regnoLabel;
    private JLabel questionsLabel;
    private JLabel marksLabel;
    private JLabel timeLabel;
    private JLabel dateLabel;
    private JRadioButton option1;
    private JRadioButton option2;
    private JRadioButton option3;
    private ButtonGroup optionGroup;
    private JButton nextButton;
    private JButton submitButton;

    private String[] questions = {
        "Java is a language?",
        "What is the capital of France?",
        "Who painted the Mona Lisa?"
    };
    private String[][] options = {
        {"Programming", "English", "Culture"},
        {"Paris", "Berlin", "Rome"},
        {"Leonardo da Vinci", "Michelangelo", "Raphael"}
    };
    private String[] answers = {"Programming", "Paris", "Leonardo da Vinci"};

    public QuizInterface() {
        setTitle("Quiz Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Setup layout and components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 1));
        add(panel);

        nameLabel = new JLabel("Name: ");
        regnoLabel = new JLabel("Reg No: ");
        questionLabel = new JLabel("Question: ");
        questionsLabel = new JLabel("");
        marksLabel = new JLabel("Marks: ");
        timeLabel = new JLabel("Time: ");
        dateLabel = new JLabel("Date: ");

        panel.add(nameLabel);
        panel.add(regnoLabel);
        panel.add(questionLabel);
        panel.add(questionsLabel);
        panel.add(marksLabel);
        panel.add(timeLabel);
        panel.add(dateLabel);

        option1 = new JRadioButton();
        option2 = new JRadioButton();
        option3 = new JRadioButton();
        optionGroup = new ButtonGroup();
        optionGroup.add(option1);
        optionGroup.add(option2);
        optionGroup.add(option3);

        panel.add(option1);
        panel.add(option2);
        panel.add(option3);

        nextButton = new JButton("Next");
        submitButton = new JButton("Submit");
        panel.add(nextButton);
        panel.add(submitButton);

        // Action listeners for buttons
        nextButton.addActionListener(new ActionListener() {
            private int currentQuestion = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentQuestion < questions.length) {
                    questionsLabel.setText(questions[currentQuestion]);
                    option1.setText(options[currentQuestion][0]);
                    option2.setText(options[currentQuestion][1]);
                    option3.setText(options[currentQuestion][2]);
                    currentQuestion++;
                } else {
                    JOptionPane.showMessageDialog(QuizInterface.this, "No more questions");
                }
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Evaluate quiz results
                JOptionPane.showMessageDialog(QuizInterface.this, "Quiz submitted");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuizInterface();
            }
        });
    }
}
