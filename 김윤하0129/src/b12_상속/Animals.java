package b12_���;

public class Animals {
	public static void main(String[] args) {
		Human h = new Human();
		Tigar t = new Tigar();
		Eagle e = new Eagle();
		
		// �޼ҵ��̱� ������ system.out.println�� ������� �ʰ� ȣ���� �����.
		t.move();
		h.move();		
		e.move();
		
		// �پ缺 (ĳ����). Animal�� �پ��� ���¸� ��� ��. 
		
		// ��ĳ����
		Animal[] a = new Animal[3];
		a[0] = new Human();		// Animal a[0] = new Human();
		a[1] = new Tigar();
		a[2] = new Eagle();
		
		for (int i=0; i<a.length; i++) {
			Animal ani = a[i];
			ani.move();		// a[i].move(); �� ���� �ڵ�.
		}
		
		// foreach (: ����, �����ݷ� X) -> ���� �Ǵ� array List���� �ַ� ���.
		for(Animal ani : a) {
			ani.move();		// �迭 �ȿ� �ִ� �͵��� �ϳ��� ����ϰ� �ȴ�.
		}
		
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("����� �� �߷� �����Դϴ�.");
	}
}

class Tigar extends Animal {
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �پ�ٴմϴ�.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("�������� ���ƴٴմϴ�.");
	}
}
