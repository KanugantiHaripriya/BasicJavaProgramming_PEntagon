package Numbers;
import java.util.Scanner;

public class DigitsCount {
	public static int find_digit(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 System.out.println(find_digit(n));
		

	}

}
