package b21_����ó��;

import java.time.DateTimeException;
import java.util.zip.DataFormatException;

/**
 * 
 * Exception (����)
 * 1. ���� (�ҽ��ڵ�) ����
 * 2. ������ ����
 * 3. ����
 * 
 * throw (ȣ���� ��ġ�� ���� �̷��)
 */

public class ExceptionEx {
	
	public static void arrTest() throws Exception {
		int[] arr = new int[5];
		
		for (int i=0; i<=5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		// ����ó������
		// try���� ���� ���� catch�� �޾Ƽ� ���ܿ� ���� ������ �����.
		try {
			ExceptionEx.arrTest();
		} catch (DateTimeException e){
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		} catch (SecurityException e) {
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		// Exception ���� ó���� ���� �ؿ� �־�� ��. 
		} catch (Exception e) {
			e.printStackTrace();
		// finally�� try, catch�� ������� ������ �����.
		} finally {
			System.out.println();
		}
		
		
		System.out.println("���α׷� ����");
	}
}
