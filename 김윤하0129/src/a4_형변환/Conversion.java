package a4_형변환;				// 자료형에 계급이 있음. 캐릭터 < 인트 < 더블 < 스트링

public class Conversion {

	public static void main(String[] args) {
		
	// 업캐스팅 		낮은 계급 -> 높은 계급으로
		
		// 1. 문자 -> 정수
		char c = 'A';
		int i_c = c;			// 업캐스팅 시 '묵시적 형 변환; 가능.
		System.out.println("문자 -> 정수: " + i_c);	
		// 2. 정수 -> 실수
		int num = 100;
		double d_num = num;
		System.out.println("정수 -> 실수: " + d_num);
		// 3. 문자 + 정수			=>	문자와 정수는 합할 수 없다. c가 업캐스팅을 통해 데이터 변환
		System.out.println("문자 + 정수: " + (c + num));
		
		
	// 다운캐스팅 		높은 계급 -> 낮은 계급으로(명시 필수 !!)
		
		// 1. 정수 -> 문자
		int i = 67;		
		char c_i = (char)i;		// 다운캐스팅 시 '명시적 형 변환' 필요.
		System.out.println("정수 -> 문자: " + c_i);
		// 2. 실수 -> 정수
		double d_num2 = 3.14;
		int num2 = (int)d_num2;
		System.out.println("실수 -> 정수: " + num2);

	}

}
