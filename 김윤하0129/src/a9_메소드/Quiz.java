package a9_�޼ҵ�;

import java.util.Scanner;

public class Quiz {
	
	String quiz1(int sNum) {
		String res1 = "?";
		return res1;
	}
	
	String quiz2(int starNum) {
		String res2 = "?";
		return res2;
	}
	
	String quiz3(int starNum) {
		String res3 = "?";
		return res3;
	}
	
	String quiz4(int starNum) {
		String res4 = "?";
		return res4;
	}
	
	String quiz5(int starNum) {
		String res5 = "?";
		return res5;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);				// Scanner
		
		boolean ctrl = true;							// ��ü ��Ʈ�� ���� ����
		
		while(ctrl) {									// ���α׷� ����
			
			System.out.println("[�� ��� ���α׷�]");		// �޴�
			System.out.println("1. ���� 1");
			System.out.println("2. ���� 2");
			System.out.println("3. ���� 3");
			System.out.println("4. ���� 4");
			System.out.println("5. ���� 5");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� �Է��ϼ���: ");		// ��� �Է�
			String selecter = s.nextLine();				// ���ڿ� �Է�(1~5,q)
			System.out.println();
			
			if (selecter.equals("1") || selecter.equals("2") || selecter.equals("3") || selecter.equals("4") || selecter.equals("5")) {
				
				System.out.println("����� ��(*)�� ������ �Է��ϼ���.: ");
				int starNum = s.nextInt();
				
//				String procStart(selecter, starNum) {
//					System.out.println();
//			}
				
				
			}else if (selecter.equals("q")) {
				System.out.println("���α׷� ������ ...");
				break;
			}else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
			}
			
			}
		System.out.println("���α׷� ����");
	}


}
