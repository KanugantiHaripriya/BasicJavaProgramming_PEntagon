package Array;

import java.util.Arrays;

public class RemoveElement {
	public static void remove(int arr[],int index) {
		int res[]=new int[arr.length-1];
		for(int i=0;i<index-1;i++) {
			res[i]=arr[i];
		}
		for(int i=index;i<arr.length;i++) {
			res[i-1]=arr[i];
		}
		System.out.println(Arrays.toString(res));
	}	

	public static void main(String[] args) {
		int arr[]= {2,4,5,7,9};
		int index=3;
		remove(arr,index);
	}
}
