package b11_배열;

public class Student {
	private int student_code;
	private String student_name;
	
	
	public Student(int student_code, String student_name) {		// 자동으로 생성자 오버로딩
		super();
		this.student_code = student_code;
		this.student_name = student_name;
	}
	
	public int getStudent_code() {
		return student_code;
	}
	public void setStudent_code(int student_ode) {
		this.student_code = student_ode;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	public void showInfo() {
		System.out.println(student_name + "학생의 고유 코드번호(학번)는" + student_code +"입니다.");
	}
	public void readBook() {
		System.out.println(student_name + "학생이 책을 읽습니다.");
	}
}
