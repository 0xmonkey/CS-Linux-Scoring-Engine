import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ScrollPaneConstants;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JMenu;


public class ScoringFrame {

	public static JLabel ScoreNumber;
	public static JLabel ssh_status;
	public static JLabel ftp_status;
	public static JLabel www_status;
	public static JLabel sql_status;
	public static JLabel dns_status;
	public static JTextArea textArea;
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
		frame.setBounds(100, 100, 510, 314);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCurrentScore = new JLabel("Current Score:");
		lblCurrentScore.setBounds(10, 29, 103, 27);
		lblCurrentScore.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(lblCurrentScore);
		
		ScoreNumber = new JLabel("#");
		ScoreNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ScoreNumber.setBounds(123, 29, 87, 27);
		frame.getContentPane().add(ScoreNumber);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 59, 202, 32);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblService = new JLabel("SSH");
		lblService.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblService.setBounds(0, 0, 97, 32);
		panel.add(lblService);
		
		ssh_status = new JLabel("N/A");
		ssh_status.setBounds(107, 0, 85, 32);
		panel.add(ssh_status);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 93, 202, 32);
		frame.getContentPane().add(panel_1);
		
		JLabel lblFtp = new JLabel("FTP");
		lblFtp.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFtp.setBounds(0, 0, 97, 32);
		panel_1.add(lblFtp);
		
		ftp_status = new JLabel("N/A");
		ftp_status.setBounds(107, 0, 85, 32);
		panel_1.add(ftp_status);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 125, 202, 32);
		frame.getContentPane().add(panel_2);
		
		JLabel lblWww = new JLabel("WWW");
		lblWww.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWww.setBounds(0, 0, 97, 32);
		panel_2.add(lblWww);
		
		www_status = new JLabel("N/A");
		www_status.setBounds(107, 0, 85, 32);
		panel_2.add(www_status);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(10, 157, 202, 32);
		frame.getContentPane().add(panel_3);
		
		JLabel lblSql = new JLabel("SQL");
		lblSql.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSql.setBounds(0, 0, 97, 32);
		panel_3.add(lblSql);
		
		sql_status = new JLabel("N/A");
		sql_status.setBounds(107, 0, 85, 32);
		panel_3.add(sql_status);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(10, 190, 202, 32);
		frame.getContentPane().add(panel_4);
		
		JLabel lblDns = new JLabel("DNS");
		lblDns.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDns.setBounds(0, 0, 97, 32);
		panel_4.add(lblDns);
		
		dns_status = new JLabel("N/A");
		dns_status.setBounds(107, 0, 85, 32);
		panel_4.add(dns_status);
		
		JLabel Log_title = new JLabel("<html>You will see updates for all other scores here!<br>Newest updates will be at the bottom.</html>");
		Log_title.setHorizontalAlignment(SwingConstants.LEFT);
		Log_title.setBounds(222, 59, 262, 27);
		frame.getContentPane().add(Log_title);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(222, 93, 262, 157);
		frame.getContentPane().add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.BLACK);
		menuBar.setBounds(0, 0, 80, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnQuit = new JMenu("Exit                         ");
		menuBar.add(mnQuit);
		
		JMenuItem mntmQuit = new JMenuItem("Exit");
		mnQuit.add(mntmQuit);
		
		//textArea.append("Sample Text\n");
		//use this to append the logs at the end.
		
	}
}
