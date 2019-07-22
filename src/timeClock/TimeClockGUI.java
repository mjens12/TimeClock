package timeClock;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

/**
 * This is the front end of the Time Clock software. All JComponents
 * and Action Listeners are within this class. Action listeners call
 * various classes such as Clock.java and potential dialog classes.
 * 
 * Entire GUI (Except for action listeners) was created and generated
 * using the Eclipse Window Builder PlugIn.
 * 
 * @author Tyler Hay, Freeman Ogburn, Max Jensen
 *
 */
public class TimeClockGUI extends JFrame implements ActionListener {

	private ActionListener updateClockAction;

	Timer t = new Timer(1000, updateClockAction);

	/**
	 * Default serial ID.
	 */
	private static final long serialVersionUID = 1L;

	/** Formatter Object to format doubles 2 decimal spaces. **/
	private static DecimalFormat df = new DecimalFormat("0.00");

	/** JPanel to hold the GUI contents. **/
	private JPanel contentPane;

	/**
	 * JTextField for user to enter in Wednesday clock-in hour.
	 */
	private JTextField wedInHr;

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

	private JLabel clock = new JLabel("00:00");

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

	/** Jlabel for clock-out minute section. **/
	private JLabel lblMinOut = new JLabel("Min");

	/** JTextArea that displays tax information. **/
	private JTextArea taxNotice = new JTextArea();

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
	private JComboBox sunInAMPMBox = new JComboBox();

	/** JComboBox for Monday clock-in AM/PM choice. **/
	private JComboBox monInAMPMBox = new JComboBox();

	/** JComboBox for Tuesday clock-in AM/PM choice. **/
	private JComboBox tuesInAMPMBox = new JComboBox();

	/** JComboBox for Wednesday clock-in AM/PM choice. **/
	private JComboBox wedInAMPMBox = new JComboBox();

	/** JComboBox for Thursday clock-in AM/PM choice. **/
	private JComboBox thursInAMPMBox = new JComboBox();

	/** JComboBox for Friday clock-in AM/PM choice. **/
	private JComboBox friInAMPMBox = new JComboBox();

	/** JComboBox for Saturday clock-in AM/PM choice. **/
	private JComboBox satInAMPMBox = new JComboBox();

	/** JComboBox for Sunday clock-out AM/PM choice. **/
	private JComboBox sunOutAMPMBox = new JComboBox();

	/** JComboBox for Monday clock-out AM/PM choice. **/
	private JComboBox monOutAMPMBox = new JComboBox();

	/** JComboBox for Tuesday clock-out AM/PM choice. **/
	private JComboBox tuesOutAMPMBox = new JComboBox();

	/** JComboBox for Wednesday clock-out AM/PM choice. **/
	private JComboBox wedOutAMPMBox = new JComboBox();

	/** JComboBox for Thursday clock-out AM/PM choice. **/
	private JComboBox thursOutAMPMBox = new JComboBox();

	/** JComboBox for Friday clock-out AM/PM choice. **/
	private JComboBox friOutAMPMBox = new JComboBox();

	/** JComboBox for Saturday clock-out AM/PM choice. **/
	private JComboBox satOutAMPMBox = new JComboBox();

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

	/** Clock object for money and time calculations. **/
	private Clock week = new Clock();

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
					TimeClockGUI frame = new TimeClockGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * TimeClockGUI Constructor.
	 */
	public TimeClockGUI() {
		t.start();
		t.addActionListener(this);

		setBackground(new Color(255, 255, 255));

		setTitle("CS350 Punch Clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPunchClock =
				new JLabel("Punch Clock & Wage Calculator");
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
				new DefaultComboBoxModel(new String[] { "AM", "PM" }));
		sunInAMPMBox.setBounds(287, 267, 53, 27);
		contentPane.add(sunInAMPMBox);

		monInAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "AM", "PM" }));
		monInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		monInAMPMBox.setBounds(287, 317, 53, 27);
		contentPane.add(monInAMPMBox);

		tuesInAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "AM", "PM" }));
		tuesInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		tuesInAMPMBox.setBounds(287, 367, 53, 27);
		contentPane.add(tuesInAMPMBox);

		wedInAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "AM", "PM" }));
		wedInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		wedInAMPMBox.setBounds(287, 417, 53, 27);
		contentPane.add(wedInAMPMBox);

		thursInAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "AM", "PM" }));
		thursInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		thursInAMPMBox.setBounds(287, 467, 53, 27);
		contentPane.add(thursInAMPMBox);

		friInAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "AM", "PM" }));
		friInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		friInAMPMBox.setBounds(287, 519, 53, 27);
		contentPane.add(friInAMPMBox);

		satInAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "AM", "PM" }));
		satInAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		satInAMPMBox.setBounds(287, 563, 53, 27);
		contentPane.add(satInAMPMBox);

		enterButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		enterButton.setBounds(382, 600, 100, 50);
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
				new DefaultComboBoxModel(new String[] { "PM", "AM" }));
		sunOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		sunOutAMPMBox.setBounds(486, 267, 53, 27);
		contentPane.add(sunOutAMPMBox);

		monOutAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "PM", "AM" }));
		monOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		monOutAMPMBox.setBounds(486, 317, 53, 27);
		contentPane.add(monOutAMPMBox);

		tuesOutAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "PM", "AM" }));
		tuesOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		tuesOutAMPMBox.setBounds(486, 367, 53, 27);
		contentPane.add(tuesOutAMPMBox);

		wedOutAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "PM", "AM" }));
		wedOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		wedOutAMPMBox.setBounds(486, 417, 53, 27);
		contentPane.add(wedOutAMPMBox);

		thursOutAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "PM", "AM" }));
		thursOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		thursOutAMPMBox.setBounds(486, 467, 53, 27);
		contentPane.add(thursOutAMPMBox);

		friOutAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "PM", "AM" }));
		friOutAMPMBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		friOutAMPMBox.setBounds(486, 517, 53, 27);
		contentPane.add(friOutAMPMBox);

		satOutAMPMBox.setModel(
				new DefaultComboBoxModel(new String[] { "PM", "AM" }));
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

		clock.setFont(new Font("Tahoma", Font.BOLD, 20));
		clock.setBounds(48, 675, 500, 25);
		contentPane.add(clock);

		setPayRateDollars(new JTextField());
		getPayRateDollars().setText("10.00");
		getPayRateDollars().setToolTipText("");
		getPayRateDollars().setFont(new Font("Tahoma", Font.BOLD, 20));
		getPayRateDollars().setColumns(10);
		getPayRateDollars().setBounds(184, 621, 91, 27);
		contentPane.add(getPayRateDollars());

		lblPerHr.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPerHr.setBounds(282, 625, 69, 25);
		contentPane.add(lblPerHr);

		taxNotice.setBackground(new Color(135, 206, 250));
		taxNotice.setText("Value calculated in the Net Pay\r\nField is"
				+ " affected by these typical U.S taxes:"
				+ "\r\nFederal Income Tax: 11% of Gross"
				+ "\r\nSocial Security Tax: 6% of Gross"
				+ "\r\nMedicare Tax: 1.45% of Gross");
		taxNotice.setFont(new Font("Arial Black", Font.PLAIN, 10));
		taxNotice.setBounds(693, 865, 261, 88);
		contentPane.add(taxNotice);

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
	}

	/**
	 * Fills the WeekData Array with information from user input.
	 * 
	 * The method goes through every day of the week and parses in the
	 * Hours, Minutes, and AM/PM choice for both the clock-in and
	 * clock-out times.
	 * 
	 * If the user leaves a text field blank, a dialog will prompt the
	 * user about it and default every section of that day to 0.
	 * 
	 */
	void setWeekDataArray() {
		// Sunday
		try {
			week.weekData[0][0] = Integer.parseInt(sunInHr.getText());
			week.weekData[0][1] = Integer.parseInt(sunInMin.getText());

			if (sunInAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[0][2] = 0;
			} else {
				week.weekData[0][2] = 1;
			}

			week.weekData[0][3] = Integer.parseInt(sunOutHr.getText());
			week.weekData[0][4] =
					Integer.parseInt(sunOutMin.getText());

			if (sunOutAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[0][5] = 0;
			} else {
				week.weekData[0][5] = 1;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Sunday input time!"
							+ " Please enter a number.");
		}

		// Monday
		try {

			week.weekData[1][0] = Integer.parseInt(monInHr.getText());
			week.weekData[1][1] = Integer.parseInt(monInMin.getText());

			if (monInAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[1][2] = 0;
			} else {
				week.weekData[1][2] = 1;
			}

			week.weekData[1][3] = Integer.parseInt(monOutHr.getText());
			week.weekData[1][4] =
					Integer.parseInt(monOutMin.getText());

			if (monOutAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[1][5] = 0;
			} else {
				week.weekData[1][5] = 1;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Monday input time!"
							+ " Please enter a number.");
		}

		// Tuesday
		try {

			week.weekData[2][0] = Integer.parseInt(tuesInHr.getText());
			week.weekData[2][1] =
					Integer.parseInt(tuesInMin.getText());

			if (tuesInAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[2][2] = 0;
			} else {
				week.weekData[2][2] = 1;
			}

			week.weekData[2][3] =
					Integer.parseInt(tuesOutHr.getText());
			week.weekData[2][4] =
					Integer.parseInt(tuesOutMin.getText());

			if (tuesOutAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[2][5] = 0;
			} else {
				week.weekData[2][5] = 1;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Tuesday input time!"
							+ " Please enter a number.");
		}

		// Wednesday
		try {
			week.weekData[3][0] = Integer.parseInt(wedInHr.getText());
			week.weekData[3][1] = Integer.parseInt(wedInMin.getText());

			if (wedInAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[3][2] = 0;
			} else {
				week.weekData[3][2] = 1;
			}

			week.weekData[3][3] = Integer.parseInt(wedOutHr.getText());
			week.weekData[3][4] =
					Integer.parseInt(wedOutMin.getText());

			if (wedOutAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[3][5] = 0;
			} else {
				week.weekData[3][5] = 1;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Wednesday input time!"
							+ " Please enter a number.");
		}
		// Thursday
		try {
			week.weekData[4][0] =
					Integer.parseInt(thursInHr.getText());
			week.weekData[4][1] =
					Integer.parseInt(thusInMin.getText());

			if (thursInAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[4][2] = 0;
			} else {
				week.weekData[4][2] = 1;
			}

			week.weekData[4][3] =
					Integer.parseInt(thursOutHr.getText());
			week.weekData[4][4] =
					Integer.parseInt(thursOutMin.getText());

			if (thursOutAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[4][5] = 0;
			} else {
				week.weekData[4][5] = 1;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Thursday input time!"
							+ " Please enter a number.");
		}

		// Friday
		try {
			week.weekData[5][0] = Integer.parseInt(friInHr.getText());
			week.weekData[5][1] = Integer.parseInt(friInMin.getText());

			if (friInAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[5][2] = 0;
			} else {
				week.weekData[5][2] = 1;
			}

			week.weekData[5][3] = Integer.parseInt(friOutHr.getText());
			week.weekData[5][4] =
					Integer.parseInt(friOutMin.getText());

			if (friOutAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[5][5] = 0;
			} else {
				week.weekData[5][5] = 1;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Friday input time!"
							+ " Please enter a number.");
		}

		// Saturday
		try {
			week.weekData[6][0] = Integer.parseInt(satInHr.getText());
			week.weekData[6][1] = Integer.parseInt(satInMin.getText());

			if (satInAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[6][2] = 0;
			} else {
				week.weekData[6][2] = 1;
			}

			week.weekData[6][3] = Integer.parseInt(satOutHr.getText());
			week.weekData[6][4] =
					Integer.parseInt(satOutMin.getText());

			if (satOutAMPMBox.getSelectedItem().equals("AM")) {
				week.weekData[6][5] = 0;
			} else {
				week.weekData[6][5] = 1;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Could not parse Saturday input time!"
							+ " Please enter a number.");
		}

	}

	/**
	 * Method that updates the total hours worked for every day of the
	 * week.
	 * 
	 * Contains a switch-case that cycles through every day of the
	 * week. It will call the calcTime method in Clock.java with
	 * parameters for that particular day.
	 * 
	 * After all total hours are calculated. The method updates the
	 * total hour JLabels for each day so the user may see the total
	 * calculated hours.
	 */
	void updateCalcHrs() {
		int x = 0;
		double sun = 0;
		double mon = 0;
		double tues = 0;
		double wed = 0;
		double thurs = 0;
		double fri = 0;
		double sat = 0;

		for (int y = 0; y < 7; y++) {
			int a = week.weekData[y][0];
			int b = week.weekData[y][1];
			int c = week.weekData[y][2];
			int d = week.weekData[y][3];
			int e = week.weekData[y][4];
			int f = week.weekData[y][5];

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
		weekTotHrs.setText(
				df.format(sun + mon + tues + wed + thurs + fri + sat));
	}

	/**
	 * Method that updates the JLabels involving Gross and Net Income.
	 * 
	 * The method sets the payRate variable to the double value that
	 * was entered by the user.
	 * 
	 * The method then calls the calcGrossEarnings and calcNetEarnings
	 * methods in Clock.java to calculate the total amount of capital
	 * earned for the week.
	 * 
	 * After these calculations are made, the method updates the
	 * JLabels for Gross and Net income so that the user may see how
	 * much capital they have earned based on the weekly hours and pay
	 * rate they have entered.
	 */
	void updatePay() {

		// Try-Catch block to check that payRate input is correct.
		try {
			double testpayRate =
					Double.parseDouble(getPayRateDollars().getText());

			if (testpayRate < 0.00) {
				JOptionPane.showMessageDialog(null, "Pay Rate must be "
						+ "a positive number. Defaulting to $15.00");

				testpayRate = 15.00;
				getPayRateDollars().setText("15.00");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Pay Rate must be a positive"
							+ "number. Defaulting pay rate to $15.00");
			getPayRateDollars().setText("15.00");
		}

		double payRate =
				Double.parseDouble(getPayRateDollars().getText());

		double grossPay = week.calcGrossEarnings(
				Double.parseDouble(weekTotHrs.getText()), payRate);

		double netPay = week.calcNetEarnings(grossPay);

		weekGrossDollars.setText("$" + df.format(grossPay));
		weekNetPay.setText("$" + df.format(netPay));

	}

	/**
	 * Performs actions based on any ActionEvent objects passed into
	 * the method.
	 * 
	 * @param e
	 *            ActionEvent that is passed in. i.e JButton clicks.
	 */

	public void actionPerformed(final ActionEvent e) {

		Object action = e.getSource();

		if (enterButton == action) {
			setWeekDataArray();
			updateCalcHrs();
			updatePay();

		}
		if (t == action) {
			clock.setText(new Date().toString());
		}
	}

	/**
	 * Getter method for payRateDollars JTextfield. method is needed
	 * for JUnits tests
	 * 
	 * @return JTextfield for payRateDollars.
	 */
	public JTextField getPayRateDollars() {
		return payRateDollars;
	}

	/**
	 * setter method for payRateDollars JTextField. method is needed
	 * for JUnit tests
	 * 
	 * @param payRateDollars
	 *            JTextField containing a string value.
	 */
	public void setPayRateDollars(final JTextField payRateDollars) {
		this.payRateDollars = payRateDollars;
	}
}
