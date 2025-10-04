package Recursion;

//Reverse of a number through recursion
public class ReverseRecur {
	
	public static int reverse(int num,int res) {
		if(num==0) {
			return res;
		}
		return reverse(num/10,(num%10)+(res*10));
	}

	public static void main(String[] args) {
		int num=123;
		int res=0;
		System.out.println(reverse(num,res));
	}
}
