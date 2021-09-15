package b18_ÄÃ·º¼Ç;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentSet {
	public static void main(String[] args) {
		Set<Student> sSet = new HashSet<Student>();
		
		for (int i=0; i<3; i++)
		sSet.add(new Student("±èÀ±ÇÏ"+i, 202100+i));
		
		Iterator ir = sSet.iterator();
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
