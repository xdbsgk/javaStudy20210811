package b13_������;

import b12_���.Animal;

class Human extends Animal {
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	@Override
	public void move() {
		System.out.println("����� �� �߷� �����Դϴ�.");
	}
}

class Tigar extends Animal {
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �پ�ٴմϴ�.");
	}
}

class Eagle extends Animal {
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
	@Override
	public void move() {
		System.out.println("�������� ���ƴٴմϴ�.");
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
			ani.move();		// ��ĳ���� �� �θ� ���� �޼ҵ�ۿ� ��������. (���길 ��밡��. �����, ����, �ö��� ���⼭ ��� X.)
		}					// �������̵�� �θ� ���� ���� �������ϱ� ������ Animal Ŭ������ �޼ҵ尡 �ƴ� Animals Ŭ������ �޼ҵ尡 ����ȴ�.
	}
	
	public void casting() {
		// list[0] �� ����ִ� �ְ� Human���� �����ߴ��� ����� �ڵ���.
		// System.out.println(list[0] instanceof Human);
		for(Animal ani : list) {
			if (ani == null) {
				continue;
			}
			if(ani instanceof Human) {	// �ش� Ŭ������ ������������� ����.
				Human h = (Human)ani;	// �ٿ�ĳ�����̱� ������ ����� ����ȯ �����.
				h.readBook();
			} else if (ani instanceof Tigar) {
				Tigar h = (Tigar)ani;
				h.hunting();
			} else if (ani instanceof Eagle) {
				Eagle h = (Eagle)ani;
				h.flying();
			} else {
				System.out.println("�������� �ʴ� �ڷ����Դϴ�.");
			}
		}
	}
	
	public static void main(String[] args) {
		AnimalTest aniTest = new AnimalTest();
		
		// ��ĳ���� <- Human, Tigar, Eagle
		aniTest.addAnimal();
		aniTest.animalMove();
		
		System.out.println("-------------------------------");
		
		// �ٿ�ĳ���� <- ��ĳ���� �� �͵��� �ٽ� ������ ���·� �ǵ�����.
		aniTest.casting();
		

	}

}
