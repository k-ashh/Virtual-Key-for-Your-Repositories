package Phase1_Project;

import java.io.File;
import java.util.Scanner;

public class SearchFile {
	
	Scanner sc = new Scanner(System.in);
	
	String fnames[];
	String path = "C:\\Users\\ashuk\\Desktop\\Work\\Java FSD\\Simplilearn Submissions\\Phase 1 Project\\";
	File f = new File(path);

	public void searchfile() {

		System.out.println("Enter the name of the file you want to Search:");
		String fname = sc.next();
		fnames = f.list();
		boolean found = false;
		
		for(String name : fnames) {
			if(name.equalsIgnoreCase(fname)) {
				System.out.println("File Found In Directory...");
				found = true;
				break;
			}
		}
		if(found==false) {
			System.out.println("File not Found In Directory!!!");
		}
	}
}
