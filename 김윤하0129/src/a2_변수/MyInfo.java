package a2_����;

public class MyInfo {

	public static void main(String[] args) {
		
		/** <�ڷ���>
		* ����(boolean) = true, false
		* boolean ������ = true;
		* boolean ������ = false;
		* 
		* ������(char) ĳ���� = a ~ z, �ѱ�(1���ڸ�)
		* char ������ = 'a';
		* char ������ = '��';
		* char ������ = '1';
		* char ������ = '$';
		* 
		* ���ڿ��ڷ���(String) ��Ʈ�� = "���ڿ��� ������ �� �ֽ��ϴ�."
		* String ������ = "�ȳ��ϼ���. �������Դϴ�."
		* 
		* ������(int) Integer = 0 ~ 10 �������� ǥ��
		* int ������ = 100;
		* 
		* �Ǽ���(double) = 0.0 ~ 0,9999 �Ǽ� ����(�Ҽ���) ǥ��
		* double ������ = 100.08776;
		* 
		*/

		//Pro1] ���������� ������� �� �⵵�� �����ϴ�  year ����
		int year = 2000;
		//Pro2] ���������� ���� �����ϴ� month ����
		int month = 01;
		//Pro3] ���������� ���� �����ϴ� day ����
		int day = 29;
		
		
		//Pro4] �̸��� ���������� ǥ�� �������� f, s, th
		char f = '��';
		char s = '��';
		char th = '��';
		String name = "������";
		
		
		//Pro5] �÷� left, right ���� �Ǽ������� ���� ����
		double left = -6.5;
		double right = -7.0;
		
		
		//Pro6] ���� ���� maleFemale ������ ���� true, ���� false
		boolean maleFemale = false;
		
		
		/*Pro7] ���
		* �������: 2000�� 01�� 29�� 
		* �̸� : ������
		* �÷�(R): -7.0
		* �÷�(L): -6.5
		* ����: false
		*/
		
		
		System.out.print("�������: ");
		System.out.print(year);
		System.out.print("�� ");
		System.out.print(month);
		System.out.print("�� ");
		System.out.print(day);
		System.out.println("��");
		
		System.out.print("�̸�: ");
		System.out.print(f);
		System.out.print(s);
		System.out.println(th);
		
		System.out.print("�̸�: ");
		System.out.println(name);
		
		System.out.print("�÷�(R): ");
		System.out.print(right);
		System.out.print("	�÷�(L): ");
		System.out.println(left);
		
		System.out.print("����: ");
		System.out.println(maleFemale);
		
	}

}
