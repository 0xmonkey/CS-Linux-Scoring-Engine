import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JMenuBar;
import javax.swing.ButtonGroup;
import javax.swing.JTabbedPane;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JRadioButton;

import java.awt.SystemColor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.swing.JCheckBox;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;


public class MainUI {

	private JFrame frame;
	private JTable table;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;
	private JTable table_9;
	private JTextField textField_sudo;
	private final ButtonGroup ssh_anon_login_group = new ButtonGroup();
	private final ButtonGroup ssh_v_2_group = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private JTable table_10;
	private JTextField textField_system;
	private JTable table_11;
	private JTable table_12;
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private JTable table_1;
	private JTextField textField;
	private JTable table_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
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
	public MainUI() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Consolas", Font.PLAIN, 11));
		tabbedPane.setBounds(10, 21, 664, 380);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_ssh = new JPanel();
		panel_ssh.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("SSH", null, panel_ssh, null);
		panel_ssh.setLayout(null);
		
		JLabel lblPasswordPolicy = new JLabel("Setting");
		lblPasswordPolicy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPasswordPolicy.setBounds(10, 11, 108, 14);
		panel_ssh.add(lblPasswordPolicy);
		
		JLabel lblValue = new JLabel("Value");
		lblValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValue.setBounds(213, 11, 46, 14);
		panel_ssh.add(lblValue);
		
		JLabel lblScoring = new JLabel("Scoring");
		lblScoring.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblScoring.setBounds(415, 11, 46, 14);
		panel_ssh.add(lblScoring);
		
		JPanel ssh_service = new JPanel();
		ssh_service.setBounds(10, 36, 514, 35);
		panel_ssh.add(ssh_service);
		ssh_service.setLayout(null);
		
		JLabel ssh_service_text = new JLabel("SSH Service");
		ssh_service_text.setBounds(10, 8, 125, 18);
		ssh_service.add(ssh_service_text);
		
		final JCheckBox ssh_service_scoring = new JCheckBox("Scoring");
		ssh_service_scoring.setBounds(399, 6, 95, 23);
		ssh_service.add(ssh_service_scoring);
		
		ButtonGroup ssh_service_group = new ButtonGroup();
		
		final JRadioButton ssh_service_en = new JRadioButton("Enabled");
		ssh_service_en.setBounds(141, 6, 99, 23);
		ssh_service.add(ssh_service_en);
		ssh_service_group.add(ssh_service_en);
		
		JRadioButton ssh_service_dis = new JRadioButton("Disabled");
		ssh_service_dis.setBounds(242, 6, 95, 23);
		ssh_service.add(ssh_service_dis);
		ssh_service_group.add(ssh_service_dis);
		
		table = new JTable();
		table.setBounds(399, 16, 0, 0);
		ssh_service.add(table);
		table.setBackground(SystemColor.menu);
		
		JPanel anon_login = new JPanel();
		anon_login.setLayout(null);
		anon_login.setBounds(10, 68, 514, 35);
		panel_ssh.add(anon_login);
		
		JLabel lblAnonymousLogin = new JLabel("Anonymous Login");
		lblAnonymousLogin.setBounds(10, 8, 125, 18);
		anon_login.add(lblAnonymousLogin);
		
		JCheckBox anon_login_scoring = new JCheckBox("Scoring");
		anon_login_scoring.setBounds(399, 6, 95, 23);
		anon_login.add(anon_login_scoring);
		
		JRadioButton anon_login_en = new JRadioButton("Enabled");
		ssh_anon_login_group.add(anon_login_en);
		anon_login_en.setBounds(141, 6, 99, 23);
		anon_login.add(anon_login_en);
		
		JRadioButton anon_login_dis = new JRadioButton("Disabled");
		ssh_anon_login_group.add(anon_login_dis);
		anon_login_dis.setBounds(242, 6, 95, 23);
		anon_login.add(anon_login_dis);
		
		table_4 = new JTable();
		table_4.setBackground(SystemColor.menu);
		table_4.setBounds(399, 16, 0, 0);
		anon_login.add(table_4);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 103, 514, 35);
		panel_ssh.add(panel);
		
		JLabel version_2 = new JLabel("Only SSH Version 2");
		version_2.setBounds(10, 8, 125, 18);
		panel.add(version_2);
		
		JCheckBox ssh_v2_scoring = new JCheckBox("Scoring");
		ssh_v2_scoring.setBounds(399, 6, 95, 23);
		panel.add(ssh_v2_scoring);
		
		JRadioButton ssh_v_2_en = new JRadioButton("Enabled");
		ssh_v_2_group.add(ssh_v_2_en);
		ssh_v_2_en.setBounds(141, 6, 99, 23);
		panel.add(ssh_v_2_en);
		
		JRadioButton ssh_v_2_dis = new JRadioButton("Disabled");
		ssh_v_2_group.add(ssh_v_2_dis);
		ssh_v_2_dis.setBounds(242, 6, 95, 23);
		panel.add(ssh_v_2_dis);
		
		table_5 = new JTable();
		table_5.setBackground(SystemColor.menu);
		table_5.setBounds(399, 16, 0, 0);
		panel.add(table_5);
		
		JPanel panel_services = new JPanel();
		panel_services.setLayout(null);
		panel_services.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Services", null, panel_services, null);
		
		JLabel lblService = new JLabel("Service");
		lblService.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblService.setBounds(10, 11, 108, 14);
		panel_services.add(lblService);
		
		JLabel label_9 = new JLabel("Value");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(213, 11, 46, 14);
		panel_services.add(label_9);
		
		JLabel label_10 = new JLabel("Scoring");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(415, 11, 46, 14);
		panel_services.add(label_10);
		
		JPanel panel_ftp = new JPanel();
		panel_ftp.setLayout(null);
		panel_ftp.setBounds(10, 36, 514, 35);
		panel_services.add(panel_ftp);
		
		JLabel lblFtpService = new JLabel("FTP Service");
		lblFtpService.setBounds(10, 8, 95, 18);
		panel_ftp.add(lblFtpService);
		
		JCheckBox checkBox_2 = new JCheckBox("Scoring");
		checkBox_2.setBounds(399, 6, 95, 23);
		panel_ftp.add(checkBox_2);
		
		JRadioButton radioButton_4 = new JRadioButton("Enabled");
		buttonGroup_2.add(radioButton_4);
		radioButton_4.setBounds(141, 6, 99, 23);
		panel_ftp.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Disabled");
		buttonGroup_2.add(radioButton_5);
		radioButton_5.setBounds(242, 6, 95, 23);
		panel_ftp.add(radioButton_5);
		
		table_3 = new JTable();
		table_3.setBackground(SystemColor.menu);
		table_3.setBounds(399, 16, 0, 0);
		panel_ftp.add(table_3);
		
		JPanel panel_sql = new JPanel();
		panel_sql.setLayout(null);
		panel_sql.setBounds(10, 73, 514, 35);
		panel_services.add(panel_sql);
		
		JLabel lblSqlService = new JLabel("SQL Service");
		lblSqlService.setBounds(10, 8, 95, 18);
		panel_sql.add(lblSqlService);
		
		JCheckBox checkBox_5 = new JCheckBox("Scoring");
		checkBox_5.setBounds(399, 6, 95, 23);
		panel_sql.add(checkBox_5);
		
		JRadioButton radioButton_10 = new JRadioButton("Enabled");
		buttonGroup_3.add(radioButton_10);
		radioButton_10.setBounds(141, 6, 99, 23);
		panel_sql.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("Disabled");
		buttonGroup_3.add(radioButton_11);
		radioButton_11.setBounds(242, 6, 95, 23);
		panel_sql.add(radioButton_11);
		
		table_6 = new JTable();
		table_6.setBackground(SystemColor.menu);
		table_6.setBounds(399, 16, 0, 0);
		panel_sql.add(table_6);
		
		JPanel panel_www = new JPanel();
		panel_www.setLayout(null);
		panel_www.setBounds(10, 110, 514, 35);
		panel_services.add(panel_www);
		
		JLabel lblWwwService = new JLabel("WWW Service");
		lblWwwService.setBounds(10, 8, 95, 18);
		panel_www.add(lblWwwService);
		
		JCheckBox checkBox_6 = new JCheckBox("Scoring");
		checkBox_6.setBounds(399, 6, 95, 23);
		panel_www.add(checkBox_6);
		
		JRadioButton radioButton_12 = new JRadioButton("Enabled");
		buttonGroup_4.add(radioButton_12);
		radioButton_12.setBounds(141, 6, 99, 23);
		panel_www.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("Disabled");
		buttonGroup_4.add(radioButton_13);
		radioButton_13.setBounds(242, 6, 95, 23);
		panel_www.add(radioButton_13);
		
		table_7 = new JTable();
		table_7.setBackground(SystemColor.menu);
		table_7.setBounds(399, 16, 0, 0);
		panel_www.add(table_7);
		
		JPanel panel_dns = new JPanel();
		panel_dns.setLayout(null);
		panel_dns.setBounds(10, 148, 514, 35);
		panel_services.add(panel_dns);
		
		JLabel lblDnsService = new JLabel("DNS Service");
		lblDnsService.setBounds(10, 8, 95, 18);
		panel_dns.add(lblDnsService);
		
		JCheckBox checkBox_7 = new JCheckBox("Scoring");
		checkBox_7.setBounds(399, 6, 95, 23);
		panel_dns.add(checkBox_7);
		
		JRadioButton radioButton_14 = new JRadioButton("Enabled");
		buttonGroup_5.add(radioButton_14);
		radioButton_14.setBounds(141, 6, 99, 23);
		panel_dns.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("Disabled");
		buttonGroup_5.add(radioButton_15);
		radioButton_15.setBounds(242, 6, 95, 23);
		panel_dns.add(radioButton_15);
		
		table_8 = new JTable();
		table_8.setBackground(SystemColor.menu);
		table_8.setBounds(399, 16, 0, 0);
		panel_dns.add(table_8);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(10, 186, 514, 35);
		panel_services.add(panel_6);
		
		JLabel lblNetcatBackdoors = new JLabel("Netcat Backdoor Check");
		lblNetcatBackdoors.setBounds(10, 8, 125, 18);
		panel_6.add(lblNetcatBackdoors);
		
		JCheckBox checkBox_11 = new JCheckBox("Scoring");
		checkBox_11.setBounds(399, 6, 95, 23);
		panel_6.add(checkBox_11);
		
		JRadioButton radioButton_18 = new JRadioButton("Enabled");
		buttonGroup_7.add(radioButton_18);
		radioButton_18.setBounds(141, 6, 99, 23);
		panel_6.add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton("Disabled");
		buttonGroup_7.add(radioButton_19);
		radioButton_19.setBounds(242, 6, 95, 23);
		panel_6.add(radioButton_19);
		
		table_12 = new JTable();
		table_12.setBackground(SystemColor.menu);
		table_12.setBounds(399, 16, 0, 0);
		panel_6.add(table_12);
		
		JPanel panel_localPolicy = new JPanel();
		panel_localPolicy.setLayout(null);
		panel_localPolicy.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Local Policy", null, panel_localPolicy, null);
		
		JLabel lblPolicy = new JLabel("Policy");
		lblPolicy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPolicy.setBounds(10, 11, 108, 14);
		panel_localPolicy.add(lblPolicy);
		
		JLabel label_5 = new JLabel("Value");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(273, 11, 46, 14);
		panel_localPolicy.add(label_5);
		
		JLabel label_6 = new JLabel("Scoring");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(415, 11, 46, 14);
		panel_localPolicy.add(label_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(10, 36, 514, 35);
		panel_localPolicy.add(panel_3);
		
		JLabel lblSudoUsersMust = new JLabel("Sudo Users Must Use Passwords");
		lblSudoUsersMust.setBounds(10, 8, 195, 18);
		panel_3.add(lblSudoUsersMust);
		
		JCheckBox checkBox_1 = new JCheckBox("Scoring");
		checkBox_1.setBounds(399, 6, 95, 23);
		panel_3.add(checkBox_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Enabled");
		buttonGroup_6.add(radioButton_2);
		radioButton_2.setBounds(211, 6, 85, 23);
		panel_3.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Disabled");
		buttonGroup_6.add(radioButton_3);
		radioButton_3.setBounds(298, 6, 78, 23);
		panel_3.add(radioButton_3);
		
		table_2 = new JTable();
		table_2.setBackground(SystemColor.menu);
		table_2.setBounds(399, 16, 0, 0);
		panel_3.add(table_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 78, 514, 35);
		panel_localPolicy.add(panel_1);
		
		JLabel lblUserToBe = new JLabel("User to be Removed From Sudo Group");
		lblUserToBe.setBounds(10, 8, 219, 18);
		panel_1.add(lblUserToBe);
		
		JCheckBox checkBox_8 = new JCheckBox("Scoring");
		checkBox_8.setBounds(399, 6, 95, 23);
		panel_1.add(checkBox_8);
		
		table_9 = new JTable();
		table_9.setBackground(SystemColor.menu);
		table_9.setBounds(399, 16, 0, 0);
		panel_1.add(table_9);
		
		textField_sudo = new JTextField();
		textField_sudo.setBounds(239, 7, 86, 20);
		panel_1.add(textField_sudo);
		textField_sudo.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(10, 118, 514, 35);
		panel_localPolicy.add(panel_4);
		
		JLabel lblUserToBe_1 = new JLabel("User to be Removed From System");
		lblUserToBe_1.setBounds(10, 8, 219, 18);
		panel_4.add(lblUserToBe_1);
		
		JCheckBox checkBox_9 = new JCheckBox("Scoring");
		checkBox_9.setBounds(399, 6, 95, 23);
		panel_4.add(checkBox_9);
		
		table_10 = new JTable();
		table_10.setBackground(SystemColor.menu);
		table_10.setBounds(399, 16, 0, 0);
		panel_4.add(table_10);
		
		textField_system = new JTextField();
		textField_system.setColumns(10);
		textField_system.setBounds(239, 7, 86, 20);
		panel_4.add(textField_system);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(10, 157, 514, 35);
		panel_localPolicy.add(panel_5);
		
		JLabel lblEnsureAllUsers = new JLabel("Ensure All Users Have Passwords");
		lblEnsureAllUsers.setBounds(10, 8, 195, 18);
		panel_5.add(lblEnsureAllUsers);
		
		JCheckBox checkBox_10 = new JCheckBox("Scoring");
		checkBox_10.setBounds(399, 6, 95, 23);
		panel_5.add(checkBox_10);
		
		JRadioButton radioButton_16 = new JRadioButton("Enabled");
		radioButton_16.setBounds(211, 6, 85, 23);
		panel_5.add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("Disabled");
		radioButton_17.setBounds(298, 6, 78, 23);
		panel_5.add(radioButton_17);
		
		table_11 = new JTable();
		table_11.setBackground(SystemColor.menu);
		table_11.setBounds(399, 16, 0, 0);
		panel_5.add(table_11);
		
		JPanel panel_misc = new JPanel();
		panel_misc.setLayout(null);
		panel_misc.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Misc", null, panel_misc, null);
		
		JLabel lblPolicy_1 = new JLabel("Policy");
		lblPolicy_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPolicy_1.setBounds(10, 11, 108, 14);
		panel_misc.add(lblPolicy_1);
		
		JLabel label_1 = new JLabel("Value");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(274, 11, 46, 14);
		panel_misc.add(label_1);
		
		JLabel label_2 = new JLabel("Scoring");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(415, 11, 46, 14);
		panel_misc.add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 36, 514, 35);
		panel_misc.add(panel_2);
		
		JLabel lblNoFilesOf = new JLabel("No Files of Specifed Type");
		lblNoFilesOf.setBounds(10, 8, 219, 18);
		panel_2.add(lblNoFilesOf);
		
		JCheckBox checkBox = new JCheckBox("Scoring");
		checkBox.setBounds(399, 6, 95, 23);
		panel_2.add(checkBox);
		
		table_1 = new JTable();
		table_1.setBackground(SystemColor.menu);
		table_1.setBounds(399, 16, 0, 0);
		panel_2.add(table_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(239, 7, 86, 20);
		panel_2.add(textField);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(10, 82, 514, 35);
		panel_misc.add(panel_7);
		
		JLabel lblCheckForMalicious = new JLabel("Check for Malicious Software: nmap, johntheripper, torrent clients...");
		lblCheckForMalicious.setBounds(10, 8, 389, 18);
		panel_7.add(lblCheckForMalicious);
		
		JCheckBox checkBox_12 = new JCheckBox("Scoring");
		checkBox_12.setBounds(399, 6, 95, 23);
		panel_7.add(checkBox_12);
		
		table_13 = new JTable();
		table_13.setBackground(SystemColor.menu);
		table_13.setBounds(399, 16, 0, 0);
		panel_7.add(table_13);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setBounds(0, 0, 80, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File                    ");
		menuBar.add(mnFile);
		
		JMenuItem mntmSaveSettingsAnd = new JMenuItem("Save Settings And Run");
		mnFile.add(mntmSaveSettingsAnd);
		mntmSaveSettingsAnd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae){
				currentSettings object = new currentSettings();
				
				/**
				 * check ssh service check
				 */
				if(ssh_service_en.isSelected() && ssh_service_scoring.isSelected()){
					object.ssh_service_sc = 1;
					object.ssh_service_setting = "enabled";
				}
				else if(!ssh_service_en.isSelected() && ssh_service_scoring.isSelected()){
					object.ssh_service_sc = 1;
					object.ssh_service_setting = "disabled";
				}
				else{
					object.ssh_service_sc = -1;
					object.ssh_service_setting = "null";
				}
				
				System.out.println("Scored?: " + object.ssh_service_sc + " Setting: " + object.ssh_service_setting);
				pythonCall();
			}
		});
	}
	/**
	 * Mid Layer Section
	 */
	private static String path = "./string_script_task.py";
	private static String python = "python3";
	private static ResultHolder resultHolder;
	private final static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	public static void checkServicesLin(int s_type, String pname) {
		try {
			String pythonScriptPath = path; // need installer to determine locations
			String cmd = new String();
			cmd = python + " "; // check version of installed python and what bash command to use (python, py, python3)
			cmd += pythonScriptPath + " " + s_type + " " + pname;
		 
			// create runtime to execute external command
			Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec(cmd);
		 
			// retrieve output from python script
			BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line = "";
			line = bfr.readLine();
			resultHolder = new ResultHolder(line);
			System.out.println("SSH Status: " + resultHolder.getStatusSSH());
//			while((line = bfr.readLine()) != null) {
//			// display each output line form python script
//				resultHolder = new ResultHolder(line);
//				System.out.println("SSH Status: " + resultHolder.getStatusSSH());
//			}
		} catch (IOException err) {
			System.out.println(err.getMessage());
		}
	}
	public static void pythonCall() {
		final Runnable pythonCaller = new Runnable() {
			public void run() { 
				pythonCallManual();
			}
		};
		//Set interval to call script
		final ScheduledFuture<?> pythonCallerHandle = scheduler.scheduleAtFixedRate(pythonCaller, -1, 30, TimeUnit.SECONDS);
	}
	public static void pythonCallManual() {
		checkServicesLin(1, "sshd");
	}
}
