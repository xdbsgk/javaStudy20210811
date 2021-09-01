package b11_�迭;

public class ClassGroup {
	private int student_count = 0;		// �й�
	private Student[] students;			// 
	private Desk[] desks;				// 
	
	public ClassGroup(int count) {
		students = new Student[count];
		desks = new Desk[count];
	}
	
	public void addStudent(String student_name) {
		desks[student_count] = new Desk(202100 + student_count, "Desker");
		students[student_count] = new Student((student_count++) + 20210000, student_name);
		//		�л��� �ڸ� x��°						�й�						�̸� �ο�
	}
	
	public void classInfo(int student_code) {
		int student_num = 0;
		for (int i=0; i<students.length; i++) {					// .length => �� �迭�� ������ ��ȯ�� ��. 0���� ����!
			if(students[i].getStudent_code() == student_code) {	// students�� i �ε��� �ȿ��� getStudent_code�� �й��� ������
				student_num = i;								// ���� ã���� �ϴ� �л��� index ��ȣ�� �˾Ƴ�
				break;
				
			}
		}
		
		students[student_num].showInfo();
		desks[student_num].showInfo();
		
	}
}
