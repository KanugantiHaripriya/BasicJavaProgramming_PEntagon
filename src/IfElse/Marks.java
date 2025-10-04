package IfElse;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		
		if(marks>=85) {
			System.out.println("Distinction");
		}
		else if(marks>=60) {
			System.out.println("First");
		}
		else if(marks>=40) {
			System.out.println("Second");
		}
		else {
			System.out.println("Fail");
		}
	}
}
