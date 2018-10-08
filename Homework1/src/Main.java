import java.util.*;

public class Main {
	public static void main (String [] args) {
		
		Contact p1 = new Contact("Shaggy", "Rodgers", "3471234567");
		Contact p2 = new Contact("Daphne", "Blake", "9170987654", "123 Purple St", "Red Hook", "NY");
		Contact p3 = new Contact("Fred", "Jones", "2124568234", "50  Haunt St.", "Harlem", "NJ");

		Contact[] list = {p1, p2, p3};

		ContactList book = new ContactList(list);

		System.out.print(book);

		System.out.print("The size of the contact list is ");
		System.out.print(book.Size());
		System.out.print("\n");
		System.out.print("\n");

		book.Remove(p2);

		System.out.print("Jones has been erased");
		System.out.print("\n");
		System.out.print("\n");

		Contact p4 = new Contact("Velma", "Dinkley", "4351240633");

		book.Add(p4);

		System.out.print("Velma has been added.");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");

		System.out.print(book);

		System.out.print("Searching for last name Rodgers in list. . .");
		System.out.print("\n");
		System.out.print("\n");

		System.out.print(book.searchLN("Rodgers"));

		System.out.print("\n\nSearching for phone number 9170987654 in list. . .");
		System.out.print("\n");
		System.out.print("\n");

		System.out.print(book.searchNum("9170987654"));
		
	}
}
