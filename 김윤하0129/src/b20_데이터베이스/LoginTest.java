package b20_�����ͺ��̽�;

import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		System.out.print("��й�ȣ: ");
//		String password = input.nextLine();
		
		int flag = 0;
//		flag = loginDao.login(id, password);

		
		if(flag == 0) {
			System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
		}else if(flag == 1) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
		}else if(flag == 2) {
//			String name = loginDao.getLoginUserName(id);
//			System.out.println("�α��� ����. " + name + "�� ȯ���մϴ�.");
		}else {
			System.out.println("������ ���̽� ����.");
		}
		
	}
	
	
}