package b10_클래스;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student("김윤하","부산대학교", 3);
		Student lee = new Student("이지원", "학교", 1);
		Student park = new Student("박호훈", "코리아it", 3);
		
//		kim.name = "김준일";	//	.은 해당 메모리 주소값을 참조한다
		kim.showInfo();
		kim.getFreebies();
		
		lee.showInfo();
		lee.getFreebies();
		
		park.showInfo();
		park.getFreebies();
		
//		Integer i = new Integer(100);
//		System.out.println(i.hashCode());
		
		System.out.println(kim.hashCode());
		


	}

}
