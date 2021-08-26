package a9_메소드;

import java.util.Scanner;

public class Quiz {
	
	static void quiz1(int starNum) {					// 1번 문제 메소드
		for (int i=0; i<starNum; i++) {
			int i2=i+1;
			for(int j=0; j<i2; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
	}
	
	static void quiz2(int starNum) {					// 2번 문제 메소드
		for (int i=0; i<starNum; i++) {
			for(int j=0; j<starNum-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void quiz3(int starNum) {					// 3번 문제 메소드
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
	
	static void quiz4(int starNum) {					// 4번 문제 메소드
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
	
	static void quiz5(int starNum) {					// 5번 문제 메소드
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
		
		while(true) {									// 프로그램 실행
			
			System.out.println("[별 찍기 프로그램]");		// 메뉴
			System.out.println("1. 문제 1");
			System.out.println("2. 문제 2");
			System.out.println("3. 문제 3");
			System.out.println("4. 문제 4");
			System.out.println("5. 문제 5");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요: ");		// 명령 입력
			String selecter = s.nextLine();				// 문자열 입력 (1~5, q, etc)
			System.out.println();
			
		
			if (selecter.equals("1")) {
				System.out.println("출력할 별(*)의 개수를 입력하세요.: ");
				int starNum = s.nextInt();
				quiz1(starNum);
				break;
			}else if(selecter.equals("2")) {
				System.out.println("출력할 별(*)의 개수를 입력하세요.: ");
				int starNum = s.nextInt();
				quiz2(starNum);
				break;
			}else if(selecter.equals("3")) {
				System.out.println("출력할 별(*)의 개수를 입력하세요.: ");
				int starNum = s.nextInt();
				quiz3(starNum);
				break;
			}else if(selecter.equals("4")) {
				System.out.println("출력할 별(*)의 개수를 입력하세요.: ");
				int starNum = s.nextInt();
				quiz4(starNum);
				break;
			}else if(selecter.equals("5")) {
				System.out.println("출력할 별(*)의 개수를 입력하세요.: ");
				int starNum = s.nextInt();
				quiz5(starNum);
				break;
			}else if (selecter.equals("q")) {
				System.out.println("프로그램 종료중 ...");
				break;
				
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
			}
			
			}
		
		System.out.println();
		System.out.println("프로그램 종료");
	
	}


}
