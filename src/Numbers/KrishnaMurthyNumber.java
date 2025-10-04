package Numbers;

import java.util.Scanner;

//sum of the factorial of its digits is equal to the number itself.
public class KrishnaMurthyNumber {
	
	public static int fact(int num) {
		if(num==0 || num==1){
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}
	
	public static int kmn(int num) {
		int kmn=0;
		while(num!=0) {
			int rem=num%10;
			kmn+=fact(rem);
			num/=10;
		}
		return kmn;		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(kmn(num)==num) {
			System.out.println("KRishna Murthy Number");
		}
		else {
			System.out.println("Not a Krishna Murthy Number");
		}

	}
	
	
}
	
