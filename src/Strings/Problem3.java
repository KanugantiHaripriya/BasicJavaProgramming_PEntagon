package Strings;

public class Problem3 {

	public static void main(String[] args) {
		String str="india is my country";
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}

//input: "india is my country"
//output2: country my is india