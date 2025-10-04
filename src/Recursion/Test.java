package Recursion;

public class Test {
	
	public static void print_num(int num) {
		
		if (num==0) {
			System.out.println(num);
			return;
		}
		print_num(num-1);
		System.out.println(num);
	}

	public static void main(String[] args) {
		int num=5;
		print_num(num);
	}
}


//Recursion
//1. there must be end/bare/termination condition
//2. while calling the method inside other method the parameter must be the next iteration.
//3. don't declare the variable inside the method