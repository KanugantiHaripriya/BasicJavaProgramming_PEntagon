package Strings;

import java.util.Arrays;
public class ConvertArray {

	public static void main(String[] args) {
		String s="Madam";
		char[] c = s.toCharArray();
		char[] c1=new char[5];
		for(int i=0;i<c.length;i++) {
			c1[i]=s.charAt(i);
		}
		System.out.println(Arrays.toString(c1));
	}

}

//== --> It will compare with the address of the variables
//equals() --> compare with the content of the object
//toCharArray() --> helps to convert String to char array
