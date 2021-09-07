package jswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminlog extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTable table;
    private  Vector columnnames;
    private  Vector data;
    private int columns;
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminlog frame = new adminlog();
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
	public adminlog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable(data,columnnames) {
		public Class getColumnClass(int columns)
		{
			for(int row=0;row<getRowCount();row++)
			{
				Object o=getValueAt(row,columns);
				if(o!=null)
				{
					return o.getClass();
				}
				}
				return Object.class;
		}
				
		};
		JScrollPane scrollPane=new JScrollPane(table);
		contentPane.add(scrollPane);
		table.setBounds(12, 115, 677, 299);
		contentPane.add(table);
		
		lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(28, 74, 82, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("First_name");
		lblNewLabel.setBounds(28, 13, 69, 28);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(124, 16, 176, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try {
					Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","satyam");
				   
				
			   }
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			});
		btnNewButton.setBounds(335, 15, 97, 25);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("email id");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(271, 80, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(487, 81, 82, 16);
		contentPane.add(lblNewLabel_3);
	}
}
