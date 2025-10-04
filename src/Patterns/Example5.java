package Patterns;

public class Example5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=6-i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

/*

SampleOutput:
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 

*/