package a6_ǥ���Է�;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String�� �⺻���� Ŭ����
		// Scanner�� �ܺ� Ŭ���� (������ -> �ڹٿ��� �����ϴ� �⺻ ���� Ŭ������ �ƴ�.)
		
		// �ڵ� import
		// Ctrl + �����̽��� -> �ϳ��� Ŭ���� import
		// Ctrl + Shift + o -> ��� Ŭ���� import
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("���� 2���� �Է��� �ּ���. ");
		System.out.print("ù��° ��: ");
		String str = input.nextLine();		// if] next�� ������ ->�����̽��ٸ� ���������� ���� ���Ͱ� ��.
		System.out.print("�ι�° ��: ");
		String str2 = input.nextLine();		// 
		
		System.out.print("���: ");
		System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));
		
		

	}

}
