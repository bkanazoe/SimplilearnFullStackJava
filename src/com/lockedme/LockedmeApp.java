package com.lockedme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.imageio.IIOException;

public class LockedmeApp {

	public static void main(String[] args) throws IOException {

		System.out.println("-----BOUKARE KANAZOE-------");
		System.out.println();
		System.out.println("*****FSD P1 PROJECT************");
		System.out.println();
		System.out.println("**************WELCOME TO LOCKEDME.COM APP****************\n");
		System.out.println("You must sign up and login to use the application\n");
		
		try {
			UserLogin.userLogin();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Enter 1 for option displaying the files existing in directory");
		System.out.println("Enter 2 for option adding a new file to the directory");
		System.out.println("Enter 3 for option deletinga a file in the directory");
		System.out.println("Enter 4 for option searching a file in the directory");
		
		Scanner userInput = new Scanner(System.in);
		
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean  navigation = true;
		
		while(navigation) {
			
			System.out.println("Enter the number of your choice\n");
			int number = userInput.nextInt();
			//userInput.close();
			
			switch (number) {
			
			case 1: 
				try {
					System.out.println("Enter the directory path name to display the list of files in the directory\n");
					String input = inputReader.readLine();
					RetrieveFileNames.displayFileNames(input);
				} catch (IIOException e) {
					
					e.printStackTrace();
				}
				
				break;
				
			case 2: System.out.println("Enter the directory path\\file name or the file name to create new file in the current directory");
			
				try {
					String input = inputReader.readLine();
					AddFile.addNewFile(input);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				break;
				
			case 3: System.out.println("Enter the directory path\\file name or the file name to delete the file in the current directory");
				
				try {
					String input = inputReader.readLine();
					DeleteFile.deleteFile(input);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				break;
				
			case 4: System.out.println("Enter the directory path\\file  name or the file name to search the file in the current directory");
			
				try {
					String input = inputReader.readLine();
					SearchFile.searchFile(input);
				} catch (IOException e) {
				
					e.printStackTrace();
				}

			default: System.out.println("Invalid choice try again");
				break;
			}
			
			System.out.println("Do you want to continue with the application: \n Enter true to continue\n Enter false to exit and close the application");
			
			String userChoise = inputReader.readLine().toLowerCase();
			
			navigation = Boolean.parseBoolean(userChoise);
			
			if (navigation == false) {
				
				System.out.println("You are existing the application. Exited!");
				System.exit(0);
			}
			
		}
	}

}
