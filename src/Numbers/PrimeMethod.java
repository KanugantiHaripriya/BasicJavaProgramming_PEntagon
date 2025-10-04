package Numbers;
import java.util.Scanner;

public class PrimeMethod {
	//printing all the prime number up to given number
	public static int prime(int i) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j == 0) {
				count++;
			}
		}
		return count;		
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1 ; i<=n; i++) {
			int res= prime(i);
			if( res == 2) {
				System.out.println(i);
			}		
		}
	}
	
}
