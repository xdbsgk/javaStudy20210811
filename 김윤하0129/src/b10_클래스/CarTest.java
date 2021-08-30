package b10_클래스;

public class CarTest {

	public static void main(String[] args) {
		
		Car sonata = new Car();
		sonata.setCompany("현대자동차");
		sonata.setModel("소나타");
		sonata.setColor("블랙");
		sonata.setYear(2019);
		
		Car k7 = new Car();
		k7.setCompany("kia자동차");
		k7.setModel("k7");
		k7.setColor("화이트");
		k7.setYear(2017);
		
		Car chiron = new Car();
		chiron.setCompany("부가티");
		chiron.setModel("Bugatti Chiron Sport");
		chiron.setColor("레드");
		chiron.setYear(2018);
		
		Car tesla_model_x = new Car();
		tesla_model_x.setCompany("테슬라");
		tesla_model_x.setModel("tesla model X");
		tesla_model_x.setColor("gray");
		tesla_model_x.setYear(2019);
		
		
		System.out.println("[윤하의 차고]");
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
