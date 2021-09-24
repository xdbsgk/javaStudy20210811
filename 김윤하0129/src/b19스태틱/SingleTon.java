package b19스태틱;

public class SingleTon {
	// 싱글톤: 클래스 자체를 하나만 만드는 경우. 데이터베이스
	// 예시: 회사가 하나, 지점이 여러개인 것처럼 하나에 집중할 때 사용.
	// Ex) 일련번호 관리의 경우 회사에서 생성하는 것처럼 하나에 집중함.
	
	public static void main(String[] args) {
		
		// 모든 공장이 이 하나의 kia회사를 통해서 만들어질 수 있다.
		// 하나의 회사를 공유하고있음.
		KIA factory1 = KIA.getInstance();
		KIA factory2 = KIA.getInstance();
		KIA factory3 = KIA.getInstance();
		KIA factory4 = KIA.getInstance();
		KIA factory5 = KIA.getInstance();
		KIA factory6 = KIA.getInstance();
		
		// 각각의 공장에서 생성해도 시리얼 넘버가 겹칠 일이 없음.
		Car k3 = factory1.createCar("과학3호기");
		Car k5 = factory1.createCar("과학5호기");
		Car k7 = factory1.createCar("과학7호기");
		Car k9 = factory1.createCar("과학9호기");
		Car ev6 = factory1.createCar("ev6");
		
		k3.carInfo();
		k5.carInfo();
		k7.carInfo();
		k9.carInfo();
		ev6.carInfo();
		
	}
	
}
