package adminlog;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import jswing.swingProjectAdmin;
import jswing.swingProjectLogin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Addcustomer extends JPanel {
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public Addcustomer() {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Add User");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel_1.setBounds(373, 35, 171, 47);
		 add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_2.setBounds(305, 180, 88, 32);
		 add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(305, 225, 292, 22);
		add(textField);
		textField.setColumns(10);
		add(textField );
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(305, 291, 292, 22);
		  add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(Color.WHITE);
		passwordField_1.setBounds(306, 355, 292, 22);
		 add(passwordField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Set Password");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_3.setBounds(305, 260, 135, 16);
		 add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_4.setBounds(302, 326, 154, 16);
		 add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Add User");
		btnNewButton.setForeground(new Color(95, 158, 160));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				String firstname=textField_1.getText();
				String Lastname=textField_2.getText();
				String username=textField.getText();
				String email=textField_3.getText();
				String password=passwordField.getText();
				String Cpassword=passwordField_1.getText();
	            int c=0;			
				if(firstname.equals("")||Lastname.equals("")||email.equals("")||password.equals("")||Cpassword.equals("")||username.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Fill the  fields first");
                    c=1;
				}
					else if(! password.equals(Cpassword))
				{
					JOptionPane.showMessageDialog(null,"Password does not match confirm password");
			        c=1;
				}
					if(c==0) {
				try 
				{
					int Ussn = 0;
				  Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo ","root","9411571534");
				  Statement myStat=myConn.createStatement();
				  Statement myStat1=myConn.createStatement();
				  String query1="select Ussn from user order by Ussn desc limit 0,1";
				  ResultSet myRs=myStat1.executeQuery(query1);
				  if(myRs.next()) {
					  Ussn=myRs.getInt("Ussn");
				  }
				  Ussn++;
				  String query="insert into user(Ussn,first_name,last_name,email,password,username) values('"+Ussn+"','" +firstname+"','"+Lastname+"','"+email+"','"+password+"','"+username+"')";
	              
				  int x=myStat.executeUpdate(query);
	              if(x==0)
	              {
	            	  JOptionPane.showMessageDialog(null, "User Already exists");
	              }
	              else
	            	  JOptionPane.showMessageDialog(null, "Successfully Registered...Thank You for your time");
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				}
   			}
		});
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 26));
		btnNewButton.setBounds(373, 503, 171, 47);
		 add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Admin page");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				swingProjectAdmin spa=new swingProjectAdmin();
				spa.setVisible(true);
			}
		});
		lblNewLabel_5.setBackground(new Color(230, 230, 250));
		lblNewLabel_5.setForeground(new Color(230, 230, 250));
		lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_5.setBounds(78, 649, 135, 22);
		  add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Already a member?Login");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				JOptionPane.showMessageDialog(null,"");
			}
		});
		
		lblNewLabel_6.setBackground(new Color(230, 230, 250));
		lblNewLabel_6.setForeground(new Color(230, 230, 250));
		lblNewLabel_6.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_6.setBounds(247, 649, 209, 22);
		  add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(398, 200, 56, 32);
		 add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("First name");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Century Schoolbook", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(319, 116, 90, 16);
		 add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Email ID");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(305, 390, 56, 16);
		 add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Last Name\r\n");
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setBounds(491, 116, 92, 16);
		 add(lblNewLabel_10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(305, 145, 116, 22);
		add(textField_1);
		textField_1.setColumns(10);
		add(textField_1);
		textField_2 = new JTextField();
		textField_2.setBounds(481, 145, 116, 22);
		add(textField_2);
		textField_2.setColumns(10);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(305, 419, 295, 22);
		add(textField_3);
		textField_3.setColumns(10);
		add(textField_3);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\AD\\\\eclipse-workspace\\\\javaswing\\\\src\\\\jswing\\\\image\\\\acbg.jpg"));
		lblNewLabel.setBounds(0, 0, 992, 642);
		add(lblNewLabel);

	}
}
