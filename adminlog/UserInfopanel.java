package adminlog;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.*;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UserInfopanel extends JPanel {
	private JTable table_1;
	private JScrollPane scrollPane;
	private JTextField fn;
	private JTextField ln;
	private JTextField un;
	private JTextField mail;
	private JPasswordField pwd;
	private JTextField idVal;
	JPanel Backpanel;
	
	public UserInfopanel() 
	{ 

		setBounds(4, 0, 952,632);
                setBackground(Color.DARK_GRAY);
		table_1 = new JTable();	
		String[] col = new String[] {"Ussn",
			"Fname" , "Lname", "UserName", "password", "MailId"," Change ","DROP"
	        };
		table_1.setModel(new DefaultTableModel(
			new Object[][] {},
			col
		));

		//creating scroll pane and adding table to it........
		scrollPane = new JScrollPane(table_1);
		scrollPane.setBounds(0, 13, 952, 619);
		loadData();
		table_1.setRowHeight(32);
		
		// displaying values inside at center.......		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table_1.setDefaultRenderer(String.class, centerRenderer);
	
		// adding column names.....	
		for(int x=0;x<col.length ;x++){
			table_1.getColumnModel().getColumn(x).setCellRenderer( centerRenderer );
		}
	
		// finally add all to panel.......	
		table_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		setLayout(null);
		add(scrollPane);
		scrollPane.setViewportView(table_1);

       }  // closing constructor

// load data is fn to load DB values to table.......
   
     private void loadData() {
	String url = "jdbc:mysql://localhost:3306/demo";
	String root = "root";
	String pass = "9411571534";

        try {
        	Connection conn = DriverManager.getConnection(url, root, pass);
                Statement stmt = conn.createStatement() ;

               ResultSet rs = stmt.executeQuery("select * from user ORDER BY Ussn ASC");

            while(rs.next()) {
            	String usn = rs.getString("Ussn");
            	String fn = rs.getString("first_name");
            	String ln = rs.getString("last_name");
            	String un = rs.getString("username");
            	String ps = rs.getString("password");
            	String ml = rs.getString("email");
            	
            	String[] data = {usn,fn,ln,un,ps,ml,"EDIT","<HTML><BODY><SPAN color = \'red\'><u>DELETE</u></SPAN></BODY></HTML>"};
            	DefaultTableModel defModel = (DefaultTableModel)table_1.getModel();
            	defModel.addRow(data);
            }

        } catch (Exception e) {
        	System.out.println(e.getLocalizedMessage());
        }

    }

	// one more function to make our own JOptionPane
     public static void showMessageBox(final String strTitle, final String strMessage , int messageType , int width , int height) {
	    //Redone for larger OK button
	    JOptionPane theOptionPane = new JOptionPane(strMessage,messageType);
	    JPanel buttonPanel = (JPanel)theOptionPane.getComponent(1);
	     // get the handle to the ok button
	    JButton buttonOk = (JButton)buttonPanel.getComponent(0);
	    // set the text
	    buttonOk.setText(" OK ");
	    buttonOk.setPreferredSize(new Dimension(width,height));  //Set Button size here
	   buttonOk.validate();
	   JDialog theDialog = theOptionPane.createDialog(null,strTitle);
	   theDialog.setVisible(true);  //present your new optionpane to the world.
    }

}