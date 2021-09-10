package b13_다형성;

import b12_상속.Animal;

class Human extends Animal {
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	@Override
	public void move() {
		System.out.println("사람이 두 발로 움직입니다.");
	}
}

class Tigar extends Animal {
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	@Override
	public void move() {
		System.out.println("호랭이가 네 발로 뛰어다닙니다.");
	}
}

class Eagle extends Animal {
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
	@Override
	public void move() {
		System.out.println("독수리가 날아다닙니다.");
	}
}


public class AnimalTest {
	
	Animal[] list = new Animal[3];
	
	public void addAnimal() {
		list[0] = new Human();
		list[1] = new Tigar();
		list[2] = new Eagle();
	}
	
	public void animalMove() {
		for (Animal ani : list) {
			ani.move();		// 업캐스팅 시 부모가 가진 메소드밖에 쓰지못함. (무브만 사용가능. 리드북, 헌팅, 플라잉 여기서 사용 X.)
		}					// 오버라이드는 부모가 가진 것을 재정의하기 때문에 Animal 클래스의 메소드가 아닌 Animals 클래스의 메소드가 실행된다.
	}
	
	public void casting() {
		// list[0] 에 들어있는 애가 Human으로 생성했는지 물어보는 코드임.
		// System.out.println(list[0] instanceof Human);
		for(Animal ani : list) {
			if (ani == null) {
				continue;
			}
			if(ani instanceof Human) {	// 해당 클래스로 만들어졌는지를 비교함.
				Human h = (Human)ani;	// 다운캐스팅이기 때문에 명시적 형변환 사용함.
				h.readBook();
			} else if (ani instanceof Tigar) {
				Tigar h = (Tigar)ani;
				h.hunting();
			} else if (ani instanceof Eagle) {
				Eagle h = (Eagle)ani;
				h.flying();
			} else {
				System.out.println("지원하지 않는 자료형입니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		AnimalTest aniTest = new AnimalTest();
		
		// 업캐스팅 <- Human, Tigar, Eagle
		aniTest.addAnimal();
		aniTest.animalMove();
		
		System.out.println("-------------------------------");
		
		// 다운캐스팅 <- 업캐스팅 된 것들을 다시 원래의 형태로 되돌린다.
		aniTest.casting();
		

	}

}
