package b10_Ŭ����;

public class Regular {
	private boolean yearCheck;

	public boolean isYearCheck() {					// booleen ���̱� ������ get ��� is�� ���δ�.
		return yearCheck;
	}

	public void setYearCheck(int year, String schoolName) {
		this.yearCheck = year > 2 && schoolName.equals("�ڸ���it");	// ���� ���ǽ��� ����ֱ� ������ �ٸ� Ŭ�������� ���ǽ� ���� �Ұ���. ������ ���� �� ����.
	}																// ����ȭ�� �����͸� ���� ������ ��������. - ĸ��ȭ

	
	

}
