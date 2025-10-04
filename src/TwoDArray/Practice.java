package TwoDArray;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		int row=3;
		int column=3;
		int[][] arr= new int[row][column];
		int k=10;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=k;
				k++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr[2][1]);
		System.out.println(arr[1][0]);
	}

}
