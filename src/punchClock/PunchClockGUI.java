package punchClock;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * PunchClockGUI is the main class of the Time Clock software.
 * 
 * This is the front end of the Time Clock software. All JComponents and Action
 * Listeners are within this class. Action listeners call various classes such
 * as Clock.java and potential dialog classes.
 * 
 * Entire GUI (Except for action listeners) was created and generated using the
 * Eclipse Window Builder PlugIn.
 * 
 * @author Tyler Hay, Freeman Ogburn, Max Jensen
 *
 */
public class PunchClockGUI extends JFrame
		implements ActionListener, ItemListener {

	/**
	 * Default serial ID.
	 */
	private static final long serialVersionUID = 1L;

	/** Formatter Object to format doubles 2 decimal spaces. **/
	private static DecimalFormat df = new DecimalFormat("0.00");

	/** JPanel to hold the GUI contents. **/
	private JPanel contentPane;

	/** Menu bar to hold drop down menu. **/
	private JMenuBar menus = new JMenuBar();

	/** Menu to hold optional actions. **/
	private JMenu mainMenu = new JMenu("Main Menu");

	/** Menu Item used to export data as .txt. **/
	private JMenuItem exportItem = new JMenuItem("Export As Text");

	/** Menu Item used to import data from .txt. **/
	private JMenuItem importItem = new JMenuItem("Import From Text");

	/** Menu Item used to reset the Time Punch data. **/
	private JMenuItem resetItem = new JMenuItem("Reset All Fields");

	// JTEXTFIELDS FOR SUN-SAT

	// CLOCK-IN HOUR TEXTFIELDS

	/**
	 * JTextField for user to enter in Sunday clock-in hour.
	 */
	private JTextField sunInHr;

	/**
	 * JTextField for user to enter in Monday clock-in hour.
	 */
	private JTextField monInHr;

	/**
	 * JTextField for user to enter in Tuesday clock-in hour.
	 */
	private JTextField tuesInHr;

	/**
	 * JTextField for user to enter in Wednesday clock-in hour.
	 */
	private JTextField wedInHr;

	/**
	 * JTextField for user to enter in Thursday clock-in hour.
	 */
	private JTextField thursInHr;

	/**
	 * JTextField for user to enter in Friday clock-in hour.
	 */
	private JTextField friInHr;

	/**
	 * JTextField for user to enter in Saturday clock-in hour.
	 */
	private JTextField satInHr;

	// CLOCK IN MINUTE TEXTFIELDS
	/**
	 * JTextField for user to enter in Sunday clock-in hour.
	 */
	private JTextField sunInMin;

	/**
	 * JTextField for user to enter in Monday clock-in minute.
	 */
	private JTextField monInMin;

	/**
	 * JTextField for user to enter in Tuesday clock-in minute.
	 */
	private JTextField tuesInMin;

	/**
	 * JTextField for user to enter in Wednesday clock-in minute.
	 */
	private JTextField wedInMin;

	/**
	 * JTextField for user to enter in Thursday clock-in minute.
	 */
	private JTextField thusInMin;

	/**
	 * JTextField for user to enter in Friday clock-in minute.
	 */
	private JTextField friInMin;

	/**
	 * JTextField for user to enter in Saturday clock-in minute.
	 */
	private JTextField satInMin;

	// CLOCK-OUT HOUR TEXTFIELDS
	/**
	 * JTextField for user to enter in Sunday clock-out hour.
	 */
	private JTextField sunOutHr;

	/**
	 * JTextField for user to enter in Monday clock-out hour.
	 */
	private JTextField monOutHr;

	/**
	 * JTextField for user to enter in Tuesday clock-out hour.
	 */
	private JTextField tuesOutHr;

	/**
	 * JTextField for user to enter in Wednesday clock-out hour.
	 */
	private JTextField wedOutHr;

	/**
	 * JTextField for user to enter in Thursday clock-out hour.
	 */
	private JTextField thursOutHr;

	/**
	 * JTextField for user to enter in Friday clock-out hour.
	 */
	private JTextField friOutHr;

	/**
	 * JTextField for user to enter in Saturday clock-out hour.
	 */
	private JTextField satOutHr;

	// CLOCK OUT MINUTE TEXTFIELDS
	/**
	 * JTextField for user to enter in Sunday clock-out minute.
	 */
	private JTextField sunOutMin;

	/**
	 * JTextField for user to enter in Monday clock-out minute.
	 */
	private JTextField monOutMin;

	/**
	 * JTextField for user to enter in Tuesday clock-out minute.
	 */
	private JTextField tuesOutMin;

	/**
	 * JTextField for user to enter in Wednesday clock-out minute.
	 */
	private JTextField wedOutMin;

	/**
	 * JTextField for user to enter in Thursday clock-out minute.
	 */
	private JTextField thursOutMin;

	/**
	 * JTextField for user to enter in Friday clock-out minute.
	 */
	private JTextField friOutMin;

	/**
	 * JTextField for user to enter in Saturday clock-out minute.
	 */
	private JTextField satOutMin;

	/**
	 * JTextField for user to enter in their pay rate.
	 */
	private JTextField payRateDollars;

	/** JLabel for clock-out section. **/
	private JLabel lblClockout = new JLabel("OUT");

	/** JLabel for Time Worked Section. **/
	private JLabel lblDailyHrs = new JLabel("TIME WORKED");

	/** JLabel for weekly total hours. **/
	private JLabel lblTotalHrs = new JLabel("WEEKLY TOTAL");

	/** JLabel for weekly gross income. **/
	private JLabel lblGrossDollars = new JLabel("GROSS INCOME");

	/** JLabel for pay rate. **/
	private JLabel lblPayRate = new JLabel("Pay Rate");

	/** JLabel for pay rate per hour. **/
	private JLabel lblPerHr = new JLabel("Per Hour");

	/** JLabel for ":" in hour format. **/
	private JLabel sColonLbl8 = new JLabel(":");

	/** JLabel for ":" in hour format. **/
	private JLabel sColonLbl9 = new JLabel(":");

	/** JLabel for ":" in hour format. **/
	private JLabel sColonLbl10 = new JLabel(":");

	/** JLabel for ":" in hour format. **/
	private JLabel sColonLbl11 = new JLabel(":");

	/** JLabel for ":" in hour format. **/
	private JLabel sColonLbl12 = new JLabel(":");

	/** JLabel for ":" in hour format. **/
	private JLabel sColonLbl13 = new JLabel(":");

	/** JLabel for ":" in hour format. **/
	private JLabel sColonLbl14 = new JLabel(":");

	/** JLabel for clock-out minute section. **/
	private JLabel lblMinOut = new JLabel("Min");

	/** JLabel for weekly hours section. **/
	private JLabel lblWeeklyHrs = new JLabel("Hours");

	/** JLabel for net pay. **/
	private JLabel lblNetPay = new JLabel("NET PAY");

	/** JLabel that updates with weekly total hours. **/
	private JLabel weekTotHrs = new JLabel("");

	/** JLabel that updates with weekly gross income. **/
	private JLabel weekGrossDollars = new JLabel("");

	/** JLabel that updates with weekly net pay. **/
	private JLabel weekNetPay = new JLabel("");

	/** JComboBox for Sunday clock-in AM/PM choice. **/
	private JComboBox<String> sunInAMPMBox = new JComboBox<String>();

	/** JComboBox for Monday clock-in AM/PM choice. **/
	private JComboBox<String> monInAMPMBox = new JComboBox<String>();

	/** JComboBox for Tuesday clock-in AM/PM choice. **/
	private JComboBox<String> tuesInAMPMBox = new JComboBox<String>();

	/** JComboBox for Wednesday clock-in AM/PM choice. **/
	private JComboBox<String> wedInAMPMBox = new JComboBox<String>();

	/** JComboBox for Thursday clock-in AM/PM choice. **/
	private JComboBox<String> thursInAMPMBox = new JComboBox<String>();

	/** JComboBox for Friday clock-in AM/PM choice. **/
	private JComboBox<String> friInAMPMBox = new JComboBox<String>();

	/** JComboBox for Saturday clock-in AM/PM choice. **/
	private JComboBox<String> satInAMPMBox = new JComboBox<String>();

	/** JComboBox for Sunday clock-out AM/PM choice. **/
	private JComboBox<String> sunOutAMPMBox = new JComboBox<String>();

	/** JComboBox for Monday clock-out AM/PM choice. **/
	private JComboBox<String> monOutAMPMBox = new JComboBox<String>();

	/** JComboBox for Tuesday clock-out AM/PM choice. **/
	private JComboBox<String> tuesOutAMPMBox = new JComboBox<String>();

	/** JComboBox for Wednesday clock-out AM/PM choice. **/
	private JComboBox<String> wedOutAMPMBox = new JComboBox<String>();

	/** JComboBox for Thursday clock-out AM/PM choice. **/
	private JComboBox<String> thursOutAMPMBox = new JComboBox<String>();

	/** JComboBox for Friday clock-out AM/PM choice. **/
	private JComboBox<String> friOutAMPMBox = new JComboBox<String>();

	/** JComboBox for Saturday clock-out AM/PM choice. **/
	private JComboBox<String> satOutAMPMBox = new JComboBox<String>();

	/** JLabel that updates with Sunday total hours. **/
	private JLabel sunTotHrs = new JLabel("");

	/** JLabel that updates with Monday total hours. **/
	private JLabel monTotHrs = new JLabel("");

	/** JLabel that updates with Tuesday total hours. **/
	private JLabel tuesTotHrs = new JLabel("");

	/** JLabel that updates with Wednesday total hours. **/
	private JLabel wedTotHrs = new JLabel("");

	/** JLabel that updates with Thursday total hours. **/
	private JLabel thusTotHrs = new JLabel("");

	/** JLabel that updates with Friday total hours. **/
	private JLabel friTotHrs = new JLabel("");

	/** JLabel that updates with Saturday total hours. **/
	private JLabel satTotHrs = new JLabel("");

	/** JButton that allows user to enter in all given inputs. **/
	private JButton enterButton = new JButton("Enter");

	/** JCheckBox to enable/disable overtime. **/
	private final JCheckBox overtimeCheckBox = new JCheckBox("");

	/** JCheckBox to Enable/Disable Sunday. **/
	private final JCheckBox sunCheckBox = new JCheckBox("");

	/** JCheckBox to Enable/Disable Monday. **/
	private final JCheckBox monCheckBox = new JCheckBox("");

	/** JCheckBox to Enable/Disable Tuesday. **/
	private final JCheckBox tuesCheckBox = new JCheckBox("");

	/** JCheckBox to Enable/Disable Wednesday. **/
	private final JCheckBox wedCheckBox = new JCheckBox("");

	/** JCheckBox to Enable/Disable Thursday. **/
	private final JCheckBox thursCheckBox = new JCheckBox("");

	/** JCheckBox to Enable/Disable Friday. **/
	private final JCheckBox friCheckBox = new JCheckBox("");

	/** JCheckBox to Enable/Disable Saturday. **/
	private final JCheckBox satCheckBox = new JCheckBox("");

	/** Week object for time calculations. **/
	private Week week = new Week();

	/** Money object for currency calculations. **/
	private Money money = new Money();

	/** JTextField for Federal Tax. **/
	private JTextField federalBox;

	/** JTextField for Social Security Tax. **/
	private JTextField socialBox;

	/** JTextField for Medicare Tax. **/
	private JTextField medicareBox;

	/** JTextField for State Income Tax. **/
	private JTextField stateBox;

	/** JLable for Medicare Tax. **/
	private final JLabel lblMedicareTax = new JLabel("Medicare Tax");

	/** JLabel for State Income Tax. **/
	private final JLabel lblStateTax1 = new JLabel("State Tax");

	/** JLabel for Social Security Tax. **/
	private final JLabel lblSocialSecurityTax = new JLabel(
			"Social Security Tax");

	/** JLabel for Federal Tax. **/
	private final JLabel lblFederalTax = new JLabel("Federal Tax");

	/**
	 * Main method that launches the GUI.
	 * 
	 * @param args
	 *            default argument
	 */
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PunchClockGUI frame = new PunchClockGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Getter method for payRateDollars JTextfield. method is needed for JUnits
	 * tests
	 * 
	 * @return JTextfield for payRateDollars.
	 */
	public JTextField getPayRateDollars() {
		return payRateDollars;
	}

	/**
	 * setter method for payRateDollars JTextField. method is needed for JUnit tests
	 * 
	 * @param payRateDollars
	 *            JTextField containing a string value.
	 */
	public void setPayRateDollars(final JTextField payRateDollars) {
		this.payRateDollars = payRateDollars;
	}

	public double getFederalBox() {
		return Double.parseDouble(federalBox.getText());
	}

	public double getMedBox() {
		return Double.parseDouble(medicareBox.getText());
	}

	public double getSocBox() {
		return Double.parseDouble(socialBox.getText());
	}

	public double getStateBox() {
		return Double.parseDouble(stateBox.getText());
	}

	/**
	 * Constructor for PunchClockGUI.
	 */
	public PunchClockGUI() {

		// Array to hold values for AM/PM JComboBox
		String[] stringAMPM = { "AM", "PM" };

		// Array to hold list of currencies.
		String[] currencyList = { "United States Dollar (USD)(US$)",
				"Euro (EUR)(\u20AC)", "Japanese Yen (JPY)(\u00A5)",
				"Pound Sterling (GBP)(\u00A3)",
				"Australian Dollar (AUD)(A$)",
				"Canadian Dollar (CAD) (C$)",
				"Mexican Peso (MXN)($)" };

		setBackground(new Color(255, 255, 255));

		setTitle("CS350 Punch Clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		mainMenu.add(exportItem);
		mainMenu.add(importItem);
		mainMenu.add(resetItem);

		menus.add(mainMenu);

		setJMenuBar(menus);

		JLabel lblPunchClock = new JLabel(
				"Punch Clock & Wage Calculator");
		lblPunchClock.setFont(
				new Font("Arial Rounded MT Bold", Font.BOLD, 30));
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
		wedInHr.setText("12");
		wedInHr.setToolTipText("");
		wedInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		wedInHr.setBounds(184, 417, 38, 27);
		contentPane.add(wedInHr);
		wedInHr.setColumns(10);

		sunInHr = new JTextField();
		sunInHr.setText("12");
		sunInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		sunInHr.setToolTipText("");
		sunInHr.setBounds(184, 267, 38, 27);
		contentPane.add(sunInHr);
		sunInHr.setColumns(10);

		monInHr = new JTextField();
		monInHr.setText("12");
		monInHr.setToolTipText("");
		monInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		monInHr.setBounds(184, 317, 38, 27);
		contentPane.add(monInHr);
		monInHr.setColumns(10);

		tuesInHr = new JTextField();
		tuesInHr.setText("12");
		tuesInHr.setToolTipText("");
		tuesInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		tuesInHr.setBounds(184, 367, 38, 27);
		contentPane.add(tuesInHr);
		tuesInHr.setColumns(10);

		thursInHr = new JTextField();
		thursInHr.setText("12");
		thursInHr.setToolTipText("");
		thursInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		thursInHr.setBounds(184, 467, 38, 27);
		contentPane.add(thursInHr);
		thursInHr.setColumns(10);

		friInHr = new JTextField();
		friInHr.setText("12");
		friInHr.setToolTipText("");
		friInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		friInHr.setBounds(184, 517, 38, 27);
		contentPane.add(friInHr);
		friInHr.setColumns(10);

		satInHr = new JTextField();
		satInHr.setText("12");
		satInHr.setToolTipText("");
		satInHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		satInHr.setBounds(184, 561, 38, 27);
		contentPane.add(satInHr);
		satInHr.setColumns(10);

		JLabel sColonLbl = new JLabel(":");
		sColonLbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl.setBounds(225, 267, 16, 16);
		contentPane.add(sColonLbl);

		JLabel sColonLbl2 = new JLabel(":");
		sColonLbl2.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl2.setBounds(225, 322, 16, 16);
		contentPane.add(sColonLbl2);

		JLabel sColonLbl3 = new JLabel(":");
		sColonLbl3.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl3.setBounds(225, 372, 16, 16);
		contentPane.add(sColonLbl3);

		JLabel sColonLbl4 = new JLabel(":");
		sColonLbl4.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl4.setBounds(225, 422, 16, 16);
		contentPane.add(sColonLbl4);

		JLabel sColonLbl5 = new JLabel(":");
		sColonLbl5.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl5.setBounds(225, 472, 16, 16);
		contentPane.add(sColonLbl5);

		JLabel sColonLbl6 = new JLabel(":");
		sColonLbl6.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl6.setBounds(225, 522, 16, 16);
		contentPane.add(sColonLbl6);

		JLabel sColonLbl7 = new JLabel(":");
		sColonLbl7.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl7.setBounds(225, 569, 16, 16);
		contentPane.add(sColonLbl7);

		JLabel lblHrIn = new JLabel("Hr");
		lblHrIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHrIn.setBounds(184, 238, 38, 16);
		contentPane.add(lblHrIn);

		sunInMin = new JTextField();
		sunInMin.setText("00"); // initial minutes set to 00
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
		monInMin.setText("00");
		monInMin.setToolTipText("");
		monInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		monInMin.setColumns(10);
		monInMin.setBounds(237, 317, 38, 27);
		contentPane.add(monInMin);

		tuesInMin = new JTextField();
		tuesInMin.setText("00");
		tuesInMin.setToolTipText("");
		tuesInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		tuesInMin.setColumns(10);
		tuesInMin.setBounds(237, 367, 38, 27);
		contentPane.add(tuesInMin);

		wedInMin = new JTextField();
		wedInMin.setText("00");
		wedInMin.setToolTipText("");
		wedInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		wedInMin.setColumns(10);
		wedInMin.setBounds(237, 417, 38, 27);
		contentPane.add(wedInMin);

		thusInMin = new JTextField();
		thusInMin.setText("00");
		thusInMin.setToolTipText("");
		thusInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		thusInMin.setColumns(10);
		thusInMin.setBounds(237, 467, 38, 27);
		contentPane.add(thusInMin);

		friInMin = new JTextField();
		friInMin.setText("00");
		friInMin.setToolTipText("");
		friInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		friInMin.setColumns(10);
		friInMin.setBounds(237, 517, 38, 27);
		contentPane.add(friInMin);

		satInMin = new JTextField();
		satInMin.setText("00");
		satInMin.setToolTipText("");
		satInMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		satInMin.setColumns(10);
		satInMin.setBounds(237, 561, 38, 27);
		contentPane.add(satInMin);

		JLabel lblClockin = new JLabel("IN");
		lblClockin.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblClockin.setBounds(225, 183, 44, 42);
		contentPane.add(lblClockin);

		sunInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		sunInAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		sunInAMPMBox.setBounds(287, 267, 53, 27);
		contentPane.add(sunInAMPMBox);

		monInAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		monInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		monInAMPMBox.setBounds(287, 317, 53, 27);
		contentPane.add(monInAMPMBox);

		tuesInAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		tuesInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		tuesInAMPMBox.setBounds(287, 367, 53, 27);
		contentPane.add(tuesInAMPMBox);

		wedInAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		wedInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		wedInAMPMBox.setBounds(287, 417, 53, 27);
		contentPane.add(wedInAMPMBox);

		thursInAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		thursInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		thursInAMPMBox.setBounds(287, 467, 53, 27);
		contentPane.add(thursInAMPMBox);

		friInAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		friInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		friInAMPMBox.setBounds(287, 519, 53, 27);
		contentPane.add(friInAMPMBox);

		satInAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		satInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		satInAMPMBox.setBounds(287, 563, 53, 27);
		contentPane.add(satInAMPMBox);

		enterButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		enterButton.setBounds(392, 672, 256, 53);
		contentPane.add(enterButton);

		JLabel lblHrOut = new JLabel("Hr");
		lblHrOut.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHrOut.setBounds(382, 238, 38, 16);
		contentPane.add(lblHrOut);

		sunOutHr = new JTextField();
		sunOutHr.setText("12");
		sunOutHr.setToolTipText("");
		sunOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		sunOutHr.setColumns(10);
		sunOutHr.setBounds(382, 267, 38, 27);
		contentPane.add(sunOutHr);

		monOutHr = new JTextField();
		monOutHr.setText("12");
		monOutHr.setToolTipText("");
		monOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		monOutHr.setColumns(10);
		monOutHr.setBounds(382, 317, 38, 27);
		contentPane.add(monOutHr);

		tuesOutHr = new JTextField();
		tuesOutHr.setText("12");
		tuesOutHr.setToolTipText("");
		tuesOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		tuesOutHr.setColumns(10);
		tuesOutHr.setBounds(382, 367, 38, 27);
		contentPane.add(tuesOutHr);

		wedOutHr = new JTextField();
		wedOutHr.setText("12");
		wedOutHr.setToolTipText("");
		wedOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		wedOutHr.setColumns(10);
		wedOutHr.setBounds(382, 417, 38, 27);
		contentPane.add(wedOutHr);

		thursOutHr = new JTextField();
		thursOutHr.setText("12");
		thursOutHr.setToolTipText("");
		thursOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		thursOutHr.setColumns(10);
		thursOutHr.setBounds(382, 467, 38, 27);
		contentPane.add(thursOutHr);

		friOutHr = new JTextField();
		friOutHr.setText("12");
		friOutHr.setToolTipText("");
		friOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		friOutHr.setColumns(10);
		friOutHr.setBounds(382, 517, 38, 27);
		contentPane.add(friOutHr);

		satOutHr = new JTextField();
		satOutHr.setText("12");
		satOutHr.setToolTipText("");
		satOutHr.setFont(new Font("Tahoma", Font.BOLD, 20));
		satOutHr.setColumns(10);
		satOutHr.setBounds(382, 562, 38, 27);
		contentPane.add(satOutHr);

		sColonLbl8.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl8.setBounds(426, 267, 16, 19);
		contentPane.add(sColonLbl8);

		sColonLbl9.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl9.setBounds(426, 312, 16, 29);
		contentPane.add(sColonLbl9);

		sColonLbl10.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl10.setBounds(426, 362, 16, 29);
		contentPane.add(sColonLbl10);

		sColonLbl11.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl11.setBounds(426, 412, 16, 29);
		contentPane.add(sColonLbl11);

		sColonLbl12.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl12.setBounds(426, 462, 16, 29);
		contentPane.add(sColonLbl12);

		sColonLbl13.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl13.setBounds(426, 512, 16, 29);
		contentPane.add(sColonLbl13);

		sColonLbl14.setFont(new Font("Tahoma", Font.BOLD, 20));
		sColonLbl14.setBounds(426, 562, 16, 23);
		contentPane.add(sColonLbl14);

		lblMinOut.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMinOut.setBounds(439, 238, 44, 16);
		contentPane.add(lblMinOut);

		sunOutMin = new JTextField();
		sunOutMin.setText("00");
		sunOutMin.setToolTipText("");
		sunOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		sunOutMin.setColumns(10);
		sunOutMin.setBounds(436, 267, 38, 27);
		contentPane.add(sunOutMin);

		monOutMin = new JTextField();
		monOutMin.setText("00");
		monOutMin.setToolTipText("");
		monOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		monOutMin.setColumns(10);
		monOutMin.setBounds(436, 317, 38, 27);
		contentPane.add(monOutMin);

		tuesOutMin = new JTextField();
		tuesOutMin.setText("00");
		tuesOutMin.setToolTipText("");
		tuesOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		tuesOutMin.setColumns(10);
		tuesOutMin.setBounds(436, 367, 38, 27);
		contentPane.add(tuesOutMin);

		wedOutMin = new JTextField();
		wedOutMin.setText("00");
		wedOutMin.setToolTipText("");
		wedOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		wedOutMin.setColumns(10);
		wedOutMin.setBounds(436, 417, 38, 27);
		contentPane.add(wedOutMin);

		thursOutMin = new JTextField();
		thursOutMin.setText("00");
		thursOutMin.setToolTipText("");
		thursOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		thursOutMin.setColumns(10);
		thursOutMin.setBounds(436, 467, 38, 27);
		contentPane.add(thursOutMin);

		friOutMin = new JTextField();
		friOutMin.setText("00");
		friOutMin.setToolTipText("");
		friOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		friOutMin.setColumns(10);
		friOutMin.setBounds(436, 517, 38, 27);
		contentPane.add(friOutMin);

		satOutMin = new JTextField();
		satOutMin.setText("00");
		satOutMin.setToolTipText("");
		satOutMin.setFont(new Font("Tahoma", Font.BOLD, 20));
		satOutMin.setColumns(10);
		satOutMin.setBounds(436, 562, 38, 27);
		contentPane.add(satOutMin);

		sunOutAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		sunOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		sunOutAMPMBox.setBounds(486, 267, 53, 27);
		contentPane.add(sunOutAMPMBox);

		monOutAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		monOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		monOutAMPMBox.setBounds(486, 317, 53, 27);
		contentPane.add(monOutAMPMBox);

		tuesOutAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		tuesOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		tuesOutAMPMBox.setBounds(486, 367, 53, 27);
		contentPane.add(tuesOutAMPMBox);

		wedOutAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		wedOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		wedOutAMPMBox.setBounds(486, 417, 53, 27);
		contentPane.add(wedOutAMPMBox);

		thursOutAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		thursOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		thursOutAMPMBox.setBounds(486, 467, 53, 27);
		contentPane.add(thursOutAMPMBox);

		friOutAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		friOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		friOutAMPMBox.setBounds(486, 517, 53, 27);
		contentPane.add(friOutAMPMBox);

		satOutAMPMBox.setModel(
				new DefaultComboBoxModel<String>(stringAMPM));
		satOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		satOutAMPMBox.setBounds(486, 560, 53, 27);
		contentPane.add(satOutAMPMBox);

		lblClockout.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblClockout.setBounds(419, 183, 55, 42);
		contentPane.add(lblClockout);

		lblDailyHrs.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblDailyHrs.setBounds(698, 183, 189, 42);
		contentPane.add(lblDailyHrs);

		lblTotalHrs.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTotalHrs.setBounds(698, 617, 211, 42);
		contentPane.add(lblTotalHrs);

		lblGrossDollars.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblGrossDollars.setBounds(698, 703, 256, 42);
		contentPane.add(lblGrossDollars);

		lblPayRate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPayRate.setBounds(48, 623, 98, 25);
		contentPane.add(lblPayRate);

		setPayRateDollars(new JTextField());
		getPayRateDollars().setText("10.00");
		getPayRateDollars().setToolTipText("");
		getPayRateDollars()
				.setFont(new Font("Tahoma", Font.BOLD, 20));
		getPayRateDollars().setColumns(10);
		getPayRateDollars().setBounds(184, 621, 91, 27);
		contentPane.add(getPayRateDollars());

		lblPerHr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPerHr.setBounds(282, 625, 69, 25);
		contentPane.add(lblPerHr);

		lblWeeklyHrs.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWeeklyHrs.setBounds(840, 672, 69, 25);
		contentPane.add(lblWeeklyHrs);

		lblNetPay.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNetPay.setBounds(738, 789, 113, 42);
		contentPane.add(lblNetPay);

		sunTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		sunTotHrs.setBackground(new Color(255, 255, 255));
		sunTotHrs.setOpaque(true);
		sunTotHrs.setBounds(738, 267, 99, 27);
		contentPane.add(sunTotHrs);

		monTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		monTotHrs.setBackground(Color.WHITE);
		monTotHrs.setOpaque(true);
		monTotHrs.setBounds(738, 312, 99, 27);
		contentPane.add(monTotHrs);

		tuesTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		tuesTotHrs.setBackground(Color.WHITE);
		tuesTotHrs.setOpaque(true);
		tuesTotHrs.setBounds(738, 362, 99, 27);
		contentPane.add(tuesTotHrs);

		wedTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		wedTotHrs.setBackground(Color.WHITE);
		wedTotHrs.setOpaque(true);
		wedTotHrs.setBounds(738, 412, 99, 27);
		contentPane.add(wedTotHrs);

		thusTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		thusTotHrs.setBackground(Color.WHITE);
		thusTotHrs.setOpaque(true);
		thusTotHrs.setBounds(738, 467, 99, 27);
		contentPane.add(thusTotHrs);

		friTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		friTotHrs.setBackground(Color.WHITE);
		friTotHrs.setOpaque(true);
		friTotHrs.setBounds(738, 517, 99, 27);
		contentPane.add(friTotHrs);

		satTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		satTotHrs.setBackground(Color.WHITE);
		satTotHrs.setOpaque(true);
		satTotHrs.setBounds(738, 561, 99, 27);
		contentPane.add(satTotHrs);

		weekTotHrs.setFont(new Font("Tahoma", Font.BOLD, 20));
		weekTotHrs.setBackground(Color.WHITE);
		weekTotHrs.setOpaque(true);
		weekTotHrs.setBounds(738, 663, 99, 27);
		contentPane.add(weekTotHrs);

		weekGrossDollars.setFont(new Font("Tahoma", Font.BOLD, 20));
		weekGrossDollars.setBackground(Color.WHITE);
		weekGrossDollars.setOpaque(true);
		weekGrossDollars.setBounds(738, 749, 99, 27);
		contentPane.add(weekGrossDollars);

		weekNetPay.setFont(new Font("Tahoma", Font.BOLD, 20));
		weekNetPay.setBackground(Color.WHITE);
		weekNetPay.setOpaque(true);
		weekNetPay.setBounds(738, 825, 99, 27);
		contentPane.add(weekNetPay);

		enterButton.addActionListener(this);
		exportItem.addActionListener(this);
		importItem.addActionListener(this);
		resetItem.addActionListener(this);

		federalBox = new JTextField();
		federalBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		federalBox.setText("11");
		federalBox.setBounds(33, 825, 99, 27);
		contentPane.add(federalBox);
		federalBox.setColumns(10);

		socialBox = new JTextField();
		socialBox.setText("6.2");
		socialBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		socialBox.setBounds(343, 825, 99, 27);
		contentPane.add(socialBox);
		socialBox.setColumns(10);

		medicareBox = new JTextField();
		medicareBox.setText("1.45");
		medicareBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		medicareBox.setBounds(539, 825, 99, 27);
		contentPane.add(medicareBox);
		medicareBox.setColumns(10);

		stateBox = new JTextField();
		stateBox.setText("0");
		stateBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		stateBox.setBounds(184, 825, 99, 27);
		contentPane.add(stateBox);
		stateBox.setColumns(10);
		lblMedicareTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMedicareTax.setBounds(519, 800, 174, 25);

		contentPane.add(lblMedicareTax);
		lblStateTax1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStateTax1.setBounds(184, 800, 104, 25);

		contentPane.add(lblStateTax1);
		lblSocialSecurityTax
				.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSocialSecurityTax.setBounds(300, 800, 194, 25);

		contentPane.add(lblSocialSecurityTax);
		lblFederalTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFederalTax.setBounds(23, 800, 124, 25);

		contentPane.add(lblFederalTax);

		JLabel lblOvertime = new JLabel("Overtime");
		lblOvertime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOvertime.setBounds(412, 621, 99, 29);
		contentPane.add(lblOvertime);

		overtimeCheckBox.setBackground(new Color(135, 206, 250));
		overtimeCheckBox.setBounds(382, 617, 25, 40);
		contentPane.add(overtimeCheckBox);
		overtimeCheckBox.addItemListener(this);

		sunCheckBox.setSelected(true);
		sunCheckBox.setBackground(new Color(135, 206, 250));
		sunCheckBox.setBounds(8, 257, 32, 37);
		contentPane.add(sunCheckBox);
		sunCheckBox.addItemListener(this);

		monCheckBox.setSelected(true);
		monCheckBox.setBackground(new Color(135, 206, 250));
		monCheckBox.setBounds(8, 312, 32, 37);
		contentPane.add(monCheckBox);
		monCheckBox.addItemListener(this);

		tuesCheckBox.setSelected(true);
		tuesCheckBox.setBackground(new Color(135, 206, 250));
		tuesCheckBox.setBounds(8, 362, 32, 37);
		contentPane.add(tuesCheckBox);
		tuesCheckBox.addItemListener(this);

		wedCheckBox.setSelected(true);
		wedCheckBox.setBackground(new Color(135, 206, 250));
		wedCheckBox.setBounds(8, 412, 32, 37);
		contentPane.add(wedCheckBox);
		wedCheckBox.addItemListener(this);

		thursCheckBox.setSelected(true);
		thursCheckBox.setBackground(new Color(135, 206, 250));
		thursCheckBox.setBounds(8, 462, 32, 37);
		contentPane.add(thursCheckBox);
		thursCheckBox.addItemListener(this);

		friCheckBox.setSelected(true);
		friCheckBox.setBackground(new Color(135, 206, 250));
		friCheckBox.setBounds(8, 512, 25, 37);
		contentPane.add(friCheckBox);
		friCheckBox.addItemListener(this);

		satCheckBox.setSelected(true);
		satCheckBox.setBackground(new Color(135, 206, 250));
		satCheckBox.setBounds(8, 558, 32, 37);
		contentPane.add(satCheckBox);

		JComboBox<String> moneyComboBox = new JComboBox<String>();
		moneyComboBox.setModel(
				new DefaultComboBoxModel<String>(currencyList));
		moneyComboBox.setMaximumRowCount(10);
		moneyComboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		moneyComboBox.setBounds(48, 671, 276, 48);
		contentPane.add(moneyComboBox);
		satCheckBox.addItemListener(this);
	}

	/**
	 * Method that updates the JLabels involving Gross and Net Income.
	 * 
	 * The method sets the payRate variable to the double value that was entered by
	 * the user.
	 * 
	 * The method then calls the calcGrossEarnings and calcNetEarnings methods in
	 * Money.java to calculate the total amount of capital earned for the week.
	 * 
	 * After these calculations are made, the method updates the JLabels for Gross
	 * and Net income so that the user may see how much capital they have earned
	 * based on the weekly hours and pay rate they have entered.
	 */
	void updatePay() {

		// Try-Catch block to check that payRate input is correct.
		try {
			double testpayRate = Double
					.parseDouble(getPayRateDollars().getText());

			if (testpayRate < 0.00) {
				JOptionPane.showMessageDialog(null,
						"Pay Rate must be " + "a positive number."
								+ " Defaulting to $15.00");

				testpayRate = 15.00;
				getPayRateDollars().setText("15.00");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Pay Rate must be a positive" + "number."
							+ " Defaulting pay rate" + " to $15.00");
			getPayRateDollars().setText("15.00");
		}

		// Try-Catch block to check that the Federal Percentage is correct.
		try {
			double testFedTax = getFederalBox();

			if (testFedTax < 0.00 || testFedTax > 100.00) {
				JOptionPane.showMessageDialog(null, "Please enter "
						+ "a valid Federal Tax value in percentage (0-100%)");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please enter "
					+ "a valid Federal Tax value in percentage (0-100%)");
		}

		try {
			double testStateTax = getStateBox();

			if (testStateTax < 0.00 || testStateTax > 100.00) {
				JOptionPane.showMessageDialog(null, "Please enter "
						+ "a valid State Tax value in percentage (0-100%)");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please enter "
					+ "a valid State Tax value in percentage (0-100%)");
		}

		try {
			double testSocialTax = getSocBox();

			if (testSocialTax < 0.00 || testSocialTax > 100.00) {
				JOptionPane.showMessageDialog(null, "Please enter "
						+ "a valid Social Security Tax value in percentage (0-100%)");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please enter "
					+ "a valid Social Security Tax value in percentage (0-100%)");
		}

		try {
			double testMedTax = getMedBox();

			if (testMedTax < 0.00 || testMedTax > 100.00) {
				JOptionPane.showMessageDialog(null, "Please enter "
						+ "a valid Medicare Tax value in percentage (0-100%)");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Please enter "
					+ "a valid Medicare Tax value in percentage (0-100%)");
		}

		try {
			double testTotalTax = getMedBox() + getSocBox()
					+ getFederalBox() + getStateBox();

			if (testTotalTax > 100.00) {
				JOptionPane.showMessageDialog(null,
						"The total taxes are over 100%. Please enter"
						+ "tax values that do not exceed 100% in total");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"The total taxes are over 100%. Please enter"
							+ "tax values that do not exceed 100% in total");
		}

		double payRate = Double
				.parseDouble(getPayRateDollars().getText());

		double grossPay = money.calcGrossEarnings(
				Double.parseDouble(weekTotHrs.getText()), payRate);

		// NEW WITH TAX CHECKING
		double netPay = money.taxAmounts(
				Double.parseDouble(federalBox.getText()),
				Double.parseDouble(socialBox.getText()),
				Double.parseDouble(medicareBox.getText()),
				Double.parseDouble(stateBox.getText()), grossPay); // TAX AMOUNTS

		weekGrossDollars.setText("$" + df.format(grossPay));
		weekNetPay.setText("$" + df.format(netPay));

	}

	/**
	 * Method that updates the total hours worked for every day of the week.
	 * 
	 * Contains a switch-case that cycles through every day of the week. It will
	 * call the calcTime method in Week.java with parameters for that particular
	 * day.
	 * 
	 * After all total hours are calculated. The method updates the total hour
	 * JLabels for each day so the user may see the total calculated hours.
	 */
	public void updateCalcHrs() {

		int x = 0;
		double sun = 0;
		double mon = 0;
		double tues = 0;
		double wed = 0;
		double thurs = 0;
		double fri = 0;
		double sat = 0;

		for (int y = 0; y < 7; y++) {
			int a = week.getWeekData(y, 0);
			int b = week.getWeekData(y, 1);
			int c = week.getWeekData(y, 2);
			int d = week.getWeekData(y, 3);
			int e = week.getWeekData(y, 4);
			int f = week.getWeekData(y, 5);

			switch (x) {
			case 0:
				sun = week.calcTime(a, b, c, d, e, f);
				x++;
				break;
			case 1:
				mon = week.calcTime(a, b, c, d, e, f);
				x++;
				break;
			case 2:
				tues = week.calcTime(a, b, c, d, e, f);
				x++;
				break;
			case 3:
				wed = week.calcTime(a, b, c, d, e, f);
				x++;
				break;
			case 4:
				thurs = week.calcTime(a, b, c, d, e, f);
				x++;
				break;
			case 5:
				fri = week.calcTime(a, b, c, d, e, f);
				x++;
				break;
			case 6:
				sat = week.calcTime(a, b, c, d, e, f);
				break;
			default:
				break;
			}

		}
		sunTotHrs.setText(df.format(sun));
		monTotHrs.setText(df.format(mon));
		tuesTotHrs.setText(df.format(tues));
		wedTotHrs.setText(df.format(wed));
		thusTotHrs.setText(df.format(thurs));
		friTotHrs.setText(df.format(fri));
		satTotHrs.setText(df.format(sat));
		weekTotHrs.setText(df
				.format(sun + mon + tues + wed + thurs + fri + sat));

		week.setTimeWorked(0, sun);
		week.setTimeWorked(1, mon);
		week.setTimeWorked(2, tues);
		week.setTimeWorked(3, wed);
		week.setTimeWorked(4, thurs);
		week.setTimeWorked(5, fri);
		week.setTimeWorked(6, sat);
		week.setTotHrsWorked(
				sun + mon + tues + wed + thurs + fri + sat);
	}

	/**
	 * Method that exports the current week and money data to a .txt file.
	 * 
	 * @param filename
	 *            name of the file being saved.
	 */
	public void textOut(final String filename) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(
					new BufferedWriter(new FileWriter(filename)));
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int x = 0; x < 7; x++) {
			switch (x) {
			case 0:
				out.print("Sunday| In Time: ");
				out.print(week.getWeekData(x, 0));
				out.print(":");
				out.print(week.getWeekData(x, 1));
				if (week.getWeekData(x, 1) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 2) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Out Time: ");
				out.print(week.getWeekData(x, 3));
				out.print(":");
				out.print(week.getWeekData(x, 4));
				if (week.getWeekData(x, 4) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 5) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Total Hours Worked: ");
				out.println(df.format(week.getTimeWorked(x)));
				break;

			case 1:
				out.print("Monday| In Time: ");
				out.print(week.getWeekData(x, 0));
				out.print(":");
				out.print(week.getWeekData(x, 1));
				if (week.getWeekData(x, 1) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 2) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Out Time: ");
				out.print(week.getWeekData(x, 3));
				out.print(":");
				out.print(week.getWeekData(x, 4));
				if (week.getWeekData(x, 4) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 5) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Total Hours Worked: ");
				out.println(df.format(week.getTimeWorked(x)));
				break;

			case 2:
				out.print("Tuesday| In Time: ");
				out.print(week.getWeekData(x, 0));
				out.print(":");
				out.print(week.getWeekData(x, 1));
				if (week.getWeekData(x, 1) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 2) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Out Time: ");
				out.print(week.getWeekData(x, 3));
				out.print(":");
				out.print(week.getWeekData(x, 4));
				if (week.getWeekData(x, 4) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 5) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Total Hours Worked: ");
				out.println(df.format(week.getTimeWorked(x)));
				break;

			case 3:
				out.print("Wednesday| In Time: ");
				out.print(week.getWeekData(x, 0));
				out.print(":");
				out.print(week.getWeekData(x, 1));
				if (week.getWeekData(x, 1) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 2) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Out Time: ");
				out.print(week.getWeekData(x, 3));
				out.print(":");
				out.print(week.getWeekData(x, 4));
				if (week.getWeekData(x, 4) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 5) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Total Hours Worked: ");
				out.println(df.format(week.getTimeWorked(x)));
				break;

			case 4:
				out.print("Thursday| In Time: ");
				out.print(week.getWeekData(x, 0));
				out.print(":");
				out.print(week.getWeekData(x, 1));
				if (week.getWeekData(x, 1) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 2) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Out Time: ");
				out.print(week.getWeekData(x, 3));
				out.print(":");
				out.print(week.getWeekData(x, 4));
				if (week.getWeekData(x, 4) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 5) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Total Hours Worked: ");
				out.println(df.format(week.getTimeWorked(x)));
				break;

			case 5:
				out.print("Friday| In Time: ");
				out.print(week.getWeekData(x, 0));
				out.print(":");
				out.print(week.getWeekData(x, 1));
				if (week.getWeekData(x, 1) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 2) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Out Time: ");
				out.print(week.getWeekData(x, 3));
				out.print(":");
				out.print(week.getWeekData(x, 4));
				if (week.getWeekData(x, 4) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 5) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Total Hours Worked: ");
				out.println(df.format(week.getTimeWorked(x)));
				break;

			case 6:
				out.print("Saturday| In Time: ");
				out.print(week.getWeekData(x, 0));
				out.print(":");
				out.print(week.getWeekData(x, 1));
				if (week.getWeekData(x, 1) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 2) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Out Time: ");
				out.print(week.getWeekData(x, 3));
				out.print(":");
				out.print(week.getWeekData(x, 4));
				if (week.getWeekData(x, 4) == 0) {
					out.print("0");
				}
				if (week.getWeekData(x, 5) == 0) {
					out.print(" AM ");
				} else {
					out.print(" PM ");
				}
				out.print("Total Hours Worked: ");
				out.println(df.format(week.getTimeWorked(x)));
				break;
			default:
				break;

			}
		}
		out.print(df.format(week.getTotHrsWorked()));
		out.println(" Total Hours Worked");

		out.print("$ " + df.format(money.getGrossIncome()));
		out.println(" Total Earned");

		out.print("$ " + df.format(money.getNetIncome()));
		out.print(" Net Earned");

		out.close();

	}

	/**
	 * Fills the WeekData Array with information from user input.
	 * 
	 * The method goes through every day of the week and parses in the Hours,
	 * Minutes, and AM/PM choice for both the clock-in and clock-out times.
	 * 
	 * If the user leaves a text field blank, a dialog will prompt the user about it
	 * and default every section of that day to 0.
	 * 
	 */
	void setWeekDataArray() {
		// Sunday
		try {
			week.setWeekData(0, 0,
					Integer.parseInt(sunInHr.getText()));
			week.setWeekData(0, 1,
					Integer.parseInt(sunInMin.getText()));

			if (sunInAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(0, 2, 0);
			} else {
				week.setWeekData(0, 2, 1);
			}

			week.setWeekData(0, 3,
					Integer.parseInt(sunOutHr.getText()));
			week.setWeekData(0, 4,
					Integer.parseInt(sunOutMin.getText()));

			if (sunOutAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(0, 5, 0);
			} else {
				week.setWeekData(0, 5, 1);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Sunday input time!"
							+ " Please enter a number.");
		}

		// Monday
		try {

			week.setWeekData(1, 0,
					Integer.parseInt(monInHr.getText()));
			week.setWeekData(1, 1,
					Integer.parseInt(monInMin.getText()));

			if (monInAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(1, 2, 0);
			} else {
				week.setWeekData(1, 2, 1);
			}

			week.setWeekData(1, 3,
					Integer.parseInt(monOutHr.getText()));
			week.setWeekData(1, 4,
					Integer.parseInt(monOutMin.getText()));

			if (monOutAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(1, 5, 0);
			} else {
				week.setWeekData(1, 5, 1);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Sunday input time!"
							+ " Please enter a number.");
		}

		// Tuesday
		try {

			week.setWeekData(2, 0,
					Integer.parseInt(tuesInHr.getText()));
			week.setWeekData(2, 1,
					Integer.parseInt(tuesInMin.getText()));

			if (tuesInAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(2, 2, 0);
			} else {
				week.setWeekData(2, 2, 1);
			}

			week.setWeekData(2, 3,
					Integer.parseInt(tuesOutHr.getText()));
			week.setWeekData(2, 4,
					Integer.parseInt(tuesOutMin.getText()));

			if (tuesOutAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(2, 5, 0);
			} else {
				week.setWeekData(2, 5, 1);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Sunday input time!"
							+ " Please enter a number.");
		}

		// Wednesday
		try {
			week.setWeekData(3, 0,
					Integer.parseInt(wedInHr.getText()));
			week.setWeekData(3, 1,
					Integer.parseInt(wedInMin.getText()));

			if (wedInAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(3, 2, 0);
			} else {
				week.setWeekData(3, 2, 1);
			}

			week.setWeekData(3, 3,
					Integer.parseInt(wedOutHr.getText()));
			week.setWeekData(3, 4,
					Integer.parseInt(wedOutMin.getText()));

			if (wedOutAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(3, 5, 0);
			} else {
				week.setWeekData(3, 5, 1);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Sunday input time!"
							+ " Please enter a number.");
		}
		// Thursday
		try {
			week.setWeekData(4, 0,
					Integer.parseInt(thursInHr.getText()));
			week.setWeekData(4, 1,
					Integer.parseInt(thusInMin.getText()));

			if (thursInAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(4, 2, 0);
			} else {
				week.setWeekData(4, 2, 1);
			}

			week.setWeekData(4, 3,
					Integer.parseInt(thursOutHr.getText()));
			week.setWeekData(4, 4,
					Integer.parseInt(thursOutMin.getText()));

			if (thursOutAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(4, 5, 0);
			} else {
				week.setWeekData(4, 5, 1);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Sunday input time!"
							+ " Please enter a number.");
		}

		// Friday
		try {
			week.setWeekData(5, 0,
					Integer.parseInt(friInHr.getText()));
			week.setWeekData(5, 1,
					Integer.parseInt(friInMin.getText()));

			if (friInAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(5, 2, 0);
			} else {
				week.setWeekData(5, 2, 1);
			}

			week.setWeekData(5, 3,
					Integer.parseInt(friOutHr.getText()));
			week.setWeekData(5, 4,
					Integer.parseInt(friOutMin.getText()));

			if (friOutAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(5, 5, 0);
			} else {
				week.setWeekData(5, 5, 1);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Sunday input time!"
							+ " Please enter a number.");
		}

		// Saturday
		try {
			week.setWeekData(6, 0,
					Integer.parseInt(satInHr.getText()));
			week.setWeekData(6, 1,
					Integer.parseInt(satInMin.getText()));

			if (satInAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(6, 2, 0);
			} else {
				week.setWeekData(6, 2, 1);
			}

			week.setWeekData(6, 3,
					Integer.parseInt(satOutHr.getText()));
			week.setWeekData(6, 4,
					Integer.parseInt(satOutMin.getText()));

			if (satOutAMPMBox.getSelectedItem().equals("AM")) {
				week.setWeekData(6, 5, 0);
			} else {
				week.setWeekData(6, 5, 1);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Sunday input time!"
							+ " Please enter a number.");
		}

	}

	/**
	 * Performs actions based on any ActionEvent objects passed into the method.
	 * 
	 * @param e
	 *            ActionEvent that is passed in. i.e JButton clicks.
	 */
	@Override
	public void actionPerformed(final ActionEvent e) {

		Object action = e.getSource();

		if (enterButton == action) {
			setWeekDataArray();
			updateCalcHrs();
			updatePay();

		}

		if (exportItem == action) {
			JFileChooser chooser = new JFileChooser();
			int status = chooser.showSaveDialog(null);
			if (status == JFileChooser.APPROVE_OPTION) {
				String filename = chooser.getSelectedFile()
						.getAbsolutePath();
				if (exportItem == e.getSource()) {
					textOut(filename);
				}
			}

		}

		if (resetItem == action) {
			week.resetWeek();
		}

	}

	/**
	 * Performs actions based on source of ItemEvent object.
	 * 
	 * @param e
	 *            JComponent that user interacted with.
	 */
	@Override
	public void itemStateChanged(final ItemEvent e) {

		Object source = e.getItemSelectable();

		if (overtimeCheckBox == source) {
			if ((e.getStateChange() == ItemEvent.SELECTED)) {
				money.setOT(true);
			} else {
				money.setOT(false);
			}
		}

		if (sunCheckBox == source) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {

				sunInHr.setText("0");
				sunInMin.setText("00");
				sunOutHr.setText("0");
				sunOutMin.setText("00");
				sunTotHrs.setText("0.00");
				sunInHr.setEnabled(false);
				sunInMin.setEnabled(false);
				sunInAMPMBox.setEnabled(false);
				sunOutHr.setEnabled(false);
				sunOutMin.setEnabled(false);
				sunOutAMPMBox.setEnabled(false);
				sunTotHrs.setEnabled(false);
			} else {
				sunInHr.setEnabled(true);
				sunInMin.setEnabled(true);
				sunOutHr.setEnabled(true);
				sunOutMin.setEnabled(true);
				sunInAMPMBox.setEnabled(true);
				sunOutAMPMBox.setEnabled(true);
				sunTotHrs.setEnabled(true);
			}
		}

		if (monCheckBox == source) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {

				monInHr.setText("0");
				monInMin.setText("00");
				monOutHr.setText("0");
				monOutMin.setText("00");
				monTotHrs.setText("0.00");
				monInHr.setEnabled(false);
				monInMin.setEnabled(false);
				monInAMPMBox.setEnabled(false);
				monOutHr.setEnabled(false);
				monOutMin.setEnabled(false);
				monOutAMPMBox.setEnabled(false);
				monTotHrs.setEnabled(false);
			} else {
				monInHr.setEnabled(true);
				monInMin.setEnabled(true);
				monOutHr.setEnabled(true);
				monOutMin.setEnabled(true);
				monInAMPMBox.setEnabled(true);
				monOutAMPMBox.setEnabled(true);
				monTotHrs.setEnabled(true);
			}

		}

		if (tuesCheckBox == source) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {

				tuesInHr.setText("0");
				tuesInMin.setText("00");
				tuesOutHr.setText("0");
				tuesOutMin.setText("00");
				tuesTotHrs.setText("0.00");
				tuesInHr.setEnabled(false);
				tuesInMin.setEnabled(false);
				tuesInAMPMBox.setEnabled(false);
				tuesOutHr.setEnabled(false);
				tuesOutMin.setEnabled(false);
				tuesOutAMPMBox.setEnabled(false);
				tuesTotHrs.setEnabled(false);
			} else {
				tuesInHr.setEnabled(true);
				tuesInMin.setEnabled(true);
				tuesOutHr.setEnabled(true);
				tuesOutMin.setEnabled(true);
				tuesInAMPMBox.setEnabled(true);
				tuesOutAMPMBox.setEnabled(true);
				tuesTotHrs.setEnabled(true);
			}
		}

		if (wedCheckBox == source) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {

				wedInHr.setText("0");
				wedInMin.setText("00");
				wedOutHr.setText("0");
				wedOutMin.setText("00");
				wedTotHrs.setText("0.00");
				wedInHr.setEnabled(false);
				wedInMin.setEnabled(false);
				wedInAMPMBox.setEnabled(false);
				wedOutHr.setEnabled(false);
				wedOutMin.setEnabled(false);
				wedOutAMPMBox.setEnabled(false);
				wedTotHrs.setEnabled(false);
			} else {
				wedInHr.setEnabled(true);
				wedInMin.setEnabled(true);
				wedOutHr.setEnabled(true);
				wedOutMin.setEnabled(true);
				wedInAMPMBox.setEnabled(true);
				wedOutAMPMBox.setEnabled(true);
				wedTotHrs.setEnabled(true);
			}
		}

		if (thursCheckBox == source) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {

				thursInHr.setText("0");
				thusInMin.setText("00");
				thursOutHr.setText("0");
				thursOutMin.setText("00");
				thusTotHrs.setText("0.00");
				thursInHr.setEnabled(false);
				thusInMin.setEnabled(false);
				thursInAMPMBox.setEnabled(false);
				thursOutHr.setEnabled(false);
				thursOutMin.setEnabled(false);
				thursOutAMPMBox.setEnabled(false);
				thusTotHrs.setEnabled(false);
			} else {
				thursInHr.setEnabled(true);
				thusInMin.setEnabled(true);
				thursOutHr.setEnabled(true);
				thursOutMin.setEnabled(true);
				thursInAMPMBox.setEnabled(true);
				thursOutAMPMBox.setEnabled(true);
				thusTotHrs.setEnabled(true);
			}
		}

		if (friCheckBox == source) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {

				friInHr.setText("0");
				friInMin.setText("00");
				friOutHr.setText("0");
				friOutMin.setText("00");
				friTotHrs.setText("0.00");
				friInHr.setEnabled(false);
				friInMin.setEnabled(false);
				friInAMPMBox.setEnabled(false);
				friOutHr.setEnabled(false);
				friOutMin.setEnabled(false);
				friOutAMPMBox.setEnabled(false);
				friTotHrs.setEnabled(false);
			} else {
				friInHr.setEnabled(true);
				friInMin.setEnabled(true);
				friOutHr.setEnabled(true);
				friOutMin.setEnabled(true);
				friInAMPMBox.setEnabled(true);
				friOutAMPMBox.setEnabled(true);
				friTotHrs.setEnabled(true);
			}
		}

		if (satCheckBox == source) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {

				satInHr.setText("0");
				satInMin.setText("00");
				satOutHr.setText("0");
				satOutMin.setText("00");
				satTotHrs.setText("0.00");
				satInHr.setEnabled(false);
				satInMin.setEnabled(false);
				satInAMPMBox.setEnabled(false);
				satOutHr.setEnabled(false);
				satOutMin.setEnabled(false);
				satOutAMPMBox.setEnabled(false);
				satTotHrs.setEnabled(false);
			} else {
				satInHr.setEnabled(true);
				satInMin.setEnabled(true);
				satOutHr.setEnabled(true);
				satOutMin.setEnabled(true);
				satInAMPMBox.setEnabled(true);
				satOutAMPMBox.setEnabled(true);
				satTotHrs.setEnabled(true);
			}

		}

	}
}