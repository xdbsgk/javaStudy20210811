package b10_Ŭ����;

public class Student {
	
	private String name;
	private String schoolName;						
	private int year;		
	
	public String getSchoolName() {								// ��ܹ� Source�� generate getter and setter ���� ���ϴ� ���Ϳ� ���� ���� ����.
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	public void getFreebies() {
		
		Regular regular = new Regular();
		regular.setYearCheck(year, schoolName);					// ��ü ���� ���α׷��ֿ��� ���. ������ ����
		
		
		if(regular.isYearCheck()) {								// ��ǰȭ; ���� yearcheck�� ���� ���� �����ϰ� ǥ�� ������. �ٸ� �Ŀ��� ���� �Ȱ��� ��� ����.
			System.out.println("����ǰ �����");
		}else {
			System.out.println("����� ����");
		}
	}

	public Student() {											// �⺻ ������ (��Ʈ�� + �����̽� => ������ �����.), Ŭ������ ����� �⺻ �����ڴ� �׻� ����.
		// TODO Auto-generated constructor stub					// ������ ȣ���� ���, �ϳ��� (������)�����ε��Ǹ� �⺻ �����ڰ� �� �ʿ���.
	}															// ���� �����ڴ� ���� public. default�� ���� Ÿ�������� ����.

	
	public Student(String name, String schoolName, int year) {	// ��� �� source ���� generate Constructor using fields �� �ڵ� ����.
		super();												// ��� ����
		this.name = name;										// this => Ŭ���� �ڽ��� �ǹ���. (�� Ŭ���� ��.)
		this.schoolName = schoolName;
		this.year = year;
	}
	
	
	public void setName(String name) {
		this.name = name + " �л�";								// this �ʿ���. ���� �� ���� name�̶�� ������ �ֱ� �����̴�.
	}
	
	public String getName() {									// �Ű����� ��� ��� ����. ���ϰ��� ������ �ȴ�.
		return name;											// this �ʿ� ����. ���� �� ���� name�̶�� ������ ���� �����̴�.
	}

	public void showInfo() {									// �л����� ������ �żҵ�
		System.out.println("[�л� ����]");
		System.out.println("�̸�: " + name);
		System.out.println("�б�: " + schoolName);
		System.out.println("�г�: " + year);
	}
	
}
