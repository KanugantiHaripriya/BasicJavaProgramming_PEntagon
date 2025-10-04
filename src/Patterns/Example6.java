package Patterns;

public class Example6 {
	
	public static void main(String[] args) {
		int k=1;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");	
				 k++;
			}
			System.out.println();
		}
		
		
		int a=97;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)a+" ");	
				 a++;
			}
			System.out.println();
		}
		
		
		
		int A=65;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)A+" ");	
				 A++;
			}
			System.out.println();
		}
	}
}


/*

SampleOutput:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
a 
b c 
d e f 
g h i j 
k l m n o 
A 
B C 
D E F 
G H I J 
K L M N O 



*/
