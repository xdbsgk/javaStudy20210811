package a3_���;

public class Constant {
	
	/**
	 * ��� 
	 * 1. final ���� �ڷ��� �տ� ����Ͽ��� �Ѵ�.
	 * 2. �̸��� ��� �빮�ڿ��� �Ѵ�.
	 */
	
	public static void main(String[] args) {
		
		int maxNum = 100;			// ����
		final int MAX_NUM = 100;	// ���, final�� ��������� ��� ..
		
		maxNum = 200;				// ����
// 		MAX_NUM = 200;				// ���� �׻� ������. �ٸ������� ��ü X.
		
		System.out.println("�Ϲ� ����: " + maxNum);
		System.out.println("���: " + MAX_NUM);

	}

}

