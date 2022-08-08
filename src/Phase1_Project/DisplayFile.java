package Phase1_Project;

import java.io.File;

public class DisplayFile {
	String fnames[];
	String path = "C:\\Users\\ashuk\\Desktop\\Work\\Java FSD\\Simplilearn Submissions\\Phase 1 Project\\";
	File f = new File(path);

	public void display() {
		System.out.println("List of files currently in the directory:");
		fnames = f.list();
		
		for(String name : fnames) {
			System.out.println(name);
		}
	}
}