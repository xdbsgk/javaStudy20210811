package b11_�迭;

public class Student {
	private int student_code;
	private String student_name;
	
	
	public Student(int student_code, String student_name) {		// �ڵ����� ������ �����ε�
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
		System.out.println(student_name + "�л��� ���� �ڵ��ȣ(�й�)��" + student_code +"�Դϴ�.");
	}
	public void readBook() {
		System.out.println(student_name + "�л��� å�� �н��ϴ�.");
	}
}
