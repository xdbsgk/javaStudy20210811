package a9_�޼ҵ�;

import java.util.Scanner;

public class Quiz {
	
	static void quiz1(int starNum) {					// 1�� ���� �޼ҵ�
		for (int i=0; i<starNum; i++) {
			int i2=i+1;
			for(int j=0; j<i2; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
	}
	
	static void quiz2(int starNum) {					// 2�� ���� �޼ҵ�
		for (int i=0; i<starNum; i++) {
			for(int j=0; j<starNum-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void quiz3(int starNum) {					// 3�� ���� �޼ҵ�
		for (int i=0; i<starNum; i++) {
			int i2=i+1;
			for(int j=0; j<starNum-i2; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<i2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void quiz4(int starNum) {					// 4�� ���� �޼ҵ�
		for (int i=0; i<starNum; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<starNum-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void quiz5(int starNum) {					// 5�� ���� �޼ҵ�
		for (int i=0; i<starNum; i++) {
			int i2= (2*i)+1;
			for(int j=0; j<starNum-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<i2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);				// Scanner
		
		while(true) {									// ���α׷� ����
			
			System.out.println("[�� ��� ���α׷�]");		// �޴�
			System.out.println("1. ���� 1");
			System.out.println("2. ���� 2");
			System.out.println("3. ���� 3");
			System.out.println("4. ���� 4");
			System.out.println("5. ���� 5");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� �Է��ϼ���: ");		// ��� �Է�
			String selecter = s.nextLine();				// ���ڿ� �Է� (1~5, q, etc)
			System.out.println();
			
		
			if (selecter.equals("1")) {
				System.out.println("����� ��(*)�� ������ �Է��ϼ���.: ");
				int starNum = s.nextInt();
				quiz1(starNum);
				break;
			}else if(selecter.equals("2")) {
				System.out.println("����� ��(*)�� ������ �Է��ϼ���.: ");
				int starNum = s.nextInt();
				quiz2(starNum);
				break;
			}else if(selecter.equals("3")) {
				System.out.println("����� ��(*)�� ������ �Է��ϼ���.: ");
				int starNum = s.nextInt();
				quiz3(starNum);
				break;
			}else if(selecter.equals("4")) {
				System.out.println("����� ��(*)�� ������ �Է��ϼ���.: ");
				int starNum = s.nextInt();
				quiz4(starNum);
				break;
			}else if(selecter.equals("5")) {
				System.out.println("����� ��(*)�� ������ �Է��ϼ���.: ");
				int starNum = s.nextInt();
				quiz5(starNum);
				break;
			}else if (selecter.equals("q")) {
				System.out.println("���α׷� ������ ...");
				break;
				
			}else {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
			}
			
			}
		
		System.out.println();
		System.out.println("���α׷� ����");
	
	}


}
