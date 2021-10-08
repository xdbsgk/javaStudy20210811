package b22_윈도우빌더.service;

import b22_윈도우빌더.dao.SignUpDao;
import b22_윈도우빌더.dao.SignUpDaoImpl;

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
		
		// flag == 0 -> 중복확인 성공
		// flag == 1 -> 중복확인 실패
		// flag == 2 -> 빈 값 오류
	
		
		int flag = 2;
		
		// id가 빈 값이 아닐때 실행
		if (isEmptyId(id)) {
			// DB에서 아이디 중복확인
			flag = signUpDao.idCheck(id);
		}
		return flag;
	}
	
	@Override
	public String isEmptyValue(String[] values) {
		String msg = null;
		int errorIndex = 100;
		
		for(int i = 0; i < values.length; i++) {
			if(values[i].length() == 0 || values[i].equals("선택")) {
				// 해당 인덱스 저장 
				errorIndex = i;
				break;
			}
		}
		
		if (errorIndex == 0) {
			msg = "아이디가 입력되지 않았습니다.";
		} else if (errorIndex == 1) {
			msg = "비밀번호가 입력되지 않았습니다.";
		} else if (errorIndex == 2) {
			msg = "비밀번호 확인이 입력되지 않았습니다.";
		} else if (errorIndex == 3) {
			msg = "이름이 입력되지 않았습니다.";
		} else if (errorIndex == 4) {
			msg = "연락처가 입력되지 않았습니다.";
		} else if (errorIndex == 5) {
			msg = "이메일이 입력되지 않았습니다.";
		} else if (errorIndex == 6) {
			msg = "성별이 선택되지 않았습니다.";
		} else {
			// 다음 단계로 넘어감
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
			msg = "비밀번호가 일치하지 않습니다,\n 다시 입력하세요.";
		}
		return msg;
	}

	@Override
	public boolean signUp(String[] values) {
		
		return signUpDao.signUp(values);
	}
	
	
	
	
	
	

}
