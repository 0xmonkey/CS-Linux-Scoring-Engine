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
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


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
	private JTextField rm_sudo_usr_textBox;
	private final ButtonGroup ssh_anon_login_group = new ButtonGroup();
	private final ButtonGroup ssh_v_2_group = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private JTable table_10;
	private JTextField rm_usr_textBox;
	private JTable table_11;
	private JTable table_12;
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private JTable table_1;
	private JTextField no_files_textBox;
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
		
		final JRadioButton ssh_service_dis = new JRadioButton("Disabled");
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
		
		final JCheckBox anon_login_scoring = new JCheckBox("Scoring");
		anon_login_scoring.setBounds(399, 6, 95, 23);
		anon_login.add(anon_login_scoring);
		
		final JRadioButton anon_login_en = new JRadioButton("Enabled");
		ssh_anon_login_group.add(anon_login_en);
		anon_login_en.setBounds(141, 6, 99, 23);
		anon_login.add(anon_login_en);
		
		final JRadioButton anon_login_dis = new JRadioButton("Disabled");
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
		
		final JCheckBox ssh_v2_scoring = new JCheckBox("Scoring");
		ssh_v2_scoring.setBounds(399, 6, 95, 23);
		panel.add(ssh_v2_scoring);
		
		final JRadioButton ssh_v_2_en = new JRadioButton("Enabled");
		ssh_v_2_group.add(ssh_v_2_en);
		ssh_v_2_en.setBounds(141, 6, 99, 23);
		panel.add(ssh_v_2_en);
		
		final JRadioButton ssh_v_2_dis = new JRadioButton("Disabled");
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
		
		final JCheckBox ftp_scoring = new JCheckBox("Scoring");
		ftp_scoring.setBounds(399, 6, 95, 23);
		panel_ftp.add(ftp_scoring);
		
		final JRadioButton ftp_en = new JRadioButton("Enabled");
		buttonGroup_2.add(ftp_en);
		ftp_en.setBounds(141, 6, 99, 23);
		panel_ftp.add(ftp_en);
		
		final JRadioButton ftp_dis = new JRadioButton("Disabled");
		buttonGroup_2.add(ftp_dis);
		ftp_dis.setBounds(242, 6, 95, 23);
		panel_ftp.add(ftp_dis);
		
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
		
		final JCheckBox sql_scoring = new JCheckBox("Scoring");
		sql_scoring.setBounds(399, 6, 95, 23);
		panel_sql.add(sql_scoring);
		
		final JRadioButton sql_en = new JRadioButton("Enabled");
		buttonGroup_3.add(sql_en);
		sql_en.setBounds(141, 6, 99, 23);
		panel_sql.add(sql_en);
		
		JRadioButton sql_dis = new JRadioButton("Disabled");
		buttonGroup_3.add(sql_dis);
		sql_dis.setBounds(242, 6, 95, 23);
		panel_sql.add(sql_dis);
		
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
		
		final JCheckBox www_scoring = new JCheckBox("Scoring");
		www_scoring.setBounds(399, 6, 95, 23);
		panel_www.add(www_scoring);
		
		final JRadioButton www_en = new JRadioButton("Enabled");
		buttonGroup_4.add(www_en);
		www_en.setBounds(141, 6, 99, 23);
		panel_www.add(www_en);
		
		final JRadioButton www_dis = new JRadioButton("Disabled");
		buttonGroup_4.add(www_dis);
		www_dis.setBounds(242, 6, 95, 23);
		panel_www.add(www_dis);
		
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
		
		final JCheckBox dns_scoring = new JCheckBox("Scoring");
		dns_scoring.setBounds(399, 6, 95, 23);
		panel_dns.add(dns_scoring);
		
		final JRadioButton dns_en = new JRadioButton("Enabled");
		buttonGroup_5.add(dns_en);
		dns_en.setBounds(141, 6, 99, 23);
		panel_dns.add(dns_en);
		
		final JRadioButton dns_dis = new JRadioButton("Disabled");
		buttonGroup_5.add(dns_dis);
		dns_dis.setBounds(242, 6, 95, 23);
		panel_dns.add(dns_dis);
		
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
		
		final JCheckBox netcat_scoring = new JCheckBox("Scoring");
		netcat_scoring.setBounds(399, 6, 95, 23);
		panel_6.add(netcat_scoring);
		
		final JRadioButton netcat_en = new JRadioButton("Enabled");
		buttonGroup_7.add(netcat_en);
		netcat_en.setBounds(141, 6, 99, 23);
		panel_6.add(netcat_en);
		
		final JRadioButton netcat_dis = new JRadioButton("Disabled");
		buttonGroup_7.add(netcat_dis);
		netcat_dis.setBounds(242, 6, 95, 23);
		panel_6.add(netcat_dis);
		
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
		
		final JCheckBox sudo_pw_scoring = new JCheckBox("Scoring");
		sudo_pw_scoring.setBounds(399, 6, 95, 23);
		panel_3.add(sudo_pw_scoring);
		
		final JRadioButton sudo_pw_en = new JRadioButton("Enabled");
		buttonGroup_6.add(sudo_pw_en);
		sudo_pw_en.setBounds(211, 6, 85, 23);
		panel_3.add(sudo_pw_en);
		
		final JRadioButton sudo_pw_dis = new JRadioButton("Disabled");
		buttonGroup_6.add(sudo_pw_dis);
		sudo_pw_dis.setBounds(298, 6, 78, 23);
		panel_3.add(sudo_pw_dis);
		
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
		
		final JCheckBox rm_sudo_usr_scoring = new JCheckBox("Scoring");
		rm_sudo_usr_scoring.setBounds(399, 6, 95, 23);
		panel_1.add(rm_sudo_usr_scoring);
		
		table_9 = new JTable();
		table_9.setBackground(SystemColor.menu);
		table_9.setBounds(399, 16, 0, 0);
		panel_1.add(table_9);
		
		rm_sudo_usr_textBox = new JTextField();
		rm_sudo_usr_textBox.setBounds(239, 7, 86, 20);
		panel_1.add(rm_sudo_usr_textBox);
		rm_sudo_usr_textBox.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(10, 118, 514, 35);
		panel_localPolicy.add(panel_4);
		
		JLabel lblUserToBe_1 = new JLabel("User to be Removed From System");
		lblUserToBe_1.setBounds(10, 8, 219, 18);
		panel_4.add(lblUserToBe_1);
		
		final JCheckBox rm_usr_scoring = new JCheckBox("Scoring");
		rm_usr_scoring.setBounds(399, 6, 95, 23);
		panel_4.add(rm_usr_scoring);
		
		table_10 = new JTable();
		table_10.setBackground(SystemColor.menu);
		table_10.setBounds(399, 16, 0, 0);
		panel_4.add(table_10);
		
		rm_usr_textBox = new JTextField();
		rm_usr_textBox.setColumns(10);
		rm_usr_textBox.setBounds(239, 7, 86, 20);
		panel_4.add(rm_usr_textBox);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(10, 157, 514, 35);
		panel_localPolicy.add(panel_5);
		
		JLabel lblEnsureAllUsers = new JLabel("Ensure All Users Have Passwords");
		lblEnsureAllUsers.setBounds(10, 8, 195, 18);
		panel_5.add(lblEnsureAllUsers);
		
		final JCheckBox all_usr_pass_scoring = new JCheckBox("Scoring");
		all_usr_pass_scoring.setBounds(399, 6, 95, 23);
		panel_5.add(all_usr_pass_scoring);
		
		final JRadioButton all_usr_pass_en = new JRadioButton("Enabled");
		all_usr_pass_en.setBounds(211, 6, 85, 23);
		panel_5.add(all_usr_pass_en);
		
		final JRadioButton all_usr_pass_dis = new JRadioButton("Disabled");
		all_usr_pass_dis.setBounds(298, 6, 78, 23);
		panel_5.add(all_usr_pass_dis);
		
		table_11 = new JTable();
		table_11.setBackground(SystemColor.menu);
		table_11.setBounds(399, 16, 0, 0);
		panel_5.add(table_11);
		
		JPanel panel_passwdPolicy = new JPanel();
		panel_passwdPolicy.setLayout(null);
		panel_passwdPolicy.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Password Policy", null, panel_passwdPolicy, null);
		
		JLabel label = new JLabel("Policy");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(10, 11, 108, 14);
		panel_passwdPolicy.add(label);
		
		JLabel label_3 = new JLabel("Value");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setBounds(273, 11, 46, 14);
		panel_passwdPolicy.add(label_3);
		
		JLabel label_4 = new JLabel("Scoring");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(415, 11, 46, 14);
		panel_passwdPolicy.add(label_4);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(10, 36, 514, 35);
		panel_passwdPolicy.add(panel_10);
		
		JLabel lblCheckUserExists = new JLabel("Check user exists");
		lblCheckUserExists.setBounds(10, 8, 219, 18);
		panel_10.add(lblCheckUserExists);
		
		final JCheckBox user_exists_checkBox = new JCheckBox("Scoring");
		user_exists_checkBox.setBounds(399, 6, 95, 23);
		panel_10.add(user_exists_checkBox);
		
		table_15 = new JTable();
		table_15.setBackground(SystemColor.menu);
		table_15.setBounds(399, 16, 0, 0);
		panel_10.add(table_15);
		
		user_exists_textField = new JTextField();
		user_exists_textField.setColumns(10);
		user_exists_textField.setBounds(239, 7, 86, 20);
		panel_10.add(user_exists_textField);
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setBounds(10, 76, 514, 35);
		panel_passwdPolicy.add(panel_11);
		
		JLabel lblCheckUserFor = new JLabel("Check user for password Set");
		lblCheckUserFor.setBounds(10, 8, 219, 18);
		panel_11.add(lblCheckUserFor);
		
		final JCheckBox usr_password_checkBox = new JCheckBox("Scoring");
		usr_password_checkBox.setBounds(399, 6, 95, 23);
		panel_11.add(usr_password_checkBox);
		
		table_16 = new JTable();
		table_16.setBackground(SystemColor.menu);
		table_16.setBounds(399, 16, 0, 0);
		panel_11.add(table_16);
		
		password_set_textField = new JTextField();
		password_set_textField.setColumns(10);
		password_set_textField.setBounds(239, 7, 86, 20);
		panel_11.add(password_set_textField);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBounds(10, 118, 514, 35);
		panel_passwdPolicy.add(panel_9);
		
		JLabel lblPasswordLengthmin = new JLabel("Password length (Min, Max)");
		lblPasswordLengthmin.setBounds(10, 8, 195, 18);
		panel_9.add(lblPasswordLengthmin);
		
		final JCheckBox pass_length_scoring = new JCheckBox("Scoring");
		pass_length_scoring.setBounds(399, 6, 95, 23);
		panel_9.add(pass_length_scoring);
		
		table_14 = new JTable();
		table_14.setBackground(SystemColor.menu);
		table_14.setBounds(399, 16, 0, 0);
		panel_9.add(table_14);
		
		final JSpinner pass_length_min_spinner = new JSpinner();
		pass_length_min_spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		pass_length_min_spinner.setBounds(215, 7, 57, 20);
		panel_9.add(pass_length_min_spinner);
		
		final JSpinner pass_length_max_spinner = new JSpinner();
		pass_length_max_spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		pass_length_max_spinner.setBounds(305, 7, 57, 20);
		panel_9.add(pass_length_max_spinner);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(10, 159, 514, 35);
		panel_passwdPolicy.add(panel_13);
		
		JLabel lblPasswordTries = new JLabel("Password Tries");
		lblPasswordTries.setBounds(10, 8, 195, 18);
		panel_13.add(lblPasswordTries);
		
		final JCheckBox pass_tries_scoring = new JCheckBox("Scoring");
		pass_tries_scoring.setBounds(399, 6, 95, 23);
		panel_13.add(pass_tries_scoring);
		
		table_18 = new JTable();
		table_18.setBackground(SystemColor.menu);
		table_18.setBounds(399, 16, 0, 0);
		panel_13.add(table_18);
		
		final JSpinner password_tries_spinner = new JSpinner();
		password_tries_spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		password_tries_spinner.setBounds(260, 7, 57, 20);
		panel_13.add(password_tries_spinner);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBounds(10, 200, 514, 35);
		panel_passwdPolicy.add(panel_14);
		
		JLabel lblPasswordExpirationdays = new JLabel("Password expiration (days)");
		lblPasswordExpirationdays.setBounds(10, 8, 195, 18);
		panel_14.add(lblPasswordExpirationdays);
		
		final JCheckBox pass_expiration_scoring = new JCheckBox("Scoring");
		pass_expiration_scoring.setBounds(399, 6, 95, 23);
		panel_14.add(pass_expiration_scoring);
		
		table_19 = new JTable();
		table_19.setBackground(SystemColor.menu);
		table_19.setBounds(399, 16, 0, 0);
		panel_14.add(table_19);
		
		final JSpinner passwd_expr_spinner = new JSpinner();
		passwd_expr_spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		passwd_expr_spinner.setBounds(260, 7, 57, 20);
		panel_14.add(passwd_expr_spinner);
		
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
		
		final JCheckBox no_files_scoring = new JCheckBox("Scoring");
		no_files_scoring.setBounds(399, 6, 95, 23);
		panel_2.add(no_files_scoring);
		
		table_1 = new JTable();
		table_1.setBackground(SystemColor.menu);
		table_1.setBounds(399, 16, 0, 0);
		panel_2.add(table_1);
		
		no_files_textBox = new JTextField();
		no_files_textBox.setColumns(10);
		no_files_textBox.setBounds(239, 7, 86, 20);
		panel_2.add(no_files_textBox);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBounds(10, 82, 514, 35);
		panel_misc.add(panel_7);
		
		JLabel lblCheckForMalicious = new JLabel("Check for Malicious Software: nmap, johntheripper, torrent clients...");
		lblCheckForMalicious.setBounds(10, 8, 389, 18);
		panel_7.add(lblCheckForMalicious);
		
		final JCheckBox mal_software_scoring = new JCheckBox("Scoring");
		mal_software_scoring.setBounds(399, 6, 95, 23);
		panel_7.add(mal_software_scoring);
		
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
					object.ssh_service_sc = true;
					object.ssh_service_setting = "enabled";
				}
				else if(ssh_service_dis.isSelected() && ssh_service_scoring.isSelected()){
					object.ssh_service_sc = true;
					object.ssh_service_setting = "disabled";
				}
				else{
					object.ssh_service_sc = false;
					object.ssh_service_setting = "null";
				}
				
				/*
				 * ssh v2 check
				 */
				if(ssh_v_2_en.isSelected() && ssh_v2_scoring.isSelected()){
					object.ssh_v_2_sc = true;
					object.ssh_v_2_setting = "enabled";
				}
				else if(ssh_v_2_dis.isSelected() && ssh_v2_scoring.isSelected()){
					object.ssh_v_2_sc = true;
					object.ssh_v_2_setting = "disabled";
				}
				else{
					object.ssh_v_2_sc = false;
					object.ssh_v_2_setting = "null";
				}
				
				/*
				 * ssh anon login check
				 */
				
				if(anon_login_scoring.isSelected()){
					object.anon_login_sc = true;
					if(anon_login_en.isSelected()){
						object.anon_login_setting = "enabled";
					}
					else if(anon_login_dis.isSelected()){
						object.anon_login_setting = "disabled";
					}
				}
				else{
					object.anon_login_sc = false;
					object.anon_login_setting = "null";
				}
				
				/*
				 * ftp service check
				 */
				
				if(ftp_scoring.isSelected()){
					object.ftp_service_sc = true;
					if(ftp_en.isSelected()){
						object.ftp_service_setting = "enabled";
					}
					else if(ftp_dis.isSelected()){
						object.ftp_service_setting = "disabled";
					}
				}
				else{
					object.ftp_service_sc = false;
					object.ftp_service_setting = "null";
				}
				
				/*
				 * sql service check
				 */
				
				if(sql_scoring.isSelected()){
					object.sql_service_sc = true;
					if(sql_en.isSelected()){
						object.sql_service_setting = "enabled";
					}
					else if(ftp_dis.isSelected()){
						object.sql_service_setting = "disabled";
					}
				}
				else{
					object.sql_service_sc = false;
					object.sql_service_setting = "null";
				}
				
				/*
				 * www service check
				 */
				
				if(www_scoring.isSelected()){
					object.www_service_sc = true;
					if(www_en.isSelected()){
						object.www_service_setting = "enabled";
					}
					else if(www_dis.isSelected()){
						object.www_service_setting = "disabled";
					}
				}
				else{
					object.www_service_sc = false;
					object.www_service_setting = "null";
				}
				
				/*
				 * dns service check
				 */
				
				if(dns_scoring.isSelected()){
					object.dns_service_sc = true;
					if(dns_en.isSelected()){
						object.dns_service_setting = "enabled";
					}
					else if(www_dis.isSelected()){
						object.dns_service_setting = "disabled";
					}
				}
				else{
					object.dns_service_sc = false;
					object.dns_service_setting = "null";
				}
				
				/*
				 * netcat service check
				 */
				
				if(netcat_scoring.isSelected()){
					object.netcat_backdoor_sc = true;
					if(netcat_en.isSelected()){
						object.netcat_backdoor_setting = "enabled";
					}
					else if(netcat_dis.isSelected()){
						object.netcat_backdoor_setting = "disabled";
					}
				}
				else{
					object.netcat_backdoor_sc = false;
					object.netcat_backdoor_setting = "null";
				}
				
				/*
				 * all sudo users must have passwords
				 */
				
				if(sudo_pw_scoring.isSelected()){
					object.sudo_pw_sc = true;
					if(sudo_pw_en.isSelected()){
						object.sudo_pw_setting = "enabled";
					}
					else if(sudo_pw_dis.isSelected()){
						object.sudo_pw_setting = "disabled";
					}
				}
				else{
					object.sudo_pw_sc = false;
					object.sudo_pw_setting = "null";
				}
				
				/*
				 * remove sudo user
				 */
				
				if(rm_sudo_usr_scoring.isSelected()){
					object.rm_sudo_usr_sc = true;
					object.rm_sudo_usr_setting = rm_sudo_usr_textBox.getText();
				}
				else{
					object.rm_sudo_usr_sc = false;
					object.rm_sudo_usr_setting = "null";
				}
				
				/*
				 * remove user
				 */
				
				if(rm_usr_scoring.isSelected()){
					object.rm_usr_sc = true;
					object.rm_usr_setting = rm_usr_textBox.getText();
				}
				else{
					object.rm_usr_sc = false;
					object.rm_usr_setting = "null";
				}
				
				/*
				 * ensure all users have passwords
				 */
				
				if(all_usr_pass_scoring.isSelected()){
					object.all_usr_pass_sc = true;
					if(all_usr_pass_en.isSelected()){
						object.all_usr_pass_setting = "enabled";
					}
					else if(all_usr_pass_dis.isSelected()){
						object.all_usr_pass_setting = "disabled";
					}
				}
				else{
					object.all_usr_pass_sc = false;
					object.all_usr_pass_setting = "null";
				}
				
				/*
				 * NO FILES OF SPECIFIED TYPE
				 */
				
				if(no_files_scoring.isSelected()){
					object.no_files_sc = true;
					object.no_files_setting = no_files_textBox.getText();
				}
				else{
					object.no_files_sc = false;
					object.no_files_setting = "null";
				}
				
				
				/*
				 * CHECK FOR MALICIOUS SOFTWARE
				 */
				
				if(mal_software_scoring.isSelected()){
					object.mal_software_sc = true;
				}
				else{
					object.mal_software_sc = false;
				}
				
				/*
				 * CHECK FOR USER EXISTS
				 */
				
				if(user_exists_checkBox.isSelected()){
					object.check_user_exists_sc = true;
					object.check_user_exists_setting = user_exists_textField.getText();
				}
				else{
					object.check_user_exists_sc = false;
					object.check_user_exists_setting = "null";
				}
				
				/*
				 * CHECK USER FOR PASSWORD SET
				 */
				
				if(usr_password_checkBox.isSelected()){
					object.check_user_pass_set_sc = true;
					object.check_user_pass_set_setting = password_set_textField.getText();
				}
				else{
					object.check_user_pass_set_sc = false;
					object.check_user_pass_set_setting = "null";
				}
				
				/*
				 * CHECK PASSWORD LENGTH
				 */
				
				if(pass_length_scoring.isSelected()){
					object.passwd_length_sc = true;
					object.passwd_length_min = (Integer)pass_length_min_spinner.getValue();
					object.passwd_length_max = (Integer)pass_length_max_spinner.getValue();
				}
				else{
					object.passwd_length_sc = false;
					object.passwd_length_min = 0;
					object.passwd_length_max = 0;
				}
				
				/*
				 * CHECK PASSWORD TRIES
				 */
				
				if(pass_tries_scoring.isSelected()){
					object.passwd_tries_sc = true;
					object.passwd_tries_setting = (Integer)password_tries_spinner.getValue();
					
				}
				else{
					object.passwd_tries_sc = false;
					object.passwd_tries_setting = 0;
					
				}
				
				/*
				 * CHECK PASSWORD TRIES
				 */
				
				if(pass_expiration_scoring.isSelected()){
					object.passwd_expiration_sc = true;
					object.passwd_expiration_setting = (Integer)passwd_expr_spinner.getValue();
					
				}
				else{
					object.passwd_expiration_sc = false;
					object.passwd_expiration_setting = 0;
					
				}
				
				//pythonCall(object);
				
				ScoringFrame.main(null);
				frame.setVisible(false);
				
				
				//System.out.println("Scored?: " + finalScore + " Setting: " + object.ssh_service_setting);
			}
		});
	}
	/**
	 * Mid Layer Region
	 */
	private static String path = "./string_script_task.py";
	private static String python = "python3";
	private static ResultHolder resultHolder;
	private static float finalScore = 0;
	private static float uptime = 0;
	private final static ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	private JTable table_15;
	private JTextField user_exists_textField;
	private JTable table_16;
	private JTextField password_set_textField;
	private JTable table_14;
	private JTable table_18;
	private JTable table_19;
	public static int checkServicesLin(currentSettings object, String pname) {
		int score = 0;
		try {
			String pythonScriptPath = path; // need installer to determine locations
			String cmd = new String();
			cmd = python + " "; // check version of installed python and what bash command to use (python, py, python3)
			cmd += pythonScriptPath + pname;
			//System.out.println("cmd: " + cmd); //TODO: Remove debug code
		 
			// create runtime to execute external command
			Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec(cmd);
			//System.out.println("exec"); //TODO: Remove debug code
		 
			// retrieve output from python script
			BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line = "";
			resultHolder = new ResultHolder();
			//System.out.println("reading"); //TODO: Remove debug code
			while((line = bfr.readLine()) != null) {
				//System.out.println(line); //TODO: Remove debug code
				resultHolder.parse(line);
			}
			//System.out.println("Done while"); //TODO: Remove debug code
			//TODO: Add up score and display individual results here
			if(resultHolder.getStatusSSH()) {
				score += 1;
				System.out.println("SSH Status: " + resultHolder.getStatusSSH());
			}
			if(resultHolder.getStatusFTP()) {
				score += 1;
				System.out.println("FTP Status: " + resultHolder.getStatusFTP());
			}
			if(resultHolder.getStatusDNS()) {
				score += 1;
				System.out.println("DNS Status: " + resultHolder.getStatusDNS());
			}
			if(resultHolder.getStatusNetcat()) {
				score += 1;
				System.out.println("Netcat Status: " + resultHolder.getStatusNetcat());
			}
			if(resultHolder.getStatusWWW()) {
				score += 1;
				System.out.println("WWW Status: " + resultHolder.getStatusWWW());
			}
			if(resultHolder.getStatusSQL()) {
				score += 1;
				System.out.println("SQL Status: " + resultHolder.getStatusSQL());
			}
			if(resultHolder.getStatusSudoPW()) {
				score += 1;
				System.out.println("Sudo Password Status: " + resultHolder.getStatusSudoPW());
			}
			//System.out.println("Check users?"); //TODO: Remove debug code
			if(!resultHolder.getStatusUsers().isEmpty() && !resultHolder.getStatusUser(object.rm_usr_setting)) {
				//System.out.println("Checking users"); //TODO: Remove debug code
				score += 1;
				System.out.println("Remove User " + object.rm_usr_setting + " Status: " + !resultHolder.getStatusUser(object.rm_usr_setting));
			}
			
			
		} catch (IOException err) {
			System.out.println(err.getMessage());
		}
		return score;
	}
	@SuppressWarnings("unused")
	public static void pythonCall(final currentSettings object) {
		final Runnable pythonCaller = new Runnable() {
			public void run() { 
				// Call python script and output the score
				pythonCallManual(object);
				System.out.println("Score: " + (String.format("%.2f", finalScore/++uptime)));
			}
		};
		//Set interval to call script
		final ScheduledFuture<?> pythonCallerHandle = scheduler.scheduleAtFixedRate(pythonCaller, -1, 30, TimeUnit.SECONDS);
	}
	public static void pythonCallManual(currentSettings object) {
		//TODO: Add services to check here
		String pname = "";
		if(object.ssh_service_sc && object.ssh_service_setting.equals("enabled")) {
			pname += " 1 sshd";
		}
		if(object.ftp_service_sc && object.ftp_service_setting.equals("enabled")) {
			pname += " 1 vsftpd";
		}
		if(object.dns_service_sc && object.dns_service_setting.equals("enabled")) {
			pname += " 1 named";
		}
		if(object.netcat_backdoor_sc && object.netcat_backdoor_setting.equals("enabled")) {
			pname += " 1 netcat";
		}
		if(object.www_service_sc && object.www_service_setting.equals("enabled")) {
			pname += " 1 apache2";
		}
		if(object.sql_service_sc && object.sql_service_setting.equals("enabled")) {
			pname += " 1 mysqld";
		}
		if(object.sudo_pw_sc && object.sudo_pw_setting.equals("enabled")) {
			pname += " 7";
		}
		if(object.rm_usr_sc && !object.rm_usr_setting.equals("")) {
			pname += " 5 " + object.rm_usr_setting;
		}
		finalScore += checkServicesLin(object, pname);
		ScoringFrame.ScoreNumber.setText("finalScore");
	}
}
