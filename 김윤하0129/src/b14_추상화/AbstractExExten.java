 package b14_�߻�ȭ;

abstract class AbstractEx3Exten extends AbstractEx {
	// ��� ����
	// �� Ŭ������ ����� ������ ������ ���� �� �� ���, �ӽ÷� ����Ѵ�.
	}

class AbstractEx2Exten extends AbstractEx {
	@Override
	public void printName() {
		System.out.println("�� �� ��");
		
	}
}

public class AbstractExExten extends AbstractEx{
	// ���� Ŭ���� �߻�Ŭ�����̱� ������ �������ؾ���.
	@Override	
	public void printName() {
		System.out.println("�� ����");
		
	}
}
