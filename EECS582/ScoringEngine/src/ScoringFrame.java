import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;


public class ScoringFrame {

	public static JLabel ScoreNumber;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoringFrame window = new ScoringFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScoringFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 236, 87);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCurrentScore = new JLabel("Current Score:");
		lblCurrentScore.setBounds(10, 10, 103, 27);
		lblCurrentScore.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(lblCurrentScore);
		
		ScoreNumber = new JLabel("");
		ScoreNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ScoreNumber.setBounds(123, 10, 87, 27);
		frame.getContentPane().add(ScoreNumber);
	}
}
