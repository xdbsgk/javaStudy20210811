package a7_조건;

import java.util.Scanner;

public class Quiz2884 {

	public static void main(String[] args) {
		// 알람 시계 문제
		// 정수 H시 M분 
		// 입력은 0시 0분 - 23시 59분 (0 사용 X)
		
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
