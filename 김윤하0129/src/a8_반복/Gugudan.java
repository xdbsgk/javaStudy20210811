package a8_반복;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단을 반복문으로 출력해보기

		// for문(1부터 시작하는 예시)
		for(int i=1; i<=9; i++) {	// 여기서 i는 for문 안의 지역변수
			System.out.println("2 X " + i + " = " + 2*i);
		}
		
		// for문(0부터 시작하는 예시)
		for(int i=0; i<9; i++) {	// 지역변수 위와 중복되도 상관X
			int i2 = i+1;	
			System.out.println("4 X " + i2 + " = " + 4*i2);
		}
		
		// while문
		System.out.println("3단");
		int l = 1;					// 여기서 l은 전역변수, 앞 지역변수 사용 끝나고 같은 변수로 선언하면 사용 가능. 전역변수가 지역변수 위에 선언되면 사용 불가!
		while(l<=9) {
			System.out.println("3 X " + l + " = " + 3*l);
			l++;
		}
		
	}

}
