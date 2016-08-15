package tr.org.linux.kamp2016.strings;

import java.util.Scanner;

/*
 * File: EmailValidation.java
 * -----------------------
 * This program takes an email address as input and validates it.
 */



public class EmailValidation {

	public static void main(String args[]) {
		System.out.println("This program takes an email address as input and validates it.");
		// Your code starts here
		Scanner input = new Scanner(System.in);
		String mail = "mail";
		
		while(!mail.isEmpty()){
			System.out.print("Enter an email address: ");
			mail = input.nextLine();
			if(!mail.isEmpty()){
				if(isValid(mail)){
					System.out.println("This mail address is valid.");
				}
				else{
					System.out.println("This mail address is not valid.");
				}
			}
		}
		
		System.out.println("Done");

		// Your code ends here
	}

	/*
	 * It should not contain whitespace.
	 * It should contain a '@' character.
	 * It should contain a '.' character.
	 * '@' and '.' should not be at the first position.
	 * There should be at least one character between '@' and '.'('.' should come after '@').
	 * There should be at least two characters after '.'.
	 */
	/** Checks whether an email address is valid */
	private static boolean isValid(String email) {
		// Your code starts here
		Character.isDigit(email.charAt(1));
		if(email.contains(" ")){
			return false;
		}
		
		if(!email.contains("@")){
			return false;
		}
		
		if(!email.contains(".")){
			return false;
		}
		
		if(email.startsWith("@") || email.startsWith(".")){
			return false;
		}
		
		// mail@.
		if(!(email.indexOf('@') + 1 < email.indexOf('.'))){
			return false;
		}
		
		if(!(email.lastIndexOf('.') + 2 < email.length() )){
			return false;
		}
			
		
		// Your code ends here
		return true;
	}

}
