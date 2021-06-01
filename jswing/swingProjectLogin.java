package jswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class swingProjectLogin extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JSeparator separator;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingProjectLogin frame = new swingProjectLogin();
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
	public swingProjectLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 822);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(115, 417, 233, 22);
		contentPane.add(passwordField);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\AD\\eclipse-workspace\\javaswing\\src\\jswing\\image\\pass.png")); 
		lblNewLabel_7.setBounds(360, 406, 47, 44);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\\\Users\\\\AD\\\\eclipse-workspace\\\\javaswing\\\\src\\\\jswing\\\\image\\\\usersj.png"));
		lblNewLabel_5.setBounds(360, 301, 47, 34);
		contentPane.add(lblNewLabel_5);
		
		separator = new JSeparator();
		separator.setForeground(new Color(0, 206, 209));
		separator.setBounds(45, 666, 125, -13);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(209, 163, 91, 16);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.PLAIN, 17));
		lblNewLabel_1.setForeground(Color.CYAN);
		lblNewLabel_2.setBounds(115, 284, 91, 16);
		contentPane.add(lblNewLabel_2);
	
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		textField.setForeground(Color.BLACK);
		textField.setBounds(115, 313, 233, 22);
		contentPane.add(textField);
		textField.setColumns(10);
	
		JLabel btnNewButton = new JLabel("Password");
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 17));
		btnNewButton.setBounds(120, 373, 97, 25);
		contentPane.add(btnNewButton);
		
	
		JCheckBox chckbxNewCheckBox = new JCheckBox("I Agree to all Terms & Conditions");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			}
		});
		chckbxNewCheckBox.setBackground(Color.BLACK);
		chckbxNewCheckBox.setForeground(Color.CYAN);
		chckbxNewCheckBox.setBounds(115, 454, 246, 25);
		contentPane.add(chckbxNewCheckBox);
		

		btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String username=textField.getText();
				String password=passwordField.getText();
				int c=0;
				if(password.equals("")||username.equals("") )
				{
					JOptionPane.showMessageDialog(null,"Fill the  fields first");
				   c=1;
				}
				else if(!chckbxNewCheckBox.isSelected())
				{
					JOptionPane.showMessageDialog(null,"Check the  agree to Terms and Condition checkbox");
					c=1;
				}
				if(c==0) {
				
				try {
					Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","9411571534");
				   Statement myStat=myConn.createStatement();
				   ResultSet myRs=myStat.executeQuery("select * from user where username='"+username+"'"+"and password="+"'"+password+"'");
				   if(myRs.next())
				   {
					 JOptionPane.showMessageDialog(null, "Successful Login");  
				   }
				   else
				   {
					   JOptionPane.showMessageDialog(null, "Wrong password or username...Please retry again");  
					      
				   }
				    } 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		});
		btnNewButton_1.setFont(new Font("Book Antiqua", Font.PLAIN, 23));
		btnNewButton_1.setBackground(new Color(72, 209, 204));
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setBounds(183, 540, 130, 52);
		contentPane.add(btnNewButton_1);
		
		
		lblNewLabel_3 = new JLabel("Forgot Password?");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				
			}
		});
		lblNewLabel_3.setForeground(Color.CYAN);
		lblNewLabel_3.setBounds(102, 637, 112, 16);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Not registered? SignUp!");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				swingprojectSignup sps=new swingprojectSignup();
				sps.setVisible(true);
				
			}
		});
		lblNewLabel_4.setForeground(Color.CYAN);
		lblNewLabel_4.setBounds(261, 637, 153, 16);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel = new JLabel("New label");
		 lblNewLabel.setForeground(Color.CYAN);
		 lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AD\\eclipse-workspace\\javaswing\\src\\jswing\\image\\sjlogin.jpg"));
		lblNewLabel.setBounds(12, 0, 477, 775);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(373, 414, 56, 16);
		contentPane.add(lblNewLabel_6);
		
		
		
		
		
			}
}
