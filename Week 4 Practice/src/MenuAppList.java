import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuAppList {
      
	static Scanner scanner= new Scanner(System.in);  // put in class so available to all methods
	static List<String> students = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int choice = 0;
		
		while (choice  != -1) {
			
			showMenu();
			
			choice = getUserChoice();
			if (choice == 1) {
				printStudentNames();
			}else if (choice == 2) { 
				addNewStudent();
				
			}else if (choice == 3) {
				deleteNewStudent();
				
			}else if (choice == 4) {
				System.out.println("Goodbye!");
				
			}else {
				System.out.println("Please select a valid option");
			}
			
		}
		
		
	}
    
	public static void showMenu() {
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Position");
		System.out.println("4) Exit");
		System.out.println(".................................");
		
	}
	
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void printStudentNames() {
		for (String student : students) {
			System.out.println(student);
			
		}
	}
	
	public static void addNewStudent() {
		System.out.println("enter the name you would like to add: "); 
		String name = scanner.next();
		students.add(name);
		System.out.println(("Student added: " + name));
				
	}
	
	public static void deleteNewStudent() {
		System.out.println("Enter the index of the student you wish to delete: ");
		int index = getUserChoice();
		if (index < students.size()) {
		students.remove(index);
	}
		
   }
	
}	
