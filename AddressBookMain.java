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
	
			System.out.println("1. Add the Multiple contact list");
			System.out.println("2. Add a new contact");
			System.out.println("3. Edit an existing contact");
			System.out.println("4. Delete a contact");
			System.out.println("5. Duplicate Entry");
			System.out.println("6. Search the contacts");
			System.out.println("7. View the person by city or state");
			System.out.println("10. Exit \n");

			System.out.print("Enter your choice : ");
			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();
			System.out.println();

			switch (c) {
			
			case 1:
				AddressBook.addMultipleContacts(list);
				break;

			case 2:
				AddressBook.addContact(list);
				break;
			
			case 3:
				AddressBook.editContact(list);
				break;

			case 4:
				AddressBook.deleteContact(list);
				break;
			case 5:
				AddressBook.isDuplicateEntry(list, null);
				break;
				
			case 6:
				AddressBook.searchTheContact(list);
				break;
				
			case 7:
				AddressBook.viewCityOrState(list);
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
