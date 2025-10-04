package Strings;

import java.util.Arrays;

public class Anagram {
	
	public static boolean anagram(String a,String  b) {
		
		String s1=a.toLowerCase();
		String s2=b.toLowerCase(); 
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		
		if(arr1.length ==arr2.length ) {
			return true;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void  main(String[] args) {
		String s1="HHDFsilent";
		String s2="listen";
		if(anagram(s1,s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}

	}

}

//Steps 
//1. LowerCase
//2.CharacterArray
//3.Sorting
//4.CheckAnagram
