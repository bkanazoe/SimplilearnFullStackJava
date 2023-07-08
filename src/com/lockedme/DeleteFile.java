package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class DeleteFile {
	
	public static void deleteFile(String filepath) throws IOException {
		File file = new File(filepath);
		
		if(file.delete()) {
			System.out.println("File deleted successfully");
		}
		
		else {
			System.out.println("Failed to delete the file or not such directory exist");
		}
	}

}
