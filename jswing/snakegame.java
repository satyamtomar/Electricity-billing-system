package jswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class snakegame implements KeyListener{

	private JFrame frame;
private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					snakegame window = new snakegame();
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
	public snakegame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 674, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
	 
	lblNewLabel=new JLabel("");
		
			
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(348, 226, 56, 29);
		frame.getContentPane().add(lblNewLabel);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_A)
		{
			
		  lblNewLabel.setLocation(lblNewLabel.getX()-10, lblNewLabel.getY());
		}
		else if(e.getKeyCode()==KeyEvent.VK_S)
		  lblNewLabel.setLocation(lblNewLabel.getX(), lblNewLabel.getY()+10);
		else if(e.getKeyCode()==KeyEvent.VK_D)
		  lblNewLabel.setLocation(lblNewLabel.getX()+10, lblNewLabel.getY());
		else if(e.getKeyCode()==KeyEvent.VK_F)
		  lblNewLabel.setLocation(lblNewLabel.getX(), lblNewLabel.getY()-10);
         
		
	}
	

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
