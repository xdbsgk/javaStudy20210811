package b10_Ŭ����;

public class GetterAndSetter {
	
	public static void main(String[] args) {
		
		Student kim = new Student();
		
		// kim.name = "������";
		// Setter()
		
		kim.setName("������");
		kim.setSchoolName("�λ���б�");
		kim.setYear(3);
		
		System.out.println(kim.getName());	 // private �̱� ������ �޼ҵ带 ȣ���ؾ� �Ѵ�.
		System.out.println(kim.getSchoolName());
		System.out.println(kim.getYear());
		
		kim.showInfo();
	}

}
