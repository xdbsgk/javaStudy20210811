package b22_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import b22_윈도우빌더.service.LoginService;
import b22_윈도우빌더.service.LoginServiceImpl;

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
		// invokeLater 의 메소드 안 매개변수(객체)로 Runnable 이 필요함.
		EventQueue.invokeLater(new Runnable() {
			// Runnable() -> 무명 클래스 (이름이 없는 클래스)
			// 클래스를 정의하여 매개변수로 넘겨줄 때 사용함.
			// 딱 한번만 쓸 클래스니 임시로 만들어서 한번 사용 후 버리는 용도임.
			// {} 안의 내용이 클래스의 내용. public void run이 오버라이딩 된 것.
			public void run() {
				try {
					// 새로운 user 생성, 생성자의 호출.
					User frame = new User();
					// 보이게 하라
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
		// 프레임이 열리는 위치
		setBounds(100, 100, 450, 300);
		// 콘덴츠 패널을 생성함
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(5, 21, 424, 202);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("저장하기");
		btnNewButton.setBounds(342, 233, 87, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC624\uB298\uC758 \uC77C\uAE30");
		lblNewLabel.setBounds(179, 5, 76, 15);
		contentPane.add(lblNewLabel);
	}

}
