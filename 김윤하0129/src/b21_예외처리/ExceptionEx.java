package b21_예외처리;

import java.time.DateTimeException;
import java.util.zip.DataFormatException;

/**
 * 
 * Exception (예외)
 * 1. 문법 (소스코드) 오류
 * 2. 컴파일 오류
 * 3. 버그
 * 
 * throw (호출한 위치로 예외 미루기)
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
		
		// 예외처리구문
		// try에서 던진 것을 catch가 받아서 예외에 대한 내용을 출력함.
		try {
			ExceptionEx.arrTest();
		} catch (DateTimeException e){
			System.out.println("배열의 크기를 초과하여 대입하였습니다.");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열의 크기를 초과하여 대입하였습니다.");
		} catch (SecurityException e) {
			System.out.println("배열의 크기를 초과하여 대입하였습니다.");
		// Exception 예외 처리는 가장 밑에 있어야 함. 
		} catch (Exception e) {
			e.printStackTrace();
		// finally는 try, catch와 상관없이 무조건 실행됨.
		} finally {
			System.out.println();
		}
		
		
		System.out.println("프로그램 종료");
	}
}
