package b12_상속;

public class Son extends Father{
	
	private int bitcoin;
	
	public Son() {
		super("김", 10000, "삼정타워");	// new Father();	// 부모 객체 가리킴 -> super
		System.out.println(super.toString());
		System.out.println("아들 생성");
		
/* constructor using fields 사용시 위 super에 한번에 집어넣기 가능.
  		super.setLastName("김");		
		super.setMoney(10000);
		super.setBuilding("삼정타워");
*/
	}
	
	// 오버라이드
	public void setMoney(int money) {
		super.setMoney((int)(money*1.1));
	}
	
	
	public int getBitcoin() {
		return bitcoin;
	}
	

	public void setBitcoin(int bitcoin) {
		this.bitcoin = bitcoin;
	}
}
