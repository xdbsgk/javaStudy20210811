package b19����ƽ;

public class Student {
	private static int student_static_code = 20210001;
	private int student_code;
	private String name;
	
	public Student(String name) {
		student_code = student_static_code++;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("�й�: " + student_code);
		System.out.println("�̸�: " + name);
		System.out.println();
	}
	

}
