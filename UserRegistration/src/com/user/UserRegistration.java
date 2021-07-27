/**
* <h1>Welcome to the user registration problem !!</h1> 
* The user registration problem implements an application that
* simply displays "Welcome to the user registration problem !!" to the standard output.
* 
* @author Official_vk
* @version 1.0
* @since 2021-07-28
*/
package com.user;

public class UserRegistration {

	public static void main(String[] args) {
		// Prints Welcome to the user registration problem !! on standard output.
		System.out.println("Welcome to the user registration problem !!");
		UserValidation userValidation = new UserValidation();
		userValidation.isFirstnameValid();
		userValidation.isLastNameValid();
		userValidation.isEmailValid();
	}

}
