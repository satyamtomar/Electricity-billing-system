package jswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class jlist {

	private JFrame frame;
	private JTextField textField;
	private JList<String> list;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jlist window = new jlist();
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
	public jlist() {
		initialize();
	}
	DefaultListModel m=new DefaultListModel();
	public void add(String n)
    {
	 list.setModel(m);
	 m.addElement(n);
    }
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(42, 73, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				add(textField.getText());
			}
		});
		btnNewButton.setBounds(244, 72, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 15));
		list.setForeground(Color.MAGENTA);
		list.setBounds(329, 235, -269, -122);
		frame.getContentPane().add(list);
	}
}
