package b12_���;

public class Son extends Father{
	
	private int bitcoin;
	
	public Son() {
		super("��", 10000, "����Ÿ��");	// new Father();	// �θ� ��ü ����Ŵ -> super
		System.out.println(super.toString());
		System.out.println("�Ƶ� ����");
		
/* constructor using fields ���� �� super�� �ѹ��� ����ֱ� ����.
  		super.setLastName("��");		
		super.setMoney(10000);
		super.setBuilding("����Ÿ��");
*/
	}
	
	// �������̵�
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
