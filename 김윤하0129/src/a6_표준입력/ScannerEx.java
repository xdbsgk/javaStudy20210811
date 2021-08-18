package a6_표준입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String은 기본제공 클래스
		// Scanner는 외부 클래스 (빨간줄 -> 자바에서 제공하는 기본 제공 클래스가 아님.)
		
		// 자동 import
		// Ctrl + 스페이스바 -> 하나의 클래스 import
		// Ctrl + Shift + o -> 모든 클래스 import
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("숫자 2개를 입력해 주세요. ");
		System.out.print("첫번째 수: ");
		String str = input.nextLine();		// if] next만 있으면 ->스페이스바를 만날때까지 값만 엔터가 됨.
		System.out.print("두번째 수: ");
		String str2 = input.nextLine();		// 
		
		System.out.print("결과: ");
		System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));
		
		

	}

}
