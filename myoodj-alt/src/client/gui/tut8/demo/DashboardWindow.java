package client.gui.tut8.demo;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DashboardWindow extends JFrame {

	private JPanel contentPane;
	private JTable table;

	private void onload() {
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow( new String[] {"Celldata1","Celldata2","Celldata3"} );
		model.addRow( new String[] {"Celldata1","Celldata2","Celldata3"} );
		model.addRow( new String[] {"Celldata1","Celldata2","Celldata3"} );
		model.addRow( new String[] {"Celldata1","Celldata2","Celldata3"} );
		model.addRow( new String[] {"Celldata1","Celldata2","Celldata3"} );
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardWindow frame = new DashboardWindow();
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
	public DashboardWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 47, 749, 358);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column 1", "New column 2", "New column 3"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginWindow().setVisible(true);
				DashboardWindow.this.dispose();
			}
		});
		btnNewButton.setBounds(668, 11, 89, 23);
		contentPane.add(btnNewButton);
		onload();
		
	}
}
