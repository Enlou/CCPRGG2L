import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField UserNInput;
	private JTextField EmailInput;
	private JTextField PassInput;
	private JTextField CPassInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 402);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Your Account!");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(102, 39, 161, 36);
		contentPane.add(lblNewLabel);
		
		JLabel UserN = new JLabel("Username:");
		UserN.setFont(new Font("Arial", Font.PLAIN, 12));
		UserN.setBounds(43, 117, 79, 14);
		contentPane.add(UserN);
		
		JLabel Email = new JLabel("Email:");
		Email.setFont(new Font("Arial", Font.PLAIN, 12));
		Email.setBounds(51, 154, 60, 14);
		contentPane.add(Email);
		
		JLabel CPassword = new JLabel("Confirm Password:");
		CPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		CPassword.setBounds(28, 223, 114, 14);
		contentPane.add(CPassword);
		
		JLabel Password = new JLabel("Password:");
		Password.setFont(new Font("Arial", Font.PLAIN, 12));
		Password.setBounds(43, 190, 79, 14);
		contentPane.add(Password);
		
		UserNInput = new JTextField();
		UserNInput.setBounds(145, 117, 155, 20);
		contentPane.add(UserNInput);
		UserNInput.setColumns(10);
		
		EmailInput = new JTextField();
		EmailInput.setColumns(10);
		EmailInput.setBounds(145, 151, 155, 20);
		contentPane.add(EmailInput);
		
		PassInput = new JTextField();
		PassInput.setColumns(10);
		PassInput.setBounds(145, 187, 155, 20);
		contentPane.add(PassInput);
		
		CPassInput = new JTextField();
		CPassInput.setColumns(10);
		CPassInput.setBounds(145, 220, 155, 20);
		contentPane.add(CPassInput);
		
		JButton CreateButton = new JButton("Create");
		CreateButton.setBounds(132, 271, 89, 23);
		contentPane.add(CreateButton);
	}

}
