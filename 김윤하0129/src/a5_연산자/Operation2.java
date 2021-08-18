package a5_연산자;

public class Operation2 {

	public static void main(String[] args) {
		
		// <논리 연산자>
		// AND(&&) = 곱
		// OR(||) = 합
		// NOT(!) = 반전
		
		// true(1) && false(0) => false(0)
		// && 연산에서 false의 결과가 나오려면? 둘 중 하나만 0이면 된다.
		// && 연산에서 true의 결과가 나오려면? 둘 다 1이어야 한다.
		
		// true(1) || false(0) => true(1)
		// || 연산에서 false의 결과가 나오려면? 둘 다 0이어야 한다.
		// || 연산에서 true의 결과가 나오려면? 둘 중 하나만 1이면 된다.(0만 아니면 참이기 때문 . 10(2)도 1로 계산한다.)
		
		// !가 앞에 붙으면 true -> false 반전이 이루어진다.
		
		System.out.println(!(true || false));
		
		
		
	}

}
