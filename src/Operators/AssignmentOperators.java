package Operators;

public class AssignmentOperators {
	
	public static void main(String[] args) {
		int a=10, b=20;
		a+=2;
		
		// Assignment operators: =,+=,-=,*=,/=,%=
		System.out.println(a);
		System.out.println(a-=2);
		System.out.println(a*=2);
		System.out.println(a=2);
		System.out.println(a/=2);
		System.out.println(a*=2);
		System.out.println(b/=10);
	}	
}

/*
SampleOutput:
12
10
20
2
1
2
2
*/