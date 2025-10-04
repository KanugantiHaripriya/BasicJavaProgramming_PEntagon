package Switch;
import java.util.Scanner;

public class Days {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int day = sc.nextInt();
		
		switch (day) {
			
			case 1:
				System.out.println("FunDay");
				break;
			case 2:
				System.out.println("MonDay");
				break;
			case 3:
				System.out.println("TuesDay");
				break;
			case 4:
				System.out.println("WednesDay");
				break;
			case 5:
				System.out.println("ThursDay");
				break;
			case 6:
				System.out.println("FriDay");
				break;
			case 7:
				System.out.println("SaturDay");
				break;
			default:
				System.out.println("Plz enter valid number");
		}
	}
}
