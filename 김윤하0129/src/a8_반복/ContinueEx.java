package a8_�ݺ�;

public class ContinueEx {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				System.out.println(i+ "��(��) ¦���Դϴ�.");
				//continue;		// for�� �ȿ��� continue�� ������ �ݺ��� �� �� ���� �� �����ϰ�  �ٽ� for�� ������ ���ư� i++�� �Ǿ� �ݺ� ������.
				break;			// break�� ������ ���� �ݺ����� Ż���Ѵ�.
			}
			System.out.println(i+ "��(��) Ȧ���Դϴ�.");
		}

	}

}
