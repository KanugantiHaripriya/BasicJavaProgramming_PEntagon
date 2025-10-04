package Strings;


//input:ABCDEF output:GFEDCB
public class Problem1 {

	public static void main(String[] args) {
		String s="ABCDEF";
		String res="";
//		String rev="";
//		for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			int ne=ch+1;
//			res+=(char)ne;
//		}
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+res.charAt(i);
//		}
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			ch++;
			res=ch+res;
		}
		System.out.println(res);
	}

}
