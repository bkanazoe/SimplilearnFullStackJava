package com.lockedme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class UserLogin {
	

	public static void userLogin() throws IOException {
		
		
		System.out.println("If you are an existing user enter yes to loggin\n");
		
		System.out.println("If not a user enter no to sign up\n");
		
		
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		
		
		String userInput = bufferReader.readLine();
		
		if (userInput.equalsIgnoreCase("yes")) {
			
		System.out.println("Enter your username to login");
		String userName = bufferReader.readLine();
		System.out.println("Enter your password to login");
		String password = bufferReader.readLine();
		
		
		FileReader fileReader = new FileReader("userDatabase.txt");
		
		Scanner scannerReader = new Scanner(fileReader);
		
		while(scannerReader.hasNext()) {
			
			String  userLoginData = scannerReader.nextLine();
			
			
			String [] userData = userLoginData.split(" ");
			
					
			String registeredName = userData[0].trim();
			
			String registeredPassword = userData[1].trim();
			
			if(registeredName.equals(userName) && registeredPassword.equals(password)) {
				
				System.out.println("Welcome " + registeredName +"! You are logged in!");
				
				break;
			}
			
			else if(scannerReader.hasNext()==false) {
				System.out.println("Please register to proceed with the application");
				RegisterUser.userSignUp();
				
			}
			
		}
		
		scannerReader.close();
		
	}
		else if (userInput.equalsIgnoreCase("no")) {
			RegisterUser.userSignUp();
		}
	}
}
