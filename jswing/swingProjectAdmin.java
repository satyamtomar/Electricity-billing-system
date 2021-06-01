package jswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import adminlog.Home;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swingProjectAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingProjectAdmin frame = new swingProjectAdmin();
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
	public swingProjectAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1096, 643);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Forgot Password?");
		lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_5.setForeground(new Color(230, 230, 250));
		lblNewLabel_5.setBounds(745, 494, 165, 22);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String username=textField.getText();
				String password=textField_1.getText();
			
			int c=0;
			if(password.equals("")||username.equals("") )
			{
				JOptionPane.showMessageDialog(null,"Fill the  fields first");
			   c=1;
			}
	if(c==0) {
				
				try {
					Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","9411571534");
				   Statement myStat=myConn.createStatement();
				   ResultSet myRs=myStat.executeQuery("select * from admin where username='"+username+"'"+"and password="+"'"+password+"'");
				   if(myRs.next())
				   {
					Home obj=new Home();
					obj.setVisible(true);
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
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 24));
		btnNewButton.setBounds(763, 445, 118, 36);
		contentPane.add(btnNewButton);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(704, 390, 232, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_4.setForeground(new Color(230, 230, 250));
		lblNewLabel_4.setBounds(704, 361, 81, 16);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(704, 307, 232, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Username");
		lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_3.setForeground(new Color(230, 230, 250));
		lblNewLabel_3.setBounds(704, 278, 92, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\\\Users\\\\AD\\\\eclipse-workspace\\\\javaswing\\\\src\\\\jswing\\\\image\\\\adminlogo.png"));
		lblNewLabel_2.setBounds(732, 0, 178, 167);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Login");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_1.setBounds(704, 180, 245, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("User Login");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				swingProjectLogin spl =new swingProjectLogin();
				spl.setVisible(true);
			}
		});
		lblNewLabel_6.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_6.setForeground(new Color(230, 230, 250));
		lblNewLabel_6.setBounds(704, 545, 92, 27);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("SignUp");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				swingprojectSignup sps=new swingprojectSignup();
				sps.setVisible(true);
						
			}
		});
		lblNewLabel_7.setFont(new Font("Century Schoolbook", Font.BOLD, 16));
		lblNewLabel_7.setForeground(new Color(230, 230, 250));
		lblNewLabel_7.setBounds(868, 545, 81, 27);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AD\\eclipse-workspace\\javaswing\\src\\jswing\\image\\adminbg.jpg"));
		lblNewLabel.setBounds(0, 0, 1078, 596);
		contentPane.add(lblNewLabel);
	}
}
