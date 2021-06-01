package adminlog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Editpanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public Editpanel()
	{
		setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setForeground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel_2.setBounds(224, 165, 112, 31);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New Username");
		lblNewLabel_1.setForeground(new Color(95, 158, 160));
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel_1.setBounds(207, 107, 139, 23);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(443, 109, 237, 22);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(443, 171, 237, 22);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name");
		lblNewLabel_3.setForeground(new Color(95, 158, 160));
		lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel_3.setBounds(224, 232, 112, 16);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(443, 231, 237, 22);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("     Email");
		lblNewLabel_4.setForeground(new Color(95, 158, 160));
		lblNewLabel_4.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel_4.setBounds(207, 292, 93, 16);
		add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(443, 291, 237, 22);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("  Password");
		lblNewLabel_5.setForeground(new Color(95, 158, 160));
		lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel_5.setBounds(224, 353, 112, 16);
		add(lblNewLabel_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(443, 352, 237, 22);
		add(passwordField);
		
		JLabel lblNewLabel_6 = new JLabel("Username");
		lblNewLabel_6.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		lblNewLabel_6.setForeground(new Color(95, 158, 160));
		lblNewLabel_6.setBounds(224, 56, 112, 16);
		add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(443, 55, 237, 22);
		add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Edit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try
				{
					String us=textField_4.getText();
					String nus=textField.getText();
					String fn=textField_1.getText();
					String ln=textField_2.getText();
					String em=textField_3.getText();
					String ps=passwordField.getText();
					Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","9411571534");
					Statement myStat= connection.createStatement();
					
					String query="update user set username='"+nus+"',first_name='"+fn+"',last_name='"+ln+"',email='"+em+"',password='"+ps+"' where username='"+us+"'"  ;
					int rowsaffected=myStat.executeUpdate(query);
					if(rowsaffected ==0)
					{
						JOptionPane.showMessageDialog(null, "Username does not exist...Please use a valid username");
					}
					else
						JOptionPane.showMessageDialog(null, "Successfully edited");
				}
		   catch(Exception e)
				{
			     e.printStackTrace();
				}

			}
		});
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 23));
		btnNewButton.setBackground(new Color(95, 158, 160));
		btnNewButton.setForeground(new Color(230, 230, 250));
		btnNewButton.setBounds(376, 453, 126, 52);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AD\\eclipse-workspace\\javaswing\\src\\jswing\\image\\epbg.jpg"));
		lblNewLabel.setBounds(0, 0, 976, 669);
		add(lblNewLabel);
	}
}
