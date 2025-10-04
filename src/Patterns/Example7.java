package Patterns;

public class Example7 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("* ");	
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		int rows = 5; // Number of rows
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            // Print asterisks
            for (int j = 0; j < rows - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
		
	}
}
	
		
		
		