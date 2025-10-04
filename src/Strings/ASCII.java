package Strings;

//ASCII: American Standard Code for Information Interchange
public class ASCII {

	public static void main(String[] args) {
		String s="HArEJaaferDDsadcd";
		String rs="";
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch>=65 && ch<=90) {// ch>=97 && ch<=122-->To convert to Upper cAse
				//lowercase conversion
				int ne=ch+32; //ne=ch-32
				char neC=(char)ne;
				rs=rs+neC;	
			}
			else {
				rs+=ch;
			}
		}
		System.out.println(rs);
		
		String s1="MADam";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}
}


//ASCII values are
//a-->97
//b-->98
//c-->99
//---------
//A-->65
//B-->66