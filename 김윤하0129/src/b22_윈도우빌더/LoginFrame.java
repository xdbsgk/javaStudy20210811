package b22_���������;

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
import b22_���������.service.LoginService;

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
		
		JLabel idLabel = new JLabel("���̵�");
		idLabel.setBounds(72, 95, 57, 15);
		checkLabel.add(idLabel);
		
		idText = new JTextField();
		idText.setBounds(160, 92, 116, 21);
		checkLabel.add(idText);
		idText.setColumns(10);
		
		JLabel pwLabel = new JLabel("��й�ȣ");
		pwLabel.setBounds(72, 123, 57, 15);
		checkLabel.add(pwLabel);
		
		JButton loginButton = new JButton("\uB85C\uADF8\uC778");
		loginButton.addActionListener(new ActionListener() {
			
			LoginService loginService;
			
			public void mouseClicked(MouseEvent e) {
				
				int flag = loginService.loginTextCheck(idText.getText(), pwd_text.getText());
				if (flag == 0) {
					JOptionPane.showMessageDialog(null, "���̵� �������� �ʽ��ϴ�", "���", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 1) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ�Ƚ��ϴ�.", "���", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 2) {
					JOptionPane.showMessageDialog(null, "�α��� ����.", "����", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 3) {
					JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���", "���", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 4) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է����ּ���.", "���", JOptionPane.WARNING_MESSAGE);
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
