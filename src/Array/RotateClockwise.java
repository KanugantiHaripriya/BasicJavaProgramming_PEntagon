package Array;

 import java.util.Arrays;
 
//Rotate an array to rotate clock wise direction
public class RotateClockwise {
	
	public static void clock_wise(int arr[]) {
		int temp= arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = {9,7,5,2,1,7};
		clock_wise(arr);
	}

}
