package b22_윈도우빌더.service;

import b20_데이터베이스.LoginDao;
import b20_데이터베이스.LoginDaoImpl;
import b22_윈도우빌더.dto.UserDto;

public class LoginServiceImpl implements LoginService {
	private LoginDao loginDao;

	public LoginServiceImpl() {
		loginDao = new LoginDaoImpl();
	}

	@Override
	public int loginTextCheck(String id, String pwd) {
		int flag = 0;

		if(id.length() == 0) {
			flag = 3;
		}else if(pwd.length() == 0) {
			flag = 4;
		}else {
			flag = loginLogic(id, pwd);
		}
		return flag;
	}

	@Override
	public int loginLogic(String id, String pwd) {
		return loginDao.login(id, pwd);
	}

	@Override
	public UserDto getUserDto(String id) {
		return loginDao.getUserDto(id);
	}
}
