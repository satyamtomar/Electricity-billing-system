package jswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class component1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
     private JLabel lblNewLabel_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					component1 window = new component1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public component1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login ");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblNewLabel.setBounds(186, 29, 56, 33);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(154, 84, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 139, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(51, 87, 68, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(52, 139, 67, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
			JOptionPane.showMessageDialog(null, textField);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(164, 186, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		 lblNewLabel_3 = new JLabel("New label");
		 lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\AD\\eclipse-workspace\\javaswing\\src\\jswing\\image\\LOGIN.jpg"));
		 lblNewLabel_3.setBounds(46, 29, 289, 207);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
