package AssignAb3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

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
	
	// Uc4
	
	public static void deleteContact(List<Contacts> list) 
	{
		boolean record = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name to delete : ");
		
		String deleterecord = sc.next();
		Iterator<Contacts> iterator = list.iterator();
		
		while (iterator.hasNext())
		{
			Contacts c = iterator.next();
			if (c.getFirstname().equals(deleterecord)) 
			{
				iterator.remove();
				record = true;
			}
		}
		
		if (record)
		{
			System.out.println("Contact deleted successfully...");
			list.forEach(contacts -> System.out.println(contacts));
		} 
		
		else
		{
			System.out.println("Contact not found");
			System.out.println();
		}
	}
	
	// Uc5  &  Uc6
	
	public static void addMultipleContacts(List<Contacts> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many Contacts to add : ");
		int count = sc.nextInt();
		boolean record = true;
		while (count > 0) 
		{
			Scanner s2 = new Scanner(System.in);
			Scanner s1 = new Scanner(System.in);

			System.out.println("Enter contact details...");
			System.out.print("Enter the First Name : ");
			String firstname = s2.next();

			if (record)
			{
				System.out.print("Enter the last name : ");
				String lastname = s2.next();

				System.out.print("Enter the Address : ");
				String address = s1.nextLine();

				System.out.print("Enter the City Name : ");
				String city = s2.next();
				System.out.print("Enter the State Name : ");
				String state = s2.next();
		
				System.out.print("Enter Zip Number : ");
				int zip = s2.nextInt();
		
				System.out.print("Enter Phone Number : ");
				long phone = s2.nextLong();
		
				System.out.print("Enter Email Address : ");
				String email = s2.next();
		
				list.add(new Contacts(firstname, lastname, address, city, state, zip, phone, email));
				count--;
			}
			if (!record)
			{
				count = 0;
			}

		}
		if (record)
		{
			System.out.print("Contacts added Successfully \n");
			list.forEach(contacts -> System.out.println(contacts));
			System.out.println();
		}
	}
	
	// Uc7
	
	public static boolean isDuplicateEntry(List<Contacts> list, String firstname)
	{
		boolean record = true;
		if (!list.isEmpty()) 
		{
			Iterator<Contacts> iterator = list.iterator();
		
			while (iterator.hasNext()) 
			{
				Contacts c = iterator.next();
				if (c.getFirstname().equals(firstname)) {
					System.out.println("Contact is already exist");
					record = false;
					System.out.println();
				}
			}
		}
		return record;
	}
	
	// Uc8
	
	public static void searchTheContact(List<Contacts> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the city to search : ");
		String city = sc.next();
		List<Contacts> l = list.stream().filter(search -> search.city.equals(city)).collect(Collectors.toList());
		System.out.println("Contacts from " + city);
		l.forEach(contacts -> System.out.println(contacts));
		System.out.println();
		
	}

	// Uc9
	
	public static void viewCityOrState(List<Contacts> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. City");
		System.out.println("2. State");
		System.out.print("Enter choice to search : ");
		
		int choice = sc.nextInt();
		
		switch (choice)
		{
		case 1:
			getByCity1(list);
			break;
			
		case 2:
			getByState1(list);
			break;
			
		case 3:
			getByCity(list);
			break;
			
		case 4:
			getByState(list);
			break;
			
		default:
			System.out.println("Enter valid choice");
			System.out.println();
						
		}

	}
	
	// Uc10 
	
	public static void countByCityOrState(List<Contacts> list) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. City ");
		System.out.println("2. State ");
		System.out.print("Enter option choice to search : ");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			getByCity(list);
			break;

		case 2:
			getByState(list);
			break;

		default:
			System.out.println("Invalid credintial , please enter valid choice");
			System.out.println();

		}

	}

	
	private static void getByCity1(List<Contacts> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the city : ");
		String searchbycity = sc.next();

		long stream = list.stream().filter(l -> (l.getCity().equals(searchbycity))).count();
		System.out.println(stream + "\n");

	}

	private static void getByState1(List<Contacts> list) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the state : ");
		String searchbystate = sc.next();

		long stream = list.stream().filter(l -> (l.getState().equals(searchbystate))).count();
		System.out.println(stream + "\n");

	}
			
	private static void getByCity(List<Contacts> list)
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter the city name : ");
		String searchbycity = sc.next();

		Map<Object, Object> map = list.stream().filter(l -> (l.city.equals(searchbycity)))
				.collect(Collectors.toMap(l -> l.getFirstname(), l -> l.city));
		System.out.println(map + "\n");

	}
	
	private static void getByState(List<Contacts> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the state name: ");
		String searchbystate = sc.next();
		
		Map<Object, Object> map = list.stream().filter(l -> (l.getState().equals(searchbystate)))
				.collect(Collectors.toMap(l -> l.getFirstname(), l -> l.getState()));
		System.out.println(map +"\n");
		
	}
	
	// Uc11
	
	public static void sortByName(List<Contacts> list)
	{
		Comparator<Contacts> comp = Comparator.comparing(Contacts::getFirstname);
		List<Contacts> sc = list.stream().sorted(comp).collect(Collectors.toList());
		sc.forEach(contacts -> System.out.println(contacts));
		System.out.println();
	}
	
	// Uc12
	
	public static void fileIO(List<Contacts> list)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Following Option");
		System.out.println("1. Write");
		System.out.println("2. Read");
		System.out.println("Select your choice");
		int choice = sc.nextInt();

		switch (choice)
		{
		case 1:
			fileWrite(list);
			break;
		case 2:
			fileRead();
			break;
		default:
			System.out.println("Enter valid choice");
		}

	}

	
	private static void fileRead()
	{
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Akshay\\eclipse-workspace\\CoreJavaProject\\src\\AssignAb3\\Contacts.java");
			int i;
			while ((i = fr.read()) != -1)
			{
				System.out.print((char) i);
			}
			System.out.println("\n");
			fr.close();

		} catch (IOException e){
			System.out.println("error");
		}

	}

	
	private static void fileWrite(List<Contacts> list)
	{
		try {
			File path = new File("C:\\Users\\Akshay\\eclipse-workspace\\CoreJavaProject\\src\\AssignAb3\\Contacts.java");
			FileWriter fr = new FileWriter(path);
			Iterator<Contacts> l = list.iterator();
			while (l.hasNext())
			{
				Contacts ct = l.next();
				String st = ct.toString();
				fr.write(st);
			}
			fr.close();
			System.out.println("File create Successfull .");
			System.out.println();

		} 
		catch (IOException e) 
		{
			System.out.println("error");
		}

	}
	
	
}
