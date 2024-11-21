package ch.fhnw.richards.week06_Loops_ArrayList.solutions.codeRunner;

import java.util.ArrayList;
import java.util.Scanner;

public class UserList {

	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		boolean stop = false;
		while (!stop) {
			System.out.println("Enter a user name");
			String userName = in.next();
			if (userName.equals("stop")) {
				stop = true;
			} else {
				System.out.println("Enter a password");
				String password = in.next();
				
				User user = new User();
				user.setUserName(userName);
				user.setPassword(password);
				users.add(user);
			}
		}
		in.close();
		
		// Print all users
		int pos = 0;
		while (pos < users.size()) {
			User user = users.get(pos);
			System.out.println(user.toString());
			pos++;
		}
	}
}
