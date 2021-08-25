package a9_메소드;		// code 의 구조화

public class Bingsu {
	
	
	
	String toMake(String material, int materialCount, String material2) {		//재료를 여러개 보낼 때는 매개변수를 여러 개 선언. 콤마(,)로 구분한다.
		String bingsu = material + " " + materialCount + "개와 "+ material2 + "가 들어간 빙수";
		return bingsu;
	}
	
	
	void voidTest() {
		System.out.println("보이드 테스트 메소드");
	}
	

	public static void main(String[] args) {
		// static -> 공유하는, void(아무런 의미 없는) 함수
		Bingsu b = new Bingsu();
		
		String material = "딸기";
		
		
		String bingsu1 = b.toMake(material, 10, "연유"); // material은 전달변수
		String bingsu2 = b.toMake("청포도", 10, "연유"); // material은 전달변수
		String bingsu3 = b.toMake("망고", 10, "연유"); // material은 전달변수
		String bingsu4 = b.toMake("초코", 10, "연유"); // material은 전달변수
				
		System.out.println(bingsu1);
		System.out.println(bingsu2);
		System.out.println(bingsu3);
		System.out.println(bingsu4);
		
		b.voidTest();
	}

}
