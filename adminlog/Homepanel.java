package adminlog;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Homepanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public Homepanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 973, 678);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\AD\\eclipse-workspace\\javaswing\\src\\jswing\\image\\bgsj.jpg"));
		add(lblNewLabel);

	}
}
