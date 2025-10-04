package Strings;

public class Problem6 {
	
	public static void ind(String s) {
		
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=97 && i==0 || s.charAt(s.length()-1)>=97 && i==s.length()-1) {
				int as=s.charAt(i)-32;
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
//output: IndiA IS MY CountrY 