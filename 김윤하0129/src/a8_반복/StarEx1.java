package a8_�ݺ�;

import java.util.Scanner;

public class StarEx1 {

	public static void main(String[] args) {
		// �����
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ����: ");
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
