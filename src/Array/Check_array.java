package Array;

import java.util.Arrays;

public class Check_array {
	
	public static boolean check_array(int arr1[], int arr2[]) {
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr1[]= {4,5,6,8};
		int arr2[]= {4,5,6,8,9};
		System.out.println(check_array(arr1,arr2));
	}

}
