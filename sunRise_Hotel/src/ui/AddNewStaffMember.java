package ui;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import classes.Staff;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AddNewStaffMember extends JFrame {

	private static final long serialVersionUID = 1L;
	private ManageStaff ms;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Using thread for managing swing components(related to GUI problems)
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageStaff ms=new ManageStaff();
					AddNewStaffMember frame = new AddNewStaffMember(ms);
					frame.setVisible(true);
				} catch (Exception e) {
					/*
					 InstantiationException
					IllegalAccessException
					InvocationTargetException
					ClassCastException
					NoSuchMethodException
					RuntimeException (and its subclasses)
					AWTException
					 */
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddNewStaffMember(ManageStaff ms) {
		setTitle("AddNewStaffMember");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 907, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("     SunRise Hotels");
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(305, 0, 226, 81);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		panel.setBounds(341, 118, 175, 287);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("   staffId");
		lblNewLabel_1.setBounds(10, 8, 61, 13);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(61, 5, 96, 19);
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("    name");
		lblNewLabel_1_1.setBounds(10, 32, 61, 13);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(61, 29, 96, 19);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("    email");
		lblNewLabel_1_1_1.setBounds(10, 56, 61, 13);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(61, 53, 96, 19);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" position");
		lblNewLabel_1_1_1_1.setBounds(10, 85, 61, 13);
		panel.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(61, 82, 96, 19);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("location");
		lblNewLabel_1_1_1_1_1.setBounds(10, 114, 72, 13);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(61, 111, 96, 19);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("address");
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 143, 61, 13);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(61, 140, 96, 19);
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("   phone");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(0, 176, 72, 13);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(61, 173, 96, 19);
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("       nic");
		lblNewLabel_1_1_1_1_1_1_2.setBounds(0, 199, 61, 13);
		panel.add(lblNewLabel_1_1_1_1_1_1_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(61, 204, 96, 19);
		textField_7.setColumns(10);
		panel.add(textField_7);
		
		JButton btnAddNewStaff = new JButton("Add New Staff Member");
		btnAddNewStaff.setBounds(10, 243, 155, 21);
		btnAddNewStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/////////
				String staffId = textField.getText();
                String email = textField_2.getText();

                if (!staffId.startsWith("ST")) {
                    JOptionPane.showMessageDialog(null, "Staff ID must start with 'ST'.", "Invalid Staff ID", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!email.contains("@")) {
                    JOptionPane.showMessageDialog(null, "Email must contain '@'.", "Invalid Email", JOptionPane.ERROR_MESSAGE);
                    return;
                }
				/////////
				Staff s=new Staff(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText(),textField_6.getText(),textField_7.getText());
				s.addStaff();
				ms.jTableFill();
				resetForm();
			}
			private void resetForm() {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
			}
		});
		panel.add(btnAddNewStaff);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\ASUS\\\\Desktop\\\\SunRise_Hotel\\\\sunRise_Hotel\\\\src\\\\images\\\\image3.jpg"));
		lblNewLabel.setBounds(0, 0, 893, 459);
		contentPane.add(lblNewLabel);
	}

}
