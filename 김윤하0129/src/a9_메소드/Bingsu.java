package a9_�޼ҵ�;		// code �� ����ȭ

public class Bingsu {
	
	
	
	String toMake(String material, int materialCount, String material2) {		//��Ḧ ������ ���� ���� �Ű������� ���� �� ����. �޸�(,)�� �����Ѵ�.
		String bingsu = material + " " + materialCount + "���� "+ material2 + "�� �� ����";
		return bingsu;
	}
	
	
	void voidTest() {
		System.out.println("���̵� �׽�Ʈ �޼ҵ�");
	}
	

	public static void main(String[] args) {
		// static -> �����ϴ�, void(�ƹ��� �ǹ� ����) �Լ�
		Bingsu b = new Bingsu();
		
		String material = "����";
		
		
		String bingsu1 = b.toMake(material, 10, "����"); // material�� ���޺���
		String bingsu2 = b.toMake("û����", 10, "����"); // material�� ���޺���
		String bingsu3 = b.toMake("����", 10, "����"); // material�� ���޺���
		String bingsu4 = b.toMake("����", 10, "����"); // material�� ���޺���
				
		System.out.println(bingsu1);
		System.out.println(bingsu2);
		System.out.println(bingsu3);
		System.out.println(bingsu4);
		
		b.voidTest();
	}

}
