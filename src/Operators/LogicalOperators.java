package Operators;

public class LogicalOperators {
	public static void main(String[] args) {
		
		//LogicalOperators AND, OR, NOT
		//AND: all statements must be true,then return true for AND operator
		//OR: 
		//NOT: not true
		
		System.out.println((10>5)&&(20==20)&&(5<=10));
		System.out.println((10<5)&&(20==20)&&(5<=10));
		System.out.println((10<5)||(20==20)||(5<=10));
		
	}

}

/*
SampleOuput:
true
false
true
*/