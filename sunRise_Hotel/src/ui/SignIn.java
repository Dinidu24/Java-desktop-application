package ui;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignIn extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
   /*
 	InstantiationException
	IllegalAccessException
	exception occurs while creating and displaying frame
	InvocationTargetException
	ClassCastException
	NoSuchMethodException
	RuntimeException (and its subclasses)
    */
	//Launching the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//creating the frame
	public SignIn() {
		setFont(new Font("Brush Script MT", Font.PLAIN, 18));
		setTitle("SunRiseHotel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Entered Credentials are incorrect");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(397, 542, 239, 13);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		
		JButton btnNewButton = new JButton("Sign IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelManagementSystem?allowMultiQueries=true","root","Lpde/14727");
					String query = "SELECT password FROM user WHERE username=?";
					PreparedStatement pstmt=con.prepareStatement(query);
					pstmt.setString(1, username);
					ResultSet rs=pstmt.executeQuery();
					
					if(rs.next()) {
						String db_password = rs.getString("password");
						if(db_password.equals(password)) {
							SignIn.this.dispose();
							new Dashboard().setVisible(true);
						}else {
							lblNewLabel_2.setVisible(true);
						}
					}else {
						lblNewLabel_2.setVisible(true);
					}
					
				} catch (Exception e1) {
					/*
					 ClassNotFoundException
					 SQLException
					 NullPointerException
					 IndexOutOfBoundsException
					 IllegalArgumentException
					 */
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		btnNewButton.setForeground(new Color(64, 0, 64));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(707, 490, 152, 54);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(375, 490, 263, 42);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_3_1.setBounds(219, 497, 139, 42);
		contentPane.add(lblNewLabel_3_1);
		
		textField = new JTextField();
		textField.setBounds(375, 436, 263, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("User_Name");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(219, 436, 139, 42);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("     SunRise Hotels");
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.PLAIN, 89));
		lblNewLabel.setBounds(118, 40, 678, 105);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\SunRise_Hotel\\sunRise_Hotel\\src\\images\\image3.jpg"));
		lblNewLabel_1.setBounds(0, -13, 965, 602);
		contentPane.add(lblNewLabel_1);
	}
}
