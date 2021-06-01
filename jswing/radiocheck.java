package jswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class radiocheck {

	private JFrame frame;
    private JCheckBox chckbxNewCheckBox;
    private JCheckBox chckbxNewCheckBox_1;
    private JCheckBox chckbxNewCheckBox_2;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnNewRadioButton_1;
    private JRadioButton rdbtnNewRadioButton_2;
    private JButton btnNewButton;
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radiocheck window = new radiocheck();
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
	public radiocheck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 656, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 chckbxNewCheckBox = new JCheckBox("BTECH");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(chckbxNewCheckBox.isSelected())
				{
					chckbxNewCheckBox_1.setSelected(false);
					chckbxNewCheckBox_2.setSelected(false);
				}
			}
		});
		chckbxNewCheckBox.setBounds(27, 58, 113, 25);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		 chckbxNewCheckBox_1 = new JCheckBox("MTECH");
		 chckbxNewCheckBox_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e)
		 	{
		 		if(chckbxNewCheckBox_1.isSelected())
				{
					chckbxNewCheckBox.setSelected(false);
					chckbxNewCheckBox_2.setSelected(false);
				}
			
		 	}
		 	
		 });
		chckbxNewCheckBox_1.setBounds(27, 124, 113, 25);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		 chckbxNewCheckBox_2 = new JCheckBox("PHD");
		 chckbxNewCheckBox_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		if(chckbxNewCheckBox_2.isSelected())
				{
					chckbxNewCheckBox.setSelected(false);
					chckbxNewCheckBox_1.setSelected(false);
				}
			
		 	}
		 });
		chckbxNewCheckBox_2.setBounds(27, 178, 113, 25);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		 rdbtnNewRadioButton = new JRadioButton("18-23");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( rdbtnNewRadioButton.isSelected())
				{
					 rdbtnNewRadioButton_1.setSelected(false);
					 rdbtnNewRadioButton_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton.setBounds(377, 58, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		 rdbtnNewRadioButton_1 = new JRadioButton("24-30");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if( rdbtnNewRadioButton_1.isSelected())
				{
					 rdbtnNewRadioButton.setSelected(false);
					 rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.setBounds(377, 124, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		 rdbtnNewRadioButton_2 = new JRadioButton(">30");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if( rdbtnNewRadioButton_2.isSelected())
				{
					 rdbtnNewRadioButton.setSelected(false);
					 rdbtnNewRadioButton_1.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2.setBounds(377, 178, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(chckbxNewCheckBox.isSelected())
				{
				   JOptionPane.showMessageDialog(null,"You have selected BTECH");
				}
				if(chckbxNewCheckBox_1.isSelected())
				{
				   JOptionPane.showMessageDialog(null,"You have selected MTECH");
				}
				if(chckbxNewCheckBox_2.isSelected())
				{
				   JOptionPane.showMessageDialog(null,"You have selected PHD");
				}
				if(rdbtnNewRadioButton.isSelected())
				{
				   JOptionPane.showMessageDialog(null,"Your age is between 18 to 23 ");
				}
				if(rdbtnNewRadioButton_1.isSelected())
				{
				   JOptionPane.showMessageDialog(null,"Your age is in between 24 to 30");
				}
				if(rdbtnNewRadioButton_2.isSelected())
				{
				   JOptionPane.showMessageDialog(null,"Your age above 30");
				}
			}
		});
		btnNewButton.setBounds(203, 282, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
