package Numbers;
import java.util.Scanner;

//sum of the digits and product of the each digits should be equals then it is a spy number
public class SpyNumber {
	
	public  static void spy(int num) {
		int sum=0;
		int mul=1;
		while(num!=0) {
			int rem=num%10;
			sum+=rem;
			mul*=rem;
			num/=10;
		}
		if(sum==mul) {
			System.out.println("It is a Spy number");
		}
		else {
			System.out.println("It is not a spy number");
		}	
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		spy(num);	
	}

}
