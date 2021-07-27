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

	// create method isLastnameValid
	public void isLastNameValid() {
		final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";

		try {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Lastname:");
			String pattern = input.nextLine();

			if (Pattern.matches(LAST_NAME_PATTERN, pattern))
				System.out.println("Lastname is VALID.");
			else
				throw new userException("Invalid Input , Lastname starts with Capital and minimum 3 characters.");
			System.out.println("Lastname :-" + pattern);
		} catch (userException e) {
			System.out.println(e.errorMessage);
			isLastNameValid();
		}
	}

	// create method for validation email
	public void isEmailValid() {
		final String EMAIL_PATTERN = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";

		try {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Email-ID:");
			String pattern = input.nextLine();

			if (Pattern.matches(EMAIL_PATTERN, pattern))
				System.out.println("Email is VALID.");
			else
				throw new userException(
						"Invalid input, email contains 1 UpperCase, 1 LowerCase, 1 Numeric and 1 special Character.");
			System.out.println("Email-ID :-" + pattern);
		} catch (userException e) {
			System.out.println(e.errorMessage);
			isEmailValid();
		}
	}

	public void isMobileFormatValid() {
		final String MOBILE_PATTERN = "^[0-9]{2}[\\s][0-9]{10}$";

		try {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Mobile Number:");
			String pattern = input.nextLine();

			if (Pattern.matches(MOBILE_PATTERN, pattern))
				System.out.println("Mobile Number is VALID.");
			else
				throw new userException(
						"Invalid input, email contains country code follow by space and 10 digit number .");
			System.out.println("Mobile Number :-" + pattern);
		} catch (userException e) {
			System.out.println(e.errorMessage);
			isMobileFormatValid();
		}
	}
}
