package b19스태틱;

// 생성 없이 바로 클래스 네임 뒤에 .을 붙여서 호출함.(참조)

public interface Connector {
	public static void connect() {
		System.out.println("연결되었습니다.");
	}
	
}
