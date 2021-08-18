package a4_형변환;

public class ConversionString {

	public static void main(String[] args) {
		
		// 문자열(String)의 형변환: 문자열은 가장 계급이 높음.
		int num = 10;
		int num2 = 10;
		String sNum = "10";
		
		System.out.println(num + sNum);			// 문자열은 이어주는 역할을 함.
		System.out.println(num + num2 + sNum);	
		System.out.println(sNum + num + num2);	// 순서가 중요함.
		System.out.println(sNum + (num + num2));// 연산의 우선순위를 설정해주면 1020 출력이 가능하다.
		
		
		// 문자열 -> 다른 자료형(boolean, int, double)
		// int(정수): Integer.parseInt(문자열);
		int i = Integer.parseInt("10");			// --> 10이라는 문자열이 정수 10이 된다.
		double d = Double.parseDouble("10.1");		// --> 10.1이라는 문자열이 실수 10.1이 된다.
		boolean b = Boolean.parseBoolean("true");	// --> 문자열 true를 boolean true가 된다.
		
		// 다른 자료형 -> 문자열
		// int(정수): Integer.toString(정수);
		Integer.toString(10);
		Double.toString(10.2);
		Boolean.toString(false);
		
		
	}

}
