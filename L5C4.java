//Title: How long is your burrrp?
//ask the user to enter an integer (burp length)
//depending on the input provided 'Burp' will be produced.

//Ex: 5:  'Burrrrrp'
//Input can be any random number

import java.util.Scanner;

public class L5C4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How long is your Burp?");
		int burplength = sc.nextInt();
		String msg="";
		for(int i=1; i<=burplength;i++) {
			msg = msg+"r";
		}
		System.out.println("Bu"+msg+"p");
	}
}