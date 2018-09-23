package project1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Project3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project3 frame = new Project3();
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
	public Project3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("23\r\n");
		textField.setBounds(31, 30, 202, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("C\r\n");
		btnNewButton.setBounds(12, 66, 49, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("7\r\n\r\n\r\n");
		btnNewButton_1.setBounds(12, 105, 49, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setBounds(12, 144, 49, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.setBounds(12, 183, 49, 29);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("0");
		btnNewButton_4.setBounds(12, 222, 49, 29);
		contentPane.add(btnNewButton_4);
		
		JButton button = new JButton("00");
		button.setBounds(73, 222, 49, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("=");
		button_1.setBounds(134, 222, 49, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.setBounds(195, 222, 49, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("2");
		button_3.setBounds(73, 183, 49, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.setBounds(134, 183, 49, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("-");
		button_5.setBounds(195, 183, 49, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setBounds(73, 144, 49, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.setBounds(134, 144, 49, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("*\r\n");
		button_8.setBounds(195, 144, 49, 29);
		contentPane.add(button_8);
		
		JButton button_10 = new JButton("9");
		button_10.setBounds(134, 105, 49, 29);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.setBounds(195, 105, 49, 29);
		contentPane.add(button_11);
		
		JButton button_9 = new JButton("8");
		button_9.setBounds(73, 105, 49, 29);
		contentPane.add(button_9);
	}

}
