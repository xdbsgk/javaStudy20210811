package a7_����;

import java.util.Scanner;

public class Quiz2753 {

	public static void main(String[] args) {
		// �ش�⵵�� 4�� ����̸鼭 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int result;
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			result = 1;
			System.out.println("�����Դϴ�.!!");
		}else {
			result = 0;
			System.out.println("������ �ƴմϴ�.!!");
		}
		

	}

}
