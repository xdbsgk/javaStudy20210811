package b12_상속;

public class Animals {
	public static void main(String[] args) {
		Human h = new Human();
		Tigar t = new Tigar();
		Eagle e = new Eagle();
		
		// 메소드이기 때문에 system.out.println을 사용하지 않고 호출을 사용함.
		t.move();
		h.move();		
		e.move();
		
		// 다양성 (캐스팅). Animal이 다양한 형태를 띄게 됨. 
		
		// 업캐스팅
		Animal[] a = new Animal[3];
		a[0] = new Human();		// Animal a[0] = new Human();
		a[1] = new Tigar();
		a[2] = new Eagle();
		
		for (int i=0; i<a.length; i++) {
			Animal ani = a[i];
			ani.move();		// a[i].move(); 와 같은 코드.
		}
		
		// foreach (: 기준, 세미콜론 X) -> 베열 또는 array List에서 주로 사용.
		for(Animal ani : a) {
			ani.move();		// 배열 안에 있는 것들을 하나씩 출력하게 된다.
		}
		
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 움직입니다.");
	}
}

class Tigar extends Animal {
	@Override
	public void move() {
		System.out.println("호랭이가 네 발로 뛰어다닙니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 날아다닙니다.");
	}
}
