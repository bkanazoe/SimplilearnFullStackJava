package com.lockedme;

import java.io.File;
import java.io.IOException;

public class AddFile {

	public static void addNewFile(String  fileName) throws IOException {
		File file = new File(fileName);
		
		if (file.createNewFile()) {  
		     System.out.println("New File is created!"); 
		     System.out.println("File name :" + file.getName());
		     System.out.println("File path:" + file.getAbsolutePath());
		 } 
		
		else {                   
		     if(file.exists())
		     {
		         System.out.println("File already exists.");
		         System.out.println("File path: " +file.getAbsolutePath());
		     
		     }
		     else {
		    	 System.out.println("Enter a correct directory path + the file name");
		     }
			
		 }
	}
}
