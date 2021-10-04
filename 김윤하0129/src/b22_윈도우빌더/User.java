package b22_���������;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import b22_���������.service.LoginService;
import b22_���������.service.LoginServiceImpl;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

// MVC Model
//
// M : Model
// V : View
// C : Controller

public class User extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// invokeLater �� �޼ҵ� �� �Ű�����(��ü)�� Runnable �� �ʿ���.
		EventQueue.invokeLater(new Runnable() {
			// Runnable() -> ���� Ŭ���� (�̸��� ���� Ŭ����)
			// Ŭ������ �����Ͽ� �Ű������� �Ѱ��� �� �����.
			// �� �ѹ��� �� Ŭ������ �ӽ÷� ���� �ѹ� ��� �� ������ �뵵��.
			// {} ���� ������ Ŭ������ ����. public void run�� �������̵� �� ��.
			public void run() {
				try {
					// ���ο� user ����, �������� ȣ��.
					User frame = new User();
					// ���̰� �϶�
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
	public User() {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �������� ������ ��ġ
		setBounds(100, 100, 450, 300);
		// �ܵ��� �г��� ������
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(5, 21, 424, 202);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("�����ϱ�");
		btnNewButton.setBounds(342, 233, 87, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC624\uB298\uC758 \uC77C\uAE30");
		lblNewLabel.setBounds(179, 5, 76, 15);
		contentPane.add(lblNewLabel);
	}

}
