package b19스태틱;

public class StaticTest {
	
	public static void main(String[] args) {
		
		Connector.connect();	// 스태틱의 메소드의 경우 글씨체 바뀜.
		
		// 매번 똑같은 로직을 써야 하는 경우 스태틱을 활용해 메모리 공간을 절약한다. 
		// 다 같은 기능을 공유할 수 있기 때문이다.
		// 밑 학생의 학번은 같은 로직을 사용하기 때문에 스태틱을 사용한다.
		
			Student s1 = new Student("김윤하");
			Student s2 = new Student("김준일");
			Student s3 = new Student("김현아");
			Student s4 = new Student("김나방");
			
			s1.showInfo();
			s2.showInfo();
			s3.showInfo();
			s4.showInfo();
			
		
		
	}
}
