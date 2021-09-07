package adminlog;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class viewBill extends JPanel {
	private JTable table_1;
	private JScrollPane scrollPane;
	private JTextField Bill_id;
	private JTextField Cust_id;
	private JTextField un;
	private JTextField lr;
	private JTextField nr;
	private JTextField uu;
	private JTextField rpu;
	private JTextField sct;
	private JTextField  bm;
	private JTextField dd;
	JPanel Backpanel;
	/**
	 * Create the panel.
	 */
	public viewBill()
	{

		setBounds(4, 0, 952,632);
                setBackground(Color.DARK_GRAY);
		table_1 = new JTable();	
		String[] col = new String[] {"BIll_id",
			"Cust_id" , "Username", "LastReading", "NewReading", "UnitUsed","rpu","Tax","Month","DueDate","total"," Change ","DROP"
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
	String pass = "satyam";

        try {
        	Connection conn = DriverManager.getConnection(url, root, pass);
                Statement stmt = conn.createStatement() ;

               ResultSet rs = stmt.executeQuery("select * from bill ORDER BY Bill_id ASC");

            while(rs.next()) {
            	String Bill_id = rs.getString("Bill_id");
            	String Cust_id = rs.getString("Customer_id");
            	String lr = rs.getString("LastReading");
            	String un = rs.getString("Username");
            	String nr = rs.getString("NewReading");
            	String uu = rs.getString("UnitUsed");
            	String rpu = rs.getString("rpu");
            	String sct = rs.getString("surchargetax");
            	String bm = rs.getString("billMonth");
            	String dd = rs.getString("Duedate");
            	String total=rs.getString("total");
            	
            	String[] data = {Bill_id,Cust_id,lr,un,nr,uu,rpu,sct,bm,dd,total,"EDIT","<HTML><BODY><SPAN color = \'red\'><u>DELETE</u></SPAN></BODY></HTML>"};
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

