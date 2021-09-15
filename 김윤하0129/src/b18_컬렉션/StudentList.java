package b18_ÄÃ·º¼Ç;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		
		for(int i=0; i<10; i++) {
			sList.add(new Student("±èÀ±ÇÏ"+i, 202100+i));
		}
		
		for(Student s : sList) {
			System.out.println(s);
		}
		
		System.out.println();
		
		Student s = sList.remove(3);
		System.out.println(s);
	}

}
