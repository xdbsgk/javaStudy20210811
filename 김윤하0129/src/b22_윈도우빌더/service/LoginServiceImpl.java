package b22_윈도우빌더.service;

import b20_데이터베이스.LoginDao;

public class LoginServiceImpl implements LoginService {
	
	private LoginDao loginDao;


	@Override
	public int loginTextCheck(String id, String pwd) {
		int flag = 0;
		
		if (id.length() == 0) {
			flag = 3;
		} else if (pwd.length() == 0) {
			flag = 4;
		} else {
			loginLogic(id, pwd);
		}
		return flag;
	}
	
	
		@Override
		public int loginLogic(String id, String pwd) {		
			return loginDao.login(id, pwd);
	}		
		

	
	
	

}
