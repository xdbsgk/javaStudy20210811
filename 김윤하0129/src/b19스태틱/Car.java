package b19스태틱;

public class Car {
	
	private int serialNum;
	private String model;
	
	public Car(int serialNum, String model) {
		this.serialNum = serialNum;
		this.model = model;
	}
	
	public void carInfo() {
		System.out.println("차량 일련번호: " + serialNum);
		System.out.println("차량 모델명: " + model);
		System.out.println();
	}
	
}
