package Strings;

public class Problem2 {
	
	public static void reverse(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			res=s.charAt(i)+res;
		}
		System.out.print(res+" ");
	}

	public static void main(String[] args) {
		String str="india is my country";
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			reverse(arr[i]);
		}
	}

}



//input: "india is my country"
//output1: aidni si  ym yrtnuoc
//output2: country my is india
//output3: yrtnuoc ym si aidni
//output4: India Is My Country
//output5: IndiA IS MY CountrY