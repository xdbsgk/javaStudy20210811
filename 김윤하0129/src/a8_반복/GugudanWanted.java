package a8_반복;

import java.util.Scanner;

public class GugudanWanted {

	public static void main(String[] args) {
		// 구구단을 원하는 시작 ~ 끝단까지 출력하기, 입력값 O
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("시작 단수: ");
		int start = input.nextInt();
		System.out.print("마지막 단수: ");
		int finish = input.nextInt();
		
		while(start <= finish) {
			System.out.println(start + " 단");
			for(int i=0; i<9; i++) {		// 보통 for문에서는 '='을 사용하지 않음.
				int i2=i+1;
			System.out.println(start + " X " + i2 + " = " + start*i2);
			}
			start++;
			System.out.println();
		}

	}

}
