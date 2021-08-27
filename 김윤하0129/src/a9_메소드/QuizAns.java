package a9_메소드;

import java.util.Scanner;

public class QuizAns {
/////////////////////////////////////////////////////////////// 퀴즈 넘버 //////////////////////////////////////////////////////////////////////
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
		System.out.println("[별찍기 프로그램]");
		System.out.println("1. 문제 1");
		System.out.println("2. 문제 2");
		System.out.println("3. 문제 3");
		System.out.println("4. 문제 4");
		System.out.println("5. 문제 5");
		System.out.println("q. 프로그램 종료");
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
		QuizAns m = new QuizAns();
		Scanner in = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		while(loopFlag) {
			m.mainMenuPrint();									// m.mainMenuPrint를 호출한다.
			System.out.println("명령을 입력하세요: ");
			String selector = in.nextLine();
			
			if(selector.equals("1") || selector.equals("2") || selector.equals("3") || selector.equals("4") || selector.equals("5")) {
				System.out.println("출력할 별의 개수를 입력하세요: ");
				int starCount = in.nextInt();
				in.nextLine(); 									// 콘솔창에서 받은 마지막 엔터키가 버퍼에 저장되는데, 그 엔터키를 받아 버리는 역할임. (편법)
				m.procStart(selector, starCount);
				
			}else if(selector.equals("q")) {
				 System.out.println("프로그램 종료중 ...");
				 loopFlag = false;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램이 종료되었습니다.");

	}

}
