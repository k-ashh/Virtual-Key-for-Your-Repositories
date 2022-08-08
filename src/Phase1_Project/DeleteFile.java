package Phase1_Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {
	String path = "C:\\Users\\ashuk\\Desktop\\Work\\Java FSD\\Simplilearn Submissions\\Phase 1 Project\\";
	
	public void deletefile() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of the file you want to Delete:");
			String fname = sc.next();
			String fpath = path+fname;
			File f = new File(fpath);
			if(f.delete()) {
				System.out.println("File Deleted Succesfully...");
			}
			else {
				throw new IOException();
			}
		}
		catch (IOException e) {
			System.out.println("File Not Found... \nFile Deletion Unsuccesfull!!!");
		}		
	}
}
