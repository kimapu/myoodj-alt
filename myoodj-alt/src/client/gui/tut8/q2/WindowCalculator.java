package client.gui.tut8.q2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import solution.tut8.all.Calculator;

public class WindowCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldValue1;
	private JTextField textFieldValue2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblResult;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowCalculator frame = new WindowCalculator();
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
	public WindowCalculator() {
		setTitle("TUTORIAL 8 - Q2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panelInput = new JPanel();
		
		JPanel panelOption = new JPanel();
		
		lblResult = new JLabel("");
		lblResult.setVerticalAlignment(SwingConstants.TOP);
		lblResult.setBackground(Color.WHITE);
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 28));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblResult, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
						.addComponent(panelOption, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
						.addComponent(panelInput, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelInput, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panelOption, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblResult, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel_2 = new JLabel("Operation:");
		panelOption.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Add");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					handlerMath(
							textFieldValue1.getText(),
							textFieldValue2.getText(),
							e.getActionCommand().toLowerCase() );
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage());
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		panelOption.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Subtract");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					handlerMath(
							textFieldValue1.getText(),
							textFieldValue2.getText(),
							e.getActionCommand().toLowerCase() );
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage());
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		panelOption.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Multiply");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					handlerMath(
							textFieldValue1.getText(),
							textFieldValue2.getText(),
							e.getActionCommand().toLowerCase() );
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage());
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_2);
		panelOption.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Division");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					handlerMath(
							textFieldValue1.getText(),
							textFieldValue2.getText(),
							e.getActionCommand().toLowerCase() );
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2.getMessage());
				}
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_3);
		panelOption.add(rdbtnNewRadioButton_3);
		
		JLabel lblNewLabel = new JLabel("Value 1:");
		
		JLabel lblNewLabel_1 = new JLabel("Value 2:");
		
		textFieldValue1 = new JTextField();
		textFieldValue1.setColumns(10);
		
		textFieldValue2 = new JTextField();
		textFieldValue2.setColumns(10);
		GroupLayout gl_panelInput = new GroupLayout(panelInput);
		gl_panelInput.setHorizontalGroup(
			gl_panelInput.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelInput.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_panelInput.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelInput.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldValue2, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
						.addGroup(gl_panelInput.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldValue1, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panelInput.setVerticalGroup(
			gl_panelInput.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelInput.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelInput.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textFieldValue1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelInput.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textFieldValue2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panelInput.setLayout(gl_panelInput);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void handlerMath( String n1, String n2, String op ) throws Exception{
		
		switch (op) {
			case "add": {
				Calculator calc = new Calculator(Double.parseDouble(n1), Double.parseDouble(n2));	
				lblResult.setText( String.valueOf(calc.add()) );
				break;
			}
			case "subtract": {
				Calculator calc = new Calculator(Double.parseDouble(n1), Double.parseDouble(n2));	
				lblResult.setText( String.valueOf(calc.sub()) );
				break;
			}
			case "multiply": {
				Calculator calc = new Calculator(Double.parseDouble(n1), Double.parseDouble(n2));	
				lblResult.setText( String.valueOf(calc.mul()) );
				break;
			}
			case "division": {
				Calculator calc = new Calculator(Double.parseDouble(n1), Double.parseDouble(n2));	
				lblResult.setText( String.valueOf(calc.div()) );
				break;
			}
			default:
				throw new IllegalArgumentException("ERROR: Invalid operation!");
		}
		
	}
}
