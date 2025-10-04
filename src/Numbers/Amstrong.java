package Numbers;
import java.util.Scanner;


public class Amstrong {
	// An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
	public static int find_digit(int num) {
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		return count;
	}
	
	public static int ams(int num, int count) {
		int result = 0;
		while(num!=0) {
			result+= (int)Math.pow((num%10),count);
			num/=10;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res=ams(n,find_digit(n));
		System.out.println(res);
		if(res == n) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not an Amstrong number");
		}		
	}
}
