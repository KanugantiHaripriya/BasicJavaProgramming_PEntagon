package Array;

import java.util.Arrays;

//write a program to rotate an array in anti clock wise for 456 times

public class RotateAnticlock {
	
	public static void rotate_anti(int arr[],int count) {
		for(int j=0;j<count;j++) {
			int temp=arr[0];
			for(int i=1;i<arr.length;i++) {
				arr[i-1]=arr[i];			
			}
			arr[arr.length-1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[]= {3,4,5,6,7,1};
		int count=456;
		rotate_anti(arr,count);
	}

}
