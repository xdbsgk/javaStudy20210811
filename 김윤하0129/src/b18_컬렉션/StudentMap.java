package b18_�÷���;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {
		Map<String, Student> sMap = new HashMap<String, Student>();
		for (int i=0; i<10; i++) {
			sMap.put("������"+i, new Student("������"+i, 202100+i));
		}
		
		for (int i=0; i<sMap.size(); i++) {
			boolean flag = sMap.containsKey("������9");
			if (flag == true) {
				System.out.println("Ű ���� �����մϴ�.");
				break;
			}
		}
		
		System.out.println(sMap.get("������3"));

	}

}
