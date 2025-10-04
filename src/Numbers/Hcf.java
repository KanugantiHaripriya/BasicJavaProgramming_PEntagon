package Numbers;
import java.util.Scanner;

public class Hcf {
	
	//Find hcf(highest common factor) of two numbers
	public static int Hcf(int num1,int num2) {
		int smallestNo = num1 < num2 ? num1 : num2;
		int hcf=1;
		for(int i = 1; i<= smallestNo;i++) {
			if (num1%i == num2%i) {
				hcf=i;
			}
		}
		return hcf;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(Hcf(num1,num2));
		

	}

}
