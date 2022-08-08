package Phase1_Project;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InputMismatchException, IOException{
		menu();		
	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		DisplayFile dis = new DisplayFile();
		AddFile a = new AddFile();
		SearchFile s = new SearchFile();
		DeleteFile d = new DeleteFile();
		
		try {
		
			label : while(true) {
			
				System.out.println("============FILE MANAGEMENT SYSTEM============");
				System.out.println("----MENU----");
				System.out.println("1. Display File");
				System.out.println("2. File Operations Menu");
				System.out.println("3. Exit");
				System.out.println("Please Enter a Coice from above options...");
				int choice1 = sc.nextInt();
				switch (choice1) {
				case 1: {
					dis.display();
					break;
				}
				case 2: {
					while(true) {
						System.out.println("--Performable Operations:");
						System.out.println("---- 1. Add File \n---- 2. Delete File\n---- 3. Search File\n---- 4. Back to Main Menu");
						System.out.println("Please Enter a Coice from above options...");
						int choice2 = sc.nextInt();
						switch (choice2) {
						case 1: {
							a.addfile();
							break;
						}
						case 2: {
							d.deletefile();
							break;
						}
						case 3: {
							s.searchfile();
							break;
						}
						case 4: {
							continue label;
						}
						default:
							System.out.println("Please Enter a Valid Input !!!");
						}
					}
				}
				case 3: {
					System.out.println("Exiting the application...\nTHANK YOU.");
					System.exit(0);
				}
				default:
					System.out.println("Please Enter a Valid Input !!!");
				}
			}
		}
		catch (InputMismatchException i) {
			System.out.println("Please Enter a Valid Integer Input !!!");
			menu();
		}
	}
}
