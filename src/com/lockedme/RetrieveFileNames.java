package com.lockedme;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.imageio.IIOException;

public class RetrieveFileNames {
	
	
	public static void displayFileNames (String Directorypath) throws IIOException{
		
		File file = new File(Directorypath);
		
		Set<String> fileSet = new TreeSet<String>();
		
		if (file.isDirectory()) {
			String[] fileNames  = file.list();
			fileSet.addAll(Arrays.asList(fileNames));
			
			System.out.println("The Total number of items present in the directory:" + fileSet.size() );
			
			Iterator<String> E = fileSet.iterator();
			
			while (E.hasNext()) {
				System.out.println(E.next());
			}
			
		}
			
			else if (file.isFile()) {
			System.out.println("The path provided is not a directory it is a file ");
			System.out.println("File path: " + file.getAbsolutePath());
			System.out.println("File name: " + file.getName());
			
			}
		
			else {
				System.out.println("Directory not found or such file doesn't exist");

		}
	}

}
