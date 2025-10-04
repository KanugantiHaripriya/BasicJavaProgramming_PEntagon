package Operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a= 95;
		int b= 10;
		int c= 200;
		int res= (a>b)? a:b;
		System.out.println(res);
		
		//Using if else finds the largest value among a, b, and c.
		if(a > b) {
		    if(a > c)
		        System.out.println(a);
		    else
		        System.out.println(c);
		} 
		else {
		    if(b > c)
		        System.out.println(b);
		    else
		        System.out.println(c);
		}
		
		// using ternary operator  finds the largest value among a, b, and c.
		int re = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(re);

	}

}

/*
SampleOutput:
95
200
200
*/
