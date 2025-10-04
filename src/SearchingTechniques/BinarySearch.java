package SearchingTechniques;

import java.util.Arrays;

//Note:To perform binary search the elements should be sorted
public class BinarySearch {
	public static int binary_search(int arr[],int key) {
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			
			if(key == arr[mid]) {
				return mid;			}
			else if(key>arr[mid]) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {3,4,5,7,8,9,39};		
		int key=8;
		System.out.println(binary_search(arr,key));
	}
}
