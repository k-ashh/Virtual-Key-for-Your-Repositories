package Phase1_Project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	
	Scanner sc = new Scanner(System.in);
	String path = "C:\\Users\\ashuk\\Desktop\\Work\\Java FSD\\Simplilearn Submissions\\Phase 1 Project\\";
	
	public void addfile() {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of the file you want to Add:");
			String fname = sc.next();
			String fpath = path+fname;
			File f = new File(fpath);
			if(f.createNewFile()) {
				System.out.println("File Created Succesfully...");
			}
			else {
				throw new IOException();		
			}
		}
		catch (IOException e) {
			System.out.println("File not Created...\n A file with same name already exists!!!");
		}
	}	
}
