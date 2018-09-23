package project1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class project1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project1 frame = new project1();
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
	public project1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uAC70\uB9AC\uB97C \uB9C8\uC77C \uB2E8\uC704\uB85C \uBCC0\uD658\uD558\uC2DC\uC624.\r\n");
		label.setBounds(12, 42, 192, 15);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(149, 65, 57, 44);
		contentPane.add(panel);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JButton button = new JButton("변환");
		panel_3.add(button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(121, 119, 116, 21);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 0, 116, 21);
		panel_2.add(textField_1);
		textField_1.setText("1마일은 1.6킬로미터입니다.");
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(215, 39, 116, 21);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(0, 0, 116, 21);
		panel_1.add(textField);
		textField.setText("1");
		textField.setColumns(10);
	}
	}

