package Strings;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter te user name");
		String name = sc.nextLine();
		System.out.println(name);
		
		String s="pookie";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}

}


//next()-->Scanner class --> it will accept only one word as input
//nextLine()--> it will accept multiple words
//length()-->To get total length of the String 
//charAt(index)--> It will give character of the String of respected indexes value

//StringOutOfBounds:When trying to access index that is not present inString then will end up  with this exception
