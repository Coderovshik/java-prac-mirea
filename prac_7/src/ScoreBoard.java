import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ScoreBoard
 */
public class ScoreBoard extends JFrame {
    int milanScore = 0;
    int madridScore = 0;
    String lastScorer = "N/A";

    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");

    JLabel resultLabel = new JLabel("Result: 0 X 0");
    JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    Label winnerLabel = new Label("Winner: DRAW");

    private void updateScoreBoard() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
        String winner = milanScore > madridScore ? "AC Milan" : milanScore < madridScore ? "Real Madrid" : "DRAW";
        winnerLabel.setText("Winner: " + winner);
    }

    public ScoreBoard() {
        super("ScoreBoard");

        setSize(640, 360);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        add(milanButton, BorderLayout.WEST);
        add(madridButton, BorderLayout.EAST);
        add(resultLabel, BorderLayout.CENTER);
        add(lastScorerLabel, BorderLayout.SOUTH);
        add(winnerLabel, BorderLayout.NORTH);

        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                milanScore++;
                lastScorer = "AC Milan";
                updateScoreBoard();
            }
        });
        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                madridScore++;
                lastScorer = "Real Madird";
                updateScoreBoard();
            }
        });
    }
    
    public static void main(String[] args) {
        new ScoreBoard().setVisible(true);
    }
}