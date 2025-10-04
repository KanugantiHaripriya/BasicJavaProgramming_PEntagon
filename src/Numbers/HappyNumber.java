package Numbers;

import java.util.Scanner;

//19->1^2+9^2=82-->8^2+2^2=68-->6^2+8^2=100-->1^2+0^2+0^2=1 ==> here we got 1 so,19 is a happy number 
//13->1^2+3^2=10-->1^2+0^2=1 == >So if we get 1 as as an output my squaring the digits and adding then that number is a happy number

public class HappyNumber {
	
	// Function to calculate sum of squares of digits
	public static int checkHappy(int num) {
		int res = 0;
		while (num != 0) {
			int rem = num % 10;
			res += rem * rem;
			num /= 10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int res = num;
		
		// Keep calculating until result is 1 (Happy) or 4 (loop of unhappy numbers)
		while (res != 1 && res != 4) {
			res = checkHappy(res);  // use res instead of num
		}
		
		if (res == 1) {
			System.out.println(num + " is a Happy Number");
		} else {
			System.out.println(num + " is not a Happy Number");
		}
		
		sc.close();
	}
}

