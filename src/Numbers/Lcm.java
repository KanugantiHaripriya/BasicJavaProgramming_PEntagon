package Numbers;
import java.util.Scanner;

public class Lcm {
	//write a program to find lcm(least common multiple) of the two numbers
	public static int Lcm(int num1,int num2) {
		int bigNo = num1 > num2 ? num1 : num2;
		int lcm=1;
		for(int i = bigNo; i<=(num1*num2);i++) {
			if (i%num1 ==0 && i%num2==0) {
				lcm=i;
				break;
			}
		}
		return lcm;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(Lcm(num1,num2));
		

	}

}
