// Project:   Topic 4 - Switch Statements 
// Author: 	  Michael Joiner

import java.util.Scanner;


public class Casestatements {
	
	public static void main (String[] args) {
		// TODO Auto-generated method stub 
		
		// Activiate scanner/keyboard
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Main Menu - 2k");
		System.out.println("\t1.) Start Game");
		System.out.println("\t2.) Highlights");
		System.out.println("\t3.) High Scores");
		System.out.println("\t4.) Exit");
		System.out.print("Please select a menu choice. ");
		
		// Placeholder to ask for user input later
		int menuchoice = keyboard.nextInt();
		int highscore = 5000;
	
		
		switch (menuchoice) {
		case 1:
			System.out.println("Loading Game....");
			break;
		case 2: 
			System.out.println("Let's watch those highlights");
			break;
		case 3:
			System.out.println("Highest score:  Mike");
		
				if (highscore > 4000)
				System.out.println("Get more practice");
		default:
			System.out.println("Thanks for playing");
			
		}
	}
}