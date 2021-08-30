package b10_클래스;

public class Regular {
	private boolean yearCheck;

	public boolean isYearCheck() {					// booleen 형이기 때문에 get 대신 is가 쓰인다.
		return yearCheck;
	}

	public void setYearCheck(int year, String schoolName) {
		this.yearCheck = year > 2 && schoolName.equals("코리아it");	// 여기 조건식이 들어있기 때문에 다른 클래스에서 조건식 열람 불가능. 공식을 숨길 수 있음.
	}																// 정형화된 데이터를 통해 공식을 내보내줌. - 캡슐화

	
	

}
