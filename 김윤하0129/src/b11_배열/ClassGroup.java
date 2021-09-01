package b11_배열;

public class ClassGroup {
	private int student_count = 0;		// 학번
	private Student[] students;			// 
	private Desk[] desks;				// 
	
	public ClassGroup(int count) {
		students = new Student[count];
		desks = new Desk[count];
	}
	
	public void addStudent(String student_name) {
		desks[student_count] = new Desk(202100 + student_count, "Desker");
		students[student_count] = new Student((student_count++) + 20210000, student_name);
		//		학생의 자리 x번째						학번						이름 부여
	}
	
	public void classInfo(int student_code) {
		int student_num = 0;
		for (int i=0; i<students.length; i++) {					// .length => 이 배열의 개수를 반환해 줌. 0개가 없음!
			if(students[i].getStudent_code() == student_code) {	// students의 i 인덱스 안에서 getStudent_code가 학번과 같으면
				student_num = i;								// 내가 찾고자 하는 학생의 index 번호를 알아냄
				break;
				
			}
		}
		
		students[student_num].showInfo();
		desks[student_num].showInfo();
		
	}
}
