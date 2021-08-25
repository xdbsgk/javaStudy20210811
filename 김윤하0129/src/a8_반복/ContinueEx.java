package a8_반복;

public class ContinueEx {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				System.out.println(i+ "은(는) 짝수입니다.");
				//continue;		// for문 안에서 continue를 만날시 반복문 안 뒤 문장 싹 무시하고  다시 for문 앞으로 돌아가 i++이 되어 반복 재진행.
				break;			// break를 만나는 순간 반복문을 탈출한다.
			}
			System.out.println(i+ "은(는) 홀수입니다.");
		}

	}

}
