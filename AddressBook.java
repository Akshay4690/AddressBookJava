package AssignAb3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook {

	ArrayList <Contacts> contact = new ArrayList<Contacts>();
	
	// Uc2 
	
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
	
	// Uc3
	
	public static void editContact(List<Contacts> list)
	{
		boolean record = false;
		Iterator<Contacts> iterator = list.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}

		System.out.print("Enter name to edit : ");
		Scanner sc = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		String firstname = sc.next();

		ListIterator<Contacts> iterator1 = list.listIterator();
		
		while (iterator1.hasNext())
		{
			Contacts c = iterator1.next();
			if (c.getFirstname().equals(firstname)) 
			{

				System.out.print("Enter the last name : ");
				c.setLastname(sc.next());
		
				System.out.print("Enter address name : ");
				c.setAddress(sc.next());
		
				System.out.print("Enter the city name: ");
				c.setCity(sc.next());
		
				System.out.print("Enter the state name : ");
				c.setState(sc.next());
		
				System.out.print("Enter the zip number : ");
				c.setZip(sc.nextInt());
		
				System.out.print("Enter the phone number : ");
				c.setPhoneno(sc.nextLong());
		
				System.out.print("Enter the email : ");
				c.setEmail(sc.next());
		
				record = true;
			}
		}
		
		if (record) 
		{
			System.out.println("Contact updated Successfully");
			list.forEach(contacts -> System.out.println(contacts));
		} 
		else
		{
			System.out.println("Contact not found");
			System.out.println();
		}
	}
}
