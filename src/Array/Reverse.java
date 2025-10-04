package Array;

import java.util.Arrays;

public class Reverse {
	public static void reverse(int arr[]) {
		int res[] = new int[arr.length];
		int p=arr.length;
		for(int i=0;i<arr.length;i++) {
			res[i]=arr[p-1];
			p--;
		}
		System.out.println(Arrays.toString(res));
	}
	
	public static void main(String[] args) {
		int arr[]= {7,5,4,3,1};
		reverse(arr);
	}

}
