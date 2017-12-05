//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JButton;
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.Font;
//import javax.swing.JPanel;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.JScrollPane;
//import javax.swing.ScrollPaneConstants;
//import javax.swing.JLabel;
//import javax.swing.JScrollBar;
//
//public class ClippyUI {
//
//	private JFrame frame;
//	private JTable table;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					//ClippyUI window = new ClippyUI();
//					//window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public ClippyUI() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.getContentPane().setBackground(new Color(240, 240, 240));
//		frame.setBounds(100, 100, 1024, 768);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JButton catalog = new JButton("Catalog");
//		catalog.setFont(new Font("Tahoma", Font.PLAIN, 23));
//		catalog.setForeground(Color.BLUE);
//		catalog.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//			}
//		});
//		catalog.setBounds(0, 0, 151, 182);
//		frame.getContentPane().add(catalog);
//		
//		JButton invoiceHistory = new JButton("Invoice\nHistory");
//		invoiceHistory.setFont(new Font("Tahoma", Font.PLAIN, 19));
//		invoiceHistory.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		invoiceHistory.setForeground(Color.GREEN);
//		invoiceHistory.setBounds(0, 182, 151, 182);
//		frame.getContentPane().add(invoiceHistory);
//		
//		JButton invoice = new JButton("Invoice");
//		invoice.setFont(new Font("Tahoma", Font.PLAIN, 23));
//		invoice.setForeground(Color.RED);
//		invoice.setBounds(0, 364, 151, 182);
//		frame.getContentPane().add(invoice);
//		
//		JButton manager = new JButton("Manager");
//		manager.setFont(new Font("Tahoma", Font.PLAIN, 23));
//		manager.setForeground(Color.ORANGE);
//		manager.setBounds(0, 546, 151, 182);
//		frame.getContentPane().add(manager);
//		
//		table = new JTable();
//		table.setRowSelectionAllowed(false);
//		table.setModel(new DefaultTableModel(
//			new Object[][] {
//				{"234356", "John Doe", "36 Large Paper Clips", "$10.25"},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//				{null, null, null, null},
//			},
//			new String[] {
//				"Invoice #", "Name", "Order Description", "Total Price"
//			}
//		));
//		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		table.setFillsViewportHeight(true);
//		table.setBounds(150, 66, 858, 676);
//		frame.getContentPane().add(table);
//		
//		JLabel lblNewLabel = new JLabel("Invoice History");
//		lblNewLabel.setForeground(Color.GREEN);
//		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
//		lblNewLabel.setBounds(473, 0, 245, 41);
//		frame.getContentPane().add(lblNewLabel);
//	}
//}
