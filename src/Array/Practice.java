package Array;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the elements:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("After updated");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}

	}

}
