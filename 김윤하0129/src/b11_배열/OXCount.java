package b11_배열;

public class OXCount {

	public static void main(String[] args) {
		String[][][] quiz = new String[3][2][3];
		
		// quiz[i][j][k] = if(i+j+k%2==0) "O" else "X" 삼합연산자 사용
		
		for (int i=0; i<quiz.length; i++) {
			for (int j=0; j<quiz[i].length; j++) {
				for (int k=0; k<quiz[i][j].length; k++) {
					quiz[i][j][k] = (i+j+k)%2==0 ? "O" : "X" ;
				}
			}
		}
		
		// OXO, OOO
		// OOX, OOO
		// OXO, OOX
		
		int oCount = 0;
		int xCount = 0;
		
		for (int i=0; i<quiz.length; i++) {
			for (int j=0; j<quiz[i].length; j++) {
				for (int k=0; k<quiz[i][j].length; k++) {
					System.out.print(quiz[i][j][k]);
					if (quiz[i][j][k].equals("O")) oCount+=1;
					else xCount+=1;
				}
				System.out.print(quiz[i].length-1 == j ? "\n" : ", ");		// |n은 줄바꿈을 의미함. 
			}
		}
		
		// O의 개수: 00개
		// X의 개수: 00개
		
		System.out.println("O의 개수: " + oCount);
		System.out.println("X의 개수: " + xCount);
	}

}
