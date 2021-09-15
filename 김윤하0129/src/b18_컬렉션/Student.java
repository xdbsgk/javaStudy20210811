package b18_ÄÃ·º¼Ç;

public class Student {
	private String name;
	private int studentCode;
	
	
	public Student(String name, int studentCode) {
		super();
		this.name = name;
		this.studentCode = studentCode;
	}
	
	public String getName() {
		return name;
	}
	public int getStudentCode() {
		return studentCode;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentCode=" + studentCode + "]";
	}
	
}
