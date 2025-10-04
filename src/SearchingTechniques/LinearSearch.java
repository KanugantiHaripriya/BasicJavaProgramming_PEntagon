package SearchingTechniques;

import java.util.Arrays;

public class LinearSearch {
	
	public static int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {3,5,6,9,2,1};
		int key=6; 
		System.out.println(linearSearch(arr,key));
		
	}

}
