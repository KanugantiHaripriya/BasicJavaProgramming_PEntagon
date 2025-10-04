package Strings;


//Count of number of vowels and consonants in a string 
public class VowConso {

	public static void main(String[] args) {
		String s="hello guys";
		int vowels_count=0;
		int space=0;
		int conso_count=0;
		int specialCh_count=0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>=97 && ch<=122 || ch==32) {
				if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					vowels_count++;
				}
				else if(ch == 32) { // 32 is ascii value for space 
					space++;
				}
				else {
					conso_count++;
				}
			}
			else{
				specialCh_count++;
			}
			
		}
		System.out.println("Vowels: "+vowels_count);
		System.out.println("Spaces: "+space);
		System.out.println("Consonents: "+conso_count);
	}

}
