package b17_���׸�;

/**
 * 
 * Generic(���׸�)
 * Ŭ���� ������ �ڷ����� ���ϴ� ���·� ������ �� �ִ�. 
 * �ٿ�ĳ����, ��ĳ���� �ʿ� X.
 * ������ �������� �Ѳ����� ��밡�� ! 
 *
 */

public class GenericEx<T> {
	T generic;
	public T getGeneric(T t) {
		T t2 = t;
		return t2;
	}
	/*
	public Object getGeneric2(Object obj) {
		Object obj2 = (Car)obj;
		return obj2;
	}
	*/
	public static void main(String[] args) {
		
		GenericEx <String> gex = new GenericEx<String>();
		String str = gex.getGeneric("������");
		
		GenericEx <Integer> gex2 = new GenericEx<Integer>();
		Integer num1 = gex2.getGeneric(100);
		
		System.out.println(str);
	}
}
