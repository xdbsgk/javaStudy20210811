package b22_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import b22_윈도우빌더.service.LoginService;

public class LoginFrame extends JFrame {

	private JPanel checkLabel;
	private JTextField idText;
	private JPasswordField pwd_text;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		checkLabel = new JPanel();
		checkLabel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(checkLabel);
		checkLabel.setLayout(null);
		
		JLabel idLabel = new JLabel("아이디");
		idLabel.setBounds(72, 95, 57, 15);
		checkLabel.add(idLabel);
		
		idText = new JTextField();
		idText.setBounds(160, 92, 116, 21);
		checkLabel.add(idText);
		idText.setColumns(10);
		
		JLabel pwLabel = new JLabel("비밀번호");
		pwLabel.setBounds(72, 123, 57, 15);
		checkLabel.add(pwLabel);
		
		JButton loginButton = new JButton("\uB85C\uADF8\uC778");
		loginButton.addActionListener(new ActionListener() {
			
			LoginService loginService;
			
			public void mouseClicked(MouseEvent e) {
				
				int flag = loginService.loginTextCheck(idText.getText(), pwd_text.getText());
				if (flag == 0) {
					JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다", "경고", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 1) {
					JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 2) {
					JOptionPane.showMessageDialog(null, "로그인 성동.", "성공", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 3) {
					JOptionPane.showMessageDialog(null, "아이디를 입력해주세요", "경고", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 4) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.", "경고", JOptionPane.WARNING_MESSAGE);
				}
			}
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginButton.setBounds(293, 95, 85, 46);
		checkLabel.add(loginButton);
		
		pwd_text = new JPasswordField();
		pwd_text.setBounds(160, 120, 116, 21);
		checkLabel.add(pwd_text);
	}
}
