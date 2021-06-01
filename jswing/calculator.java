package jswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 656, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(130, 105, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(499, 105, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First no");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.PLAIN, 16));
		lblNewLabel.setBounds(39, 107, 72, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Second no");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(401, 107, 86, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Calculator");
		lblNewLabel_2.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(240, 43, 122, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int n,m,c;
			  n=Integer.parseInt(textField.getText());
			  m=Integer.parseInt(textField_1.getText());
			  c=n+m;
			  textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton.setBounds(162, 185, 107, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtraction");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,m,c;
				  n=Integer.parseInt(textField.getText());
				  m=Integer.parseInt(textField_1.getText());
				  c=n-m;
				  textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_1.setBounds(162, 241, 107, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplication");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				int n,m,c;
				  n=Integer.parseInt(textField.getText());
				  m=Integer.parseInt(textField_1.getText());
				  c=n*m;
				  textField_2.setText(Integer.toString(c));	
			}
		});
		btnNewButton_2.setBounds(396, 185, 107, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Division");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int n,m,c;
				  n=Integer.parseInt(textField.getText());
				  m=Integer.parseInt(textField_1.getText());
				  c=n/m;
				  textField_2.setText(Integer.toString(c));
			}
		});
		btnNewButton_3.setBounds(396, 241, 107, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(272, 330, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
	}

}
