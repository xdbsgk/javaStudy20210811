package a7_조건;

import java.util.Scanner;

public class Quiz14681 {

	public static void main(String[] args) {
		// 백준 문제 - 사분면 고르기
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("x축: ");
		int x = in.nextInt();
		
		System.out.print("y축: ");
		int y = in.nextInt();
		
		
		if(x>0) {
			if(y>0) {
				System.out.println("1");
			}else {
				System.out.println("4");
			}
		}
		else {
			if(y>0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
		}
	}


}
