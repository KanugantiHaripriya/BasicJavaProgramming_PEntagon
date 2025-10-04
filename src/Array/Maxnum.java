package Array;

public class Maxnum {

	public static void main(String[] args) {
		int arr[]= {12,55,6,7,34,343,54,764};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
