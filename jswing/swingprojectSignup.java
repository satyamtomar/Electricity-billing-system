package jswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class swingprojectSignup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingprojectSignup frame = new swingprojectSignup();
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
	public swingprojectSignup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sign Up");
		lblNewLabel_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(206, 23, 116, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(new Color(230, 230, 250));
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_2.setBounds(94, 183, 88, 32);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBackground(new Color(230, 230, 250));
		textField.setBounds(94, 213, 292, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(230, 230, 250));
		passwordField.setBounds(94, 287, 292, 22);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(new Color(230, 230, 250));
		passwordField_1.setBounds(94, 375, 292, 22);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Set Password");
		lblNewLabel_3.setForeground(new Color(230, 230, 250));
		lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_3.setBounds(94, 258, 135, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password");
		lblNewLabel_4.setForeground(new Color(230, 230, 250));
		lblNewLabel_4.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_4.setBounds(97, 343, 154, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Sign Up");
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
				  Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo ","root","satyam");
				  Statement myStat=myConn.createStatement();
				  Statement myStat1=myConn.createStatement();
				  String query1="select Ussn from user order by Ussn desc limit 0,1";
				  ResultSet myRs=myStat1.executeQuery(query1);
				  if(myRs.next()) {
					  Ussn=myRs.getInt("Ussn");
				  }
				  String query="insert into user(Ussn,first_name,last_name,email,password,username) values('"+Ussn+"','" +firstname+"','"+Lastname+"','"+email+"','"+password+"','"+username+"')";
	              Ussn++;
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
		btnNewButton.setBounds(168, 526, 154, 47);
		contentPane.add(btnNewButton);
		
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
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Already a member?Login");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				swingProjectLogin spl=new swingProjectLogin();
				spl.setVisible(true);
			}
		});
		
		lblNewLabel_6.setBackground(new Color(230, 230, 250));
		lblNewLabel_6.setForeground(new Color(230, 230, 250));
		lblNewLabel_6.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_6.setBounds(247, 649, 209, 22);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(398, 200, 56, 32);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("First name");
		lblNewLabel_8.setForeground(new Color(230, 230, 250));
		lblNewLabel_8.setFont(new Font("Century Schoolbook", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(94, 120, 90, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Email ID");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setForeground(new Color(230, 230, 250));
		lblNewLabel_9.setBounds(92, 426, 56, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Last Name\r\n");
		lblNewLabel_10.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_10.setForeground(new Color(230, 230, 250));
		lblNewLabel_10.setBounds(294, 120, 92, 16);
		contentPane.add(lblNewLabel_10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 154, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(294, 154, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(91, 454, 295, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\AD\\\\eclipse-workspace\\\\javaswing\\\\src\\\\jswing\\\\image\\\\sjbg.jpg"));
		lblNewLabel.setBounds(0, 0, 525, 773);
		contentPane.add(lblNewLabel);
	}

}
