package a5_������;

public class Operation2 {

	public static void main(String[] args) {
		
		// <�� ������>
		// AND(&&) = ��
		// OR(||) = ��
		// NOT(!) = ����
		
		// true(1) && false(0) => false(0)
		// && ���꿡�� false�� ����� ��������? �� �� �ϳ��� 0�̸� �ȴ�.
		// && ���꿡�� true�� ����� ��������? �� �� 1�̾�� �Ѵ�.
		
		// true(1) || false(0) => true(1)
		// || ���꿡�� false�� ����� ��������? �� �� 0�̾�� �Ѵ�.
		// || ���꿡�� true�� ����� ��������? �� �� �ϳ��� 1�̸� �ȴ�.(0�� �ƴϸ� ���̱� ���� . 10(2)�� 1�� ����Ѵ�.)
		
		// !�� �տ� ������ true -> false ������ �̷������.
		
		System.out.println(!(true || false));
		
		
		
	}

}
