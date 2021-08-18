package a5_연산자;

public class Operation1 {

	public static void main(String[] args) {
		
		// 증감 연산자(증가, 감소 연산자)
		
		int score = 85;

		//score = score + 1;
		//score = score - 1;
		
		System.out.println(score);		
		System.out.println(++score);	// 선증가 연산자 -> 먼저 증가시키기
		System.out.println(score++);	// 후증가 연산자 -> 현재는 값을 보류하고 다음번 변수 호출 때 연산하여라.
		System.out.println(score);
		System.out.println(++score);
		
		
		System.out.println(--score);		// 선감소 연산자
		System.out.println(score--);		// 후감소 연산자
		System.out.println(score);
		
	}

}
