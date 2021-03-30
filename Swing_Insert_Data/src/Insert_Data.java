import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Insert_Data extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField address;
	private JTextField mobile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Insert_Data frame = new Insert_Data();
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
	public Insert_Data() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name = new JTextField();
		name.setBounds(150, 126, 283, 40);
		contentPane.add(name);
		name.setColumns(10);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(150, 197, 283, 40);
		contentPane.add(address);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 638, 667);
		contentPane.add(panel);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(150, 266, 283, 40);
		panel.add(mobile);
		
		JButton save = new JButton("Save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name1=name.getText();
				String address1=address.getText();
				String mobile1=mobile.getText();	
				
				try{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dipak","dipak");			
					Statement stmt=con.createStatement();
					
							
				}
				
				catch(Exception e)
				{
					System.out.println(e);	
				}
				}
		});
		save.setBounds(366, 359, 97, 40);
		panel.add(save);
	}
}
