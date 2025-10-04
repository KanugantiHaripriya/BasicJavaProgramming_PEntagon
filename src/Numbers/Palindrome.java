package Numbers;
import java.util.Scanner;

//Palindrome number
public class Palindrome {
	public static int reverse(int n) {
		int res=0;
		while(n!=0) {
			int rem=n%10;
			res = (res*10)+rem;
			n/=10;
		}
		return res;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(reverse(n)); // Reverse of a number
		
		// To check Palindrome number or not
		if(n == reverse(n)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
		//generate all the palindrome numbers up to given number
		int num = sc.nextInt();
		for(int i =1;i<=num;i++) {
			int temp = i ;
			if(temp == reverse(temp)) {
				System.out.print(temp+" ");
			}
			
		}
	}

}
