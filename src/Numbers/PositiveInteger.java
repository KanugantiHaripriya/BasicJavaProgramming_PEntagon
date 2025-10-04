package Numbers;
import java.util.Scanner;
public class PositiveInteger {
	//Write program to find all the positive integers up to n
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for( int i= 1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}
	

}
