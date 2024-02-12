//Objective: Generating random numbers
//package: java.util, class: Random, method: nextInt(limit), output:generates random numbers blw 0 to limit

import java.util.Random;
import java.util.Scanner;
public class L5C1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int computerChoice = rnd.nextInt(20);
		System.out.println("Computer Choice : " + computerChoice);
		
		// guess the number
		
		for(int i=1; i<=6; i++) {
		System.out.println("Guess a number between 0 and 20");
		int userChoice = sc.nextInt();
		
		if(userChoice>computerChoice) {
			System.out.println("Your guess is too High");
		}
		else if(userChoice<computerChoice) {
			System.out.println("Your guess is too Low");
		}
		else {
			System.out.println("Gotcha! You guessed it right!!");
			break;
		}
		}
	}
}