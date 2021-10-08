package b20_데이터베이스;

import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		System.out.print("비밀번호: ");
//		String password = input.nextLine();
		
		int flag = 0;
//		flag = loginDao.login(id, password);

		
		if(flag == 0) {
			System.out.println("존재하지 않는 아이디 입니다.");
		}else if(flag == 1) {
			System.out.println("비밀번호가 틀렸습니다. 다시 시도하세요.");
		}else if(flag == 2) {
//			String name = loginDao.getLoginUserName(id);
//			System.out.println("로그인 성공. " + name + "님 환영합니다.");
		}else {
			System.out.println("데이터 베이스 오류.");
		}
		
	}
	
	
}