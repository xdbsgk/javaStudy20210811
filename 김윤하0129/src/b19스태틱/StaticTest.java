package b19����ƽ;

public class StaticTest {
	
	public static void main(String[] args) {
		
		Connector.connect();	// ����ƽ�� �޼ҵ��� ��� �۾�ü �ٲ�.
		
		// �Ź� �Ȱ��� ������ ��� �ϴ� ��� ����ƽ�� Ȱ���� �޸� ������ �����Ѵ�. 
		// �� ���� ����� ������ �� �ֱ� �����̴�.
		// �� �л��� �й��� ���� ������ ����ϱ� ������ ����ƽ�� ����Ѵ�.
		
			Student s1 = new Student("������");
			Student s2 = new Student("������");
			Student s3 = new Student("������");
			Student s4 = new Student("�質��");
			
			s1.showInfo();
			s2.showInfo();
			s3.showInfo();
			s4.showInfo();
			
		
		
	}
}
