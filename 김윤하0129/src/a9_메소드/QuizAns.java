package a9_�޼ҵ�;

import java.util.Scanner;

public class QuizAns {
/////////////////////////////////////////////////////////////// ���� �ѹ� //////////////////////////////////////////////////////////////////////
	public void quiz1(int starCount) {
		for (int i=0; i<starCount; i++) {
			int i2=i+1;
			for(int j=0; j<i2; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
	}
	
	public void quiz2(int starCount) {
		for (int i=0; i<starCount; i++) {
			for(int j=0; j<starCount-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void quiz3(int starCount) {
		for (int i=0; i<starCount; i++) {
			int i2=i+1;
			for(int j=0; j<starCount-i2; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<i2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void quiz4(int starCount) {
		for (int i=0; i<starCount; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<starCount-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void quiz5(int starCount) {
		for (int i=0; i<starCount; i++) {
			int i2= (2*i)+1;
			for(int j=0; j<starCount-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<i2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public void procStart(String selector, int starCount) {
		if (selector.equals("1")) {
			quiz1(starCount);
		} else if (selector.equals("2")) {
			quiz2(starCount);
		} else if (selector.equals("3")) {
			quiz3(starCount);
		} else if (selector.equals("4")) {
			quiz4(starCount);
		}else {
			quiz5(starCount);
		}
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void mainMenuPrint() {
		System.out.println("[����� ���α׷�]");
		System.out.println("1. ���� 1");
		System.out.println("2. ���� 2");
		System.out.println("3. ���� 3");
		System.out.println("4. ���� 4");
		System.out.println("5. ���� 5");
		System.out.println("q. ���α׷� ����");
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		QuizAns m = new QuizAns();
		Scanner in = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		while(loopFlag) {
			m.mainMenuPrint();									// m.mainMenuPrint�� ȣ���Ѵ�.
			System.out.println("����� �Է��ϼ���: ");
			String selector = in.nextLine();
			
			if(selector.equals("1") || selector.equals("2") || selector.equals("3") || selector.equals("4") || selector.equals("5")) {
				System.out.println("����� ���� ������ �Է��ϼ���: ");
				int starCount = in.nextInt();
				in.nextLine(); 									// �ܼ�â���� ���� ������ ����Ű�� ���ۿ� ����Ǵµ�, �� ����Ű�� �޾� ������ ������. (���)
				m.procStart(selector, starCount);
				
			}else if(selector.equals("q")) {
				 System.out.println("���α׷� ������ ...");
				 loopFlag = false;
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			System.out.println();
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}

}
