package b10_Ŭ����;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student();				// ������ -> Ŭ������� ����.
				// kim, lee => ȣ�� ��ȣ��� ����.
		kim.name = "���缺";
		
		kim.showInfo();
		
		Student lee = new Student();
		// �޸� �ּҰ� ��ȯ���̱� ������ ���ϰ��� ����?
		lee.name = "��ȿ��";
				
		lee.showInfo();
		
		System.out.println(kim);	// �޸� �ּ� ���
		System.out.println(lee);	// �޸� �ּ� ���

	}

}
