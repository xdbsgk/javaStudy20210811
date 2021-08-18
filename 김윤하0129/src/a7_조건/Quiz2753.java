package a7_조건;

import java.util.Scanner;

public class Quiz2753 {

	public static void main(String[] args) {
		// 해당년도가 4의 배수이면서 100의 배수가 아닐 떄 또는 400의 배수일 때이다.
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int result;
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			result = 1;
			System.out.println("윤년입니다.!!");
		}else {
			result = 0;
			System.out.println("윤년이 아닙니다.!!");
		}
		

	}

}
