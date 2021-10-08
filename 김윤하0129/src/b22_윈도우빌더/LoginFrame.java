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

import b22_���������.dao.DeleteUserDao;
import b22_���������.dao.DeleteUserDaoImpl;
import b22_���������.dao.UpdateUserDao;
import b22_���������.dao.UpdateUserDaoImpl;
import b22_���������.dto.UserDto;
import b22_���������.service.LoginService;
import b22_���������.service.LoginServiceImpl;
import b22_���������.service.SignUpService;
import b22_���������.service.SignUpServiceImpl;

import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.SystemColor;
import java.awt.Font;

public class LoginFrame extends JFrame {
	
	private UserDto loginSession;

	private JPanel mainCardPan;
	private CardLayout cl_mainCardPan;
	private CardLayout login_pan;
	private JTextField login_id_tf;
	private JTextField login_pw_tf;
	private JTextField id_tf;
	private JTextField pw_tf;
	private JTextField repw_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private JLabel welcomeMsg;
	private String[] gender_list = {"����", "����", "����", "�������� ����"};
	private JTextField new_pwd_tf;
	private JTextField new_repwd_tf;
	
	private LoginService loginService;
	private SignUpService signUpService;
	private DeleteUserDao deleteUserDao;
	private UpdateUserDao updateUserDao;

	

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
		deleteUserDao = new DeleteUserDaoImpl();
		updateUserDao = new UpdateUserDaoImpl();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 505);
		mainCardPan = new JPanel();
		mainCardPan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCardPan);
		// ��ü ��Ʈ�� ���� ���� ��������.
		cl_mainCardPan = new CardLayout();
		mainCardPan.setLayout(cl_mainCardPan);
		
		JPanel login_pan = new JPanel();
		login_pan.setBackground(Color.PINK);
		mainCardPan.add(login_pan, "login_pan");
		login_pan.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(171, 165, 57, 15);
		login_pan.add(lblNewLabel);
		
		login_id_tf = new JTextField();
		login_id_tf.setBounds(289, 162, 116, 21);
		login_pan.add(login_id_tf);
		login_id_tf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(171, 216, 57, 15);
		login_pan.add(lblNewLabel_1);
		
		login_pw_tf = new JTextField();
		login_pw_tf.setBounds(289, 213, 116, 21);
		login_pan.add(login_pw_tf);
		login_pw_tf.setColumns(10);
		
		JButton login_btn = new JButton("\uB85C\uADF8\uC778");
		login_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// �α��� ��ư ������ �����Ͱ� �´��� Ȯ���ϱ�
				int flag = loginService.loginTextCheck(login_id_tf.getText(), login_pw_tf.getText());
				System.out.println("test");
				if (flag != 2) {
					String msg = null;
					if (flag == 0) {
						msg = "�������� �ʴ� ���̵��Դϴ�.";
					} else if (flag == 1) {
						msg = "��й�ȣ�� �ٽ� Ȯ�����ּ���.";
					} else if (flag == 3) {
						msg = "���̵� �Է����ּ���.";
					} else if (flag == 4) {
						msg = "��й�ȣ�� �Է����ּ���.";
					}
					JOptionPane.showMessageDialog(null, msg, "���", JOptionPane.WARNING_MESSAGE);
				} else {
					cl_mainCardPan.show(mainCardPan, "index_pan");
					loginSession = loginService.getUserDto(login_id_tf.getText());
					welcomeMsg.setText(loginSession.getUser_name() + "�� ȯ���մϴ�.");
				}
			}
		});
		login_btn.setBackground(Color.LIGHT_GRAY);
		login_btn.setBounds(450, 165, 86, 66);
		login_pan.add(login_btn);
		
		JButton sign_up_btn = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up_btn.setBackground(Color.LIGHT_GRAY);
		sign_up_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "sign_up_pan");
				// ��� Ȯ�εǾ��� ��� �����ͺ��̽��� ���� ����ֱ� -> SignUpDao���� �����Ѵ�.
				login_id_tf.setText("");
				login_pw_tf.setText("");
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
		sin_up_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl_mainCardPan.show(mainCardPan, "login_pan");
				id_tf.setText("");
				id_tf.setEditable(true);
				pw_tf.setText("");
				repw_tf.setText("");
				name_tf.setText("");
				phone_tf.setText("");
				email_tf.setText("");
				gender_cb.setSelectedIndex(0);	
				
				login_id_tf.setText("");
				login_pw_tf.setText("");
			}
		});
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
						gender_cb.getSelectedItem().toString(),
						Integer.toString(gender_cb.getSelectedIndex())
				};
				
				String errorMsg = signUpService.isEmptyValue(values);
				// ��ü ���� Ȱ���� SignUpServiceImpl�� if�� ���� ������ �����.
				if (!errorMsg.equals("value is not null")) {
					JOptionPane.showMessageDialog(null, errorMsg, "���� ����", JOptionPane.ERROR_MESSAGE);
				} else {
					errorMsg = signUpService.equalsPassword(pw_tf.getText(), repw_tf.getText());
					if (!errorMsg.equals("password equals")) {
						JOptionPane.showMessageDialog(null, errorMsg, "��й�ȣ ����", JOptionPane.ERROR_MESSAGE);
					} else {
						boolean flag = signUpService.signUp(values);
						JOptionPane.showMessageDialog(null, "ȸ�����Կ� �����Ͽ����ϴ�.", "ȸ������ ����", JOptionPane.INFORMATION_MESSAGE);
						cl_mainCardPan.show(mainCardPan, "login_pan");
						id_tf.setText("");
						id_tf.setEditable(true);
						pw_tf.setText("");
						repw_tf.setText("");
						name_tf.setText("");
						phone_tf.setText("");
						email_tf.setText("");
						gender_cb.setSelectedIndex(0);						
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
					JOptionPane.showMessageDialog(null, "���̵� �Է��ϼ���.", "���", JOptionPane.ERROR_MESSAGE);
				} else if (flag == 1) {
					JOptionPane.showMessageDialog(null, "�����ϴ� ���̵��Դϴ�.", "���̵� �ߺ�", JOptionPane.WARNING_MESSAGE);
				} else if (flag == 0){
					int select = JOptionPane.showConfirmDialog(null, "��밡���� ���̵��Դϴ�.\n����Ͻðڽ��ϱ�?", "���̵� Ȯ��", JOptionPane.YES_NO_OPTION);
					if (select == 0) {
						// �ؽ�Ʈ �ʵ带 read_only ���·� �ٲ�. �ߺ�Ȯ�� �Ϸ������� �ٽ� ��ġ�� ����.
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
		
		JPanel index_pan = new JPanel();
		mainCardPan.add(index_pan, "name_8041172334900");
		index_pan.setLayout(null);
		
		welcomeMsg = new JLabel("");
		welcomeMsg.setBounds(12, 10, 132, 15);
		index_pan.add(welcomeMsg);
		
		JButton logout_btn = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logout_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// �α׾ƿ� ��ư Ŭ���� �α׾ƿ� �Ұ��� �ѹ� �� Ȯ���ϰ�, Ȯ�� �� �̵��� ȭ�� �̵�
				int flag = JOptionPane.showConfirmDialog(null, "���� �α׾ƿ� �Ͻðڽ��ϱ�?", "�α׾ƿ�", JOptionPane.YES_NO_OPTION);
				if (flag == 0) {
					cl_mainCardPan.show(mainCardPan, "login_pan");
					loginSession = null;
					login_id_tf.setText("");
					login_pw_tf.setText("");
				}
			}
		});
		logout_btn.setBounds(568, 10, 97, 23);
		index_pan.add(logout_btn);
		
		JButton mypage_btn = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		mypage_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl_mainCardPan.show(mainCardPan, "mypage_pan");
			}
		});
		mypage_btn.setBounds(459, 10, 97, 23);
		index_pan.add(mypage_btn);
		
		JPanel mypage_pan = new JPanel();
		mypage_pan.setBackground(Color.PINK);
		mainCardPan.add(mypage_pan, "mypage_pan");
		mypage_pan.setLayout(null);
		
		JButton user_drop_btn = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		user_drop_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null, "������ ������ �����Ͻðڽ��ϱ�?", "ȸ��Ż��", JOptionPane.YES_NO_OPTION);
				if (flag == 0) {
					boolean dropflag = deleteUserDao.deeteUser(loginSession.getUser_id());
					cl_mainCardPan.show(mainCardPan, "login_pan");
					login_id_tf.setText("");
					login_pw_tf.setText("");
				}
			}
		});
		user_drop_btn.setBounds(568, 423, 97, 23);
		mypage_pan.add(user_drop_btn);
		
		JLabel lblNewLabel_3 = new JLabel("\uB9C8\uC774\uD398\uC774\uC9C0");
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(301, 33, 71, 15);
		mypage_pan.add(lblNewLabel_3);
		
	
		
		JLabel lblNewLabel_4 = new JLabel("\uC0C8 \uBE44\uBC00\uBC88\uD638");
		lblNewLabel_4.setBounds(459, 120, 97, 15);
		mypage_pan.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("\uC0C8 \uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_4_1.setBounds(437, 159, 97, 15);
		mypage_pan.add(lblNewLabel_4_1);
		
		new_pwd_tf = new JTextField();
		new_pwd_tf.setBounds(536, 117, 116, 21);
		new_pwd_tf.setEditable(false);
		mypage_pan.add(new_pwd_tf);
		new_pwd_tf.setColumns(10);
		
		new_repwd_tf = new JTextField();
		new_repwd_tf.setBounds(536, 156, 116, 21);
		new_repwd_tf.setEditable(false);
		mypage_pan.add(new_repwd_tf);
		new_repwd_tf.setColumns(10);
		
		JButton update_btn = new JButton("\uBCC0\uACBD \uC644\uB8CC");
		update_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (new_pwd_tf.getText() == new_repwd_tf.getText()) {
					boolean flag = updateUserDao.updatePassword(loginSession.getUser_id(), new_pwd_tf.getText());
					if (flag == true) {
						loginSession.setUser_pwd(new_pwd_tf.getText());
						JOptionPane.showMessageDialog(null,  "��й�ȣ ���� �Ϸ�", "�Ϸ�", JOptionPane.INFORMATION_MESSAGE);	
						new_pwd_tf.setText("");
						new_repwd_tf.setText("");
						
						new_pwd_tf.setEditable(false);
						
						new_repwd_tf.setEditable(false);
						
					}
				} else {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.", "��й�ȣ Ȯ��", JOptionPane.WARNING_MESSAGE);					
				}
				
			}
		});
		update_btn.setBounds(555, 187, 97, 23);
		update_btn.setEnabled(false);
		mypage_pan.add(update_btn);
		
		
		JButton update_pwd_btn = new JButton("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		update_pwd_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				while(true) {
					String originPwd =  JOptionPane.showInputDialog(null, "������ ��й�ȣ�� �Է��� �ּ���.", "��й�ȣ ����", JOptionPane.YES_NO_OPTION);
					if (loginSession.getUser_pwd().equals(originPwd)) {
						new_pwd_tf.setEditable(true);
						new_repwd_tf.setEditable(true);
						update_pwd_btn.setEnabled(true);
						
						break;
					} else if (originPwd == null) {
						break;
					} else {
						JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.", "��й�ȣ ����", JOptionPane.ERROR_MESSAGE);
						
					}
					
				}
				

			}
		});
		update_pwd_btn.setBounds(426, 423, 130, 23);
		mypage_pan.add(update_pwd_btn);
	}
}
