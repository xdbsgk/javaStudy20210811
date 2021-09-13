 package b14_추상화;

abstract class AbstractEx3Exten extends AbstractEx {
	// 사용 예시
	// 이 클래스를 쓰고는 싶은데 구현이 아직 안 된 경우, 임시로 사용한다.
	}

class AbstractEx2Exten extends AbstractEx {
	@Override
	public void printName() {
		System.out.println("김 윤 하");
		
	}
}

public class AbstractExExten extends AbstractEx{
	// 상위 클래가 추상클래스이기 때문에 재정의해야함.
	@Override	
	public void printName() {
		System.out.println("김 윤하");
		
	}
}
