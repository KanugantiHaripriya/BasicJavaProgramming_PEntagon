package Numbers;
import java.util.Scanner;

//Perfect number : Sum of the factors of a number is equal to the number
public class Perfect {
	public static int perfect(int num){
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(perfect(num));
		if(num == perfect(num)) {
			System.out.println("Perfect");
		}
		else {
			System.out.println("Not Perfect");
		}
		
		//generate all the perfect numbers upto given number
		int n = sc.nextInt();
		for(int i =1;i<=n ;i++) {
			if(i == perfect(i)) {
				System.out.print(i+" ");
			}
		}
		
	}

}
