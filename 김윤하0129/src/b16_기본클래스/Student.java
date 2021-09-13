package b16_기본클래스;

public class Student {
	private String name;
	private String schoolName;
	private int year;
	private int group;
	private int number;
	private int studentNumber;
	private String addr;
	private String phoneNumber;
	
	
	
	public Student(String name, String schoolName, int year, int group, int number, int studentNumber, String addr,
			String phoneNumber) {
		super();
		this.name = name;
		this.schoolName = schoolName;
		this.year = year;
		this.group = group;
		this.number = number;
		this.studentNumber = studentNumber;
		this.addr = addr;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		return studentNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj.hashCode() == this.hashCode()) {	// 오브젝트로 전달받은 해시코드와 자기자신의 해시코드를 비교한다.
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", schoolName=" + schoolName + ", year=" + year + ", group=" + group
				+ ", number=" + number + ", studentNumber=" + studentNumber + ", addr=" + addr + ", phoneNumber="
				+ phoneNumber + "]";
	}
}
