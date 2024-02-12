//Assuming you are riding a bike and police officer stops you
//Police officer asks you to provide 2 details
//your current speed
//if it is your birthday today?
//The police officer will calculate find based on following parameters

//If it is your birthday you will be waved off with 5miles/hour
//if it is not yopur birthday no exemption will be given
//if your speed is greater than 80 tickets raised will be 'High ticket'
//if your speed is between 60 and 80 tickets raised will be 'Mid ticket'
//if your speed is below than 60 tickets raised will be 'No ticket'
//No ticket

import java.util.Scanner;

public class L5C5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter speed:");
		int speed=sc.nextInt();
		System.out.println("Today is your birthday:");
		boolean isbirthday=sc.nextBoolean();
		
		if(isbirthday==true) {
			speed=speed-5;
		}
		if(speed>80)
		System.out.printf("High ticket");
		else if(speed>=60)
		System.out.printf("Mid ticket");
		else
		System.out.printf("No ticket");
	}
}