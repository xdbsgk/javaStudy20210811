package a7_����;

import java.util.Scanner;

public class Quiz2884 {

	public static void main(String[] args) {
		// �˶� �ð� ����
		// ���� H�� M�� 
		// �Է��� 0�� 0�� - 23�� 59�� (0 ��� X)
		
		Scanner input = new Scanner(System.in);
		
		int H = input.nextInt();
		int M = input.nextInt();
		
		if(H > 0 && M >= 45) {
			M = M - 45;
		}else if(H == 0) {
			if(M >= 45) {
				M = M - 45;
				H = 0;
			}else {
				M = M + 15;
				H = 23;
			}
		}else {
			M = M + 15;
			H = H - 1;
		}

		System.out.print(H);
		System.out.print(" ");
		System.out.println(M);
	}

}
