package a8_반복;

import java.util.Scanner;

public class Quiz2739 {

	public static void main(String[] args) {
		// 구구단 출력 프로그램
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		System.out.println(N + "단");
			
		for(int i=0; i<9; i++) {
			int i2 = i+1;
			System.out.println(N + " * " + i2 + " = " + N * i2);
		}
			
		

	}

}
