package com.lockedme;

import java.io.File;
import java.io.IOException;

public class SearchFile {

	
	public static void searchFile(String fileName) throws IOException{
		
		File file = new File(fileName);
		
		if(file.exists())
	    {
	        System.out.println("File found!");	
	        System.out.println("File path:" + file.getAbsolutePath());
	        System.out.println("File name:  " + file.getName());
	        System.out.println("File class:  " + file.getClass());
			}
		 else {
			 System.out.println("File not found or not such directory exist");
		 }

	}
	}

