package ch.fhnw.richards.week04_YourOwnClasses_Part2.solutions;

import java.util.Scanner;

public class UserTestProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the User-name");
		String userName = in.nextLine();
		System.out.println("Enter the password");
		String password = in.nextLine();
		in.close();
		
		// Create a book object and set the attributes
		User u = new User();
		u.setUserName(userName);
		u.setPassword(password);
		
		System.out.println(u.toString());
	}

}
