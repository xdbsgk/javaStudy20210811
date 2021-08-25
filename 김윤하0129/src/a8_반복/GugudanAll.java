package a8_반복;

public class GugudanAll {

	public static void main(String[] args) {
		// 구구단 전체 출력 입력값 x
		
		for(int i=0; i<8; i++) {
			int i2=i+2;
			System.out.println(i2 + " 단");
			for(int j=0; j<9; j++) {
				int j2=j+1;
				System.out.println(i2 + " X " + j2 + " = " + i2*j2);
			}
			System.out.println();
		}
				

	}

}
