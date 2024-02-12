import java.util.Scanner;

public class L5C3 {
	public static void main(String[] args) {
		// user division and printing rank
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your division");
		int div = sc.nextInt();
		switch(div) {
		case 1:
			System.out.println("First rank");
			break;
		case 2:
			System.out.println("Second rank");
			break;
		case 3:
			System.out.println("Third rank");
			break;	
		default:
			System.out.println("No rank");
			break;
		}
	}
}