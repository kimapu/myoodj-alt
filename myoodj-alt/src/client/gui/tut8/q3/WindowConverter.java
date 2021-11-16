package client.gui.tut8.q3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowConverter extends JFrame {

	FunctionHandler handler = new FunctionHandler();
	
	private JPanel contentPane;
	private JTextField textFieldKilo;
	private JTextField textFieldMile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowConverter frame = new WindowConverter();
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
	public WindowConverter() {
		setTitle("TUTORIAL 8 - Q3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(null);
		
		textFieldKilo = new JTextField();
		textFieldKilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String result = handler.doConvert( "toMile",textFieldKilo.getText());
					textFieldMile.setText(result);
				} catch (Exception e2) {
					textFieldMile.setText("null");
				}
				
			}
		});
		textFieldKilo.setBounds(10, 40, 384, 42);
		panel.add(textFieldKilo);
		textFieldKilo.setColumns(10);
		
		textFieldMile = new JTextField();
		textFieldMile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String result = handler.doConvert( "toKilo",textFieldMile.getText());
					textFieldKilo.setText(result);
				} catch (Exception e2) {
					textFieldKilo.setText("null");
				}
			}
		});
		textFieldMile.setBounds(10, 112, 384, 51);
		panel.add(textFieldMile);
		textFieldMile.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kilometer:");
		lblNewLabel.setBounds(10, 22, 384, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mile:");
		lblNewLabel_1.setBounds(10, 93, 384, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldMile.setText("");
				textFieldKilo.setText("");
				textFieldKilo.requestFocus();
			}
		});
		btnNewButton.setBounds(308, 174, 89, 23);
		panel.add(btnNewButton);
		contentPane.setLayout(gl_contentPane);
	}
}
