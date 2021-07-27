package com.user;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {
	@SuppressWarnings("resource")
	public void isFirstnameValid() {
		final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";

		try {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Firstname:");
			String pattern = input.nextLine();

			if (Pattern.matches(FIRST_NAME_PATTERN, pattern))
				System.out.println("Firstname is VALID.");
			else
				throw new userException("Invalid Input , first name starts with Capital and minimum 3 characters.");
			System.out.println("Firstname :-" + pattern);
		} catch (userException e) {
			System.out.println(e.errorMessage);
			isFirstnameValid();
		}
	}
}
