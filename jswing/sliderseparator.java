package jswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JSeparator;
import java.awt.Color;

public class sliderseparator {

	private JFrame frame;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sliderseparator window = new sliderseparator();
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
	public sliderseparator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 642, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) 
			{
				lblNewLabel.setText(Integer.toString(slider.getValue()));
			}
		});
		slider.setMajorTickSpacing(10);
		slider.setValue(0);
		slider.setBounds(153, 70, 404, 53);
		frame.getContentPane().add(slider);
		
		 lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(284, 240, 68, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(489, 198, -335, -18);
		frame.getContentPane().add(separator);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(133, 189, 404, 38);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.ORANGE);
		separator_7.setBounds(163, 143, 374, 23);
		frame.getContentPane().add(separator_7);
	}
}
