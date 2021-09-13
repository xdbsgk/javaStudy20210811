package b16_기본클래스;

public class Car {
	private int carNumber;
	private String model;
	public Car(int carNumber, String model) {
		super();
		this.carNumber = carNumber;
		this.model = model;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public String getModel() {
		return model;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carNumber;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carNumber != other.carNumber)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	/*
	@Override
	public int hashCode() {
		return carNumber;		// 해시코드를 통해서 논리적 주소값을 임의로 지정하는것. 
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		// Car c = (Car)obj;						// get메소드 쓰려면 다운캐스팅이 필요함. obj안의 메소드가 아니기 떄문에 따로 다운캐스팅 필요.
		// if (carNumber == c.getCarNumber())		// 하지만 자동차 뿐이 아닌 다른 것들을 비교할 수 있으므로 아래의 코드가 더 잘 쓰임.
		if (this.hashCode() == obj.hashCode()) {
			flag = true;
		}
		return flag;
	}
	*/
}
