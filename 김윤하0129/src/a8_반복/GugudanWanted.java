package a8_�ݺ�;

import java.util.Scanner;

public class GugudanWanted {

	public static void main(String[] args) {
		// �������� ���ϴ� ���� ~ ���ܱ��� ����ϱ�, �Է°� O
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �ܼ�: ");
		int start = input.nextInt();
		System.out.print("������ �ܼ�: ");
		int finish = input.nextInt();
		
		while(start <= finish) {
			System.out.println(start + " ��");
			for(int i=0; i<9; i++) {		// ���� for�������� '='�� ������� ����.
				int i2=i+1;
			System.out.println(start + " X " + i2 + " = " + start*i2);
			}
			start++;
			System.out.println();
		}

	}

}
