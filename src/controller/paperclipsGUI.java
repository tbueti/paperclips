import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// File: paperclipsGUI.java
// Author: Thomas Bueti
// NetID: tbueti

// Controller Class
public class paperclipsGUI extends JFrame {
	
	// Main
	public static void main(String[] args) {
		
		// Start
		paperclipsGUI g = new paperclipsGUI();
		g.setVisible(true);
	}
	
	// Class members
	private static final int width = 1024;
	private static final int height = 800;
	private JPanel currentView;
	private invoicesView iv;
	private categoryView cv;
	private historyView hv;
	private managerView mv;
	private pos system;
	
	// Constructor
	public paperclipsGUI() {
		
		// Initialize
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.setLocation(100, 40);
		this.setTitle("Paperclips POS System");
		this.currentView = null;
		this.system = new pos();
		
		// Create the views
		iv = new invoicesView(system, width, height);
		cv = new categoryView(system, width, height);
		hv = new historyView(system, width, height);
		mv = new managerView(system, width, height);
		
		// Create the tab buttons
		JButton catalog = new JButton("Catalog");
		catalog.setFont(new Font("Tahoma", Font.BOLD, 23));
		catalog.setForeground(Color.WHITE);
		catalog.setBackground(Color.BLUE);
		catalog.setOpaque(true);
		catalog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				currentView = cv;
			}
		});
		catalog.setBounds(0, 0, 151, 182);
		this.getContentPane().add(catalog);
		
		JButton invoiceHistory = new JButton("History");
		invoiceHistory.setFont(new Font("Tahoma", Font.BOLD, 23));
		invoiceHistory.setForeground(Color.WHITE);
		invoiceHistory.setBackground(Color.GREEN);
		invoiceHistory.setOpaque(true);
		invoiceHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				currentView = hv;
			}
		});
		invoiceHistory.setBounds(0, 182, 151, 182);
		this.getContentPane().add(invoiceHistory);
		
		JButton invoice = new JButton("Invoice");
		invoice.setFont(new Font("Green", Font.BOLD, 23));
		invoice.setForeground(Color.WHITE);
		invoice.setBackground(Color.RED);
		invoice.setOpaque(true);
		invoice.setBounds(0, 364, 151, 182);
		invoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				currentView = iv;
			}
		});
		this.getContentPane().add(invoice);
		
		JButton manager = new JButton("Manager");
		manager.setFont(new Font("Tahoma", Font.BOLD, 23));
		manager.setForeground(Color.WHITE);
		manager.setBackground(Color.ORANGE);
		manager.setOpaque(true);
		manager.setBounds(0, 546, 151, 182);
		manager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				currentView = mv;
			}
		});
		this.getContentPane().add(manager);
		this.setLayout(null);
		
		// Set the current view to the catalog view
		this.currentView = cv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}