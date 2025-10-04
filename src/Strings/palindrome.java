package Strings;

public class palindrome {

	public static void main(String[] args) {
		String s="pookie";
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		System.out.println(res);
		
		if(s==res) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	

}
