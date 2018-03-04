import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JMenuBar;

import java.awt.Choice;

import javax.swing.ButtonGroup;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;

import java.awt.GridLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;

import java.awt.SystemColor;
import java.awt.Checkbox;

import javax.swing.JCheckBox;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;


public class MainUI {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

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
		
		JPanel panel_accoutPolicy = new JPanel();
		panel_accoutPolicy.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Account Policy", null, panel_accoutPolicy, null);
		panel_accoutPolicy.setLayout(null);
		
		JLabel lblPasswordPolicy = new JLabel("Password Policy");
		lblPasswordPolicy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPasswordPolicy.setBounds(10, 11, 108, 14);
		panel_accoutPolicy.add(lblPasswordPolicy);
		
		JLabel lblValue = new JLabel("Value");
		lblValue.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblValue.setBounds(213, 11, 46, 14);
		panel_accoutPolicy.add(lblValue);
		
		JLabel lblScoring = new JLabel("Scoring");
		lblScoring.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblScoring.setBounds(415, 11, 46, 14);
		panel_accoutPolicy.add(lblScoring);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 36, 514, 35);
		panel_accoutPolicy.add(panel);
		panel.setLayout(null);
		
		JLabel lblEnforcepolicy = new JLabel("Enforce [policy]");
		lblEnforcepolicy.setBounds(10, 8, 95, 18);
		panel.add(lblEnforcepolicy);
		
		JCheckBox chckbxScoring = new JCheckBox("Scoring");
		chckbxScoring.setBounds(399, 6, 95, 23);
		panel.add(chckbxScoring);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Enabled");
		rdbtnNewRadioButton.setBounds(141, 6, 99, 23);
		panel.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnDisabled = new JRadioButton("Disabled");
		rdbtnDisabled.setBounds(242, 6, 95, 23);
		panel.add(rdbtnDisabled);
		group.add(rdbtnDisabled);
		
		table = new JTable();
		table.setBounds(399, 16, 0, 0);
		panel.add(table);
		table.setBackground(SystemColor.menu);
		
		JPanel panel_installedSoftware = new JPanel();
		panel_installedSoftware.setLayout(null);
		panel_installedSoftware.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Installed Software", null, panel_installedSoftware, null);
		
		JLabel label = new JLabel("Password Policy");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(10, 11, 108, 14);
		panel_installedSoftware.add(label);
		
		JLabel label_1 = new JLabel("Value");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(213, 11, 46, 14);
		panel_installedSoftware.add(label_1);
		
		JLabel label_2 = new JLabel("Scoring");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(415, 11, 46, 14);
		panel_installedSoftware.add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 36, 514, 35);
		panel_installedSoftware.add(panel_2);
		
		JLabel label_3 = new JLabel("Enforce [policy]");
		label_3.setBounds(10, 8, 95, 18);
		panel_2.add(label_3);
		
		JCheckBox checkBox = new JCheckBox("Scoring");
		checkBox.setBounds(399, 6, 95, 23);
		panel_2.add(checkBox);
		
		JRadioButton radioButton = new JRadioButton("Enabled");
		radioButton.setBounds(141, 6, 99, 23);
		panel_2.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Disabled");
		radioButton_1.setBounds(242, 6, 95, 23);
		panel_2.add(radioButton_1);
		
		table_1 = new JTable();
		table_1.setBackground(SystemColor.menu);
		table_1.setBounds(399, 16, 0, 0);
		panel_2.add(table_1);
		
		JPanel panel_localPolicy = new JPanel();
		panel_localPolicy.setLayout(null);
		panel_localPolicy.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Local Policy", null, panel_localPolicy, null);
		
		JLabel label_4 = new JLabel("Password Policy");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(10, 11, 108, 14);
		panel_localPolicy.add(label_4);
		
		JLabel label_5 = new JLabel("Value");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(213, 11, 46, 14);
		panel_localPolicy.add(label_5);
		
		JLabel label_6 = new JLabel("Scoring");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(415, 11, 46, 14);
		panel_localPolicy.add(label_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(10, 36, 514, 35);
		panel_localPolicy.add(panel_3);
		
		JLabel label_7 = new JLabel("Enforce [policy]");
		label_7.setBounds(10, 8, 95, 18);
		panel_3.add(label_7);
		
		JCheckBox checkBox_1 = new JCheckBox("Scoring");
		checkBox_1.setBounds(399, 6, 95, 23);
		panel_3.add(checkBox_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Enabled");
		radioButton_2.setBounds(141, 6, 99, 23);
		panel_3.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Disabled");
		radioButton_3.setBounds(242, 6, 95, 23);
		panel_3.add(radioButton_3);
		
		table_2 = new JTable();
		table_2.setBackground(SystemColor.menu);
		table_2.setBounds(399, 16, 0, 0);
		panel_3.add(table_2);
		
		JPanel panel_services = new JPanel();
		panel_services.setLayout(null);
		panel_services.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.addTab("Services", null, panel_services, null);
		
		JLabel label_8 = new JLabel("Password Policy");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(10, 11, 108, 14);
		panel_services.add(label_8);
		
		JLabel label_9 = new JLabel("Value");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(213, 11, 46, 14);
		panel_services.add(label_9);
		
		JLabel label_10 = new JLabel("Scoring");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_10.setBounds(415, 11, 46, 14);
		panel_services.add(label_10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(10, 36, 514, 35);
		panel_services.add(panel_4);
		
		JLabel label_11 = new JLabel("Enforce [policy]");
		label_11.setBounds(10, 8, 95, 18);
		panel_4.add(label_11);
		
		JCheckBox checkBox_2 = new JCheckBox("Scoring");
		checkBox_2.setBounds(399, 6, 95, 23);
		panel_4.add(checkBox_2);
		
		JRadioButton radioButton_4 = new JRadioButton("Enabled");
		radioButton_4.setBounds(141, 6, 99, 23);
		panel_4.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Disabled");
		radioButton_5.setBounds(242, 6, 95, 23);
		panel_4.add(radioButton_5);
		
		table_3 = new JTable();
		table_3.setBackground(SystemColor.menu);
		table_3.setBounds(399, 16, 0, 0);
		panel_4.add(table_3);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setBounds(0, 0, 80, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File                    ");
		menuBar.add(mnFile);
		
		JMenuItem mntmSaveSettingsAnd = new JMenuItem("Save Settings And Run");
		mnFile.add(mntmSaveSettingsAnd);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
