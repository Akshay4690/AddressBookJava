package AssignAb3;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain 
{
	public static void main(String[] args) 
	{
		List<Contacts> list = new ArrayList<>();

		System.out.println("WelCome to AddressBook Programm ");
		AddressBook.addContact(list);
		
	}

}
