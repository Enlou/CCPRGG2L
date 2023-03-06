import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;

public class ForgotPassword extends JFrame implements ActionListener {

	private JPanel FP;
	private JTextField textField;
	private JTextField textField_1;
	protected JComponent frame;
	private JLabel Recover;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgotPassword frame = new ForgotPassword();
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
	public ForgotPassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 300);
		FP = new JPanel();
		FP.setBackground(new Color(0, 255, 255));
		FP.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(FP);
		FP.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Username:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(51, 118, 97, 14);
		FP.add(lblNewLabel);
		
		JLabel lblEnterEmail = new JLabel("Enter Email:");
		lblEnterEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterEmail.setBounds(51, 146, 97, 14);
		FP.add(lblEnterEmail);
		
		textField = new JTextField();
		textField.setBounds(148, 115, 141, 20);
		FP.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 143, 141, 20);
		FP.add(textField_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(125, 188, 89, 23);
		FP.add(btnNewButton);
		
		Recover = new JLabel("Recover your password");
		Recover.setFont(new Font("Arial", Font.BOLD, 20));
		Recover.setBounds(64, 50, 225, 38);
		FP.add(Recover);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
