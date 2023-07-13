package AssignAb3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to address book");
		System.out.println();

		List<Contacts> list = new ArrayList<>();

		boolean tree = true;

		while (tree) {
	
			System.out.println("1. Add a new contact");
			System.out.println("2. Edit an existing contact");
			System.out.println("10. Exit \n");
			System.out.print("Enter your choice : ");
			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();
		System.out.println();

		switch (c) {

			case 1:
				AddressBook.addContact(list);
				break;
			case 2:
				AddressBook.editContact(list);
				break;
				
			case 10:
				tree = false;
				System.out.println("exit successfull...");
				break;

			default:
				System.out.println("Invalid choice please Enter the valid choice \n");

		}

		}
	}

}
