package AssignAb3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	ArrayList <Contacts> contact = new ArrayList<Contacts>();
	
	public static void addContact(List<Contacts> list)
	{
		Scanner sc = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter the contact details");
		System.out.print(" Enter the First Name : ");
		String firstname = sc.next();

		System.out.print("Enter the Last Name : ");
		String lastname = sc.next();

		System.out.print("Enter the Address : ");
		String address = s1.nextLine();

		System.out.print("Enter the City Name : ");
		String city = sc.next();

		System.out.print("Enter the State Name : ");
		String state = sc.next();

		System.out.print("Enter the ZipNumber : ");
		int zip = sc.nextInt();
		
		System.out.print("Enter the PhoneNumber : ");
		long phone = sc.nextLong();

		System.out.print("Enter the Email : ");
		String email = sc.next();

		list.add(new Contacts(firstname, lastname, address, city, state, zip, phone, email));
		System.out.println();
		System.out.print("Contact added Successfully .\n");
		list.forEach(contacts -> System.out.println(contacts));
		System.out.println();
		
	}
}
