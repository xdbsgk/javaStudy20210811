package b19����ƽ;

public class SingleTon {
	// �̱���: Ŭ���� ��ü�� �ϳ��� ����� ���. �����ͺ��̽�
	// ����: ȸ�簡 �ϳ�, ������ �������� ��ó�� �ϳ��� ������ �� ���.
	// Ex) �Ϸù�ȣ ������ ��� ȸ�翡�� �����ϴ� ��ó�� �ϳ��� ������.
	
	public static void main(String[] args) {
		
		// ��� ������ �� �ϳ��� kiaȸ�縦 ���ؼ� ������� �� �ִ�.
		// �ϳ��� ȸ�縦 �����ϰ�����.
		KIA factory1 = KIA.getInstance();
		KIA factory2 = KIA.getInstance();
		KIA factory3 = KIA.getInstance();
		KIA factory4 = KIA.getInstance();
		KIA factory5 = KIA.getInstance();
		KIA factory6 = KIA.getInstance();
		
		// ������ ���忡�� �����ص� �ø��� �ѹ��� ��ĥ ���� ����.
		Car k3 = factory1.createCar("����3ȣ��");
		Car k5 = factory1.createCar("����5ȣ��");
		Car k7 = factory1.createCar("����7ȣ��");
		Car k9 = factory1.createCar("����9ȣ��");
		Car ev6 = factory1.createCar("ev6");
		
		k3.carInfo();
		k5.carInfo();
		k7.carInfo();
		k9.carInfo();
		ev6.carInfo();
		
	}
	
}
