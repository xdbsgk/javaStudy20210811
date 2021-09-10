package b14_추상화;

public class AbstractExTest {

	public static void main(String[] args) {
		// 추상클래스의 경우 생성 불가능. 틀이 완성되지 않았기 때문에 찍어낼 수 없다. 
		// AbstractEx absEx = new AbstractEx();	-> X
		
		// 추상클래스는 생성은 불가능하지만 업캐스팅하여 사용은 가능하다.
		AbstractEx absEx = new AbstractExExten();
		AbstractEx absEx2 = new AbstractExExten();
	}

}
