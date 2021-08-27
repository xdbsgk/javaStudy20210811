package b10_클래스;

public class Student {
	
	String name;
	String schoolName;
	String year;										// 학년
	
	public void showInfo() {							// 학생마다 가지는 매소드
		System.out.println("학생 정보");
		System.out.println("이름: " + name);
		System.out.println("학교: " + schoolName);
		System.out.println("학년: " + year);
	}
	
}
