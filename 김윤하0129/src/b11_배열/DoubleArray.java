package b11_�迭;

public class DoubleArray {
	// ������ �迭
	// ������ �迭�� ���� -> �ڷ���[][]; (�迭�� �ΰ��� �ִ� (0,0) (0,1) (1,0) (1,1))
	
	public static void main(String[] args) {
		
		int [][] d_arr = new int [3][5]; // �ڴ� �ε��� �ƴ϶� ������. �� 15���� ����. ���� 3�� ���� 5
		d_arr[0][0] = 10;
		d_arr[1][4] = 100;

		System.out.println(d_arr.length);
		System.out.println(d_arr[0].length);
		
		System.out.println(d_arr[0][0]);
		System.out.println(d_arr[1][4]);
		
		for(int i=0; i<d_arr.length; i++) {			// ��� 3����
			for(int j=0; j<d_arr[i].length; j++) {	// �ڳ����� ���� ...
				if (d_arr[i][j] != 100) 
					continue;
				System.out.println(d_arr[i][j] == 100 ? "[" + i + "]" + "[" + j + "]" : ""); 
				break;								// ȿ������ �ۼ� �ڵ�. ���� ���� �� �ݺ� �������� �ʾƵ� ��.
			}
		}
		
	}

}
