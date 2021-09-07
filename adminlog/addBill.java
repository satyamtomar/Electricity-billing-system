package adminlog;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;


public class addBill extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_9;
  
	/**
	 * Create the panel.
	 */
	public addBill() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(215, 126, 181, 27);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 193, 181, 27);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(215, 255, 181, 27);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(215, 315, 181, 27);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(215, 368, 181, 27);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(215, 427, 181, 27);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Type");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(76, 129, 127, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Customer Id");
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(86, 196, 103, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("  Name");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_3.setBounds(86, 258, 82, 16);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(86, 318, 82, 16);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Last Reading");
		lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(79, 371, 124, 16);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New Reading");
		lblNewLabel_6.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(76, 430, 113, 16);
		add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(733, 126, 181, 27);
		add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(733, 193, 181, 27);
		add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(733, 255, 181, 27);
		add(textField_8);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(733, 368, 181, 27);
		add(textField_10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("January");
		comboBox.addItem("February");
		comboBox.addItem("March");
		comboBox.addItem("April");
		comboBox.addItem("May");
		comboBox.addItem("June");
		comboBox.addItem("July");
		comboBox.addItem("August");
		comboBox.addItem("September");
		comboBox.addItem("October");
		comboBox.addItem("November");
		comboBox.addItem("December");
		
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(733, 315, 181, 27);
		add(comboBox);
		
		JButton btnNewButton = new JButton("Calculate Total");
		btnNewButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) 
			{
				String cust_type=textField.getText();
				String cust_id=textField_1.getText();
				String username=textField_2.getText();
				String address=textField_3.getText();
				String Lreading=textField_4.getText();
				String nreading=textField_5.getText();
				int b=Integer.parseInt(nreading)-Integer.parseInt(Lreading);
				String  uu=Integer.toString(b);
				textField_6.setText(uu);
				String rpu=textField_7.getText();
				String sct=textField_8.getText();
				
				double a=Integer.parseInt(uu)*Double.parseDouble(rpu)+Double.parseDouble(sct)*Integer.parseInt(uu)*Double.parseDouble(rpu)*.01;
				textField_9.setText(Double.toString(a));
				
			}
		});
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		btnNewButton.setBounds(759, 414, 155, 35);
		add(btnNewButton);
		
		textField_9 = new JTextField();
		textField_9.setBounds(733, 489, 181, 35);
		add(textField_9);
		textField_9.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(577, 462, 337, 2);
		add(separator);
		
		JLabel lblNewLabel_7 = new JLabel("Unit Consumed");
		lblNewLabel_7.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_7.setForeground(Color.WHITE);
			lblNewLabel_7.setBounds(566, 131, 135, 16);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Rate Per Unit");
		lblNewLabel_8.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(577, 204, 124, 16);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Surcharge Tax");
		lblNewLabel_9.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(566, 266, 125, 16);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Bill Month");
		lblNewLabel_10.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(577, 320, 100, 16);
		add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Due Date");
		lblNewLabel_11.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(588, 373, 89, 16);
		add(lblNewLabel_11);
		
		JLabel lblNewLabel_13 = new JLabel("   Total");
		lblNewLabel_13.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setBounds(588, 498, 91, 16);
		add(lblNewLabel_13);
		
		JButton btnNewButton_1 = new JButton("Add Bill");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String cust_type=textField.getText();
				String cust_id=textField_1.getText();
				String username=textField_2.getText();
				String address=textField_3.getText();
				String Lreading=textField_4.getText();
				String nreading=textField_5.getText();
				int b=Integer.parseInt(nreading)-Integer.parseInt(Lreading);
				String  uu=Integer.toString(b);
				
				textField_6.setText(uu);
				String rpu=textField_7.getText();
				String sct=textField_8.getText();
				double a=Integer.parseInt(uu)*Double.parseDouble(rpu)+Double.parseDouble(sct)*Integer.parseInt(uu)*Double.parseDouble(rpu)*.01;
				String total=Double.toString(a);
				
				String dd=textField_10.getText();
				String bm=comboBox.getSelectedItem().toString();
				
				
				try {
					Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","satyam");
					Statement myStat= myConn.createStatement();
					String query="insert into bill(Bill_id,customer_id,username,address,Lastreading,Newreading,Unitused,rpu,surchargetax,duedate,total,billmonth) values('"+cust_type+"','" +cust_id+"','"+username+"','"+address+"','"+Lreading+"','"+nreading+"','"+uu+"','"+rpu+"','"+sct+"','"+dd+"','"+total+"','"+bm+"')";
		              
					  int x=myStat.executeUpdate(query);
		              if(x==0)
		              {
		            	  JOptionPane.showMessageDialog(null, "Bill Already exists");
		              }
		              else
		            	  JOptionPane.showMessageDialog(null, "Successfully added...Thank You for your time");
					}
				 catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Century Schoolbook", Font.BOLD, 26));
		btnNewButton_1.setBounds(410, 535, 155, 51);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(12, 0, 986, 778);
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\AD\\\\eclipse-workspace\\\\javaswing\\\\src\\\\jswing\\\\image\\\\abbg.jpg"));
		add(lblNewLabel);

	}
}
