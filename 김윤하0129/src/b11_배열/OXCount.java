package b11_�迭;

public class OXCount {

	public static void main(String[] args) {
		String[][][] quiz = new String[3][2][3];
		
		// quiz[i][j][k] = if(i+j+k%2==0) "O" else "X" ���տ����� ���
		
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
				System.out.print(quiz[i].length-1 == j ? "\n" : ", ");		// |n�� �ٹٲ��� �ǹ���. 
			}
		}
		
		// O�� ����: 00��
		// X�� ����: 00��
		
		System.out.println("O�� ����: " + oCount);
		System.out.println("X�� ����: " + xCount);
	}

}
