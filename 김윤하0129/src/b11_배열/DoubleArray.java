package b11_배열;

public class DoubleArray {
	// 이차원 배열
	// 이차원 배열의 형태 -> 자료형[][]; (배열이 두개씩 있당 (0,0) (0,1) (1,0) (1,1))
	
	public static void main(String[] args) {
		
		int [][] d_arr = new int [3][5]; // 뒤는 인덱스 아니라 개수임. 총 15개의 공간. 행이 3개 열이 5
		d_arr[0][0] = 10;
		d_arr[1][4] = 100;

		System.out.println(d_arr.length);
		System.out.println(d_arr[0].length);
		
		System.out.println(d_arr[0][0]);
		System.out.println(d_arr[1][4]);
		
		for(int i=0; i<d_arr.length; i++) {			// 운동장 3바퀴
			for(int j=0; j<d_arr[i].length; j++) {	// 코끼리코 돌기 ...
				if (d_arr[i][j] != 100) 
					continue;
				System.out.println(d_arr[i][j] == 100 ? "[" + i + "]" + "[" + j + "]" : ""); 
				break;								// 효율적인 작성 코드. 굳이 다음 번 반복 실행하지 않아도 됨.
			}
		}
		
	}

}
