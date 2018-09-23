package project1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class Project2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project2 frame = new Project2();
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
	public Project2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText("1000");
		textField.setBounds(252, 25, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uC6D0\uAE08\uC744 \uC785\uB825\uD558\uC2DC\uC624\r\n");
		lblNewLabel.setBounds(66, 28, 116, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uC728\uC744 \uC785\uB825\uD558\uC2DC\uC624.");
		lblNewLabel_1.setBounds(68, 72, 130, 15);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setText("7.5\r\n");
		textField_1.setBounds(252, 69, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(163, 122, 97, 23);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton button = new JButton("\uBCC0\uD658\r\n");
		button.setBounds(0, 0, 97, 23);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(100, 191, 207, 21);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setText("\uC774\uC790\uB294 \uC5F0 75\uB9CC\uC6D0 \uC785\uB2C8\uB2E4.\r\n");
		textField_2.setBounds(0, 0, 207, 21);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
	}

}
