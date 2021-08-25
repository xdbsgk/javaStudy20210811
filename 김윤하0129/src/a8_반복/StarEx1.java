package a8_반복;

import java.util.Scanner;

public class StarEx1 {

	public static void main(String[] args) {
		// 별찍기
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("별의 개수: ");
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
