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
import b22_윈도우빌더.service.LoginServiceImpl;
import b22_윈도우빌더.service.SignUpService;
import b22_윈도우빌더.service.SignUpServiceImpl;

import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.SystemColor;

public class LoginFrame extends JFrame {

	private JPanel mainCardPan;
	private CardLayout cl_mainCardPan;
	private CardLayout login_pan;
	private JTextField id_textField;
	private JTextField pw_textField;
	private JTextField id_tf;
	private JTextField pw_tf;
	private JTextField repw_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private String[] gender_list = {"선택", "남성", "여성", "선택하지 않음"};
	
	private LoginService loginService;
	private SignUpService signUpService;
	

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
		
		loginService = new LoginServiceImpl();
		signUpService = new SignUpServiceImpl();		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 505);
		mainCardPan = new JPanel();
		mainCardPan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCardPan);
		// 객체 컨트롤 위해 따로 생성해줌.
		cl_mainCardPan = new CardLayout();
		mainCardPan.setLayout(cl_mainCardPan);
		
		JPanel login_pan = new JPanel();
		login_pan.setBackground(Color.PINK);
		mainCardPan.add(login_pan, "login_pan");
		login_pan.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(171, 165, 57, 15);
		login_pan.add(lblNewLabel);
		
		id_textField = new JTextField();
		id_textField.setBounds(289, 162, 116, 21);
		login_pan.add(id_textField);
		id_textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(171, 216, 57, 15);
		login_pan.add(lblNewLabel_1);
		
		pw_textField = new JTextField();
		pw_textField.setBounds(289, 213, 116, 21);
		login_pan.add(pw_textField);
		pw_textField.setColumns(10);
		
		JButton loginBtn = new JButton("\uB85C\uADF8\uC778");
		loginBtn.setBackground(Color.LIGHT_GRAY);
		loginBtn.setBounds(450, 165, 86, 66);
		login_pan.add(loginBtn);
		
		JButton sign_up_btn = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up_btn.setBackground(Color.LIGHT_GRAY);
		sign_up_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "sign_up_pan");
			}
		});
		sign_up_btn.setBounds(308, 303, 97, 36);
		login_pan.add(sign_up_btn);
		
		JPanel sign_up_pan = new JPanel();
		sign_up_pan.setBackground(Color.PINK);
		mainCardPan.add(sign_up_pan, "sign_up_pan");
		sign_up_pan.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_2.setBounds(199, 39, 57, 15);
		sign_up_pan.add(lblNewLabel_2);
		
		id_tf = new JTextField();
		id_tf.setBounds(321, 36, 70, 21);
		sign_up_pan.add(id_tf);
		id_tf.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_2_1.setBounds(188, 79, 57, 15);
		sign_up_pan.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_2_2.setBounds(155, 130, 90, 15);
		sign_up_pan.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("\uC774\uB984");
		lblNewLabel_2_3.setBounds(207, 176, 38, 15);
		sign_up_pan.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_2_4.setBounds(199, 222, 57, 15);
		sign_up_pan.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_2_5.setBounds(199, 266, 57, 15);
		sign_up_pan.add(lblNewLabel_2_5);
		
		pw_tf = new JTextField();
		pw_tf.setColumns(10);
		pw_tf.setBounds(321, 76, 161, 21);
		sign_up_pan.add(pw_tf);
		
		repw_tf = new JTextField();
		repw_tf.setColumns(10);
		repw_tf.setBounds(321, 127, 161, 21);
		sign_up_pan.add(repw_tf);
		
		name_tf = new JTextField();
		name_tf.setColumns(10);
		name_tf.setBounds(321, 173, 161, 21);
		sign_up_pan.add(name_tf);
		
		phone_tf = new JTextField();
		phone_tf.setColumns(10);
		phone_tf.setBounds(321, 219, 161, 21);
		sign_up_pan.add(phone_tf);
		
		email_tf = new JTextField();
		email_tf.setColumns(10);
		email_tf.setBounds(321, 263, 161, 21);
		sign_up_pan.add(email_tf);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("\uC131\uBCC4");
		lblNewLabel_2_5_1.setBounds(207, 309, 38, 15);
		sign_up_pan.add(lblNewLabel_2_5_1);
		
		JComboBox gender_cb = new JComboBox(gender_list);
		gender_cb.setBackground(Color.LIGHT_GRAY);
		gender_cb.setBounds(321, 305, 161, 23);
		sign_up_pan.add(gender_cb);
		
		JButton sin_up_btn = new JButton("\uAC00\uC785\uD558\uAE30");
		sin_up_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] values = {
						id_tf.getText(),
						pw_tf.getText(),
						repw_tf.getText(),
						name_tf.getText(),
						phone_tf.getText(),
						email_tf.getText(),
						gender_cb.getSelectedItem().toString()
				};
				
				String errorMsg = signUpService.isEmptyValue(values);
				// 객체 지향 활용해 SignUpServiceImpl에 if문 세워 간단히 만들기.
				if (!errorMsg.equals("value is not null")) {
					JOptionPane.showMessageDialog(null, errorMsg, "공백 오류", JOptionPane.ERROR_MESSAGE);
				} else {
					errorMsg = signUpService.equalsPassword(pw_tf.getText(), repw_tf.getText());
					if (! errorMsg.equals("password equals")) {
						JOptionPane.showMessageDialog(null, errorMsg, "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
					}
				}
				
				signUpService.isEmptyValue(gender_list);
			}
		});
		sin_up_btn.setBackground(Color.LIGHT_GRAY);
		sin_up_btn.setBounds(219, 378, 97, 34);
		sign_up_pan.add(sin_up_btn);
		
		
		JButton id_chk_btn = new JButton("\uC911\uBCF5\uD655\uC778");
		id_chk_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = signUpService.idCheck(id_tf.getText());
				if(flag == 2) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.", "경고", JOptionPane.ERROR_MESSAGE);
				} else if (flag == 1) {
					JOptionPane.showMessageDialog(null, "존재하는 아이디입니다.", "아이디 중복", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 0){
					int select = JOptionPane.showConfirmDialog(null, "사용가능한 아이디입니다.\n사용하시겠습니까?", "아이디 확인", JOptionPane.YES_NO_OPTION);
					if (select == 0) {
						// 텍스트 필드를 read_only 상태로 바꿈. 중복확인 완료했으니 다시 고치지 못함.
						id_tf.setEditable(false);
					}
				}
			}
		});
		id_chk_btn.setBackground(Color.LIGHT_GRAY);
		id_chk_btn.setBounds(404, 35, 90, 23);
		sign_up_pan.add(id_chk_btn);
		
		JButton page_back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		page_back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "login_pan");
			}
		});
		page_back_btn.setBackground(Color.LIGHT_GRAY);
		page_back_btn.setBounds(357, 378, 97, 34);
		sign_up_pan.add(page_back_btn);
	}
}
