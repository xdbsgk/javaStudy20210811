package b19����ƽ;

public class KIA {
	
	// kia�ڵ��� ȸ�� �ϳ� �����
	private static KIA instance = new KIA();
	private int serialNum = 20210001;

	private KIA() {
		
	}
	
	// �ܺο��� ������ ������ �ܺο��� �����ϰ� ������ �����̺��̶� �ȵ� 
	// --> ������ ����ƽ�� ���� ������� �� �ϳ��� ������ �ܺη� ������ �� ����.
	
	public static KIA getInstance() {
		// Ȥ�ö� ī���丮�� �������� �ʾ��� ��츦 ����� �ϳ��� ������ ������ ������.
		// ������ �ν��Ͻ��� ��������.
		if (instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(serialNum++, model);
	}
	
}
