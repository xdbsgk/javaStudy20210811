package b10_Ŭ����;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student("������","�λ���б�", 3);
		Student lee = new Student("������", "�б�", 1);
		Student park = new Student("��ȣ��", "�ڸ���it", 3);
		
//		kim.name = "������";	//	.�� �ش� �޸� �ּҰ��� �����Ѵ�
		kim.showInfo();
		kim.getFreebies();
		
		lee.showInfo();
		lee.getFreebies();
		
		park.showInfo();
		park.getFreebies();
		
//		Integer i = new Integer(100);
//		System.out.println(i.hashCode());
		
		System.out.println(kim.hashCode());
		


	}

}
