package client.gui.tut8.q5;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.UUID;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import solution.tut8.all.Staff;

public class WindowDataListing extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnDelete;
	private JButton btnEdit;
	private JButton btnAddNew;
	private JPanel panel_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textFieldName;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textFieldUsername;
	private JTextField textFieldPwd;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textFieldAddr;
	private JTextField textFieldDOB;
	private JLabel lblNewLabel_7;
	private JTextField textFieldJobRole;
	private JLabel lblNewLabel_8;
	private JTextField textFieldID;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowDataListing frame = new WindowDataListing();
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
	public WindowDataListing() {
		setTitle("TUTORIAL 8 - Q5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 687);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 877, 298);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = table_1.getSelectedRow();
				DefaultTableModel m = (DefaultTableModel)table_1.getModel();
				Vector<String> row = m.getDataVector().elementAt(selectedRow);
				//System.out.println( row );
				textFieldID.setText(row.get(0));
				textFieldName.setText(row.get(1));
				textFieldAddr.setText(row.get(2));
				textFieldDOB.setText(row.get(3));
				textFieldJobRole.setText(row.get(4));
				textFieldUsername.setText(row.get(5));
				textFieldPwd.setText(row.get(6));
				btnDelete.setEnabled(true);
				btnEdit.setEnabled(true);
			}
		});
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NAME", "ADDRESS", "DOB", "USERNAME", "PASSWORD", "JOB ROLE"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane_1.setViewportView(table_1);
		
		panel = new JPanel();
		panel.setBounds(10, 320, 438, 210);
		contentPane.add(panel);
		
		lblNewLabel = new JLabel("PERSONAL PROFILE:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		
		lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldName = new JTextField();
		textFieldName.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Address:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_6 = new JLabel("DOB:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldAddr = new JTextField();
		textFieldAddr.setColumns(10);
		
		textFieldDOB = new JTextField();
		textFieldDOB.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Job Role:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldJobRole = new JTextField();
		textFieldJobRole.setColumns(10);
		
		lblNewLabel_8 = new JLabel("ID:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldID = new JTextField();
		textFieldID.setEnabled(false);
		textFieldID.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_8))
							.addGap(42)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldDOB, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
								.addComponent(textFieldAddr, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
								.addComponent(textFieldName, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
								.addComponent(textFieldJobRole, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
								.addComponent(textFieldID, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_8)
						.addComponent(textFieldID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(14)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5)
								.addComponent(textFieldAddr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_6)
						.addComponent(textFieldDOB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_7)
						.addComponent(textFieldJobRole, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panel_1 = new JPanel();
		panel_1.setBounds(10, 541, 877, 81);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table_1.getSelectedRow();
				DefaultTableModel m = (DefaultTableModel)table_1.getModel();
				m.removeRow(selectedRow);
				btnDelete.setEnabled(false);
				btnEdit.setEnabled(false);
			}
		});
		btnDelete.setEnabled(false);
		btnDelete.setBounds(503, 11, 92, 49);
		btnDelete.setFont(new Font("Arial", Font.BOLD, 11));
		panel_1.add(btnDelete);
		
		btnEdit = new JButton("EDIT");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table_1.getSelectedRow();
				DefaultTableModel m = (DefaultTableModel)table_1.getModel();
				
				String name = textFieldName.getText();
				String addr = textFieldAddr.getText();
				String jobRole = textFieldJobRole.getText();
				String dob = textFieldDOB.getText();
				String username = textFieldUsername.getText();
				String pwd = textFieldPwd.getText();
				
				m.setValueAt(name, selectedRow, 1);
				m.setValueAt(addr, selectedRow, 2);
				m.setValueAt(dob, selectedRow, 3);
				m.setValueAt(username, selectedRow, 4);
				m.setValueAt(pwd, selectedRow, 5);
				m.setValueAt(jobRole, selectedRow, 6);
			}
		});
		btnEdit.setEnabled(false);
		btnEdit.setBounds(607, 11, 63, 49);
		btnEdit.setFont(new Font("Arial", Font.BOLD, 11));
		panel_1.add(btnEdit);
		
		btnAddNew = new JButton("ADD NEW");
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String uuid = UUID.randomUUID().toString();
				String name = textFieldName.getText();
				String addr = textFieldAddr.getText();
				String jobRole = textFieldJobRole.getText();
				String dob = textFieldDOB.getText();
				String username = textFieldUsername.getText();
				String pwd = textFieldPwd.getText();
				
				Staff s1 = new Staff(
						uuid,
						name,
						addr,
						dob,
						jobRole,
						username,
						pwd);
				//s1.create();
				DefaultTableModel model = (DefaultTableModel)table_1.getModel();
				model.addRow( new String[] {uuid, name, addr, dob, username, pwd, jobRole} );
			}
		});
		btnAddNew.setBounds(765, 11, 102, 49);
		btnAddNew.setFont(new Font("Arial", Font.BOLD, 11));
		panel_1.add(btnAddNew);
		
		btnNewButton = new JButton("CLEAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldID.setText("");
				textFieldName.setText("");
				textFieldAddr.setText("");
				textFieldDOB.setText("");
				textFieldJobRole.setText("");
				textFieldUsername.setText("");
				textFieldPwd.setText("");
				textFieldName.requestFocus();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setBounds(680, 11, 75, 49);
		panel_1.add(btnNewButton);
		
		btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WindowDataListing.this.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_1.setBounds(10, 11, 92, 49);
		panel_1.add(btnNewButton_1);
		
		panel_2 = new JPanel();
		panel_2.setBounds(458, 320, 429, 210);
		contentPane.add(panel_2);
		
		lblNewLabel_1 = new JLabel("LOGIN CREDENTIAL:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		
		lblNewLabel_3 = new JLabel("Username:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_4 = new JLabel("Password:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldUsername = new JTextField();
		textFieldUsername.setColumns(10);
		
		textFieldPwd = new JTextField();
		textFieldPwd.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_3))
							.addGap(24)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldUsername, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
								.addComponent(textFieldPwd, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textFieldUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textFieldPwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(148, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		textFieldName.requestFocus();
	}
}
