package b16_기본클래스;

public class ObjectEx{							// extends Object(상속)가 생략되어있음. 따라서 아래 oex에서 toString 사용가능함.
												// 모든 클래스는 Object class를 상속받고 있음. 상위 클래스의 상위 클래스, 즉 최상위클래스가 항상 Object상속받기 때문에
												// 다중상속이 안되더라도 항상 상속받고있음.
	private String className = "ObjectEx";
	
	@Override
		public String toString() {
			return className;
		}
	
	@Override
		public boolean equals(Object obj) {
			return super.equals(obj);
		}
	
	@Override
		public int hashCode() {					// 물리적 주소가 아닌 논리적 주소를 바꾼다.
			return 100;							
		}
	
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.toString());		// .toString: 그 클래스가 위치하고있는 주소를 알려준다. (지워도 동일하게 주소값나옴. => 투스트링 메소드는 생략가능)
		
		ObjectEx oex = new ObjectEx();
		ObjectEx oex2 = new ObjectEx();
		System.out.println(oex.toString());
		
		String str1 = "yunha";
		String str2 = "yunha";
		String str3 = new String("yunha");
		
		/* toString() 메소드 
		 * 
		 * 
		String[] toStringArray = new String[10];
		
		for(int i=0; i<toStringArray.length; i++) {
			Student s1 = new Student("김윤하", "부산대학교", 1, 1, 1, 20190002, "부산 사하구", "010-3230-0129");
			toStringArray[i] = s1.toString();
		}
		
		for(String s : toStringArray) {
			System.out.println(s);
		}
		*/
		
		System.out.println(oex.equals(oex2));	// 객체 자체를 비교 -> 물리적 주소를 비교하기때문에 해시코드 오버라이드 100으로 바꿨지만 false. 
		
		System.out.println(str1 + str2 + str3);
		
		System.out.println(str1.equals(str2));	//t
		
		System.out.println(str1 == str2);		//t
		System.out.println(str1 == str3);		//f
		
		// equals와 == 비교의 차이는?
		// 물리적 주소(Hardware)와 논리적 주소(Software, 값) 비교
		
		Student s1 = new Student("김윤하", "부산대학교", 1, 1, 1, 20190002, "부산 사하구", "010-3230-0129");
		Student s2 = new Student("김윤하", "부산대학교", 1, 1, 1, 20190002, "부산 사하구", "010-3230-0129");
		
		System.out.println(s1.equals(s2));	// equals가 최상위이므로 업캐스팅됨..?
		System.out.println(s1 == s2);		// f
	}
	
}
