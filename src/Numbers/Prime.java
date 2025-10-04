package Numbers;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
	// Write a program to check whether the given number is prime or not
	//The number which is divisible by 1 and itself then the remainder is 0 , we call it as a prime number
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}

}
