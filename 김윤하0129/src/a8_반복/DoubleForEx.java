package a8_반복;

public class DoubleForEx {

	public static void main(String[] args) {
		// 중첩 반복
		
		for(int i=0; i<10; i++) {
			int i2=i+1;	
			System.out.println("코끼리 코 " + i2 + "번 째");
			for(int j=0; j<10; j++) {
				int j2=j+1;
				System.out.println("박수 " + j2 + "번");
			}
			
		}

	}

}
