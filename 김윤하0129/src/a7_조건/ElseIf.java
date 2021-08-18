package a7_조건;

public class ElseIf {

	public static void main(String[] args) {
		char c = 'a';
		
		if (c == 'A') {
			System.out.println("알파벳 A(a)입니다.");
		}else if(c == 'a') {
			System.out.println("알파벳 A(a)입니다.");
		}else {											// 모든 조건이 아닐 때 마지막에 실행됨.
			System.out.println("알파벳 A(a)가 아닙니다.");
		}
		

	}

}
