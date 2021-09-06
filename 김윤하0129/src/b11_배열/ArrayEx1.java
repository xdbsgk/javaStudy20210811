package b11_배열;

/*
 * Array(배열)
 * 같은 자료형끼리의 묶음.
 * index(인덱스)
 * index 연산자 기호 [] 대괄호
 */

public class ArrayEx1 {
	
	public static void main(String[] args) {
		
/*	int num1 = 10;
	int num2 = 20;
	int num3 = 30;
	int num4 = 40;
	int num5 = 50;

	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println(num4);
	System.out.println(num5);
*/
		
		
// 배열 선언 및 대입 방법
	
// 1. 
	int[] num = new int[100];
	
//	num = new int[] {10, 20, 30, 40, 50};				// 이 문법은 X
	
	for (int i=0; i<100; i++) {							// 0부터 99까지의 칸 존재. 그 안에 10씩 곱해서 넣어주는 
		num[i] = i * 10;
	}
	for (int i=0; i<100; i++) {
		System.out.println(num[i]);
	}
	
//	num[0] = 10;
//	num[1] = 20;
//	num[2] = 30;
//	num[3] = 40;
//	num[4] = 50;
	
// 2. 장점: 
	int[] arr_i = new int[] {10, 20, 30, 40, 50};		// 같은
	int[] arr_i2 = {10, 20, 30, 40, 50};				// 표현 (맞춤 제작)
	
	for(int i=0; i<5; i++) {
		System.out.println(num[i]);
	}
	
	}
}
