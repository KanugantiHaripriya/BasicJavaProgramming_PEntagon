package Strings;

//Write a program to find a continuous substring in a given string
public class Substring {

	public static void main(String[] args) {
		String s="Hello";
		for(int i=0;i<s.length();i++) {
			String res="";
			for(int j=i;j<s.length();j++) {
				res+=s.charAt(j);
				System.out.println(res);
			}	
		}
		

	}

}
