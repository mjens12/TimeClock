package timeClock;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

/**
 * This is the front end of the Time Clock software.
 * All JComponents and Action Listeners are within this class.
 * Action listeners call various classes such as Clock.java
 * and potential dialouge classes. 
 * 
 * Entire GUI (Except for action listeners) was created and generated
 *  using the Eclipse Window Builder PlugIn. 
 * @author Tyler Hay, Freeman Ogburn, Max Jensen
 *
 */
public class TimeClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField wedInHr;
	private JTextField sunInHr;
	private JTextField monInHr;
	private JTextField tuesInHr;
	private JTextField thursInHr;
	private JTextField friInHr;
	private JTextField satInHr;
	private JTextField sunInMin;
	private JTextField monInMin;
	private JTextField tuesInMin;
	private JTextField wedInMin;
	private JTextField thusInMin;
	private JTextField friInMin;
	private JTextField satInMin;
	private JTextField sunOutHr;
	private JTextField monOutHr;
	private JTextField tuesOutHr;
	private JTextField wedOutHr;
	private JTextField thursOutHr;
	private JTextField friOutHr;
	private JTextField satOutHr;
	private JTextField sunOutMin;
	private JTextField monOutMin;
	private JTextField tuesOutMin;
	private JTextField wedOutMin;
	private JTextField thursOutMin;
	private JTextField friOutMin;
	private JTextField satOutMin;
	private JTextField payRateDollars;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeClockGUI frame = new TimeClockGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TimeClockGUI() {
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage
				(TimeClockGUI.class.getResource("/com/sun/javafx/scene/control/skin"
						+ "/caspian/dialog-more-details@2x.png")));
		setTitle("CS350 Punch Clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPunchClock = new JLabel("Punch Clock & Wage Calculator");
		lblPunchClock.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblPunchClock.setBounds(237, 45, 531, 48);
		contentPane.add(lblPunchClock);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSunday.setBounds(48, 257, 80, 37);
		contentPane.add(lblSunday);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMonday.setBounds(48, 312, 80, 37);
		contentPane.add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTuesday.setBounds(48, 362, 90, 37);
		contentPane.add(lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWednesday.setBounds(48, 412, 124, 37);
		contentPane.add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblThursday.setBounds(48, 462, 99, 37);
		contentPane.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFriday.setBounds(48, 512, 69, 37);
		contentPane.add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSaturday.setBounds(48, 562, 98, 25);
		contentPane.add(lblSaturday);
		
		wedInHr = new JTextField();
		wedInHr.setToolTipText("");
		wedInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		wedInHr.setBounds(184, 417, 38, 27);
		contentPane.add(wedInHr);
		wedInHr.setColumns(10);
		
		sunInHr = new JTextField();
		sunInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		sunInHr.setToolTipText("");
		sunInHr.setBounds(184, 267, 38, 27);
		contentPane.add(sunInHr);
		sunInHr.setColumns(10);
		
		monInHr = new JTextField();
		monInHr.setToolTipText("");
		monInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		monInHr.setBounds(184, 317, 38, 27);
		contentPane.add(monInHr);
		monInHr.setColumns(10);
		
		tuesInHr = new JTextField();
		tuesInHr.setToolTipText("");
		tuesInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		tuesInHr.setBounds(184, 367, 38, 27);
		contentPane.add(tuesInHr);
		tuesInHr.setColumns(10);
		
		thursInHr = new JTextField();
		thursInHr.setToolTipText("");
		thursInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		thursInHr.setBounds(184, 467, 38, 27);
		contentPane.add(thursInHr);
		thursInHr.setColumns(10);
		
		friInHr = new JTextField();
		friInHr.setToolTipText("");
		friInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		friInHr.setBounds(184, 517, 38, 27);
		contentPane.add(friInHr);
		friInHr.setColumns(10);
		
		satInHr = new JTextField();
		satInHr.setToolTipText("");
		satInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		satInHr.setBounds(184, 561, 38, 27);
		contentPane.add(satInHr);
		satInHr.setColumns(10);
		
		JLabel sColonLbl = new JLabel(":");
		sColonLbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl.setBounds(225, 267, 16, 16);
		contentPane.add(sColonLbl);
		
		JLabel sColonLbl_2 = new JLabel(":");
		sColonLbl_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_2.setBounds(225, 322, 16, 16);
		contentPane.add(sColonLbl_2);
		
		JLabel sColonLbl_3 = new JLabel(":");
		sColonLbl_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_3.setBounds(225, 372, 16, 16);
		contentPane.add(sColonLbl_3);
		
		JLabel sColonLbl_4 = new JLabel(":");
		sColonLbl_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_4.setBounds(225, 422, 16, 16);
		contentPane.add(sColonLbl_4);
		
		JLabel sColonLbl_5 = new JLabel(":");
		sColonLbl_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_5.setBounds(225, 472, 16, 16);
		contentPane.add(sColonLbl_5);
		
		JLabel sColonLbl_6 = new JLabel(":");
		sColonLbl_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_6.setBounds(225, 522, 16, 16);
		contentPane.add(sColonLbl_6);
		
		JLabel sColonLbl_7 = new JLabel(":");
		sColonLbl_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_7.setBounds(225, 569, 16, 16);
		contentPane.add(sColonLbl_7);
		
		JLabel lblHrIn = new JLabel("Hr");
		lblHrIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHrIn.setBounds(184, 238, 38, 16);
		contentPane.add(lblHrIn);
		
		sunInMin = new JTextField();
		sunInMin.setToolTipText("");
		sunInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		sunInMin.setBounds(237, 267, 38, 27);
		contentPane.add(sunInMin);
		sunInMin.setColumns(10);
		
		JLabel lblMinIn = new JLabel("Min");
		lblMinIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMinIn.setBounds(237, 238, 44, 16);
		contentPane.add(lblMinIn);
		
		monInMin = new JTextField();
		monInMin.setToolTipText("");
		monInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		monInMin.setColumns(10);
		monInMin.setBounds(237, 317, 38, 27);
		contentPane.add(monInMin);
		
		tuesInMin = new JTextField();
		tuesInMin.setToolTipText("");
		tuesInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		tuesInMin.setColumns(10);
		tuesInMin.setBounds(237, 367, 38, 27);
		contentPane.add(tuesInMin);
		
		wedInMin = new JTextField();
		wedInMin.setToolTipText("");
		wedInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		wedInMin.setColumns(10);
		wedInMin.setBounds(237, 417, 38, 27);
		contentPane.add(wedInMin);
		
		thusInMin = new JTextField();
		thusInMin.setToolTipText("");
		thusInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		thusInMin.setColumns(10);
		thusInMin.setBounds(237, 467, 38, 27);
		contentPane.add(thusInMin);
		
		friInMin = new JTextField();
		friInMin.setToolTipText("");
		friInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		friInMin.setColumns(10);
		friInMin.setBounds(237, 517, 38, 27);
		contentPane.add(friInMin);
		
		satInMin = new JTextField();
		satInMin.setToolTipText("");
		satInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		satInMin.setColumns(10);
		satInMin.setBounds(237, 561, 38, 27);
		contentPane.add(satInMin);
		
		JLabel lblClockin = new JLabel("IN");
		lblClockin.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblClockin.setBounds(225, 183, 44, 42);
		contentPane.add(lblClockin);
		
		JComboBox sunInAMPMBox = new JComboBox();
		sunInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		sunInAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		sunInAMPMBox.setBounds(287, 267, 53, 27);
		contentPane.add(sunInAMPMBox);
		
		JComboBox monInAMPMBox = new JComboBox();
		monInAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		monInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		monInAMPMBox.setBounds(287, 317, 53, 27);
		contentPane.add(monInAMPMBox);
		
		JComboBox tuesInAMPMBox = new JComboBox();
		tuesInAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		tuesInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		tuesInAMPMBox.setBounds(287, 367, 53, 27);
		contentPane.add(tuesInAMPMBox);
		
		JComboBox wedInAMPMBox = new JComboBox();
		wedInAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		wedInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		wedInAMPMBox.setBounds(287, 417, 53, 27);
		contentPane.add(wedInAMPMBox);
		
		JComboBox thursInAMPMBox = new JComboBox();
		thursInAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		thursInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		thursInAMPMBox.setBounds(287, 467, 53, 27);
		contentPane.add(thursInAMPMBox);
		
		JComboBox friInAMPMBox = new JComboBox();
		friInAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		friInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		friInAMPMBox.setBounds(287, 519, 53, 27);
		contentPane.add(friInAMPMBox);
		
		JComboBox satInAMPMBox = new JComboBox();
		satInAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		satInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		satInAMPMBox.setBounds(287, 563, 53, 27);
		contentPane.add(satInAMPMBox);
		
		JLabel lblHrOut = new JLabel("Hr");
		lblHrOut.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHrOut.setBounds(382, 238, 38, 16);
		contentPane.add(lblHrOut);
		
		sunOutHr = new JTextField();
		sunOutHr.setToolTipText("");
		sunOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		sunOutHr.setColumns(10);
		sunOutHr.setBounds(382, 267, 38, 27);
		contentPane.add(sunOutHr);
		
		monOutHr = new JTextField();
		monOutHr.setToolTipText("");
		monOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		monOutHr.setColumns(10);
		monOutHr.setBounds(382, 317, 38, 27);
		contentPane.add(monOutHr);
		
		tuesOutHr = new JTextField();
		tuesOutHr.setToolTipText("");
		tuesOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		tuesOutHr.setColumns(10);
		tuesOutHr.setBounds(382, 367, 38, 27);
		contentPane.add(tuesOutHr);
		
		wedOutHr = new JTextField();
		wedOutHr.setToolTipText("");
		wedOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		wedOutHr.setColumns(10);
		wedOutHr.setBounds(382, 417, 38, 27);
		contentPane.add(wedOutHr);
		
		thursOutHr = new JTextField();
		thursOutHr.setToolTipText("");
		thursOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		thursOutHr.setColumns(10);
		thursOutHr.setBounds(382, 467, 38, 27);
		contentPane.add(thursOutHr);
		
		friOutHr = new JTextField();
		friOutHr.setToolTipText("");
		friOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		friOutHr.setColumns(10);
		friOutHr.setBounds(382, 517, 38, 27);
		contentPane.add(friOutHr);
		
		satOutHr = new JTextField();
		satOutHr.setToolTipText("");
		satOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		satOutHr.setColumns(10);
		satOutHr.setBounds(382, 562, 38, 27);
		contentPane.add(satOutHr);
		
		JLabel sColonLbl_8 = new JLabel(":");
		sColonLbl_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_8.setBounds(426, 267, 16, 19);
		contentPane.add(sColonLbl_8);
		
		JLabel sColonLbl_9 = new JLabel(":");
		sColonLbl_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_9.setBounds(426, 312, 16, 29);
		contentPane.add(sColonLbl_9);
		
		JLabel sColonLbl_10 = new JLabel(":");
		sColonLbl_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_10.setBounds(426, 362, 16, 29);
		contentPane.add(sColonLbl_10);
		
		JLabel sColonLbl_11 = new JLabel(":");
		sColonLbl_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_11.setBounds(426, 412, 16, 29);
		contentPane.add(sColonLbl_11);
		
		JLabel sColonLbl_12 = new JLabel(":");
		sColonLbl_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_12.setBounds(426, 462, 16, 29);
		contentPane.add(sColonLbl_12);
		
		JLabel sColonLbl_13 = new JLabel(":");
		sColonLbl_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_13.setBounds(426, 512, 16, 29);
		contentPane.add(sColonLbl_13);
		
		JLabel sColonLbl_14 = new JLabel(":");
		sColonLbl_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl_14.setBounds(426, 562, 16, 23);
		contentPane.add(sColonLbl_14);
		
		JLabel lblMinOut = new JLabel("Min");
		lblMinOut.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMinOut.setBounds(439, 238, 44, 16);
		contentPane.add(lblMinOut);
		
		sunOutMin = new JTextField();
		sunOutMin.setToolTipText("");
		sunOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		sunOutMin.setColumns(10);
		sunOutMin.setBounds(436, 267, 38, 27);
		contentPane.add(sunOutMin);
		
		monOutMin = new JTextField();
		monOutMin.setToolTipText("");
		monOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		monOutMin.setColumns(10);
		monOutMin.setBounds(436, 317, 38, 27);
		contentPane.add(monOutMin);
		
		tuesOutMin = new JTextField();
		tuesOutMin.setToolTipText("");
		tuesOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		tuesOutMin.setColumns(10);
		tuesOutMin.setBounds(436, 367, 38, 27);
		contentPane.add(tuesOutMin);
		
		wedOutMin = new JTextField();
		wedOutMin.setToolTipText("");
		wedOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		wedOutMin.setColumns(10);
		wedOutMin.setBounds(436, 417, 38, 27);
		contentPane.add(wedOutMin);
		
		thursOutMin = new JTextField();
		thursOutMin.setToolTipText("");
		thursOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		thursOutMin.setColumns(10);
		thursOutMin.setBounds(436, 467, 38, 27);
		contentPane.add(thursOutMin);
		
		friOutMin = new JTextField();
		friOutMin.setToolTipText("");
		friOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		friOutMin.setColumns(10);
		friOutMin.setBounds(436, 517, 38, 27);
		contentPane.add(friOutMin);
		
		satOutMin = new JTextField();
		satOutMin.setToolTipText("");
		satOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		satOutMin.setColumns(10);
		satOutMin.setBounds(436, 562, 38, 27);
		contentPane.add(satOutMin);
		
		JComboBox sunOutAMPMBox = new JComboBox();
		sunOutAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		sunOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		sunOutAMPMBox.setBounds(486, 267, 53, 27);
		contentPane.add(sunOutAMPMBox);
		
		JComboBox monOutAMPMBox = new JComboBox();
		monOutAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		monOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		monOutAMPMBox.setBounds(486, 317, 53, 27);
		contentPane.add(monOutAMPMBox);
		
		JComboBox tuesOutAMPMBox = new JComboBox();
		tuesOutAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		tuesOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		tuesOutAMPMBox.setBounds(486, 367, 53, 27);
		contentPane.add(tuesOutAMPMBox);
		
		JComboBox wedOutAMPMBox = new JComboBox();
		wedOutAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		wedOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		wedOutAMPMBox.setBounds(486, 417, 53, 27);
		contentPane.add(wedOutAMPMBox);
		
		JComboBox thursOutAMPMBox = new JComboBox();
		thursOutAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		thursOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		thursOutAMPMBox.setBounds(486, 467, 53, 27);
		contentPane.add(thursOutAMPMBox);
		
		JComboBox friOutAMPMBox = new JComboBox();
		friOutAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		friOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		friOutAMPMBox.setBounds(486, 517, 53, 27);
		contentPane.add(friOutAMPMBox);
		
		JComboBox satOutAMPMBox = new JComboBox();
		satOutAMPMBox.setModel(new DefaultComboBoxModel(new String[] {"AM", "PM"}));
		satOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		satOutAMPMBox.setBounds(486, 560, 53, 27);
		contentPane.add(satOutAMPMBox);
		
		JLabel lblClockout = new JLabel("OUT");
		lblClockout.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblClockout.setBounds(419, 183, 55, 42);
		contentPane.add(lblClockout);
		
		JLabel lblDailyHrs = new JLabel("TIME WORKED");
		lblDailyHrs.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblDailyHrs.setBounds(698, 183, 189, 42);
		contentPane.add(lblDailyHrs);
		
		JLabel lblTotalHrs = new JLabel("WEEKLY TOTAL");
		lblTotalHrs.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTotalHrs.setBounds(698, 617, 211, 42);
		contentPane.add(lblTotalHrs);
		
		JLabel lblGrossDollars = new JLabel("GROSS INCOME");
		lblGrossDollars.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblGrossDollars.setBounds(698, 703, 256, 42);
		contentPane.add(lblGrossDollars);
		
		JLabel lblPayRate = new JLabel("Pay Rate");
		lblPayRate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPayRate.setBounds(48, 623, 98, 25);
		contentPane.add(lblPayRate);
		
		payRateDollars = new JTextField();
		payRateDollars.setToolTipText("");
		payRateDollars.setFont(new Font("Tahoma", Font.BOLD, 20));
		payRateDollars.setColumns(10);
		payRateDollars.setBounds(184, 621, 91, 27);
		contentPane.add(payRateDollars);
		
		JLabel lblPerHr = new JLabel("Per Hour");
		lblPerHr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPerHr.setBounds(282, 625, 69, 25);
		contentPane.add(lblPerHr);
		
		JTextArea taxNotice = new JTextArea();
		taxNotice.setBackground(new Color(135, 206, 250));
		taxNotice.setText("Value calculated in the Net Pay\r\nField is"
				+ " affected by these typical U.S taxes:"
				+ "\r\nFederal Income Tax: 11% of Gross"
				+ "\r\nSocial Security Tax: 6% of Gross"
				+ "\r\nMedicare Tax: 1.45% of Gross");
		taxNotice.setFont(new Font("Arial Black", Font.PLAIN, 10));
		taxNotice.setBounds(693, 865, 261, 88);
		contentPane.add(taxNotice);
		
		JLabel lblWeeklyHrs = new JLabel("Hours");
		lblWeeklyHrs.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWeeklyHrs.setBounds(840, 672, 69, 25);
		contentPane.add(lblWeeklyHrs);
		
		JLabel lblNetPay = new JLabel("NET PAY");
		lblNetPay.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNetPay.setBounds(738, 789, 113, 42);
		contentPane.add(lblNetPay);
		
		JLabel sunTotHrs = new JLabel("");
		sunTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		sunTotHrs.setBackground(new Color(255, 255, 255));
		sunTotHrs.setBounds(738, 267, 99, 27);
		contentPane.add(sunTotHrs);
		
		JLabel monTotHrs = new JLabel("");
		monTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		monTotHrs.setBackground(Color.WHITE);
		monTotHrs.setBounds(738, 312, 99, 27);
		contentPane.add(monTotHrs);
		
		JLabel tuesTotHrs = new JLabel("");
		tuesTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		tuesTotHrs.setBackground(Color.WHITE);
		tuesTotHrs.setBounds(738, 362, 99, 27);
		contentPane.add(tuesTotHrs);
		
		JLabel wedTotHrs = new JLabel("");
		wedTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		wedTotHrs.setBackground(Color.WHITE);
		wedTotHrs.setBounds(738, 412, 99, 27);
		contentPane.add(wedTotHrs);
		
		JLabel thusTotHrs = new JLabel("");
		thusTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		thusTotHrs.setBackground(Color.WHITE);
		thusTotHrs.setBounds(738, 467, 99, 27);
		contentPane.add(thusTotHrs);
		
		JLabel friTotHrs = new JLabel("");
		friTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		friTotHrs.setBackground(Color.WHITE);
		friTotHrs.setBounds(738, 517, 99, 27);
		contentPane.add(friTotHrs);
		
		JLabel satTotHrs = new JLabel("");
		satTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		satTotHrs.setBackground(Color.WHITE);
		satTotHrs.setBounds(738, 561, 99, 27);
		contentPane.add(satTotHrs);
		
		JLabel weekTotHrs = new JLabel("");
		weekTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		weekTotHrs.setBackground(Color.WHITE);
		weekTotHrs.setBounds(738, 663, 99, 27);
		contentPane.add(weekTotHrs);
		
		JLabel weekGrossDollars = new JLabel("");
		weekGrossDollars.setFont(new Font("Tahoma", Font.BOLD, 20));
		weekGrossDollars.setBackground(Color.WHITE);
		weekGrossDollars.setBounds(738, 749, 99, 27);
		contentPane.add(weekGrossDollars);
		
		JLabel weekNetPay = new JLabel("");
		weekNetPay.setFont(new Font("Tahoma", Font.BOLD, 20));
		weekNetPay.setBackground(Color.WHITE);
		weekNetPay.setBounds(738, 825, 99, 27);
		contentPane.add(weekNetPay);
	}
}
