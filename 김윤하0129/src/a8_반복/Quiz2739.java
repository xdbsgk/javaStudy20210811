package a8_�ݺ�;

import java.util.Scanner;

public class Quiz2739 {

	public static void main(String[] args) {
		// ������ ��� ���α׷�
		
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		System.out.println(N + "��");
			
		for(int i=0; i<9; i++) {
			int i2 = i+1;
			System.out.println(N + " * " + i2 + " = " + N * i2);
		}
			
		

	}

}
