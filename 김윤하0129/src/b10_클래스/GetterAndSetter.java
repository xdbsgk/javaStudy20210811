package b10_클래스;

public class GetterAndSetter {
	
	public static void main(String[] args) {
		
		Student kim = new Student();
		
		// kim.name = "김윤하";
		// Setter()
		
		kim.setName("김윤하");
		kim.setSchoolName("부산대학교");
		kim.setYear(3);
		
		System.out.println(kim.getName());	 // private 이기 떄문에 메소드를 호출해야 한다.
		System.out.println(kim.getSchoolName());
		System.out.println(kim.getYear());
		
		kim.showInfo();
	}

}
