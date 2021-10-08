package b22_���������.service;

import b22_���������.dao.SignUpDao;
import b22_���������.dao.SignUpDaoImpl;

public class SignUpServiceImpl implements SignUpService {
	
	private SignUpDao signUpDao;
	
	public SignUpServiceImpl() {
		signUpDao = new SignUpDaoImpl();
	}
	
	@Override
	public boolean isEmptyId(String id) {
		return id.length() != 0 ? true : false;
	}
	
	@Override
	public int idCheck(String id) {
		
		// flag == 0 -> �ߺ�Ȯ�� ����
		// flag == 1 -> �ߺ�Ȯ�� ����
		// flag == 2 -> �� �� ����
	
		
		int flag = 2;
		
		// id�� �� ���� �ƴҶ� ����
		if (isEmptyId(id)) {
			// DB���� ���̵� �ߺ�Ȯ��
			flag = signUpDao.idCheck(id);
		}
		return flag;
	}
	
	@Override
	public String isEmptyValue(String[] values) {
		String msg = null;
		int errorIndex = 100;
		
		for(int i = 0; i < values.length; i++) {
			if(values[i].length() == 0 || values[i].equals("����")) {
				// �ش� �ε��� ���� 
				errorIndex = i;
				break;
			}
		}
		
		if (errorIndex == 0) {
			msg = "���̵� �Էµ��� �ʾҽ��ϴ�.";
		} else if (errorIndex == 1) {
			msg = "��й�ȣ�� �Էµ��� �ʾҽ��ϴ�.";
		} else if (errorIndex == 2) {
			msg = "��й�ȣ Ȯ���� �Էµ��� �ʾҽ��ϴ�.";
		} else if (errorIndex == 3) {
			msg = "�̸��� �Էµ��� �ʾҽ��ϴ�.";
		} else if (errorIndex == 4) {
			msg = "����ó�� �Էµ��� �ʾҽ��ϴ�.";
		} else if (errorIndex == 5) {
			msg = "�̸����� �Էµ��� �ʾҽ��ϴ�.";
		} else if (errorIndex == 6) {
			msg = "������ ���õ��� �ʾҽ��ϴ�.";
		} else {
			// ���� �ܰ�� �Ѿ
			msg = "value is not null";
		}
		return msg;
	}
	
	@Override
	public String equalsPassword(String pw_tf, String repw_tf) {
		String msg = null;
		
		if(pw_tf.equals(repw_tf)) {
			msg = "password equals";
		} else {
			msg = "��й�ȣ�� ��ġ���� �ʽ��ϴ�,\n �ٽ� �Է��ϼ���.";
		}
		return msg;
	}

	@Override
	public boolean signUp(String[] values) {
		
		return signUpDao.signUp(values);
	}
	
	
	
	
	
	

}
