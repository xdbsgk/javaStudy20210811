package b12_���;

public class Father {
	private String lastName;
	private int money;
	private String building;
	
	public Father() {
		System.out.println("�ƹ��� ����");
	}
	
	// constructor using fields
	public Father(String lastName, int money, String building) {
		super();
		this.lastName = lastName;
		this.money = money;
		this.building = building;
	}


	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override // ������̼�
	public String toString() {
		return "Father [lastName=" + lastName + ", money=" + money + ", building=" + building + "]";
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	
}
