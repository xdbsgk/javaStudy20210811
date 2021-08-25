package a9_메소드;

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
		
		boolean ctrl = true;							// 전체 컨트롤 변수 선언
		
		while(ctrl) {									// 프로그램 실행
			
			System.out.println("[별 찍기 프로그램]");		// 메뉴
			System.out.println("1. 문제 1");
			System.out.println("2. 문제 2");
			System.out.println("3. 문제 3");
			System.out.println("4. 문제 4");
			System.out.println("5. 문제 5");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요: ");		// 명령 입력
			String selecter = s.nextLine();				// 문자열 입력(1~5,q)
			System.out.println();
			
			if (selecter.equals("1") || selecter.equals("2") || selecter.equals("3") || selecter.equals("4") || selecter.equals("5")) {
				
				System.out.println("출력할 별(*)의 개수를 입력하세요.: ");
				int starNum = s.nextInt();
				
//				String procStart(selecter, starNum) {
//					System.out.println();
//			}
				
				
			}else if (selecter.equals("q")) {
				System.out.println("프로그램 종료중 ...");
				break;
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			}
			
			}
		System.out.println("프로그램 종료");
	}


}
