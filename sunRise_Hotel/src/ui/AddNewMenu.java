package ui;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import classes.Menu;
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

public class AddNewMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private ManageMenu mm;
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
		//Using thread for managing swing components(related to GUI problems)//Threads responsible for managing swing components
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageMenu mm=new ManageMenu();
					AddNewMenu frame = new AddNewMenu(mm);
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
	public AddNewMenu(ManageMenu mm) {
		setTitle("AddNewMenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 734, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("     SunRise Hotels");
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(207, 0, 226, 81);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		panel.setBounds(217, 67, 175, 301);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("   menuId");
		lblNewLabel_1.setBounds(0, 16, 81, 13);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(69, 13, 96, 19);
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("    itemName");
		lblNewLabel_1_1.setBounds(0, 45, 101, 13);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 42, 96, 19);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("    category");
		lblNewLabel_1_1_1.setBounds(0, 74, 100, 13);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(71, 71, 96, 19);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" price");
		lblNewLabel_1_1_1_1.setBounds(10, 103, 64, 13);
		panel.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(71, 100, 96, 19);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("description");
		lblNewLabel_1_1_1_1_1.setBounds(9, 132, 92, 13);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(71, 129, 96, 19);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("status");
		lblNewLabel_1_1_1_1_1_1.setBounds(10, 161, 64, 13);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(71, 158, 96, 19);
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("   calories");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(0, 190, 92, 13);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(71, 187, 96, 19);
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("dateAdded");
		lblNewLabel_1_1_1_1_1_1_2.setBounds(7, 230, 100, 13);
		panel.add(lblNewLabel_1_1_1_1_1_1_2);
		
		textField_7 = new JTextField();
		textField_7.setBounds(71, 227, 96, 19);
		textField_7.setColumns(10);
		panel.add(textField_7);
		
		JButton btnAddNewMenu = new JButton("Add New Menu");
		btnAddNewMenu.setBounds(0, 253, 165, 21);
		btnAddNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///////////
				 // Validation
                String menuId = textField.getText();
                String dateAdded = textField_7.getText();

                if (!menuId.startsWith("MN")) {
                    JOptionPane.showMessageDialog(null, "Menu ID must start with 'MN'.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (dateAdded.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Date Added cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
				///////////
				Menu m=new Menu(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText(),textField_6.getText(),textField_7.getText());
				m.addMenu();
				mm.jTableFill();
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
		panel.add(btnAddNewMenu);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\ASUS\\\\Desktop\\\\SunRise_Hotel\\\\sunRise_Hotel\\\\src\\\\images\\\\image3.jpg"));
		lblNewLabel.setBounds(0, 0, 720, 392);
		contentPane.add(lblNewLabel);
	}

}
