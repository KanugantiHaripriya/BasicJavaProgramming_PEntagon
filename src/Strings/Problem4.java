package Strings;

public class Problem4 {

	public static void main(String[] args) {
		String s=  "india is my country";
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			res=ch+res;
		}
		System.out.println(res);
	}

}


//input: "india is my country"
//output3: yrtnuoc ym si aidni