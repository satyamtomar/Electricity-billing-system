package adminlog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;

public class Home extends JFrame {

	private JPanel contentPane;
	private JLayeredPane panel_1;
	private JPanel hpanel;
	private JPanel upanel;
	private JPanel epanel;
	private JPanel apanel;
	private JPanel bpanel;
	private JPanel panel_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 697);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 945, 56);
		contentPane.add(panel);
		panel.setLayout(null);
	
		JButton btnNewButton_5 = new JButton("View Bill");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				panel_1.removeAll();
				viewBill obj =new viewBill();
				panel_1.add(obj);
				panel_1.repaint();
				panel_1.revalidate();
				
				
			}
		});
		btnNewButton_5.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		btnNewButton_5.setBounds(784, 0, 161, 54);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				panel_1.removeAll();
				Homepanel obj =new Homepanel();
				   
				
				panel_1.add(obj);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		btnNewButton.setBounds(0, 0, 152, 55);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UserInfo");
		btnNewButton_1.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				panel_1.removeAll();
				UserInfopanel obj1 =new UserInfopanel();
				   
				
				panel_1.add(obj1);
				panel_1.repaint();
				panel_1.revalidate();
				
			}
		});
		btnNewButton_1.setBounds(147, 0, 152, 55);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Edit User");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				panel_1.removeAll();
				Editpanel obj2 =new Editpanel();
				   
				
				panel_1.add(obj2);
				panel_1.repaint();
				panel_1.revalidate();
				
			}
		});
		btnNewButton_2.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		btnNewButton_2.setBounds(293, 0, 152, 55);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Add user");
		btnNewButton_3.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		btnNewButton_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				panel_1.removeAll();
				Addcustomer obj4 =new Addcustomer();
				   
				
				panel_1.add(obj4);
				panel_1.repaint();
				panel_1.revalidate();
				
			}
		});
		btnNewButton_3.setBounds(443, 0, 178, 55);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Add Bill");
		btnNewButton_4.setFont(new Font("Century Schoolbook", Font.BOLD, 18));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				addBill obj5=new addBill();
				panel_1.removeAll();
				panel_1.add(obj5);
				panel_1.repaint();
				panel_1.revalidate();
			}
		});
		btnNewButton_4.setBounds(621, 0, 163, 55);
		panel.add(btnNewButton_4);
		
	
		
		
		
		panel_1 = new JLayeredPane();
		panel_1.setBounds(0, 50, 946, 624);
		contentPane.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		Homepanel obj3=new Homepanel();
		panel_1.removeAll();
		panel_1.add(obj3);
		panel_1.repaint();
		panel_1.revalidate();
		
		
	
	    panel_1.setVisible(true);
	    contentPane.setVisible(true);
		
	}
}
