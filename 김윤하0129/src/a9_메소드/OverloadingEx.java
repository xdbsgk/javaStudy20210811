package a9_메소드;

public class OverloadingEx {							// 같은 사람인데 서로 다른 동작을 함. 재료를 받는 것에 따라 다른 동작을 한다. 
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int add(String num1, int num2) {				// 이름이 같아도 받는 자료형이 다르면 같은 메소드명을 사용할 수 있다.
		int result = Integer.parseInt(num1) + num2; 	// 대신 형변환이 사용됨. String => int
		return result;
	}
	
	public int add(int num1) {							// 매개변수가 다를 때마다 서로 다른 식을 만들 수 있음. (여러가지 경우의 수)
		int result = num1 + num1;
		return result;
	}
	
	public int mul(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		return result;
	}
	
	public double mul(int num1, double num2) {			// 형 변환 사용하는 곱셈. double => int
//		int num2_2 = (int)num2;
		double result = num1 * num2;
		return result;
	}
	
	public double mul(int num1, int num2) {	
		double result = num1 * num2;
		return result;
	}
	
	public void mainMethod() {
		int numberSum = add(10, 20);
		int numMul = mul(2, 10, 5);
		double numMul2 = mul(2, 3);
		System.out.println("두 수의 합은? " + numberSum);
		System.out.println("곱셈: " + numMul);
		System.out.println("곱셈2: " + numMul2);
	}

	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		OverloadingEx main = new OverloadingEx();
		main.mainMethod();
	}

}
