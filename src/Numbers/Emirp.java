package Numbers;

import java.util.Scanner;

public class Emirp {
	
	public static int reverse(int num) {
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int temp = reverse(num);
		
		int count=0;
		for(int i=1;i<=temp;i++) {
			if(temp%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num+" is an Emirp");
		}
		else {
			System.out.println(num+" is not an Emirp");
		}

	}

}
