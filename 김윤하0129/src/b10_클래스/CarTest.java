package b10_Ŭ����;

public class CarTest {

	public static void main(String[] args) {
		
		Car sonata = new Car();
		sonata.setCompany("�����ڵ���");
		sonata.setModel("�ҳ�Ÿ");
		sonata.setColor("��");
		sonata.setYear(2019);
		
		Car k7 = new Car();
		k7.setCompany("kia�ڵ���");
		k7.setModel("k7");
		k7.setColor("ȭ��Ʈ");
		k7.setYear(2017);
		
		Car chiron = new Car();
		chiron.setCompany("�ΰ�Ƽ");
		chiron.setModel("Bugatti Chiron Sport");
		chiron.setColor("����");
		chiron.setYear(2018);
		
		Car tesla_model_x = new Car();
		tesla_model_x.setCompany("�׽���");
		tesla_model_x.setModel("tesla model X");
		tesla_model_x.setColor("gray");
		tesla_model_x.setYear(2019);
		
		
		System.out.println("[������ ����]");
		System.out.println();
		sonata.carInfo();
		System.out.println();
		k7.carInfo();
		System.out.println();
		chiron.carInfo();
		System.out.println();
		tesla_model_x.carInfo();
	}

}
