package a4_����ȯ;				// �ڷ����� ����� ����. ĳ���� < ��Ʈ < ���� < ��Ʈ��

public class Conversion {

	public static void main(String[] args) {
		
	// ��ĳ���� 		���� ��� -> ���� �������
		
		// 1. ���� -> ����
		char c = 'A';
		int i_c = c;			// ��ĳ���� �� '������ �� ��ȯ; ����.
		System.out.println("���� -> ����: " + i_c);	
		// 2. ���� -> �Ǽ�
		int num = 100;
		double d_num = num;
		System.out.println("���� -> �Ǽ�: " + d_num);
		// 3. ���� + ����			=>	���ڿ� ������ ���� �� ����. c�� ��ĳ������ ���� ������ ��ȯ
		System.out.println("���� + ����: " + (c + num));
		
		
	// �ٿ�ĳ���� 		���� ��� -> ���� �������(��� �ʼ� !!)
		
		// 1. ���� -> ����
		int i = 67;		
		char c_i = (char)i;		// �ٿ�ĳ���� �� '����� �� ��ȯ' �ʿ�.
		System.out.println("���� -> ����: " + c_i);
		// 2. �Ǽ� -> ����
		double d_num2 = 3.14;
		int num2 = (int)d_num2;
		System.out.println("�Ǽ� -> ����: " + num2);

	}

}
