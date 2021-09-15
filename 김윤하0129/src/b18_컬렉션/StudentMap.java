package b18_ÄÃ·º¼Ç;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {
		Map<String, Student> sMap = new HashMap<String, Student>();
		for (int i=0; i<10; i++) {
			sMap.put("±èÀ±ÇÏ"+i, new Student("±èÀ±ÇÏ"+i, 202100+i));
		}
		
		for (int i=0; i<sMap.size(); i++) {
			boolean flag = sMap.containsKey("±èÀ±ÇÏ9");
			if (flag == true) {
				System.out.println("Å° °ªÀÌ Á¸ÀçÇÕ´Ï´Ù.");
				break;
			}
		}
		
		System.out.println(sMap.get("±èÀ±ÇÏ3"));

	}

}
