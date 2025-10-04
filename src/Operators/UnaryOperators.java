package Operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int a=10;
		
		// UnaryOperator: a++, ++a, a--, --a
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
	}

}

/* 
SampleOutput
10
12
12
10
 */