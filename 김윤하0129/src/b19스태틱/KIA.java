package b19스태틱;

public class KIA {
	
	// kia자동차 회사 하나 만들기
	private static KIA instance = new KIA();
	private int serialNum = 20210001;

	private KIA() {
		
	}
	
	// 외부에서 생성된 공간을 외부에서 접근하고 싶지만 프라이빗이라서 안됨 
	// --> 하지만 스태틱을 통해 만들어진 딱 하나의 공장을 외부로 공유할 수 있음.
	
	public static KIA getInstance() {
		// 혹시라도 카팩토리가 생성되지 않았을 경우를 대비해 하나를 생성해 오류를 방지함.
		// 생성한 인스턴스를 리턴해줌.
		if (instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(serialNum++, model);
	}
	
}
