package a3_상수;

public class Constant {
	
	/**
	 * 상수 
	 * 1. final 예약어를 자료형 앞에 사용하여야 한다.
	 * 2. 이름은 모두 대문자여야 한다.
	 */
	
	public static void main(String[] args) {
		
		int maxNum = 100;			// 변수
		final int MAX_NUM = 100;	// 상수, final은 결과적으로 라는 ..
		
		maxNum = 200;				// 변수
// 		MAX_NUM = 200;				// 값이 항상 일정함. 다른값으로 교체 X.
		
		System.out.println("일반 변수: " + maxNum);
		System.out.println("상수: " + MAX_NUM);

	}

}

