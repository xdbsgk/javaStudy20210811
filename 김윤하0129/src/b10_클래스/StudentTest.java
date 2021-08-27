package b10_클래스;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student();				// 생성자 -> 클래스명과 같다.
				// kim, lee => 호실 번호라고 생각.
		kim.name = "김재성";
		
		kim.showInfo();
		
		Student lee = new Student();
		// 메모리 주소가 반환형이기 때문에 리턴값이 없음?
		lee.name = "이효원";
				
		lee.showInfo();
		
		System.out.println(kim);	// 메모리 주소 출력
		System.out.println(lee);	// 메모리 주소 출력

	}

}
