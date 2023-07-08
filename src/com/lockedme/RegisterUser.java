package com.lockedme;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class RegisterUser {
	
	File UserDatabase;
	
//	public static void main(String[] args) {
//		userSignUp();
//	}
	
	public static void userSignUp(){
	
		Scanner input = new Scanner(System.in);
		
		try {
			FileWriter writeUserData = new FileWriter("userDatabase.txt", true);
			BufferedWriter bufferWriter = new BufferedWriter(writeUserData);
			System.out.println("Enter your user username to register\n");
			String name = input.nextLine();
			System.out.println("Enter your password to register\n");
			String pass = input.nextLine();
			bufferWriter.write(name + " " + pass + "\n");
			bufferWriter.close();
			input.close();
			System.out.println("Welcome " + name +"! You are logged in!");
		}
	
		catch (Exception e) {

		System.out.println(e);
		
		}
		
	}

	

}
