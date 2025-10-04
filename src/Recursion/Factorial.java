package Recursion;

public class Factorial {
	
	public static int fact(int num,int res) {
		if (num==0) {
			return res;
		}
		return fact(num-1,num*res);
	}

	public static void main(String[] args) {
		int num=5;
		int res=1;
		int ans=fact(num,res);
		System.out.println(ans);
	}
}
