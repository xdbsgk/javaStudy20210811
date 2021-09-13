package b16_�⺻Ŭ����;

public class ObjectEx{							// extends Object(���)�� �����Ǿ�����. ���� �Ʒ� oex���� toString ��밡����.
												// ��� Ŭ������ Object class�� ��ӹް� ����. ���� Ŭ������ ���� Ŭ����, �� �ֻ���Ŭ������ �׻� Object��ӹޱ� ������
												// ���߻���� �ȵǴ��� �׻� ��ӹް�����.
	private String className = "ObjectEx";
	
	@Override
		public String toString() {
			return className;
		}
	
	@Override
		public boolean equals(Object obj) {
			return super.equals(obj);
		}
	
	@Override
		public int hashCode() {					// ������ �ּҰ� �ƴ� ���� �ּҸ� �ٲ۴�.
			return 100;							
		}
	
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.toString());		// .toString: �� Ŭ������ ��ġ�ϰ��ִ� �ּҸ� �˷��ش�. (������ �����ϰ� �ּҰ�����. => ����Ʈ�� �޼ҵ�� ��������)
		
		ObjectEx oex = new ObjectEx();
		ObjectEx oex2 = new ObjectEx();
		System.out.println(oex.toString());
		
		String str1 = "yunha";
		String str2 = "yunha";
		String str3 = new String("yunha");
		
		/* toString() �޼ҵ� 
		 * 
		 * 
		String[] toStringArray = new String[10];
		
		for(int i=0; i<toStringArray.length; i++) {
			Student s1 = new Student("������", "�λ���б�", 1, 1, 1, 20190002, "�λ� ���ϱ�", "010-3230-0129");
			toStringArray[i] = s1.toString();
		}
		
		for(String s : toStringArray) {
			System.out.println(s);
		}
		*/
		
		System.out.println(oex.equals(oex2));	// ��ü ��ü�� �� -> ������ �ּҸ� ���ϱ⶧���� �ؽ��ڵ� �������̵� 100���� �ٲ����� false. 
		
		System.out.println(str1 + str2 + str3);
		
		System.out.println(str1.equals(str2));	//t
		
		System.out.println(str1 == str2);		//t
		System.out.println(str1 == str3);		//f
		
		// equals�� == ���� ���̴�?
		// ������ �ּ�(Hardware)�� ���� �ּ�(Software, ��) ��
		
		Student s1 = new Student("������", "�λ���б�", 1, 1, 1, 20190002, "�λ� ���ϱ�", "010-3230-0129");
		Student s2 = new Student("������", "�λ���б�", 1, 1, 1, 20190002, "�λ� ���ϱ�", "010-3230-0129");
		
		System.out.println(s1.equals(s2));	// equals�� �ֻ����̹Ƿ� ��ĳ���õ�..?
		System.out.println(s1 == s2);		// f
	}
	
}
