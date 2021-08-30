package b10_클래스;

public class Student {
	
	private String name;
	private String schoolName;						
	private int year;		
	
	public String getSchoolName() {								// 상단바 Source의 generate getter and setter 통해 원하는 게터와 세터 생성 가능.
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
		regular.setYearCheck(year, schoolName);					// 객체 지향 프로그래밍에서 사용. 정보의 은닉
		
		
		if(regular.isYearCheck()) {								// 부품화; 앞의 yearcheck를 통해 식을 간단하게 표현 가능함. 다른 식에도 쉽게 똑같이 사용 가능.
			System.out.println("사은품 대상자");
		}else {
			System.out.println("대상자 제외");
		}
	}

	public Student() {											// 기본 생성자 (컨트롤 + 스페이스 => 생성자 만들기.), 클래스를 만들면 기본 생성자는 항상 생략.
		// TODO Auto-generated constructor stub					// 하지만 호출할 경우, 하나라도 (생성자)오버로딩되면 기본 생성자가 꼭 필요함.
	}															// 접근 지정자는 거의 public. default는 따로 타이핑하지 않음.

	
	public Student(String name, String schoolName, int year) {	// 상단 바 source 에서 generate Constructor using fields 로 자동 생성.
		super();												// 상속 관계
		this.name = name;										// this => 클래서 자신을 의미함. (내 클래스 안.)
		this.schoolName = schoolName;
		this.year = year;
	}
	
	
	public void setName(String name) {
		this.name = name + " 학생";								// this 필요함. 지역 내 같은 name이라는 변수가 있기 때문이다.
	}
	
	public String getName() {									// 매개변수 없어도 상관 없음. 리턴값만 있으면 된다.
		return name;											// this 필요 없음. 지역 내 같은 name이라는 변수가 없기 때문이다.
	}

	public void showInfo() {									// 학생마다 가지는 매소드
		System.out.println("[학생 정보]");
		System.out.println("이름: " + name);
		System.out.println("학교: " + schoolName);
		System.out.println("학년: " + year);
	}
	
}
