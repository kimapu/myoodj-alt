package client.gui.tut8.q4;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


import solution.tut8.all.InvestmentCalculator;

public class WindowInvestment extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAmt;
	private JTextField textFieldRate;
	private JTextField textFieldYear;
	private JTextField textFieldFutValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowInvestment frame = new WindowInvestment();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setLocationRelativeTo(null);
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
	public WindowInvestment() {
		setTitle("TUTORIAL 8 - Q4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Investment Calculator");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 28));
		lblNewLabel.setBounds(10, 11, 414, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Amount:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 76, 168, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldAmt = new JTextField();
		textFieldAmt.setBounds(188, 73, 551, 20);
		contentPane.add(textFieldAmt);
		textFieldAmt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Interest rate (Annual):");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 108, 168, 14);
		contentPane.add(lblNewLabel_2);
		
		textFieldRate = new JTextField();
		textFieldRate.setBounds(188, 104, 551, 20);
		contentPane.add(textFieldRate);
		textFieldRate.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Year:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(10, 138, 168, 14);
		contentPane.add(lblNewLabel_3);
		
		textFieldYear = new JTextField();
		textFieldYear.setBounds(188, 135, 551, 20);
		contentPane.add(textFieldYear);
		textFieldYear.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Future value:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(10, 167, 168, 14);
		contentPane.add(lblNewLabel_4);
		
		textFieldFutValue = new JTextField();
		textFieldFutValue.setFont(new Font("Arial", Font.PLAIN, 28));
		textFieldFutValue.setEnabled(false);
		textFieldFutValue.setBounds(188, 166, 551, 51);
		contentPane.add(textFieldFutValue);
		textFieldFutValue.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String amount = textFieldAmt.getText();
					String annualRate = textFieldRate.getText();
					String year = textFieldYear.getText();
					InvestmentCalculator ivm = new InvestmentCalculator(
							Double.parseDouble(amount), 
							Double.parseDouble(annualRate)/12, 
							Integer.parseInt(year)) ;
					textFieldFutValue.setText( String.valueOf(ivm.futureValue()) );
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(btnNewButton, "Sorry, please try again!");
					textFieldFutValue.setText("null");
				}
			}
		});
		btnNewButton.setBounds(588, 228, 149, 47);
		contentPane.add(btnNewButton);
	}

}
