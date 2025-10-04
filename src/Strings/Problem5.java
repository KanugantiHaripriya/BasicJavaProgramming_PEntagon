package Strings;

public class Problem5 {
	
	public static void ind(String s) {
		
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=97 && i==0) {
				int as=s.charAt(0)-32;
				char nch=(char)as;
				res=res+nch;
			}
			else {
				res=res+s.charAt(i);
			}
		}
		System.out.print(res+" ");
	}

	public static void main(String[] args) {
		String str="india is my country";
		String[] arr=str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			ind(arr[i]);
		}

	}

}
//input: india is my country
// output: India Is My Country
