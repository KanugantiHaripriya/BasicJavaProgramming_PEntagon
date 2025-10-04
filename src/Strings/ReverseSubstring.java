package Strings;

public class ReverseSubstring {
	
	public static String pal(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		return rev;
	}

	public static void main(String[] args) {
		String s="malayalam";
		
		for(int i=0;i<s.length();i++) {
			String res="";
			for(int j=i;j<s.length();j++) {
				res+=s.charAt(j);
				String rev=pal(res);
				if(res.equals(rev)) {
					System.out.println(res);
				}
				
			}	
		}
		
	}

}
