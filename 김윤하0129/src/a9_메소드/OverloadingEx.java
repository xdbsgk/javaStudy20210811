package a9_�޼ҵ�;

public class OverloadingEx {							// ���� ����ε� ���� �ٸ� ������ ��. ��Ḧ �޴� �Ϳ� ���� �ٸ� ������ �Ѵ�. 
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int add(String num1, int num2) {				// �̸��� ���Ƶ� �޴� �ڷ����� �ٸ��� ���� �޼ҵ���� ����� �� �ִ�.
		int result = Integer.parseInt(num1) + num2; 	// ��� ����ȯ�� ����. String => int
		return result;
	}
	
	public int add(int num1) {							// �Ű������� �ٸ� ������ ���� �ٸ� ���� ���� �� ����. (�������� ����� ��)
		int result = num1 + num1;
		return result;
	}
	
	public int mul(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		return result;
	}
	
	public double mul(int num1, double num2) {			// �� ��ȯ ����ϴ� ����. double => int
//		int num2_2 = (int)num2;
		double result = num1 * num2;
		return result;
	}
	
	public double mul(int num1, int num2) {	
		double result = num1 * num2;
		return result;
	}
	
	public void mainMethod() {
		int numberSum = add(10, 20);
		int numMul = mul(2, 10, 5);
		double numMul2 = mul(2, 3);
		System.out.println("�� ���� ����? " + numberSum);
		System.out.println("����: " + numMul);
		System.out.println("����2: " + numMul2);
	}

	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public static void main(String[] args) {
		OverloadingEx main = new OverloadingEx();
		main.mainMethod();
	}

}
