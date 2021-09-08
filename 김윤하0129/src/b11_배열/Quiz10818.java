package b11_배열;

import java.util.Scanner;

public class Quiz10818 {
// 최소, 최대 (배열)
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int nCount = in.nextInt();
		int[] nArr = new int[nCount];

		int maxNum = -1000001;
		int minNum = 1000001;
		
		for(int i=0; i<nCount; i++) {
			nArr[i] = in.nextInt();
			
			if (nArr[i]<minNum) minNum = nArr[i];
			if (nArr[i]>maxNum) maxNum = nArr[i];
		}
		
		System.out.println(minNum + " " + maxNum);
	}

}
