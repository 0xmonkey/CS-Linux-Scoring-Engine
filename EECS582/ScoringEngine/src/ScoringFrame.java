import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;


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
		frame.setBounds(100, 100, 510, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCurrentScore = new JLabel("Current Score:");
		lblCurrentScore.setBounds(10, 10, 103, 27);
		lblCurrentScore.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(lblCurrentScore);
		
		ScoreNumber = new JLabel("#");
		ScoreNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ScoreNumber.setBounds(123, 10, 87, 27);
		frame.getContentPane().add(ScoreNumber);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 41, 202, 32);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblService = new JLabel("SSH");
		lblService.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblService.setBounds(0, 0, 97, 32);
		panel.add(lblService);
		
		JLabel ssh_status = new JLabel("N/A");
		ssh_status.setBounds(107, 0, 85, 32);
		panel.add(ssh_status);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 75, 202, 32);
		frame.getContentPane().add(panel_1);
		
		JLabel lblFtp = new JLabel("FTP");
		lblFtp.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFtp.setBounds(0, 0, 97, 32);
		panel_1.add(lblFtp);
		
		JLabel ftp_status = new JLabel("N/A");
		ftp_status.setBounds(107, 0, 85, 32);
		panel_1.add(ftp_status);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 107, 202, 32);
		frame.getContentPane().add(panel_2);
		
		JLabel lblWww = new JLabel("WWW");
		lblWww.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWww.setBounds(0, 0, 97, 32);
		panel_2.add(lblWww);
		
		JLabel www_status = new JLabel("N/A");
		www_status.setBounds(107, 0, 85, 32);
		panel_2.add(www_status);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(10, 139, 202, 32);
		frame.getContentPane().add(panel_3);
		
		JLabel lblSql = new JLabel("SQL");
		lblSql.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSql.setBounds(0, 0, 97, 32);
		panel_3.add(lblSql);
		
		JLabel sql_status = new JLabel("N/A");
		sql_status.setBounds(107, 0, 85, 32);
		panel_3.add(sql_status);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(10, 172, 202, 32);
		frame.getContentPane().add(panel_4);
		
		JLabel lblDns = new JLabel("DNS");
		lblDns.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDns.setBounds(0, 0, 97, 32);
		panel_4.add(lblDns);
		
		JLabel dns_status = new JLabel("N/A");
		dns_status.setBounds(107, 0, 85, 32);
		panel_4.add(dns_status);
		
		JLabel Log_title = new JLabel("<html>You will see updates for all other scores here!<br>Newest updates will be at the bottom.</html>");
		Log_title.setHorizontalAlignment(SwingConstants.LEFT);
		Log_title.setBounds(222, 41, 262, 27);
		frame.getContentPane().add(Log_title);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(222, 75, 262, 129);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel log_1 = new JLabel("#");
		panel_5.add(log_1);
		
		JLabel log_2 = new JLabel("#");
		panel_5.add(log_2);
		
		JLabel log_3 = new JLabel("#");
		panel_5.add(log_3);
		
		JLabel log_4 = new JLabel("#");
		panel_5.add(log_4);
		
		JLabel log_5 = new JLabel("#");
		panel_5.add(log_5);
		
		JLabel log_6 = new JLabel("#");
		panel_5.add(log_6);
		
		
	}
}
