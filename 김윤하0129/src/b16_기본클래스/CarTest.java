package b16_기본클래스;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car(20210001, "k5");
		Car car2 = new Car(20210001, "k7");
		Car car3 = new Car(20210002, "k5");
		Car car4 = car1;
		
		// 오버라이딩을 하지 않았을 경우 물리적주소만 비교함. 따라서 면밀한 비교를 위해서 오버라이딩을 새로 하여 비교하여야 함.
		System.out.println(car1 == car2);
		System.out.println(car1 == car3);
		System.out.println(car1 == car4);
		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(car3));
		System.out.println(car1.equals(car4));
	}
}
