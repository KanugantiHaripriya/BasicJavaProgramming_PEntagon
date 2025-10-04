package Array;

import java.util.Arrays;

//Write a program to add element at particular index
public class AddElement {
	
	public static void alter_value(int[] arr,int index,int element) {
		int res[]=new int[arr.length+1];
		for(int i=0;i<index;i++) {
			res[i]=arr[i];
		}
		res[index]=element;
		for(int i=index;i<arr.length;i++) {
			res[i+1]=arr[i];
		}
		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		alter_value(arr,3,35);
		
	}
}
