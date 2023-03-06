import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.Button;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;
import javax.swing.JToggleButton;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginSystem {

		JFrame frame;
	    private JTextField UserInput;
	    private JPasswordField PasswordInput;
//	    private final Action action = new SwingAction();
//	    private final Action action_1 = new SwingAction_1();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Facebook Login");
		frame.getContentPane().setBackground(new Color(51, 255, 255));
        frame.setBounds(100, 100, 493, 458);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel Username = new JLabel("Username:");
        Username.setBackground(new Color(255, 255, 255));
        Username.setFont(new Font("Arial", Font.PLAIN, 12));
        Username.setBounds(34, 159, 70, 15);
        frame.getContentPane().add(Username);

        UserInput = new JTextField();
        UserInput.setBounds(106, 152, 263, 25);
        frame.getContentPane().add(UserInput);
        UserInput.setColumns(10);

        JLabel Password = new JLabel("Password:");
        Password.setFont(new Font("Arial", Font.PLAIN, 12));
        Password.setBounds(34, 194, 70, 15);
        frame.getContentPane().add(Password);

        PasswordInput = new JPasswordField();
        PasswordInput.setBounds(106, 187, 263, 25);
        frame.getContentPane().add(PasswordInput);

        JButton Login = new JButton("Login");
        Login.setToolTipText("");
        Login.setFont(new Font("Arial", Font.PLAIN, 15));
        Login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = UserInput.getText();
                String password = new String(PasswordInput.getPassword());
                if (username.equals("admin") && password.equals("admin")) {
                	JOptionPane.showMessageDialog(frame, "Login successful!");
                    frame.dispose();   
                    DiscountSystem DS = new DiscountSystem();
                    DS.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password!");
                }
            }
        });
        Login.setBounds(126, 260, 93, 27);
        frame.getContentPane().add(Login);
        

        
        JLabel lblNewLabel_2 = new JLabel("Facebook");
        lblNewLabel_2.setForeground(new Color(0, 102, 204));
        lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 35));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setBounds(127, 53, 229, 72);
        frame.getContentPane().add(lblNewLabel_2);
        
        JLabel DontHaveAccount = new JLabel("Don't have an account?");
        DontHaveAccount.setBackground(new Color(255, 255, 255));
        DontHaveAccount.setHorizontalAlignment(SwingConstants.LEFT);
        DontHaveAccount.setFont(new Font("Arial", Font.PLAIN, 14));
        DontHaveAccount.setBounds(126, 325, 152, 15);
        frame.getContentPane().add(DontHaveAccount);
        
        JButton Exit = new JButton("Exit");
        Exit.setToolTipText("");
        Exit.setFont(new Font("Arial", Font.PLAIN, 15));
        Exit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(frame, "Thank you for using Facebook!");
                frame.dispose();     
            }
        }
        		);
     
        Exit.setBounds(248, 260, 93, 27);
        frame.getContentPane().add(Exit);
        
        JCheckBox Remember = new JCheckBox("Remember me");
        Remember.setFont(new Font("Arial", Font.PLAIN, 12));
        Remember.setBounds(106, 219, 148, 21);
        frame.getContentPane().add(Remember);
        
        JLabel Signup = new JLabel("Sign up");
        Signup.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		JOptionPane.showMessageDialog(frame, "Create an account?");
        		frame.dispose();
        		SignUp Sup = new SignUp();
        		Sup.setVisible(true);
        		
        	}
        });
        Signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Signup.setForeground(Color.BLUE);
        Signup.setFont(new Font("Arial", Font.PLAIN, 14));
        Signup.setBounds(294, 325, 62, 15);
        frame.getContentPane().add(Signup);
        
        JLabel ForgotPassword = new JLabel("Forgot your password?");
        ForgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ForgotPassword.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		JOptionPane.showMessageDialog(frame,"Forgot your password?");
        		frame.dispose();
        		ForgotPassword fp = new ForgotPassword();
        		fp.setVisible(true);
        	}
        });
        ForgotPassword.setForeground(Color.BLUE); 
        ForgotPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        ForgotPassword.setBounds(178, 351, 152, 15);
        frame.getContentPane().add(ForgotPassword);
    }
}



