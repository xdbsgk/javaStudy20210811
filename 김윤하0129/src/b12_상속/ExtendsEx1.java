package b12_상속;

public class ExtendsEx1 {
// 상속을 받은 경우 그 변수가 없더라도 사용할 수 있음.
// protected의 경우 잘 사용되지는 않으나 추상클래스들을 담은 패키지의 경우 사용할 수 있음.
// 오버로딩 -> 메소드명은 같으나 매개변수가 다름. // 오버라이딩 -> 재정의. 안의 행위 내용(메소드)이 다름. 메소드명과 매개변수까지 같음.


	public static void main(String[] args) {
		Son s = new Son();			// 아들 생성자를 호출할 떄 아버지가 먼저 만들어짐. 아들 생성자가 완전히 완성되기 전에 아버지가 먼저 완성됨.
		s.setMoney(10000);
		System.out.println(s);		// 아들이 아빠의 메소드를 쓴 것. 아버지의 toString 호출.
	}

}
