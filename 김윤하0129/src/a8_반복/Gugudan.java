package a8_�ݺ�;

public class Gugudan {

	public static void main(String[] args) {
		// �������� �ݺ������� ����غ���

		// for��(1���� �����ϴ� ����)
		for(int i=1; i<=9; i++) {	// ���⼭ i�� for�� ���� ��������
			System.out.println("2 X " + i + " = " + 2*i);
		}
		
		// for��(0���� �����ϴ� ����)
		for(int i=0; i<9; i++) {	// �������� ���� �ߺ��ǵ� ���X
			int i2 = i+1;	
			System.out.println("4 X " + i2 + " = " + 4*i2);
		}
		
		// while��
		System.out.println("3��");
		int l = 1;					// ���⼭ l�� ��������, �� �������� ��� ������ ���� ������ �����ϸ� ��� ����. ���������� �������� ���� ����Ǹ� ��� �Ұ�!
		while(l<=9) {
			System.out.println("3 X " + l + " = " + 3*l);
			l++;
		}
		
	}

}
