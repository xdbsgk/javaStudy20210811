package a4_����ȯ;

public class ConversionString {

	public static void main(String[] args) {
		
		// ���ڿ�(String)�� ����ȯ: ���ڿ��� ���� ����� ����.
		int num = 10;
		int num2 = 10;
		String sNum = "10";
		
		System.out.println(num + sNum);			// ���ڿ��� �̾��ִ� ������ ��.
		System.out.println(num + num2 + sNum);	
		System.out.println(sNum + num + num2);	// ������ �߿���.
		System.out.println(sNum + (num + num2));// ������ �켱������ �������ָ� 1020 ����� �����ϴ�.
		
		
		// ���ڿ� -> �ٸ� �ڷ���(boolean, int, double)
		// int(����): Integer.parseInt(���ڿ�);
		int i = Integer.parseInt("10");			// --> 10�̶�� ���ڿ��� ���� 10�� �ȴ�.
		double d = Double.parseDouble("10.1");		// --> 10.1�̶�� ���ڿ��� �Ǽ� 10.1�� �ȴ�.
		boolean b = Boolean.parseBoolean("true");	// --> ���ڿ� true�� boolean true�� �ȴ�.
		
		// �ٸ� �ڷ��� -> ���ڿ�
		// int(����): Integer.toString(����);
		Integer.toString(10);
		Double.toString(10.2);
		Boolean.toString(false);
		
		
	}

}
