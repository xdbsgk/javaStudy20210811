package a1_출력;

public class MyInfo {

	public static void main(String[] args) {
		int studentYear = 3;					// studentYear (4byte 정수형)변수에 1이라는 값을 대입한다.
		
		System.out.print("이름: ");				// println 대신 print를 쓰는 예시. 옆에 붙여야 하기 때문이다.
		System.out.println("김윤하");
		
		System.out.print("연락처: ");	
		System.out.println("010-3230-0129");
		
		System.out.print("주소: ");	
		System.out.println("부산 사하구");
		
		System.out.print("학교: ");	
		System.out.println("부산대학교");
		
		System.out.print("전공: ");	
		System.out.println("정보컴퓨터공학");
		
		System.out.print("학년: ");	
		System.out.println(studentYear);
		System.out.println();					// 줄바꿈만 시도
		
	}

}
